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
public class Plansza {
    protected Pole[][] pola;
//String napis="WSGHKGSWPPPPPPPP................................ppppppppwsghkgsw";
String napis ="WSGHKGSWPPPPPPPP................................ppppppppwsghkgsw";
    
    
    protected void wstaw(){
        int l=0;
        for(int i =0; i<8; i++){
            for (int j=0; j<8;j++){
				System.out.println("=======");
				System.out.println(j*i + j);
				System.out.println(i);
				System.out.println(j);
				System.out.println(ustaw(napis.charAt(8*i + j )));

                if(napis.charAt(j*i + j )!= '.'){
                pola[i][j].dodajBierkę(ustaw(napis.charAt(8*i + j )));
                    l+=1; // patrze ile razy dodal figure
                }
            }
        }
        pola[6][3].dodajBierkę(new Wieża("czarny"));//osobno wstawia 
        System.out.println(l);
    }

    
    protected Bierka ustaw(char c){
        Bierka b;
        
        
        switch (c) {
            case 'W': b =  new Wieża("biały");
                     break;
            case 'S':  b =new Skoczek("biały");
                     break;
            case 'G':  b =new Goniec("biały");
                     break;
            case 'H':  b =new Hetman("biały");
                     break;
            case 'K':  b=new Król("biały");    
                break;
            case 'P':  b=new Pion("biały");
                     break;
            case 'w': b =  new Wieża("czarny");
                     break;
            case 's':  b =new Skoczek("czarny");
                     break;
            case 'g':  b =new Goniec("czarny");
                     break;
            case 'h':  b =new Hetman("czarny");
                     break;
            case 'k':  b=new Król("czarny");    
                break;
            case 'p':  b=new Pion("czarny");
                     break; 
            default: b=null;
                break;
        }

        return b;
    }
    public Plansza(){
            
    pola = new Pole[8][8];
    
    for(int i = 0; i < 8; i++){
        for (int j = 0; j <8; j++){
            pola[i][j] = new Pole();
        }
    }
    this.wstaw();
    }
    
    public void wypisz(){
        System.out.println("   ABCDEFGH");
    for(int i =0; i<8 ;i++){
         
         String wyn="";
        for (int j =0; j<8; j++){
            
            wyn+=pola[i][j].toString();
            
        }
        System.out.println((i+1) + ": " + wyn);
     
    }
}
}
