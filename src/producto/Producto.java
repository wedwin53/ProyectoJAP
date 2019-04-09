package producto;

public class Producto {
	int codProducto;
	String nombreProducto;
	int precio;
	
	public Producto(int codProducto, String nombreProducto, int precio) {
		super();
		this.codProducto = codProducto;
		//this.nombreProducto = nombreProducto;
		this.precio = precio;
	}
	
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
