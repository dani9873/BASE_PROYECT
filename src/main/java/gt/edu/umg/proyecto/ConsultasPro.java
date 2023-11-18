
package gt.edu.umg.proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultasPro extends javax.swing.JFrame {
    private Connection conexion;
    DefaultTableModel model;
    
    public ConsultasPro() {
        initComponents();
        mostrarC("");
        this.conectar();
        this.setLocationRelativeTo(null);
    }
    public void conectar(){
        ConectarL bd = new ConectarL();
        //Conexion es un objeto
        conexion = bd.getConexion();
        this.conexion = bd.getConexion();
    }
    void deshabilitar(){
    tfActualizar.setEnabled(true);
    btnnuevo.setEnabled(true);
    }
    void clean(){
    tfActualizar.setText("");
    }
    void mostrarC(String valor){
    String mostrar="SELECT Id, Nombre, Apellido, Direccion, No_telefono FROM proveedor;";
    String []titulos={"Id","Nombre","Apellido","Direccion","No_telefono"};
    model= new DefaultTableModel(null,titulos);
        try {
              PreparedStatement pst = conexion.prepareStatement(mostrar);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String[] Registros = { rs.getString("Id"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Direccion"), rs.getString("No_telefono") };
            model.addRow(Registros);
        }
        tbcliente.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(ActualizarP.class.getName()).log(Level.SEVERE, null, ex);
        }
     
}
    void buscar(String valor){
    String mostrar="select * from proveedor where id =?";
    String []titulos={"Id","Nombre","Apellido","No_telefono"};
    String []Registros=new String[4];
    model= new DefaultTableModel(null,titulos);
        try {
              Statement st = conexion.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("Id");
                  Registros[1]= rs.getString("Nombre");
                  Registros[2]= rs.getString("Apellido"); 
                  Registros[3]= rs.getString("No_telefono");
                  model.addRow(Registros);
              }
              tbcliente.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(ConsultasPro.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel5 = new javax.swing.JLabel();
        tfActualizar = new javax.swing.JTextField();
        tfMostrar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas proveedores");
        setBackground(new java.awt.Color(255, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultas proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 30));

        tfActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfActualizarKeyPressed(evt);
            }
        });
        getContentPane().add(tfActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        tfMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/btnmostrartabla.png"))); // NOI18N
        tfMostrar.setBorder(null);
        tfMostrar.setBorderPainted(false);
        tfMostrar.setContentAreaFilled(false);
        tfMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(tfMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, 30));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_btnnuevo.png"))); // NOI18N
        btnnuevo.setBorder(null);
        btnnuevo.setBorderPainted(false);
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        tbcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Direccion", "No_telefono"
            }
        ));
        jScrollPane2.setViewportView(tbcliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultasC.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
    deshabilitar();
    clean();
    tfActualizar.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tfMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMostrarActionPerformed
        mostrarC("");
    }//GEN-LAST:event_tfMostrarActionPerformed

    private void tfActualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfActualizarKeyPressed
        buscar(tfActualizar.getText());
    }//GEN-LAST:event_tfActualizarKeyPressed

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
            java.util.logging.Logger.getLogger(ConsultasPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbcliente;
    private javax.swing.JTextField tfActualizar;
    private javax.swing.JButton tfMostrar;
    // End of variables declaration//GEN-END:variables
}
