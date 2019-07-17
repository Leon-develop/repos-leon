/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leo González
 */
public class Edicion {
 private int idedicion;
 private String edicion;
 
 public Edicion(){
     this.idedicion = 0;
     this.edicion = null;
 }
 public Edicion(int idedicion, String edicion){
     this.idedicion = idedicion;
     this.edicion = edicion;
 }

    public int getIdedicion() {
        return idedicion;
    }

    public void setIdedicion(int idedicion) {
        this.idedicion = idedicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
 public String toString(){
     return " Edicion{" + "idedicion=" + idedicion +", edicion=" + edicion+ '}';
 }
}

