/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author jaime
 */
public class Pedidos extends javax.swing.JDialog {

    /**
     * Creates new form Pedidos
     */
    public Pedidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmdMenuHamburguesas = new javax.swing.JButton();
        cmdMenuEnsaladaAcompañamientos = new javax.swing.JButton();
        cmdRegresar = new javax.swing.JButton();
        cmdMenuBebidas = new javax.swing.JButton();
        cmdMenuPollo = new javax.swing.JButton();
        cmdMenuDesayunos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Menú ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        cmdMenuHamburguesas.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmdMenuHamburguesas.setText("HAMBURGUESAS");
        cmdMenuHamburguesas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdMenuHamburguesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuHamburguesasActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuHamburguesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 60));

        cmdMenuEnsaladaAcompañamientos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmdMenuEnsaladaAcompañamientos.setText("ACOMPAÑAMIENTOS");
        cmdMenuEnsaladaAcompañamientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdMenuEnsaladaAcompañamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuEnsaladaAcompañamientosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuEnsaladaAcompañamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 240, 60));

        cmdRegresar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegresar.setText("REGRESAR");
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, 40));

        cmdMenuBebidas.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmdMenuBebidas.setText("BEBIDAS");
        cmdMenuBebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdMenuBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 230, 60));

        cmdMenuPollo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmdMenuPollo.setText("POLLO");
        cmdMenuPollo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdMenuPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuPolloActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 60));

        cmdMenuDesayunos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmdMenuDesayunos.setText("DESAYUNOS");
        cmdMenuDesayunos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdMenuDesayunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuDesayunosActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMenuDesayunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 230, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mcdonalds.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(632, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMenuBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuBebidasActionPerformed

        Bebidas b = new Bebidas(null, true);
        b.setVisible(true);
    }//GEN-LAST:event_cmdMenuBebidasActionPerformed

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_cmdRegresarActionPerformed

    private void cmdMenuHamburguesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuHamburguesasActionPerformed

        Hamburguesas h = new Hamburguesas(null, true);
        h.setVisible(true);
    }//GEN-LAST:event_cmdMenuHamburguesasActionPerformed

    private void cmdMenuPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuPolloActionPerformed

        Pollos p = new Pollos(null, true);
        p.setVisible(true);
    }//GEN-LAST:event_cmdMenuPolloActionPerformed

    private void cmdMenuDesayunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuDesayunosActionPerformed

        Desayunos d = new Desayunos(null, true);
        d.setVisible(true);
    }//GEN-LAST:event_cmdMenuDesayunosActionPerformed

    private void cmdMenuEnsaladaAcompañamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuEnsaladaAcompañamientosActionPerformed

        Acompañamientos a = new Acompañamientos(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_cmdMenuEnsaladaAcompañamientosActionPerformed

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pedidos dialog = new Pedidos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdMenuBebidas;
    private javax.swing.JButton cmdMenuDesayunos;
    private javax.swing.JButton cmdMenuEnsaladaAcompañamientos;
    private javax.swing.JButton cmdMenuHamburguesas;
    private javax.swing.JButton cmdMenuPollo;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
