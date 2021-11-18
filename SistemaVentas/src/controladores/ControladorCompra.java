package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import sistemaventas.Compra;
import sistemaventas.Conexion;

public class ControladorCompra {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public ControladorCompra() {
    }
    
    public boolean comprar(Compra compra){
        boolean bandera;
        String sql = "insert into compra(idproducto, idcliente) values ("+compra.getIdproducto()+", "+compra.getIdcliente()+")";
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
    
}
