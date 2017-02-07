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
public class Szachy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plansza p = new Plansza();
        p.wypisz();
        String c = p.pola[6][3].toString();
        System.out.println(c);
    }
    
}
