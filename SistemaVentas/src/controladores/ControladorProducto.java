package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemaventas.Administrador;
import sistemaventas.Conexion;
import sistemaventas.Producto;
import sistemaventas.Administrador;



public class ControladorProducto {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    public ControladorProducto() {
    }
    
    public boolean guardar(Producto producto){
        boolean bandera;
        Administrador admin = new Administrador();
 String sql = "insert into producto(descripcion, stock, precio) values ('"+producto.getDescripcion()+"', "+producto.getStock()+", "+producto.getPrecio()+")";
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            //admin.limpiarTabla();
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            bandera = false;
        }
        return bandera;
    }
    
    public boolean borrar(Producto producto){
        boolean bandera;
        String sql = "DELETE FROM producto WHERE idproducto="+producto.idproducto;
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            bandera = false;
        }
        return bandera;
    }
    
    public boolean modificar(Producto producto){
        boolean bandera;
        String sql = "UPDATE producto SET descripcion ='"+producto.getDescripcion()+"' , stock="+producto.getStock()+" , precio="+producto.getPrecio()+" WHERE idproducto="+producto.getIdproducto();
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
            bandera = true;
        }catch(SQLException e) {
            System.out.println(e);
            bandera = false;
        }
        return bandera;
    }
    
    public void actualizarStock(int idprod, int cantidadNueva){
        String sql = "UPDATE producto SET stock="+cantidadNueva+" WHERE idproducto="+idprod;
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
    
}
