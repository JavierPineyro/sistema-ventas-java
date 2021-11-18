package sistemaventas;
public class Producto {
   public int idproducto;
   public String descripcion;
   public int stock;
   public float precio;

    public Producto() {
    }
    
    public Producto(int idproducto, String descripcion, int stock, float precio){
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }
    
    public Producto(String descripcion, int stock, float precio) {
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
   
   
}
