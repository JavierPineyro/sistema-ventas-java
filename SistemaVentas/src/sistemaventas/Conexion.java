/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection GetConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/sistemaventas";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException   ex){
            JOptionPane.showMessageDialog(null, ex, "error en la conexion"+ ex.getMessage(),JOptionPane.ERROR_MESSAGE);
            conexion=null;}
        finally{
            return conexion;
        }
    }
}
