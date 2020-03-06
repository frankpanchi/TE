/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Amilcar
 */
public class Cliente {
    private String cliente;
    private String id;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente(String cliente, String id) {
        this.cliente = cliente;
        this.id = id;
    }



    @Override
    public String toString() {
        return  cliente ;
    }
    
    
}
