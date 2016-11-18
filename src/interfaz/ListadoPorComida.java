/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;

/**
 *
 * @author jaime
 */
public class ListadoPorComida extends javax.swing.JDialog {

    /**
     * Creates new form ListadoPorComida
     */
    String rutaV;
    public ListadoPorComida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         rutaV = "src/datos/Ventas.txt";
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        chbH = new javax.swing.JCheckBox();
        chbP = new javax.swing.JCheckBox();
        chbB = new javax.swing.JCheckBox();
        chbD = new javax.swing.JCheckBox();
        chbA = new javax.swing.JCheckBox();
        cmdListar = new javax.swing.JButton();
        cmdRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaH.setBackground(new java.awt.Color(0, 0, 0));
        tblTablaH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre", "Precio", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaH);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 550, 290));

        jLabel1.setText("LISTADO DE VENTAS POR COMIDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        chbH.setText("Hamburguesas");
        chbH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbHActionPerformed(evt);
            }
        });
        jPanel1.add(chbH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        chbP.setText("Pollos");
        jPanel1.add(chbP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        chbB.setText("Bebidas");
        jPanel1.add(chbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        chbD.setText("Desayunos");
        jPanel1.add(chbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        chbA.setText("Acompañamientos");
        jPanel1.add(chbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        cmdListar.setText("LISTAR");
        cmdListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 30));

        cmdRegresar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegresar.setText("REGRESAR");
        cmdRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(573, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblTablaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaHMouseClicked

    }//GEN-LAST:event_tblTablaHMouseClicked

    private void chbHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbHActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_chbHActionPerformed

    private void cmdListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListarActionPerformed
        String h ="Hamburguesas";
        String b = "Bebidas";
        String d = "Desayunos";
        String p = "Pollos";
        String a = "Acompañamientos";
        if(chbH.isSelected()){
            Helper.listadoPorComida(tblTablaH, rutaV, h); 
        }
        if(chbB.isSelected()){
            Helper.listadoPorComida(tblTablaH, rutaV, b);
        }
        if(chbD.isSelected()){
            Helper.listadoPorComida(tblTablaH, rutaV, d);
        }
        if(chbP.isSelected()){
            Helper.listadoPorComida(tblTablaH, rutaV, p);
        }
        if(chbA.isSelected()){
            Helper.listadoPorComida(tblTablaH, rutaV, a);
        }
    }//GEN-LAST:event_cmdListarActionPerformed

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_cmdRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoPorComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoPorComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoPorComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoPorComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoPorComida dialog = new ListadoPorComida(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox chbA;
    private javax.swing.JCheckBox chbB;
    private javax.swing.JCheckBox chbD;
    private javax.swing.JCheckBox chbH;
    private javax.swing.JCheckBox chbP;
    private javax.swing.JButton cmdListar;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaH;
    // End of variables declaration//GEN-END:variables
}
