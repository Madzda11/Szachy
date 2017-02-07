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
public class Skoczek  extends Bierka{
    public String toString(){
        
       return (kolor.equals("biały") ? "S" : "s");
        
    }
    public Skoczek(String kolor){
         this.kolor=kolor;
     } 
}
