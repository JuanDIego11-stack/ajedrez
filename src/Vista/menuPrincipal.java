
package Vista;

import Controlador.Controlador;
import Modelo.onevone;




public class menuPrincipal extends javax.swing.JFrame {

 
    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Principal");
        this.setVisible(true);
        
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
        jLabel1 = new javax.swing.JLabel();
        botonContraBOt = new javax.swing.JButton();
        BotonIniciar1v1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 37, 34));

        jLabel1.setBackground(new java.awt.Color(38, 37, 34));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ajedrez");

        botonContraBOt.setBackground(new java.awt.Color(115, 149, 82));
        botonContraBOt.setForeground(new java.awt.Color(255, 255, 255));
        botonContraBOt.setText("Nueva Partida Contra CPU");
        botonContraBOt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContraBOtActionPerformed(evt);
            }
        });

        BotonIniciar1v1.setBackground(new java.awt.Color(115, 149, 82));
        BotonIniciar1v1.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciar1v1.setText("Iniciar Partida 1vs1");
        BotonIniciar1v1.setMaximumSize(new java.awt.Dimension(151, 24));
        BotonIniciar1v1.setMinimumSize(new java.awt.Dimension(151, 24));
        BotonIniciar1v1.setPreferredSize(new java.awt.Dimension(151, 24));
        BotonIniciar1v1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciar1v1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(botonContraBOt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(BotonIniciar1v1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonContraBOt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIniciar1v1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContraBOtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContraBOtActionPerformed

       this.setVisible(true);
       //VistaTablero tablero = new VistaTablero();
       //tablero.setVisible(true);
       Controlador controlador = new Controlador();
       this.dispose();
       
    }//GEN-LAST:event_botonContraBOtActionPerformed

    private void BotonIniciar1v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciar1v1ActionPerformed
        this.setVisible(true);
        onevone one = new onevone();
        this.dispose();
    }//GEN-LAST:event_BotonIniciar1v1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciar1v1;
    private javax.swing.JButton botonContraBOt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
