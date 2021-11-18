
package sistemaventas;

public class Cliente {
    public int idcliente;
    public String nombre;
    public String usuario;
    public String password;
    public int idrol;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String usuario, String password, int idrol) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.idrol = idrol;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    
}
