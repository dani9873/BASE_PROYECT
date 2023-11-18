/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gt.edu.umg.proyecto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class F_Egresos extends javax.swing.JFrame {
    private Connection conexion;
    DefaultTableModel model;
    
    public F_Egresos() { 
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
    tfDetalle.setEnabled(true);
    tfComentario.setEnabled(true);
    tfFecha.setEnabled(true);
    tfMonto.setEnabled(true);
    tfActualizar.setEnabled(true);
    btnnuevo.setEnabled(true);
    btnnuevo1.setEnabled(true);
    btnguardar.setEnabled(true);
    }
    void clean(){
    tfDetalle.setText("");
    tfComentario.setText("");
    tfFecha.setText("");
    tfMonto.setText("");
    }
    void clean2(){
    tfActualizar.setText("");
    }
    void mostrarC(String valor){
    String mostrar="SELECT id, detalle, monto, fecha, comentario FROM Egresos;";
            LoggerUtil.logInfo("Mostrar Egresos");

    String []titulos={"Id","Detalle","Monto","Fecha","Comentario"};
    String []Registros=new String[5];
    model= new DefaultTableModel(null,titulos);
        try {
              Statement st = conexion.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("Id");
                  Registros[1]= rs.getString("Detalle");
                  Registros[2]= rs.getString("Monto"); 
                  Registros[3]= rs.getString("Fecha");
                  Registros[4]= rs.getString("Comentario");
                  model.addRow(Registros);
              }
              tbcliente.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(ConsultasC.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    void buscar(String valor){
    String mostrar="select * from egresos where id =?";
    LoggerUtil.logInfo("Buscar egresos por id");
    String []titulos={"Id","Detalle","Monto","Fecha","Comentario"};
    String []Registros=new String[5];
    model= new DefaultTableModel(null,titulos);
        try {
              Statement st = conexion.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("Id");
                  Registros[1]= rs.getString("Detalle");
                  Registros[2]= rs.getString("Monto"); 
                  Registros[3]= rs.getString("Fecha");
                  Registros[4]= rs.getString("Comentario");
                  model.addRow(Registros);
              }
              tbcliente.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(ConsultasC.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        tfDetalle = new javax.swing.JTextField();
        tfComentario = new javax.swing.JTextField();
        tfMonto = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnguardar2 = new javax.swing.JButton();
        btnguardar1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcliente = new javax.swing.JTable();
        btnnuevo1 = new javax.swing.JButton();
        tfActualizar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Comentario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Detalle:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EGRESOS");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(8.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 40));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 30));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Monto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));
        jPanel1.add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 380, 30));
        jPanel1.add(tfDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 380, 30));
        jPanel1.add(tfComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 360, 30));

        tfMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMontoActionPerformed(evt);
            }
        });
        jPanel1.add(tfMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 380, 30));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_btnnuevo.png"))); // NOI18N
        btnnuevo.setBorder(null);
        btnnuevo.setBorderPainted(false);
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_botonguardar.png"))); // NOI18N
        btnguardar.setBorder(null);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Confirmar.jpeg"))); // NOI18N
        btnguardar2.setBorder(null);
        btnguardar2.setBorderPainted(false);
        btnguardar2.setContentAreaFilled(false);
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btnguardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Cancelar.jpeg"))); // NOI18N
        btnguardar1.setBorder(null);
        btnguardar1.setBorderPainted(false);
        btnguardar1.setContentAreaFilled(false);
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Egresos.jpg"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 320));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/btnmostrartabla.png"))); // NOI18N
        tfMostrar.setBorder(null);
        tfMostrar.setBorderPainted(false);
        tfMostrar.setContentAreaFilled(false);
        tfMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(tfMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTADO DE EGRESOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 450, -1));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, 30));

        tbcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Detalle", "Monto", "Fecha", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbcliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 620, 110));

        btnnuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOTONES/Java_btnnuevo.png"))); // NOI18N
        btnnuevo1.setBorder(null);
        btnnuevo1.setBorderPainted(false);
        btnnuevo1.setContentAreaFilled(false);
        btnnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        tfActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfActualizarKeyPressed(evt);
            }
        });
        jPanel2.add(tfActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1db394.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        deshabilitar();
        clean();
        tfDetalle.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String Detalle = tfDetalle.getText();
        String Monto = tfMonto.getText();
        String Fecha = tfFecha.getText();
        String Comentario = tfComentario.getText();
        

        String sql = "Insert Into Egresos values (null, '"+Detalle+"','"+Monto+"','"+Fecha+"','"+Comentario+"',null);";
        
        try{
            conexion.setAutoCommit(false);
            LoggerUtil.logInfo("Start transaction");
            Statement st = conexion.createStatement();
            int resultado = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Egreso guardado");
            LoggerUtil.logInfo(MessageFormat.format("Se ha registrado un nuevo egreso con detalle: {0} y monto: {1}", Detalle, Monto));
        }catch(Exception error){
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
LoggerUtil.logInfo(MessageFormat.format( "Error {0}", error));        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void tfMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMontoActionPerformed

    private void tfMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMostrarActionPerformed
        mostrarC("");
    }//GEN-LAST:event_tfMostrarActionPerformed

    private void btnnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo1ActionPerformed
        deshabilitar();
        clean2();
        tfActualizar.requestFocus();
    }//GEN-LAST:event_btnnuevo1ActionPerformed

    private void tfActualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfActualizarKeyPressed
        buscar(tfActualizar.getText());
    }//GEN-LAST:event_tfActualizarKeyPressed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea guardar los cambios?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                conexion.commit();
                LoggerUtil.logInfo("Commit");
                JOptionPane.showMessageDialog(null,"Cambios guardados");
                LoggerUtil.logInfo(MessageFormat.format("Commit: {0}", opcion));
            } catch (SQLException ex) {
                Logger.getLogger(F_Egresos.class.getName()).log(Level.SEVERE, null, ex);
                LoggerUtil.logInfo(MessageFormat.format( "Error {0}", ex));

            }
        }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea revertir los cambios?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                conexion.rollback();
                LoggerUtil.logInfo("Rollback");
                JOptionPane.showMessageDialog(null,"Cambios revertidos");
                                LoggerUtil.logInfo(MessageFormat.format("Rollback: {0}", opcion));
            } catch (SQLException ex) {
                LoggerUtil.logInfo(MessageFormat.format( "Error al intentar registrar un nuevo egreso", ex));
                Logger.getLogger(F_Egresos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(F_Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Egresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbcliente;
    private javax.swing.JTextField tfActualizar;
    private javax.swing.JTextField tfComentario;
    private javax.swing.JTextField tfDetalle;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfMonto;
    private javax.swing.JButton tfMostrar;
    // End of variables declaration//GEN-END:variables
}
