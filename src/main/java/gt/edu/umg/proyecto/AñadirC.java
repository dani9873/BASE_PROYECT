
package gt.edu.umg.proyecto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AñadirC extends javax.swing.JFrame {
   private Connection conexion;

    public AñadirC() {
        initComponents();
        this.conectar();

        this.setLocationRelativeTo(null);
    }
    public void conectar(){
        ConectarL bd = new ConectarL();
        //Conexion es un objeto
        conexion = bd.getConexion();
    }
    void deshabilitar(){
    tfNombres.setEnabled(true);
    tfApellidos.setEnabled(true);
    tfNumero.setEnabled(true);
    /*tfCompañia.setEnabled(true);
    tfMarca.setEnabled(true);*/
    btnnuevo.setEnabled(true);
    btnguardar.setEnabled(true);
    }
    void clean(){
    tfNombres.setText("");
    tfApellidos.setText("");
    tfNumero.setText("");
    /*tfCompañia.setText("");
    tfMarca.setText("");*/
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnguardar2 = new javax.swing.JButton();
        btnguardar1 = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfCompañia = new javax.swing.JTextField();
        tfMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir clientes");
        setMinimumSize(new java.awt.Dimension(600, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setText("Agregar nuevos clientes");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(8.5F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 440, 40));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, 30));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Nombres:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, 30));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Numero:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 110, 30));
        getContentPane().add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 110, -1));
        getContentPane().add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, -1));
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, -1));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_botonguardar.png"))); // NOI18N
        btnguardar.setBorder(null);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Confirmar.jpeg"))); // NOI18N
        btnguardar2.setBorder(null);
        btnguardar2.setBorderPainted(false);
        btnguardar2.setContentAreaFilled(false);
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btnguardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Cancelar.jpeg"))); // NOI18N
        btnguardar1.setBorder(null);
        btnguardar1.setBorderPainted(false);
        btnguardar1.setContentAreaFilled(false);
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_btnnuevo.png"))); // NOI18N
        btnnuevo.setBorder(null);
        btnnuevo.setBorderPainted(false);
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarC.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 310));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Marca:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 100, 30));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Numero Telefono:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
        getContentPane().add(tfCompañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));
        getContentPane().add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
    String Nombre = tfNombres.getText();
    String Apellido = tfApellidos.getText();
    String No_telefono = tfNumero.getText();
    /*String Compania = tfCompañia.getText();
    String Marca = tfMarca.getText();*/
    
    String sql = "Insert Into Cliente values (null, '"+Nombre+"','"+Apellido+"','"+No_telefono+"',null);";
    //   String sql1 = "Insert Into telefono values (null, '"+No_telefono+"', '"+Compania+"', '"+Marca+"');";
    try{
        conexion.setAutoCommit(false);
        LoggerUtil.logInfo("Start transaction");
        Statement st = conexion.createStatement();
        int resultado = st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Cliente guardado");
        LoggerUtil.logInfo(MessageFormat.format("Confirmado {0} y {1}", Nombre,Apellido));

        /*try{
            Statement st1 = conexion.createStatement();
            int resultado1 = st1.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null,"Cliente guardado");
         }catch(Exception error){
      
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
         }*/
      
    }catch(Exception error){
         LoggerUtil.logInfo(MessageFormat.format( "Error {0}", error));
         JOptionPane.showMessageDialog(null,"Ocurrio un error");
     }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
    deshabilitar();
    clean();
    tfNombres.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea guardar los cambios?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                conexion.commit();
                JOptionPane.showMessageDialog(null,"Cambios guardados");
                LoggerUtil.logInfo(MessageFormat.format("Commit: {0}", opcion));
            } catch (SQLException ex) {
                Logger.getLogger(AñadirC.class.getName()).log(Level.SEVERE, null, ex);
                                LoggerUtil.logInfo(MessageFormat.format( "Error {0}", ex));
            }
        }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea revertir los cambios?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                conexion.rollback();
                JOptionPane.showMessageDialog(null,"Cambios revertidos");
                                LoggerUtil.logInfo(MessageFormat.format("Rollback: {0}", opcion));
            } catch (SQLException ex) {
                Logger.getLogger(AñadirC.class.getName()).log(Level.SEVERE, null, ex);
                                LoggerUtil.logInfo(MessageFormat.format( "Error {0}", ex));
            }
        }
    }//GEN-LAST:event_btnguardar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AñadirC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCompañia;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
