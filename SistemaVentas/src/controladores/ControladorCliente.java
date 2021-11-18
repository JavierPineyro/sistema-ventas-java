package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import sistemaventas.Conexion;

public class ControladorCliente {
    Conexion conexion = new Conexion();
    Connection con;
    Statement stm;
    ResultSet res;
    DefaultTableModel modelo;
    int id;
    
    public ControladorCliente() {
    }
    
    
}
