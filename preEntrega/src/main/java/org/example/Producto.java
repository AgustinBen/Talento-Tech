package org.example;

public class Producto {
    private static int siguienteID = 1;
    private int id;
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock){

        this.id = siguienteID;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        siguienteID++;

    }

    public void mostrarInfo(){
        System.out.printf("""
               
               id: %s
               nombre: %s
               precio: %s
               stock: %s
               
               """, this.id, this.nombre, this.precio, this.stock);
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
