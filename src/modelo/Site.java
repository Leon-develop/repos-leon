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
public class Site {
    
    
private int idsite;
  private  String site;
   

   public Site() {
        this.idsite=0;
        this.site = null;
       
    }
public   Site(int idsite,String site){
      
         this.idsite=idsite;
           this.site=site;
}
    public int getIdsite(){
        return idsite;
    }

    public void setIdsite(int idsite) {
        this.idsite= idsite;
    }

    public String getSite(){
        return site;
    }

    public void setSite(String site){
        
        this.site=site;
    }
  public String toString() {
        return "Site{" + "idudn=" + idsite+ ",udn="+site+'}';
    }

}
   