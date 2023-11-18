package gt.edu.umg.proyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {

    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    static {
        Path logDirPath = Paths.get(System.getProperty("java.io.tmpdir"), "logs");
        if (!Files.exists(logDirPath)) {
            try {
                Files.createDirectories(logDirPath);
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error al crear el directorio de logs", e);
            }
        }

        String logFilePath = logDirPath.resolve("log.txt").toString();
        System.out.println("Archivo de registro: " + logFilePath); // Agregamos esta línea para imprimir la ruta del archivo de registro
        Handler fileHandler;
        try {
            fileHandler = new FileHandler(logFilePath);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al crear el manejador de archivo", e);
        }
    }

    public static void logInfo(String message) {
        LOGGER.log(Level.INFO, message);
    }

    public static void logError(String message, Throwable t) {
        LOGGER.log(Level.SEVERE, message, t);
    }

    public static void logWarning(String message) {
        LOGGER.log(Level.WARNING, message);
    }
}
