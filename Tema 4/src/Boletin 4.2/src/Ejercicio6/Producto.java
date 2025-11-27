package Ejercicio6;


import Ejercicio6.Exception.ProductoException;

public class Producto {

    private int idProducto;
    private String descripcion;
    private double precio;

    private static final int IVA = 20;

    public Producto(){
        this.idProducto = generarId();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws ProductoException {
        if(precio < 0){
            throw new ProductoException("Como vas a tener un producto gratis por la cara");
        }
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    private static int generarId (){
    }

}
