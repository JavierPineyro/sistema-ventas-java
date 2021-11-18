package sistemaventas;
public class Compra {
    public int idcompra;
    public int idproducto;
    public int idcliente;

    public Compra() {
    }
    
    public Compra(int idproducto, int idcliente) {
        this.idproducto = idproducto;
        this.idcliente = idcliente;
    }

    public Compra(int idcompra, int idproducto, int idcliente) {
        this.idcompra = idcompra;
        this.idproducto = idproducto;
        this.idcliente = idcliente;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    
}
