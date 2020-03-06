/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import parcial.conexion;

/**
 *
 * @author PANCHY
 */
public class Sucursal {
    
       private String nombre;
       private String id;
       Connection cn;
    conexion conn =new conexion();
    PreparedStatement s;
    ResultSet rs;
    
    public Sucursal(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return  nombre;
    }
    
}
