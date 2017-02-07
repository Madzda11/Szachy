/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szachy;

/**
 *
 * @author Magda
 */
public class Pole {
    protected boolean czyZajęte;
    protected Bierka bierka;
    
    protected void dodajBierkę (Bierka b){
    bierka = b;
    }
    protected boolean czyZajęte(){
        
    return bierka!=null;
    }
    protected Bierka jakaBierka(){
        return bierka;
    }
    protected void usuńBierkę(){
        // usuwa z listy bierek gracza, bierka = null
    }
    
    public String toString(){
        
        return (this.czyZajęte() ? bierka.toString() : ".");
      
    }
    
    
}
