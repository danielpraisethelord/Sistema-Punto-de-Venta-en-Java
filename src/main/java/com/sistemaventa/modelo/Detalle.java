package com.sistemaventa.modelo;

public class Detalle {
    private int id;
    private String codProd;
    private int cantidad;
    private double precio;
    private int idVenta;

    public Detalle () {

    }

    public Detalle(int id, String codProd, int cantidad, double precio, int idVenta) {
        this.id = id;
        this.codProd = codProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idVenta = idVenta;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodProd() {
        return this.codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdVenta() {
        return this.idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

}
