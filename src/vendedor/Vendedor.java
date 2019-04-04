package vendedor;

public class Vendedor {
	int codVendedor;
	String nombreVendedor;
	public Vendedor(int i, String nombreVendedor) {
		super();
		this.codVendedor = i;
		this.nombreVendedor = nombreVendedor;
	}
	public int getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
}
