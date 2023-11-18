
package gt.edu.umg.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectarL {
    private Connection conexion;
    public ConectarL() {
    try {
            //se obtiene el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String bd = "ProyectoBD";
            String url ="jdbc:mysql://localhost:4002/"+bd+"?serverTimezone=UTC";
            String user ="root";
            String password="";
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectarL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectarL.class.getName()).log(Level.SEVERE, null, ex);
            LoggerUtil.logInfo(MessageFormat.format( "Error {0}", ex));
        }
   }
   //devuleve la conexion para poder realizar consultas a la b.d.
   public Connection  getConexion(){
       return conexion;
   }
   public void cierraConexion() {
    try {
        conexion.close();
    } catch (Exception exception) {
        // TODO: handle exception
        System.out.println("Error cerrando la conexion");
    }

    }//Cierre del constructor*/

}

