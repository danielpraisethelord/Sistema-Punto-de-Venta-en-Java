package com.sistemaventa.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VentaDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;

    public int RegistrarVenta (Venta v) {
        String SQL = "INSERT INTO ventas (cliente, vendedor, total) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(SQL);
            ps.setString(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setDouble(3, v.getTotal());
            ps.execute();

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.toString());
        } finally {
            try {
                con.close();           
            } catch (SQLException e) {
                // TODO: handle exception
                System.out.println(e.toString());
            }
        }
        return r;
    }

    public int registrarDetalle (Detalle dV) {
        String SQL = "INSERT INTO detalle (cod_producto, cantidad, precio, id_venta) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(SQL);
            ps.setString(1, dV.getCodProd());
            ps.setInt(2, dV.getCantidad());
            ps.setDouble(3, dV.getPrecio());
            ps.setInt(4, dV.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();           
            } catch (SQLException e) {
                // TODO: handle exception
                System.out.println(e.toString());
            }
        }

        return r;
    }
}
