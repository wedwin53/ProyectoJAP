package notas;

import producto.Producto;
import vendedor.Vendedor;

public class Notas {

	Integer codVendedor;
	Integer codProducto;
	Integer montoVendido;
	public Notas(Integer codVendedor, Integer codProducto, Integer montoVendido) {
		super();
		this.codVendedor = codVendedor;
		this.codProducto = codProducto;
		this.montoVendido = montoVendido;
	}
	public Integer getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}
	public Integer getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(Integer codProducto) {
		this.codProducto = codProducto;
	}
	public Integer getMontoVendido() {
		return montoVendido;
	}
	public void setMontoVendido(Integer montoVendido) {
		this.montoVendido = montoVendido;
	}
	


	
	
}
