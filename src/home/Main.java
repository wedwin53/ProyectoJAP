package home;

import vendedor.Vendedor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor vendedor = new Vendedor(1, "Junior Arce Pacheco");
		
		System.out.println("<<<< Proyecto Junior Arce Pacheco >>>>");
		System.out.println("");
		System.out.println("");
		System.out.println("Vendedor Registrado: " + vendedor.getNombreVendedor());
	}

}
