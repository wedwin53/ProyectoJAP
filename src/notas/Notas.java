package notas;

import producto.Producto;
import vendedor.Vendedor;

public class Notas {

	Vendedor codVendedor;
	Producto codProducto;
	int montoVendido;
	
	public Notas(Vendedor codVendedor, Producto codProducto, int montoVendido) {
		super();
		this.codVendedor = codVendedor;
		this.codProducto = codProducto;
		this.montoVendido = montoVendido;
	}
	
	public Vendedor getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(Vendedor codVendedor) {
		this.codVendedor = codVendedor;
	}
	public Producto getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(Producto codProducto) {
		this.codProducto = codProducto;
	}
	public int getMontoVendido() {
		return montoVendido;
	}
	public void setMontoVendido(int montoVendido) {
		this.montoVendido = montoVendido;
	}
	
	
}
