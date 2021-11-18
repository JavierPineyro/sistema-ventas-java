package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import sistemaventas.Conexion;
import sistemaventas.DetalleCompra;

public class ControladorDetalleCompra {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public ControladorDetalleCompra() {
    }
    
    public void crearDetalleCompra(DetalleCompra detalle){

 String sql = "insert into detalle_compra(nombre, producto, cantidad, precio, total) values ('"+detalle.getNombre()+"', '"+detalle.getProducto()+"', "+detalle.getCantidad()+", "+detalle.getPrecio()+", "+detalle.getTotal()+")";
        try { 
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            st.executeUpdate(sql);
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
}


