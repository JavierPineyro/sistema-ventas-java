/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;
import controladores.ControladorCliente;
import java.sql.SQLException;
import sistemaventas.Administrador;
import sistemaventas.Cliente;


import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AdminClientes extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    /**
     * Creates new form AdminClientes
     */
    public AdminClientes() {
        initComponents();
        setLocationRelativeTo(null);
        listarClientes();
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
        adminNameCliente = new javax.swing.JTextField();
        adminIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminSalirCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buscadorCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textoNombreCliente = new javax.swing.JTextField();
        textoUsuarioCliente = new javax.swing.JTextField();
        textoIdCliente = new javax.swing.JTextField();
        textoRolCliente = new javax.swing.JTextField();
        textoPasswordCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonReset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        adminNameCliente.setEditable(false);
        adminNameCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNameClienteActionPerformed(evt);
            }
        });

        adminIdCliente.setEditable(false);
        adminIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIdClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("IDUser");

        jLabel2.setText("Usuario");

        adminSalirCliente.setBackground(new java.awt.Color(255, 204, 204));
        adminSalirCliente.setForeground(new java.awt.Color(255, 0, 0));
        adminSalirCliente.setText("ATRAS");
        adminSalirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSalirClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminNameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(adminSalirCliente)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(adminIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminNameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adminSalirCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        buscadorCliente.setEditable(false);

        jLabel3.setText("Buscador");

        botonBuscar.setText("Buscar Usuario");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(buscadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar)
                        .addGap(176, 176, 176))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        textoUsuarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioClienteActionPerformed(evt);
            }
        });

        textoIdCliente.setEditable(false);

        jLabel4.setText("ID");

        jLabel5.setText("Nombre");

        jLabel6.setText("Usuario");

        jLabel7.setText("Password");

        jLabel8.setText("Rol");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonReset.setText("Reset");
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Usuario", "Password", "Rol"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textoRolCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(botonEditar)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(textoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoRolCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminNameClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNameClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNameClienteActionPerformed

    private void adminIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminIdClienteActionPerformed

    private void adminSalirClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSalirClienteMouseClicked
        Administrador admini = new Administrador();
        admini.setVisible(true);
        admini.setLocationRelativeTo(null);
        admini.adminId.setText(adminIdCliente.getText());
        admini.adminName.setText(adminNameCliente.getText());
        this.dispose();
    }//GEN-LAST:event_adminSalirClienteMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String textBuscar = buscadorCliente.getText();
        ControladorCliente clien = new ControladorCliente();
        Cliente clienteEncontrado = clien.buscarCliente(textBuscar);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        int idClienteNuevo, idRolCliente;
        String nombreCLiente, usuarioCliente, passCliente;
        boolean resultado;
        // Auxiliares para luego pasarlos a INT
        String idAux, rolAux;
        
        idAux = textoIdCliente.getText();
        nombreCLiente = textoNombreCliente.getText();
        usuarioCliente = textoUsuarioCliente.getText();
        passCliente = textoPasswordCliente.getText();
        rolAux = textoRolCliente.getText();
        
        // El campo del ID debe de estar VACIO, por eso el ultimo statement
        if(("".equals(nombreCLiente) || "".equals(usuarioCliente) || "".equals(passCliente) || "".equals(rolAux)) || !"".equals(passCliente)){
            JOptionPane.showMessageDialog(null, "Debe Completar Todos los campos o Reset el ID");
        }else{
            
            // ID pasado a INT
            idRolCliente = Integer.parseInt(rolAux);
            
            ControladorCliente ctrCliente = new ControladorCliente();
            Cliente clientToAdd = new Cliente(nombreCLiente, usuarioCliente, passCliente, idRolCliente);
            resultado = ctrCliente.crearUsuario(clientToAdd);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "El Cliente Ha Sido Agregado");
                listarClientes();
            }else{
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error Agregando el Cliente");
            }
            
            textoIdCliente.setText("");
            textoNombreCliente.setText("");
            textoUsuarioCliente.setText("");
            textoPasswordCliente.setText("");
            textoRolCliente.setText("");
            limpiarTablaCliente();
            listarClientes();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int idClienteNuevo, idRolCliente;
        String nombreCLiente, usuarioCliente, passCliente;
        boolean result;
        
        // Auxiliares para luego pasarlos a INT
        String  idAux, rolAux;
        
        idAux = textoIdCliente.getText();
        nombreCLiente = textoNombreCliente.getText();
        usuarioCliente = textoUsuarioCliente.getText();
        passCliente = textoPasswordCliente.getText();
        rolAux = textoRolCliente.getText();
       
        if("".equals(idAux) || "".equals(nombreCLiente) || "".equals(usuarioCliente) || "".equals(passCliente) || "".equals(rolAux)){
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Cliente para borrar");
        }else{
            
            // Paso a INT los auxiliares
            idClienteNuevo = Integer.parseInt(idAux);
            idRolCliente = Integer.parseInt(rolAux);
            
            ControladorCliente controladorClient= new ControladorCliente();
            Cliente clienteBorrar = new Cliente(idClienteNuevo, nombreCLiente, usuarioCliente, passCliente, idRolCliente);
            result = controladorClient.borrarUsuario(clienteBorrar);
            if(result == true){
                JOptionPane.showMessageDialog(null, "El Cliente Ha Sido Borrado");
                listarClientes();
            }else{
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error Borrando el Cliente");
            }
            textoIdCliente.setText("");
            textoNombreCliente.setText("");
            textoUsuarioCliente.setText("");
            textoPasswordCliente.setText("");
            textoRolCliente.setText("");
            limpiarTablaCliente();
            listarClientes();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        int idClienteNuevo, idRolCliente;
        String nombreCLiente, usuarioCliente, passCliente;
        boolean result;
        
        // Auxiliares para luego pasarlos a INT
        String  idAux, rolAux;
        
        idAux = textoIdCliente.getText();
        nombreCLiente = textoNombreCliente.getText();
        usuarioCliente = textoUsuarioCliente.getText();
        passCliente = textoPasswordCliente.getText();
        rolAux = textoRolCliente.getText();
        
        if("".equals(idAux) || "".equals(nombreCLiente) || "".equals(usuarioCliente) || "".equals(passCliente) || "".equals(rolAux)){
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Cliente para editar");
        }else{
            // Paso a INT los auxiliares
            idClienteNuevo = Integer.parseInt(idAux);
            idRolCliente = Integer.parseInt(rolAux);
            
            ControladorCliente controladorClient= new ControladorCliente();
            Cliente clienteEditar = new Cliente(idClienteNuevo, nombreCLiente, usuarioCliente, passCliente, idRolCliente);
            result = controladorClient.editarUsuario(clienteEditar);
            
            if(result == true){
                JOptionPane.showMessageDialog(null, "El Cliente Ha Sido Modificado");
                listarClientes();
            }else{
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error Modificando el Cliente");
            }
            textoIdCliente.setText("");
            textoNombreCliente.setText("");
            textoUsuarioCliente.setText("");
            textoPasswordCliente.setText("");
            textoRolCliente.setText("");
            limpiarTablaCliente();
            listarClientes();
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        textoIdCliente.setText("");
        textoNombreCliente.setText("");
        textoUsuarioCliente.setText("");
        textoPasswordCliente.setText("");
        textoRolCliente.setText("");
    }//GEN-LAST:event_botonResetActionPerformed

    private void textoUsuarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
         int fila = tablaClientes.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Cliente no seleccionado");
        }else{
            id = Integer.parseInt((String)tablaClientes.getValueAt(fila, 0).toString());
            String name = (String)tablaClientes.getValueAt(fila, 1);
            String username = (String)tablaClientes.getValueAt(fila, 2).toString();
            String pass = (String)tablaClientes.getValueAt(fila, 3).toString();
            int idRol = Integer.parseInt((String)tablaClientes.getValueAt(fila, 4).toString());
            
            textoIdCliente.setText(""+id);
            textoNombreCliente.setText(name);
            textoUsuarioCliente.setText(""+username);
            textoPasswordCliente.setText(""+pass);
            textoRolCliente.setText(""+idRol);
        }  
    }//GEN-LAST:event_tablaClientesMouseClicked

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
            java.util.logging.Logger.getLogger(AdminClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminClientes().setVisible(true);
            }
        });
    }
    
    public void listarClientes(){
        String sql = "select * from cliente";
        try {
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] clienteUnico = new Object[5];
            modelo=(DefaultTableModel)tablaClientes.getModel();
            while(rs.next()){
                clienteUnico[0] = rs.getInt("idcliente");
                clienteUnico[1] = rs.getString("nombre");
                clienteUnico[2] = rs.getString("usuario");
                clienteUnico[3] = rs.getString("password");
                clienteUnico[4] = rs.getInt("idrol");
                modelo.addRow(clienteUnico);
            }
            tablaClientes.setModel(modelo);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void limpiarTablaCliente(){       
        DefaultTableModel model = (DefaultTableModel) this.tablaClientes.getModel(); 
        int rows; 
        rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--){
           model.removeRow(i); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adminIdCliente;
    public javax.swing.JTextField adminNameCliente;
    public javax.swing.JButton adminSalirCliente;
    public javax.swing.JButton botonAgregar;
    public javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonEditar;
    public javax.swing.JButton botonReset;
    public javax.swing.JTextField buscadorCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTextField textoIdCliente;
    public javax.swing.JTextField textoNombreCliente;
    public javax.swing.JTextField textoPasswordCliente;
    public javax.swing.JTextField textoRolCliente;
    public javax.swing.JTextField textoUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}