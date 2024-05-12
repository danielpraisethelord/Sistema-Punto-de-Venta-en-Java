package com.sistemaventa.Vista;

public class PruebaBuilder {
    public static void main(String[] args) {
        ejemmploBuilder.Builder builder = new ejemmploBuilder.Builder()
            .setNombre("Juan")
            .setApellidoPaterno("Perez")
            .setApellidoMaterno("Hernandez")
            .setEdad(19)
            .setCurp("DSDADS")
            .setDireccion("DASD")
            .setEstadoCivil("Soltero")
            .setRazonSocial("DASD");

        // Construir una instancia de ejemmploBuilder
        ejemmploBuilder usuario = builder.build();
        
            
    }
}
