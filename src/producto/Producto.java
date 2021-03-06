/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import Clientes.RegistroClientes;
import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;

import Proveedor.frm_proveedores;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.menuPrincipal;

/**
 *
 * @author luisc
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    public Producto() {
        initComponents();
        mostrardatos("");
        this.setLocationRelativeTo(null);
    }

    void mostrardatos(String valor) {

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Precio");

        tablaproducto.setModel(modelo);
        String sql = "";

        if (valor.equals("")) {
            sql = "SELECT * FROM productos";
        } else {

            sql = "SELECT * FROM productos Where(IdProducto='" + valor + "'OR Nombre='" + valor + "'OR Precio='" + valor + "')";
        }

        String[] datos = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);

                modelo.addRow(datos);
            }
            tablaproducto.setModel(modelo);
        } catch (SQLException e) {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_producto_txt = new javax.swing.JTextField();
        nom_producto_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproducto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        buscar_btn = new javax.swing.JButton();
        buscar_txt = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        precio_double = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, nom_producto_txt, org.jdesktop.beansbinding.ObjectProperty.create(), id_producto_txt, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        id_producto_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_producto_txtActionPerformed(evt);
            }
        });
        id_producto_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_producto_txtKeyTyped(evt);
            }
        });
        getContentPane().add(id_producto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 113, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTextField(), org.jdesktop.beansbinding.ObjectProperty.create(), nom_producto_txt, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        nom_producto_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_producto_txtKeyTyped(evt);
            }
        });
        getContentPane().add(nom_producto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 113, 32));

        guardar_btn.setBackground(new java.awt.Color(0, 0, 153));
        guardar_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardar_btn.setText("Guardar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(guardar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 70, -1));

        edit_btn.setBackground(new java.awt.Color(0, 0, 153));
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Editar");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 70, -1));

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Atrás");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 70, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 70, -1));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 70, -1));

        tablaproducto.setForeground(new java.awt.Color(0, 0, 204));
        tablaproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaproducto.setComponentPopupMenu(jPopupMenu2);
        tablaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 745, 140));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Registrar Proveedor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Registrar Compra");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Registrar Venta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        buscar_btn.setBackground(new java.awt.Color(0, 0, 153));
        buscar_btn.setForeground(new java.awt.Color(255, 255, 255));
        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        buscar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_txtActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, 30));

        jButton10.setBackground(new java.awt.Color(0, 0, 153));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Mostrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 30));

        jButton11.setBackground(new java.awt.Color(0, 0, 153));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Inicio");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        precio_double.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        precio_double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_doubleActionPerformed(evt);
            }
        });
        getContentPane().add(precio_double, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void limpiar() {
        id_producto_txt.setText("");
        nom_producto_txt.setText("");
        precio_double.setText("");
    }

    void desbloquear() {
        id_producto_txt.setEnabled(true);
        nom_producto_txt.setEnabled(true);
        precio_double.setEnabled(true);
        guardar_btn.setEnabled(true);
        jButton2.setEnabled(true);
        jButton7.setEnabled(true);

    }

    void bloquear() {
        id_producto_txt.setEnabled(false);
        nom_producto_txt.setEnabled(false);
        precio_double.setEnabled(false);
        guardar_btn.setEnabled(false);
        jButton2.setEnabled(true);
        jButton7.setEnabled(false);
        jButton6.setEnabled(true);
        jButton4.setEnabled(true);
    }


    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (id_producto_txt.getText().equals("") || nom_producto_txt.getText().equals("") || precio_double.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
        } else {
            if (precio_double.getText().startsWith("1") || precio_double.getText().startsWith("2") || precio_double.getText().startsWith("3") || precio_double.getText().startsWith("4")
                    || precio_double.getText().startsWith("5") || precio_double.getText().startsWith("6") || precio_double.getText().startsWith("7") || precio_double.getText().startsWith("8")
                    || precio_double.getText().startsWith("9")) {
                
                if (id_producto_txt.getText().startsWith("1") || id_producto_txt.getText().startsWith("2") || id_producto_txt.getText().startsWith("3") || id_producto_txt.getText().startsWith("4")
                    || id_producto_txt.getText().startsWith("5") || id_producto_txt.getText().startsWith("6") || id_producto_txt.getText().startsWith("7") || id_producto_txt.getText().startsWith("8")
                    || id_producto_txt.getText().startsWith("9")) {

                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO productos(IdProducto, Nombre, Precio) VALUES(?,?,?)");
                    pst.setString(1, id_producto_txt.getText());
                    pst.setString(2, nom_producto_txt.getText());
                    pst.setString(3, precio_double.getText());

                    int a = pst.executeUpdate();

                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        limpiar();
                        mostrardatos("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Agregar");
                    }
                } catch (Exception e) {
                }
                }else{
                    JOptionPane.showMessageDialog(null, "El ID no debe de ser 0");
                }
        }else{
                JOptionPane.showMessageDialog(null, "El precio no debe de ser 0");
            }
                }

    }//GEN-LAST:event_guardar_btnActionPerformed
    String id = "";
    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        if (id_producto_txt.getText().equals("") || nom_producto_txt.getText().equals("") || precio_double.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
        } else {

            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE productos SET IdProducto='" + id_producto_txt.getText() + "',Nombre='" + nom_producto_txt.getText() + "',Precio='" + precio_double.getText() + "'WHERE IdProducto='" + id + "'");
                id = id_producto_txt.getText();
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se a modificado con exito");
                limpiar();
                mostrardatos("");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Esta segura que desea borrar?");
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        int fila = tablaproducto.getSelectedRow();
        String cod = "";
        cod = tablaproducto.getValueAt(fila, 0).toString();
        if (i == 0) {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM productos WHERE IdProducto='" + cod + "'");
                pst.executeUpdate();
                mostrardatos("");
                int a = pst.executeUpdate();
                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
                } else {
                    JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
                }
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed


    private void tablaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductoMouseClicked
        int fila = tablaproducto.getSelectedRow();
        if (fila >= 0) {
            id_producto_txt.setText(tablaproducto.getValueAt(fila, 0).toString());
            nom_producto_txt.setText(tablaproducto.getValueAt(fila, 1).toString());
            precio_double.setText(tablaproducto.getValueAt(fila, 2).toString());
            id = tablaproducto.getValueAt(fila, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se Encontro Fila");
        }
    }//GEN-LAST:event_tablaproductoMouseClicked

    private void buscar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_txtActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        mostrardatos(buscar_txt.getText());
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila = tablaproducto.getSelectedRow();
        if (fila >= 0) {
            id_producto_txt.setText(tablaproducto.getValueAt(fila, 0).toString());
            nom_producto_txt.setText(tablaproducto.getValueAt(fila, 1).toString());
            precio_double.setText(tablaproducto.getValueAt(fila, 2).toString());
            id = tablaproducto.getValueAt(fila, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se Encontro Fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void id_producto_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_producto_txtActionPerformed
        // TODO add your handling code here:char c = evt.getKeyChar();


    }//GEN-LAST:event_id_producto_txtActionPerformed

    private void id_producto_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_producto_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (id_producto_txt.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_id_producto_txtKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RegistroClientes rc = new RegistroClientes();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistrarEmpleados re = new RegistrarEmpleados();
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        frm_proveedores fp = new frm_proveedores();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void nom_producto_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_producto_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

        if (nom_producto_txt.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nom_producto_txtKeyTyped

    private void precio_doubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_doubleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_doubleActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id_producto_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom_producto_txt;
    private javax.swing.JFormattedTextField precio_double;
    private javax.swing.JTable tablaproducto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
