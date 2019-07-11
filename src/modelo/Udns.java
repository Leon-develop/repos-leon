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
public class Udns {
    
private int idudn;
  private  String udn;
   

    public Udns() {
        this.idudn = 0;
        this.udn = null;
       
    }
public Udns(int idudn,String udn){
      
         this.idudn = idudn;
           this.udn = udn;
}
    public int getIdudn() {
        return idudn;
    }

    public void setIdudn (int idudn) {
        this.idudn = idudn;
    }

    public String getUdn() {
        return udn;
    }

    public void setUdn(String udn) {
        this.udn = udn;
    }
  public String toString() {
        return "Xcaret{" + "idudn=" + idudn + ",udn="+udn+'}';
    }

}
   
     
      
