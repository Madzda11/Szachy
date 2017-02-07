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
public class Współrzędne {

private int x;

private int y;

public Współrzędne(int x, int y) {

this.x = x;

this.y = y;

}

public int getX() {

return x;

}

public int getY() {

return y;

}

@Override public String toString() {

return konwertujWspółrzędneNaNapis(this);

}

public static Współrzędne konwertujNapisNaWspółrzędne(String napis) {

String kolumny = "ABCDEFGH";

String wiersze = "12345678";

int x = kolumny.indexOf(napis.charAt(0));

int y = wiersze.indexOf(napis.charAt(1));

return new Współrzędne(x, y);

}



public static String konwertujWspółrzędneNaNapis(Współrzędne w) {

String kolumny = "ABCDEFGH";

String wiersze = "12345678";

return "" + kolumny.charAt(w.getX()) + wiersze.charAt(w.getY());

}

}