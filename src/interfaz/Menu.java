/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JFrame;

/**
 *
 * @author jaime
 */
public class Menu extends javax.swing.JDialog {

    /**
     * Creates new form Menu
     */
    String ruta;
    String rutaCL;

    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/Comidas.txt";
        rutaCL = "src/datos/Clientes.txt";

        cmdRegistrarCliente.requestFocusInWindow();
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
        cmdRegistrarComida = new javax.swing.JButton();
        cmdRegistrarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmdSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        mnReportes = new javax.swing.JMenu();
        mnListado = new javax.swing.JMenu();
        mnListadoVentasTotal = new javax.swing.JMenuItem();
        mnListadoClientesRegistrados = new javax.swing.JMenuItem();
        mnListadoDeVentasPorComida = new javax.swing.JMenuItem();
        mnCantidadesVendidas = new javax.swing.JMenu();
        mnCantidadVendidas = new javax.swing.JMenuItem();
        mnCantidadClientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnCerrarCesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Papas.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 30, 50));

        cmdRegistrarComida.setBackground(new java.awt.Color(255, 255, 255));
        cmdRegistrarComida.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegistrarComida.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegistrarComida.setText("    REGISTRAR COMIDA");
        cmdRegistrarComida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        cmdRegistrarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmdRegistrarComida.setRequestFocusEnabled(false);
        cmdRegistrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarComidaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegistrarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 320, 70));

        cmdRegistrarCliente.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdRegistrarCliente.setForeground(new java.awt.Color(255, 0, 0));
        cmdRegistrarCliente.setText("REGISTRAR CLIENTE");
        cmdRegistrarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        cmdRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 320, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mcdonald-fast-food-wallpaper-186080.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        cmdSalir.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(255, 0, 0));
        cmdSalir.setText("SALIR");
        cmdSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 0));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 0));

        mnOpciones.setText("Opciones");

        mnReportes.setText("Reportes");

        mnListado.setText("Listado");

        mnListadoVentasTotal.setText("Listado de Ventas Total");
        mnListadoVentasTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoVentasTotalActionPerformed(evt);
            }
        });
        mnListado.add(mnListadoVentasTotal);

        mnListadoClientesRegistrados.setText("Listado de Clientes Registrados");
        mnListadoClientesRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoClientesRegistradosActionPerformed(evt);
            }
        });
        mnListado.add(mnListadoClientesRegistrados);

        mnListadoDeVentasPorComida.setText("Listado de Ventas por Comida");
        mnListadoDeVentasPorComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoDeVentasPorComidaActionPerformed(evt);
            }
        });
        mnListado.add(mnListadoDeVentasPorComida);

        mnReportes.add(mnListado);

        mnCantidadesVendidas.setText("Cantidades");

        mnCantidadVendidas.setText("Cantidades vendidas");
        mnCantidadVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidadVendidasActionPerformed(evt);
            }
        });
        mnCantidadesVendidas.add(mnCantidadVendidas);

        mnCantidadClientes.setText("Cantidad de Clientes");
        mnCantidadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidadClientesActionPerformed(evt);
            }
        });
        mnCantidadesVendidas.add(mnCantidadClientes);

        mnReportes.add(mnCantidadesVendidas);

        mnOpciones.add(mnReportes);
        mnOpciones.add(jSeparator1);

        mnCerrarCesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnCerrarCesion.setText("Cerrar Cesion");
        mnCerrarCesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarCesionActionPerformed(evt);
            }
        });
        mnOpciones.add(mnCerrarCesion);

        jMenuBar1.add(mnOpciones);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(573, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCerrarCesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCerrarCesionActionPerformed

        this.setVisible(false);
        Principal p = new Principal();
        p.setVisible(true);

    }//GEN-LAST:event_mnCerrarCesionActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdRegistrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistrarComidaActionPerformed
        Pedidos p = new Pedidos(null, true);
        p.setVisible(true);
    }//GEN-LAST:event_cmdRegistrarComidaActionPerformed

    private void mnCantidadVendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidadVendidasActionPerformed

        int cont;
        cont = Helper.traerDatos(ruta).size();
        Helper.mensaje(this, "El número de Comida ingresada es: " + cont, 1);
    }//GEN-LAST:event_mnCantidadVendidasActionPerformed

    private void mnListadoVentasTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoVentasTotalActionPerformed

        ListadoPorVentasTotal l = new ListadoPorVentasTotal(null, true);
        l.setVisible(true);
    }//GEN-LAST:event_mnListadoVentasTotalActionPerformed

    private void cmdRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistrarClienteActionPerformed

        Agregar c = new Agregar(null, true);
        c.setVisible(true);

    }//GEN-LAST:event_cmdRegistrarClienteActionPerformed

    private void mnListadoClientesRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoClientesRegistradosActionPerformed
        ListadoCLTotal lct = new ListadoCLTotal(null, true);
        lct.setVisible(true);
    }//GEN-LAST:event_mnListadoClientesRegistradosActionPerformed

    private void mnCantidadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidadClientesActionPerformed

        int cont;
        cont = Helper.traerDatosCliente(rutaCL).size();
        Helper.mensaje(this, "El número de Clientes ingresados es de: " + cont, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_mnCantidadClientesActionPerformed

    private void mnListadoDeVentasPorComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoDeVentasPorComidaActionPerformed
        ListadoPorComida lpcc = new ListadoPorComida(null, true);
        lpcc.setVisible(true);
    }//GEN-LAST:event_mnListadoDeVentasPorComidaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdRegistrarCliente;
    private javax.swing.JButton cmdRegistrarComida;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnCantidadClientes;
    private javax.swing.JMenuItem mnCantidadVendidas;
    private javax.swing.JMenu mnCantidadesVendidas;
    private javax.swing.JMenuItem mnCerrarCesion;
    private javax.swing.JMenu mnListado;
    private javax.swing.JMenuItem mnListadoClientesRegistrados;
    private javax.swing.JMenuItem mnListadoDeVentasPorComida;
    private javax.swing.JMenuItem mnListadoVentasTotal;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JMenu mnReportes;
    // End of variables declaration//GEN-END:variables
}
