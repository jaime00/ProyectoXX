/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cliente;
import clases.Comida;
import clases.Helper;
import clases.Venta;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaime
 */
public class Bebidas extends javax.swing.JDialog {

    /**
     * Creates new form Bebidas
     */
    String rutaC, rutaCL, rutaV;
    ObjectOutputStream salidaV;
    ArrayList<Venta> ventas;

    public Bebidas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         rutaC = "src/datos/Comidas.txt";
        rutaCL = "src/datos/Clientes.txt";
        rutaV = "src/datos/Ventas.txt";
        Helper.llenarComboClientes(cmbClientes, rutaCL);

        try {

            ventas = Helper.traerDatos(rutaV);
            salidaV = new ObjectOutputStream(new FileOutputStream(rutaV));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Helper.volcado(salidaV, ventas);
        Helper.llenarTabla1(tblTablaH, rutaV);

        cmdEliminar.setEnabled(false);
        lblCant1.setVisible(false);
        lblCant2.setVisible(false);
        lblCant3.setVisible(false);
        txtCant1.setVisible(false);
        txtCant2.setVisible(false);
        txtCant3.setVisible(false);
        cmdAceptar1.setVisible(false);
        cmdAceptar2.setVisible(false);
        cmdAceptar3.setVisible(false);
        cmbClientes.setSelectedIndex(0);

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
        cmdB1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaH = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox();
        lblCant1 = new javax.swing.JLabel();
        txtCant1 = new javax.swing.JTextField();
        cmdAceptar1 = new javax.swing.JButton();
        lblCant2 = new javax.swing.JLabel();
        txtCant2 = new javax.swing.JTextField();
        cmdAceptar2 = new javax.swing.JButton();
        lblCant3 = new javax.swing.JLabel();
        txtCant3 = new javax.swing.JTextField();
        cmdAceptar3 = new javax.swing.JButton();
        cmdRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmdB2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdB3 = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("BEBIDAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 200, 20));

        cmdB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coca-cola.jpg"))); // NOI18N
        cmdB1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdB1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 190, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel3.setText("COCA-COLA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, 20));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Total"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cliente", "Nombre", "Precio", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 540, 220));

        jLabel6.setText("CLIENTE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 200, 20));

        lblCant1.setText("CANTIDAD:");
        jPanel1.add(lblCant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtCant1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCant1ActionPerformed(evt);
            }
        });
        txtCant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant1KeyTyped(evt);
            }
        });
        jPanel1.add(txtCant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 50, -1));

        cmdAceptar1.setText("ACEPTAR");
        cmdAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 20));

        lblCant2.setText("CANTIDAD:");
        jPanel1.add(lblCant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        txtCant2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant2KeyTyped(evt);
            }
        });
        jPanel1.add(txtCant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 50, -1));

        cmdAceptar2.setText("ACEPTAR");
        cmdAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptar2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, 20));

        lblCant3.setText("CANTIDAD:");
        jPanel1.add(lblCant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        txtCant3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant3KeyTyped(evt);
            }
        });
        jPanel1.add(txtCant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 50, -1));

        cmdAceptar3.setText("ACEPTAR");
        cmdAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptar3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, 20));

        cmdRegresar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegresar.setText("REGRESAR");
        cmdRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 190, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel2.setText("SPRITE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 20));

        cmdB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sprite.jpg"))); // NOI18N
        cmdB2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdB2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 190, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel4.setText("FUZE TEA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        cmdB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fuze-tea.jpg"))); // NOI18N
        cmdB3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cmdB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdB3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 200, 150));

        cmdEliminar.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 180, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/McDonald's_Golden_Arches.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 500, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(843, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdB3ActionPerformed
        txtCant3.setVisible(true);
        lblCant3.setVisible(true);
        txtCant3.requestFocusInWindow();
        cmdAceptar3.setVisible(true);
        lblCant1.setVisible(false);
        lblCant2.setVisible(false);

        txtCant1.setVisible(false);
        txtCant2.setVisible(false);

        cmdAceptar1.setVisible(false);
        cmdAceptar2.setVisible(false);
    }//GEN-LAST:event_cmdB3ActionPerformed

    private void cmdB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdB2ActionPerformed
        txtCant2.setVisible(true);
        lblCant2.setVisible(true);
        txtCant2.requestFocusInWindow();
        cmdAceptar2.setVisible(true);
        lblCant1.setVisible(false);
        lblCant3.setVisible(false);

        txtCant1.setVisible(false);
        txtCant3.setVisible(false);

        cmdAceptar1.setVisible(false);
        cmdAceptar3.setVisible(false);

    }//GEN-LAST:event_cmdB2ActionPerformed

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_cmdRegresarActionPerformed

    private void cmdAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptar3ActionPerformed
        if (txtCant3.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite por favor la cantidad a llevar", 1);
            txtCant3.requestFocusInWindow();
        } else {
            try {
                int cant = Integer.parseInt(txtCant3.getText());
                String aux, cedula;
                int indice;
                aux = cmbClientes.getSelectedItem().toString();
                indice = aux.indexOf("-") - 1;
                cedula = aux.substring(0, indice);
                Cliente persona = Helper.traerClienteCedula(cedula, rutaCL);

                if (Helper.buscarComidaNombre("FUZE TEA", rutaC)) {
                    Comida co = Helper.traerComidaNombre("FUZE TEA", rutaC);
                    Venta venta = new Venta(cant, co, persona);
                    venta.guardar(salidaV);
                    lblCant3.setVisible(false);
                    cmdAceptar3.setVisible(false);
                    txtCant3.setVisible(false);
                    txtCant3.setText("");
                }

            } catch (IOException ex) {
                Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
            }

            Helper.llenarTabla1(tblTablaH, rutaV);

        }
    }//GEN-LAST:event_cmdAceptar3ActionPerformed

    private void txtCant3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant3KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtCant3KeyTyped

    private void cmdAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptar2ActionPerformed

        if (txtCant2.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite por favor la cantidad a llevar",1);
            txtCant2.requestFocusInWindow();
        } else {
            try {
                int cant = Integer.parseInt(txtCant2.getText());
                String aux, cedula;
                int indice;
                aux = cmbClientes.getSelectedItem().toString();
                indice = aux.indexOf("-") - 1;
                cedula = aux.substring(0, indice);
                Cliente persona = Helper.traerClienteCedula(cedula, rutaCL);

                if (Helper.buscarComidaNombre("SPRITE", rutaC)) {
                    Comida co = Helper.traerComidaNombre("SPRITE", rutaC);
                    Venta venta = new Venta(cant, co, persona);
                    venta.guardar(salidaV);
                    lblCant2.setVisible(false);
                    cmdAceptar2.setVisible(false);
                    txtCant2.setVisible(false);
                    txtCant2.setText("");
                }

            } catch (IOException ex) {
                Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
            }

            Helper.llenarTabla1(tblTablaH, rutaV);

        }
    }//GEN-LAST:event_cmdAceptar2ActionPerformed

    private void txtCant2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant2KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtCant2KeyTyped

    private void cmdAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptar1ActionPerformed

        if (txtCant1.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite por favor la cantidad a llevar",1);
            txtCant1.requestFocusInWindow();
        } else {
            try {
                int cant = Integer.parseInt(txtCant1.getText());
                String aux, cedula;
                int indice;
                aux = cmbClientes.getSelectedItem().toString();
                indice = aux.indexOf("-") - 1;
                cedula = aux.substring(0, indice);
                Cliente persona = Helper.traerClienteCedula(cedula, rutaCL);

                if (Helper.buscarComidaNombre("COCA-COLA", rutaC)) {
                    Comida co = Helper.traerComidaNombre("COCA-COLA", rutaC);
                    Venta venta = new Venta(cant, co, persona);
                    venta.guardar(salidaV);
                    lblCant1.setVisible(false);
                    cmdAceptar1.setVisible(false);
                    txtCant1.setVisible(false);
                    txtCant1.setText("");
                }

            } catch (IOException ex) {
                Logger.getLogger(Hamburguesas.class.getName()).log(Level.SEVERE, null, ex);
            }

            Helper.llenarTabla1(tblTablaH, rutaV);

        }
    }//GEN-LAST:event_cmdAceptar1ActionPerformed

    private void txtCant1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant1KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtCant1KeyTyped

    private void txtCant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCant1ActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void cmdB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdB1ActionPerformed
        txtCant1.setVisible(true);
        lblCant1.setVisible(true);
        txtCant1.requestFocusInWindow();
        cmdAceptar1.setVisible(true);
        lblCant2.setVisible(false);
        lblCant3.setVisible(false);

        txtCant2.setVisible(false);
        txtCant3.setVisible(false);

        cmdAceptar2.setVisible(false);
        cmdAceptar3.setVisible(false);

    }//GEN-LAST:event_cmdB1ActionPerformed

    private void tblTablaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaHMouseClicked
        int i;
        Venta v;
        ArrayList<Venta> Ventas = Helper.traerDatos(rutaV);
        i = tblTablaH.getSelectedRow();

        v = Ventas.get(i);

        cmdEliminar.setEnabled(true);
    }//GEN-LAST:event_tblTablaHMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i;

        ArrayList<Venta> ventas1 = Helper.traerDatos(rutaV);
        i = tblTablaH.getSelectedRow();
        ventas1.remove(i);
        try {
            salidaV = new ObjectOutputStream(new FileOutputStream(rutaV));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
        }

        Helper.volcado(salidaV, ventas1);
        Helper.llenarTabla1(tblTablaH, rutaV);
        cmdEliminar.setEnabled(false);
    }//GEN-LAST:event_cmdEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bebidas dialog = new Bebidas(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JButton cmdAceptar1;
    private javax.swing.JButton cmdAceptar2;
    private javax.swing.JButton cmdAceptar3;
    private javax.swing.JButton cmdB1;
    private javax.swing.JButton cmdB2;
    private javax.swing.JButton cmdB3;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCant1;
    private javax.swing.JLabel lblCant2;
    private javax.swing.JLabel lblCant3;
    private javax.swing.JTable tblTablaH;
    private javax.swing.JTextField txtCant1;
    private javax.swing.JTextField txtCant2;
    private javax.swing.JTextField txtCant3;
    // End of variables declaration//GEN-END:variables
}
