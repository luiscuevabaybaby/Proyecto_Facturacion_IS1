/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos.contacto_proveedor;

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
public final class ContactoP extends javax.swing.JFrame {

    /**
     *
     */
    public ContactoP() {
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

        tabla3.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM proveedor_contacto";
        } else {
            sql = "SELECT * FROM proveedor_contacto WHERE (ID_Contacto_Proveedor='" + valor + "' OR extension='" + valor + "'OR num_Telefonica='" + valor + "' OR Celular='" + valor + "'OR correo='" + valor + "')";
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
            tabla3.setModel(modelo);
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
        Numero_Telefonico = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idcc = new javax.swing.JTextField();
        extencion = new javax.swing.JTextField();
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

        jLabel1.setText("Contacto Proveedor");

        jLabel2.setText("Numero Telefonico");

        Numero_Telefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numero_TelefonicoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Numero_Telefonico);

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

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });

        Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CelularKeyTyped(evt);
            }
        });

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla3.setComponentPopupMenu(jPopupMenu1);
        tabla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla3);

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Contacto");

        idcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idccActionPerformed(evt);
            }
        });
        idcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idccKeyTyped(evt);
            }
        });

        extencion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                extencionKeyTyped(evt);
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
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(idcc)
                                            .addComponent(extencion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(idcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(extencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        if (idcc.getText().equals("") || extencion.getText().equals("") || Numero_Telefonico.getText().equals("") || Correo.getText().equals("") || Celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
        } else {

            if (esEmail(Correo.getText())) {

                if (existeUsuario(idcc.getText()) == 0) {

                    if (existeCorreo(Correo.getText()) == 0) {

                        if (existeTel(Numero_Telefonico.getText()) == 0) {

                            if (existeNum(Celular.getText()) == 0) {

                                try {

                                    PreparedStatement pst = cn.prepareStatement("INSERT INTO proveedor_contacto(ID_Contacto_Proveedor,extension,num_Telefonica,Celular,correo) VALUES(?,?,?,?,?)");
                                    pst.setString(1, idcc.getText());
                                    pst.setString(2, extencion.getText());
                                    pst.setString(3, Numero_Telefonico.getText());
                                    pst.setString(5, Correo.getText());
                                    pst.setString(4, Celular.getText());

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
        mostrardatos(buscar.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    public int existeUsuario(String usuario) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM proveedor_contacto WHERE ID_Contacto_Proveedor = ?";

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

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM proveedor_contacto WHERE correo = ?";

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

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM proveedor_contacto WHERE num_Telefonica = ?";

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

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM proveedor_contacto WHERE Celular = ?";

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
        int fila = tabla3.getSelectedRow();
        if (fila >= 0) {

            idcc.setText(tabla3.getValueAt(fila, 0).toString());
            extencion.setText(tabla3.getValueAt(fila, 1).toString());
            Numero_Telefonico.setText(tabla3.getValueAt(fila, 2).toString());
            Correo.setText(tabla3.getValueAt(fila, 4).toString());
            Celular.setText(tabla3.getValueAt(fila, 3).toString());
            id = tabla3.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (idcc.getText().equals("") || extencion.getText().equals("") || Numero_Telefonico.getText().equals("") || Correo.getText().equals("") || Celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
        } else {

            if (esEmail(Correo.getText())) {
                try {
                    PreparedStatement pst = cn.prepareStatement("UPDATE proveedor_contacto SET  ID_Contacto_Proveedor='" + idcc.getText() + "'  ,extension='" + extencion.getText() + "', num_Telefonica='" + Numero_Telefonico.getText() + "',Celular='" + Celular.getText() + "',correo='" + Correo.getText() + "' WHERE ID_Contacto_Proveedor='" + id + "' ");
                    id = idcc.getText();
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
        int fila = tabla3.getSelectedRow();
        String cod = "";
        cod = tabla3.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM proveedor_contacto WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Se a eliminado con exito");
            // TODO add your handling code here:
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void idccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idccActionPerformed

    }//GEN-LAST:event_idccActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tabla3.getSelectedRow();
        String cod = "";
        cod = tabla3.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM proveedor_contacto WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Se a eliminado con exito");
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

    private void idccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idccKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if( idcc.getText().length() >= 5){
            evt.consume();
        }
    }//GEN-LAST:event_idccKeyTyped

    private void extencionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extencionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if( extencion.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_extencionKeyTyped

    private void CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }else if(Celular.getText().startsWith("1") || Celular.getText().startsWith("2") || Celular.getText().startsWith("4") || Celular.getText().startsWith("5") || Celular.getText().startsWith("6") || Celular.getText().startsWith("7") || Celular.getText().startsWith("0") ){
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 3, 8 o 9");
        }
        if( Celular.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_CelularKeyTyped

    private void Numero_TelefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numero_TelefonicoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }else if(Numero_Telefonico.getText().startsWith("1") || Numero_Telefonico.getText().startsWith("3") || Numero_Telefonico.getText().startsWith("4") || Numero_Telefonico.getText().startsWith("5") || Numero_Telefonico.getText().startsWith("6") || Numero_Telefonico.getText().startsWith("7") || Numero_Telefonico.getText().startsWith("8") || Numero_Telefonico.getText().startsWith("9") || Numero_Telefonico.getText().startsWith("0") ){
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 2");
        }
        if( Numero_Telefonico.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_Numero_TelefonicoKeyTyped

    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
        if( Correo.getText().length() >= 40){
            evt.consume();
        }else if( Correo.getText().length() == 39){
            JOptionPane.showMessageDialog(null, "El limite de caracteres de es 40");
     
        }
    }//GEN-LAST:event_CorreoKeyTyped

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped


    }//GEN-LAST:event_buscarKeyTyped

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        idcc.setText("");
        extencion.setText("");
        Numero_Telefonico.setText("");
        Correo.setText("");
        Celular.setText("");

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
    private void tabla3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla3MouseClicked
       int fila = tabla3.getSelectedRow();
        if (fila >= 0) {

            idcc.setText(tabla3.getValueAt(fila, 0).toString());
            extencion.setText(tabla3.getValueAt(fila, 1).toString());
            Numero_Telefonico.setText(tabla3.getValueAt(fila, 2).toString());
            Correo.setText(tabla3.getValueAt(fila, 4).toString());
            Celular.setText(tabla3.getValueAt(fila, 3).toString());
            id = tabla3.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_tabla3MouseClicked

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
            java.util.logging.Logger.getLogger(ContactoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactoP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextPane Numero_Telefonico;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField extencion;
    private javax.swing.JTextField idcc;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables

}
