/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venta;

import Clientes.RegistroClientes;
import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import Proveedor.frm_proveedores;
import java.awt.Toolkit;
import Clientes.datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.menuPrincipal;
import producto.Producto;

/**
 *
 * @author Hector
 */
public class ModeloVenta extends javax.swing.JFrame {

    public ModeloVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatos("");
    }

    void mostrardatos(String valor) {
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id Detalle");
        modelo.addColumn("Producto ");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Monto");

        jTable2.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM detalleventa";
        } else {
            sql = "SELECT * FROM detalleventa WHERE (IdDetalleVenta='" + valor + "'OR producto_id ='"+ valor + "'OR cantidad ='" + valor + "'OR precio='" + valor + "')";
        }

        String[] datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
               

                modelo.addRow(datos);
            }
            jTable2.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE, null, ex);
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

        txtIdcliente1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtserie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscarCli = new javax.swing.JButton();
        btnBuscarProd = new javax.swing.JButton();
        btnAddprecio = new javax.swing.JButton();
        spinCant = new javax.swing.JSpinner();
        txtcli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtprod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtisv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtvendedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_vendedor1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnventa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        subt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtotalapagar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Punto de Venta \"Servicios Múltiples Cueva\"");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("\"Así abrimos, día a día, el camino del fúturo...\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tel: 9927-5893");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nº Factura");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txtserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserieActionPerformed(evt);
            }
        });
        txtserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtserieKeyTyped(evt);
            }
        });
        jPanel1.add(txtserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 90, 104, 34));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CAI");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txtcai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcaiKeyTyped(evt);
            }
        });
        jPanel1.add(txtcai, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 740, 180));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("COD: CLIENTE:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });
        txtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 12, 119, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("COD: PRODUCTO:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 45, -1, -1));

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 46, 119, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("PRECIO:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtprecio.setEditable(false);
        jPanel2.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 119, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("CANTIDAD");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCliMouseClicked(evt);
            }
        });
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 11, 80, -1));

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarProdMouseClicked(evt);
            }
        });
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 45, 80, -1));

        btnAddprecio.setText("Agregar");
        btnAddprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddprecioActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 80, -1));

        spinCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        spinCant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinCantStateChanged(evt);
            }
        });
        jPanel2.add(spinCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 119, 30));

        txtcli.setEditable(false);
        jPanel2.add(txtcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 12, 178, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("PRODUC:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        txtprod.setEditable(false);
        jPanel2.add(txtprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 180, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("ISV:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("CLIENTE:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtisv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisvActionPerformed(evt);
            }
        });
        jPanel2.add(txtisv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 180, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("COD:VENDE:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvendedorActionPerformed(evt);
            }
        });
        txtvendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvendedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvendedorKeyTyped(evt);
            }
        });
        jPanel2.add(txtvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("VENDEDOR");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jButton2.setText("Buscar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, -1));

        txt_vendedor1.setEditable(false);
        jPanel2.add(txt_vendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 740, 180));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Facturas Detalle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(306, 306, 306))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 740, 210));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Monto x Producto");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        btnventa.setText("Generar Venta");
        btnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventaActionPerformed(evt);
            }
        });
        jPanel4.add(btnventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, -1));

        subt.setEditable(false);
        jPanel4.add(subt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 120, 40));

        jButton3.setText("Atrás");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton4.setText("Ver Facturas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtotalapagar.setEditable(false);
        txtotalapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalapagarActionPerformed(evt);
            }
        });
        jPanel4.add(txtotalapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 120, 35));

        jButton5.setText("Cancelar Factura");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jButton6.setText("Calcular Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 740, 130));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtotalapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalapagarActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void txtCodClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodClienteKeyReleased

    void calularTotal() {
        /*        tpagar = 0;
         for (int i = 0; i < jTable1.getRowCount(); i++) {
         cant = Integer.parseInt(jTable1.getValueAt(i, 3).toString());
         pre = Double.parseDouble(jTable1.getValueAt(i, 4).toString());
         tpagar = tpagar + (cant * pre);

         }
         txtotalapagar.setText("" + tpagar + "");
         */
    }


    private void btnBuscarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCliMouseClicked
        // TODO add your handling code here:
        try {
            String num_id_cliente = txtCodCliente.getText();

            ConexionSQL cc = new ConexionSQL();
            Connection nn = cc.getConnection();

            PreparedStatement pst = nn.prepareStatement("Select * from cliente where Cli_id =?");

            pst.setString(1, num_id_cliente);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtcli.setText(rs.getString("Nombre_Cliente"));
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente no se encuentra registrado");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarCliMouseClicked

    private void btnBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProdMouseClicked
        // TODO add your handling code here:
        try {
            int nombre = Integer.parseInt(txtCodProducto.getText());

            ConexionSQL cc = new ConexionSQL();
            Connection nn = cc.getConnection();

            PreparedStatement pst = nn.prepareStatement("Select * from productos where IdProducto =?");

            pst.setInt(1, nombre);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txtprod.setText(rs.getString("Nombre"));
                txtprecio.setText(rs.getString("Precio"));
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no se encuentra registrado");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarProdMouseClicked

    private void txtvendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvendedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvendedorKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
            String num_id_empleado = txtvendedor.getText();

            ConexionSQL cc = new ConexionSQL();
            Connection nn = cc.getConnection();

            PreparedStatement pst = nn.prepareStatement("Select * from vendedor where Vendedor_id =?");

            pst.setString(1, num_id_empleado);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_vendedor1.setText(rs.getString("nombre_empleado"));
            } else {
                JOptionPane.showMessageDialog(null, "El Empleado no se encuentra registrado");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void spinCantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinCantStateChanged
        double role = Integer.parseInt(spinCant.getValue().toString());
        double prec = Integer.parseInt(txtprecio.getText());
        
        
        
        
        double pre = Integer.parseInt(txtprecio.getText().toString());
        double princi = Integer.parseInt(txtisv.getText().toString());
        
        
        double secon = princi *0.01;
            double terc = secon * pre;
            double to = terc  + pre;
           

      

        

        double tot = role * to;

        subt.setText(String.valueOf(Math.round(tot)));
    }//GEN-LAST:event_spinCantStateChanged

    private void btnAddprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddprecioActionPerformed
        // TODO add your handling code here:
if (txtserie.getText().equals("") || txtCodProducto.getText().equals("")|| txtCodProducto.getText().equals("") || txtprecio.getText().equals("") || subt.getText().equals("")||
        txtvendedor.getText().equals("") || txt_vendedor1.getText().equals("")){
      JOptionPane.showMessageDialog(null, "Todos los campos tienen que ir llenos");
}else{
        DefaultTableModel model = new DefaultTableModel();

        model = (DefaultTableModel) jTable2.getModel();

        model.addRow(new Object[]{
            txtserie.getText(),
            txtCodProducto.getText(),
            spinCant.getValue().toString(),
            txtprecio.getText(),
            subt.getText()

        });

        txtCodProducto.setText("");

        txtprod.setText("");
}

    }//GEN-LAST:event_btnAddprecioActionPerformed
void limpiar(){
txtserie.setText("");
        txtCodCliente.setText("");
        txtvendedor.setText("");
        txtisv.setText("");
        txtcai.setText("");
        subt.setText("");
        spinCant.setValue("");
        txtprecio.setText("");
        txtcli.setText("");
        txtprod.setText("");
        txt_vendedor1.setText("");
        txtisv.setText("");
        txtcli.setText("");
        txtprecio.setText("");
}
    private void btnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventaActionPerformed

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        try {

            PreparedStatement pst = cn.prepareStatement("INSERT INTO ventas(IdVentas,Cliente_IdCliente,Vendedor_IdVendedor,isv,cai,monto) VALUES(?,?,?,?,?,?)");
            pst.setString(1, txtserie.getText());
            pst.setString(2, txtCodCliente.getText());
            pst.setString(3, txtvendedor.getText());
            pst.setString(4, txtisv.getText());
            pst.setString(5, txtcai.getText());
            pst.setString(6, txtotalapagar.getText());

            int a = pst.executeUpdate();
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
                mostrardatos("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }

        } catch (Exception e) {

        }
       

        double sum = 0;
        

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            
         

            sum = sum + Integer.parseInt(jTable2.getValueAt(i, 5).toString()) ;

        }
        Math.round(sum);
        txtotalapagar.setText(Integer.toString((int) sum));
    }//GEN-LAST:event_btnventaActionPerformed

    private void txtisvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtisvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtisvActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtCodClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteKeyPressed

    private void txtCodClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtCodCliente.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCodClienteKeyTyped

    private void txtCodProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtCodProducto.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCodProductoKeyTyped

    private void txtvendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvendedorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtvendedor.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtvendedorKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VerFacturaVenta ver = new VerFacturaVenta();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = jTable2.getSelectedRow();
        String cod = "";
        cod = jTable2.getValueAt(fila, 1).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM detalleventa WHERE IdDetalleventa= '" + cod + "'");
            pst.executeUpdate();
            
            mostrardatos("");// TODO add your handling code here:
            JOptionPane.showMessageDialog(null, "Se a eliminado con exito");
            
        } catch (Exception e) {
        }
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void txtvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvendedorActionPerformed

    private void txtserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserieActionPerformed

    private void txtserieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserieKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtserieKeyTyped

    private void txtcaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaiKeyTyped
char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtcaiKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
           double sum = 0;

        for (int i = 0; i < jTable2.getRowCount(); i++) {

            sum = sum + Integer.parseInt(jTable2.getValueAt(i, 4).toString());

        }
        Math.round(sum);
        
        txtotalapagar.setText(String.valueOf(sum));
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModeloVenta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddprecio;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnventa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner spinCant;
    private javax.swing.JTextField subt;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtIdcliente1;
    private javax.swing.JTextField txt_vendedor1;
    private javax.swing.JTextField txtcai;
    private javax.swing.JTextField txtcli;
    private javax.swing.JTextField txtisv;
    private javax.swing.JTextField txtotalapagar;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprod;
    private javax.swing.JTextField txtserie;
    private javax.swing.JTextField txtvendedor;
    // End of variables declaration//GEN-END:variables

}
