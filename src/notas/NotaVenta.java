/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author edwin.rebolledo
 */
public class NotaVenta {
    
    String Producto;
    int vendedor1Ventas;
    int vendedor2Ventas;
    int vendedor3Ventas;
    int vendedor4Ventas;
    
    public NotaVenta(){
        
    }

    public NotaVenta(String Producto, int vendedor1Ventas, int vendedor2Ventas, int vendedor3Ventas, int vendedor4Ventas) {
        this.Producto = Producto;
        this.vendedor1Ventas = vendedor1Ventas;
        this.vendedor2Ventas = vendedor2Ventas;
        this.vendedor3Ventas = vendedor3Ventas;
        this.vendedor4Ventas = vendedor4Ventas;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getVendedor1Ventas() {
        return vendedor1Ventas;
    }

    public void setVendedor1Ventas(int vendedor1Ventas) {
        this.vendedor1Ventas = vendedor1Ventas;
    }

    public int getVendedor2Ventas() {
        return vendedor2Ventas;
    }

    public void setVendedor2Ventas(int vendedor2Ventas) {
        this.vendedor2Ventas = vendedor2Ventas;
    }

    public int getVendedor3Ventas() {
        return vendedor3Ventas;
    }

    public void setVendedor3Ventas(int vendedor3Ventas) {
        this.vendedor3Ventas = vendedor3Ventas;
    }

    public int getVendedor4Ventas() {
        return vendedor4Ventas;
    }

    public void setVendedor4Ventas(int vendedor4Ventas) {
        this.vendedor4Ventas = vendedor4Ventas;
    }

    

    
}
