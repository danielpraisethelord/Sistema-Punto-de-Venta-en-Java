package com.sistemaventa.modelo;

public class Proveedor {
    private int id;
    private int ruc;
    private String nombre;
    private String telefono;
    private String direccion;
    private String Razon;

    public Proveedor(){

    }

    public Proveedor(int id, int ruc, String nombre, String telefono, String direccion, String Razon) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Razon = Razon;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return this.ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return this.Razon;
    }

    public void setRazon(String Razon) {
        this.Razon = Razon;
    }

}
