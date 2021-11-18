package sistemaventas;
public class DetalleCompra {
    public int iddetalle;
    public String nombre;
    public String producto;
    public int cantidad;
    public float precio;
    public float total;

    public DetalleCompra() {
    }
    
    public DetalleCompra(String nombre, String producto,int cantidad, float precio, float total) {
        this.nombre = nombre;
        this.producto =producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public DetalleCompra(int iddetalle, String nombre, String producto, int cantidad, float precio, float total) {
        this.iddetalle = iddetalle;
        this.nombre = nombre;
        this.producto =producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
