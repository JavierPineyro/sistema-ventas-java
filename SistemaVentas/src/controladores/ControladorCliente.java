package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import sistemaventas.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistemaventas.Cliente;

public class ControladorCliente {
    Conexion conexion = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    public ControladorCliente() {
    }
    
    // AGREGAR Le paso un cliente y es agregado por el admin
    public boolean crearUsuario(Cliente cliente){
        boolean bandera;
        String sql = "insert into cliente(nombre, usuario, password, idrol) values ('"+cliente.getNombre()+"', '"+cliente.getUsuario()+"', '"+cliente.getPassword()+"', "+cliente.getIdrol()+")";
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            System.out.println("No se pude accerde a ControladorCliente.crearUsuario");
            bandera = false;
        }
        return bandera;
    }
    
    // BORRAR
    public boolean borrarUsuario(Cliente cliente){
        boolean bandera;
        String sql = "DELETE FROM cliente WHERE idcliente="+cliente.getIdcliente();
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            System.out.println("No se pude accerde a ControladorCliente.borrarUsuario");
            bandera = false;
        }
        return bandera;
    }
    
    // BUSCAR 1
    public Cliente buscarCliente(String username){
        int idcliente, idrol;
        String nombre, usuario, password;
        Cliente clienteBuscado = new Cliente(0, "", "", "", 0);
        
        String sql = "select * from cliente where usuario='"+username+"';";
        try {
                    
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            rs=st.executeQuery(sql);

            idcliente = rs.getInt("idcliente");
            idrol = rs.getInt("idrol");
            nombre = rs.getString("nombre");
            usuario = rs.getString("usuario");
            password = rs.getString("password");
            
            clienteBuscado.setIdcliente(idcliente);
            clienteBuscado.setIdrol(idrol);
            clienteBuscado.setNombre(nombre);
            clienteBuscado.setUsuario(usuario);
            clienteBuscado.setPassword(password);
            
            JOptionPane.showMessageDialog(null, "Usuario Encontrado");
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Usuario No Encontrado o No Existe");
        }
        return clienteBuscado;
    }
    
    // EDITAR
    public boolean editarUsuario(Cliente cliente){
        boolean bandera;
        String sql = "UPDATE cliente SET nombre='"+cliente.getNombre()+"' , usuario='"+cliente.getUsuario()+"' , password='"+cliente.getPassword()+"' , idrol="+cliente.getIdrol()+" WHERE idcliente="+cliente.getIdcliente();
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            System.out.println("No se pude accerde a ControladorCliente.editarUsuario");
            bandera = false;
        }
        return bandera;
    }
}
