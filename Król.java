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
public class Król extends Bierka {
    
    final int[] ruchy = new int[]{1,0,1,1,-1,1,-1,-1,1,-1,0,1,-1,0,0,-1};
    
    public String toString(){
        
        return (kolor.equals("biały") ? "K" : "k");
    }
    
    public Król(String kolor){
         this.kolor=kolor;
     } 
}
