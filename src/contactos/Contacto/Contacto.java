package contactos.Contacto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Clientes.datos;
import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public final class Contacto extends javax.swing.JFrame {

    /**
     *
     */
    public Contacto() {
        initComponents();
        mostrardatos("");
    }

    void mostrardatos(String valor) {
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id");
        modelo.addColumn("Extencion Numerica");
        modelo.addColumn("Numero Telefonico");
        modelo.addColumn("Numero Celuar");
        modelo.addColumn("Correo electronico");

        tabla1.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM vendedor_contacto";
        } else {
            sql = "SELECT * FROM vendedor_contacto WHERE (ID_Contacto_Proveedor='" + valor + "' OR extension='" + valor + "'OR num_Telefonica='" + valor + "' OR Celular='" + valor + "'OR correo='" + valor + "')";
        }

        String[] datos = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tabla1.setModel(modelo);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        num_telefonico = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField02 = new javax.swing.JTextField();
        correos = new javax.swing.JTextField();
        num_celular = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        contacto = new javax.swing.JTextField();
        extension = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar\n");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contacto Vendedor");

        jLabel2.setText("Numero Telefonico");

        num_telefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_telefonicoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(num_telefonico);

        jLabel3.setText("Extencion Numerica");

        jLabel4.setText("Correo Electronico");

        jLabel5.setText("Numero Celular");

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField02ActionPerformed(evt);
            }
        });
        jTextField02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField02KeyTyped(evt);
            }
        });

        correos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correosKeyTyped(evt);
            }
        });

        num_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_celularKeyTyped(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla1.setComponentPopupMenu(jPopupMenu1);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Contacto");

        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });
        contacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactoKeyTyped(evt);
            }
        });

        extension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                extensionKeyTyped(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Atras");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Nuevo");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(contacto)
                                            .addComponent(extension, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(correos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton1)
                                    .addComponent(jToggleButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(63, 63, 63)))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(correos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(num_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (contacto.getText().equals("") || extension.getText().equals("") || num_telefonico.getText().equals("") || correos.getText().equals("") || num_celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
        } else {

            if (esEmail(correos.getText())) {

                if (existeUsuario(contacto.getText()) == 0) {

                    if (existeCorreo(correos.getText()) == 0) {

                        if (existeTel(num_telefonico.getText()) == 0) {

                            if (existeNum(num_celular.getText()) == 0) {

                                try {

                                    PreparedStatement pst = cn.prepareStatement("INSERT INTO vendedor_contacto(ID_Contacto_Proveedor,extension,num_Telefonica,Celular,correo) VALUES(?,?,?,?,?)");
                                    pst.setString(1, contacto.getText());
                                    pst.setString(2, extension.getText());
                                    pst.setString(3, num_telefonico.getText());
                                    pst.setString(5, correos.getText());
                                    pst.setString(4, num_celular.getText());

                                    int a = pst.executeUpdate();
                                    if (a > 0) {
                                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                                        mostrardatos("");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error al agregar");
                                    }

                                } catch (Exception e) {

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "El Numero de Celular ya existe");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Numero de Telefono ya existe");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El correo ya existe");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");

                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo es invalido. Ejemplo: nombre.apellido@gmail.com");
            }

        }    // TODO // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrardatos(jTextField02.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    public int existeUsuario(String usuario) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM vendedor_contacto WHERE ID_Contacto_Proveedor = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeCorreo(String correo) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM vendedor_contacto WHERE correo = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeTel(String telefono) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM vendedor_contacto WHERE num_Telefonica = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeNum(String num) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM vendedor_contacto WHERE Celular = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, num);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    String id = "";
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tabla1.getSelectedRow();
        if (fila >= 0) {

            contacto.setText(tabla1.getValueAt(fila, 0).toString());
            extension.setText(tabla1.getValueAt(fila, 1).toString());
            num_telefonico.setText(tabla1.getValueAt(fila, 2).toString());
            correos.setText(tabla1.getValueAt(fila, 4).toString());
            num_celular.setText(tabla1.getValueAt(fila, 3).toString());
            id = tabla1.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        if (contacto.getText().equals("") || extension.getText().equals("") || num_telefonico.getText().equals("") || correos.getText().equals("") || num_celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
        } else {

            if (esEmail(correos.getText())) {
                try {
                    PreparedStatement pst = cn.prepareStatement("UPDATE vendedor_contacto SET  ID_Contacto_Proveedor='" + contacto.getText() + "'  ,extension='" + extension.getText() + "', num_Telefonica='" + num_telefonico.getText() + "',Celular='" + num_celular.getText() + "',correo='" + correos.getText() + "' WHERE ID_Contacto_Proveedor='" + id + "' ");
                    id = contacto.getText();
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se a modificado con exito");

                    mostrardatos("");
                } catch (Exception e) {
                    System.out.print(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo es invalido. Ejemplo: nombre.apellido@gmail.com");

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tabla1.getSelectedRow();
        String cod = "";
        cod = tabla1.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM vendedor_contacto  WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");// TODO add your handling code here:
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed

    }//GEN-LAST:event_contactoActionPerformed

    private void jTextField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField02ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tabla1.getSelectedRow();
        String cod = "";
        cod = tabla1.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM vendedor_contacto  WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");// TODO add your handling code here:
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        RegistrarEmpleados rg = new RegistrarEmpleados();
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void contactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (contacto.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_contactoKeyTyped

    private void extensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extensionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (extension.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_extensionKeyTyped

    private void num_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_celularKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }else if(num_celular.getText().startsWith("1") || num_celular.getText().startsWith("2") || num_celular.getText().startsWith("4") || num_celular.getText().startsWith("5") || num_celular.getText().startsWith("6") || num_celular.getText().startsWith("7") || num_celular.getText().startsWith("0") ){
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 3, 8 o 9");
        }
        
        if (num_celular.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_num_celularKeyTyped

    private void num_telefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_telefonicoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }else if(num_telefonico.getText().startsWith("1") || num_telefonico.getText().startsWith("3") || num_telefonico.getText().startsWith("4") || num_telefonico.getText().startsWith("5") || num_telefonico.getText().startsWith("6") || num_telefonico.getText().startsWith("7") || num_telefonico.getText().startsWith("8") || num_telefonico.getText().startsWith("9") || num_telefonico.getText().startsWith("0") ){
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 2");
        }
        
        if (num_telefonico.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_num_telefonicoKeyTyped

    private void correosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correosKeyTyped
        if (correos.getText().length() >= 40) {
            evt.consume();
        } else if (correos.getText().length() == 39) {
            JOptionPane.showMessageDialog(null, "El limite de caracteres es de 40");
        }
    }//GEN-LAST:event_correosKeyTyped

    private void jTextField02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField02KeyTyped


    }//GEN-LAST:event_jTextField02KeyTyped

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        contacto.setText("");
        extension.setText("");
        num_telefonico.setText("");
        correos.setText("");
        num_celular.setText("");

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int fila = tabla1.getSelectedRow();
        if (fila >= 0) {

            contacto.setText(tabla1.getValueAt(fila, 0).toString());
            extension.setText(tabla1.getValueAt(fila, 1).toString());
            num_telefonico.setText(tabla1.getValueAt(fila, 2).toString());
            correos.setText(tabla1.getValueAt(fila, 4).toString());
            num_celular.setText(tabla1.getValueAt(fila, 3).toString());
            id = tabla1.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_tabla1MouseClicked

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
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contacto;
    private javax.swing.JTextField correos;
    private javax.swing.JTextField extension;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField num_celular;
    private javax.swing.JTextPane num_telefonico;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables

}
