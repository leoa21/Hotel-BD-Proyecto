
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo21
 */
public class RecepcionVista extends javax.swing.JFrame {

    /**
     * Creates new form RecepcionPage
     */
    public RecepcionVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHabitacionRecepcion = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnDetallesCliente = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHabitacionRecepcion.setBackground(new java.awt.Color(0, 102, 0));
        btnHabitacionRecepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHabitacionRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bed (1).png"))); // NOI18N
        btnHabitacionRecepcion.setText(" Habitaciones");
        btnHabitacionRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionRecepcionActionPerformed(evt);
            }
        });
        getContentPane().add(btnHabitacionRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 176, -1));

        btnCheckIn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-in (1).png"))); // NOI18N
        btnCheckIn.setText("Check - In");
        btnCheckIn.setPreferredSize(new java.awt.Dimension(147, 59));
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 160, 72));

        btnCheckOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-out (1).png"))); // NOI18N
        btnCheckOut.setText("Check - Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 180, -1));

        btnDetallesCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnDetallesCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDetallesCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details (1).png"))); // NOI18N
        btnDetallesCliente.setText(" Cliente Detalle");
        btnDetallesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetallesCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 176, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout (1).png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesi??n");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FndoHotel(2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1330, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
        new CheckIn().setVisible(true);

    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnHabitacionRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionRecepcionActionPerformed
        // TODO add your handling code here:
        new HabitacionesRecepcion().setVisible(true);
    }//GEN-LAST:event_btnHabitacionRecepcionActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        new CheckOut().setVisible(true);
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnDetallesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesClienteActionPerformed
        // TODO add your handling code here:
        new ClienteDetalle().setVisible(true);
    }//GEN-LAST:event_btnDetallesClienteActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "??Desea cerrar sesi??n?", "Select", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            new login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(RecepcionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecepcionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecepcionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecepcionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecepcionVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnDetallesCliente;
    private javax.swing.JButton btnHabitacionRecepcion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
