package com.sistemaventa.Vista;

public class ejemmploBuilder {
    private final String nombre;
    private final String apellidoPaterno;
    private final String apellidoMaterno; // Corregido el nombre del campo
    private final int edad;
    private final String curp;
    private final String direccion;
    private final String estadoCivil;
    private final String razonSocial;

    public ejemmploBuilder(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String curp,
            String direccion, String estadoCivil, String razonSocial) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno; // Corregido el nombre del parámetro y el campo
        this.edad = edad;
        this.curp = curp;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.razonSocial = razonSocial;
    }   

    public ejemmploBuilder(Builder builder){
        this.nombre = builder.nombre;
        this.apellidoPaterno = builder.apellidoPaterno;
        this.apellidoMaterno = builder.apellidoMaterno;
        this.edad = builder.edad;
        this.curp = builder.curp;
        this.direccion = builder.direccion;
        this.estadoCivil = builder.estadoCivil;
        this.razonSocial = builder.razonSocial;
    }

    public static class Builder{
        private  String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private int edad;
        private String curp;
        private String direccion;
        private String estadoCivil;
        private String razonSocial;

        public Builder setNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
            return this;
        }

        public Builder setApellidoMaterno(String apellidoMaterno) { // Corregido el nombre del método
            this.apellidoMaterno = apellidoMaterno;
            return this;
        }

        public Builder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder setCurp(String curp) {
            this.curp = curp;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }

        public Builder setRazonSocial(String razonSocial) {
            this.razonSocial = razonSocial;
            return this;
        }

        public ejemmploBuilder build(){
            return new ejemmploBuilder(this);
        }
    }
}
