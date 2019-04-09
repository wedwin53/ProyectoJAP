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
    String vendedor1Ventas;
    String vendedor2Ventas;
    String vendedor3Ventas;
    String vendedor4Ventas;

    public NotaVenta(String Producto, String vendedor1Ventas, String vendedor2Ventas, String vendedor3Ventas, String vendedor4Ventas) {
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

    public String getVendedor1Ventas() {
        return vendedor1Ventas;
    }

    public void setVendedor1Ventas(String vendedor1Ventas) {
        this.vendedor1Ventas = vendedor1Ventas;
    }

    public String getVendedor2Ventas() {
        return vendedor2Ventas;
    }

    public void setVendedor2Ventas(String vendedor2Ventas) {
        this.vendedor2Ventas = vendedor2Ventas;
    }

    public String getVendedor3Ventas() {
        return vendedor3Ventas;
    }

    public void setVendedor3Ventas(String vendedor3Ventas) {
        this.vendedor3Ventas = vendedor3Ventas;
    }

    public String getVendedor4Ventas() {
        return vendedor4Ventas;
    }

    public void setVendedor4Ventas(String vendedor4Ventas) {
        this.vendedor4Ventas = vendedor4Ventas;
    }
    
    

    
}
