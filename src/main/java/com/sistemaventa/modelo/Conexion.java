package com.sistemaventa.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            //mariadb, 3307, sistemaventas ---> windows
            //mysql, 3306, sistemaventa ---> Ubuntu
            String myBD = "jdbc:mariadb://localhost:3307/sistemaventas?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root","");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
