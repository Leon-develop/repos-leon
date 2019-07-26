/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author heriberto guzman
 */
public class Marca {
   private int idmarca;
    private String marca;
    public Marca(){
        this.idmarca = 0;
        this.marca = "";
    }
 public Marca(int idmarca, String marca){
     this.idmarca = idmarca;
     this.marca = marca;
 }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }  
public String toString(){
     return " Marca{" + "idmarca=" + idmarca +", marca=" + marca+ '}';
 }
}


