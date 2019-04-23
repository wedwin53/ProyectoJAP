package vendedor;

public class Vendedor {
	String codVendedor;
	int montoVentas;
        String productoVendido;

    public Vendedor(String codVendedor, int montoVentas, String productoVendido) {
        this.codVendedor = codVendedor;
        this.montoVentas = montoVentas;
        this.productoVendido = productoVendido;
    }

    public Vendedor() {
        
    }
    

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public int getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(int montoVentas) {
        this.montoVentas = montoVentas;
    }

    public String getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(String productoVendido) {
        this.productoVendido = productoVendido;
    }
	
	
}
