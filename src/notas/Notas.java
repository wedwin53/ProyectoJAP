package notas;


public class Notas {

	String codVendedor;
	String codProducto;
	int montoVendido;

    public Notas(String codVendedor, String codProducto, int montoVendido) {
        this.codVendedor = codVendedor;
        this.codProducto = codProducto;
        this.montoVendido = montoVendido;
    }
    
    public Notas(){
        
    }

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public int getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(int montoVendido) {
        this.montoVendido = montoVendido;
    }
        

	
}
