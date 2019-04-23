/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hugo
 */
public class Main {
    public static void main(String[] args) {
        
         
    FabricaWake fabricaWake1 =  FabricaWake.getInstancia();
    fabricaWake1.prancha="RipCurl";
    fabricaWake1.quilha="2mm";
    fabricaWake1.atleta="Hugo";
  
    System.out.println("Informações A: " + fabricaWake1 + " prancha: " + fabricaWake1.prancha + " quilha: " + fabricaWake1.quilha + fabricaWake1 + "atleta" + fabricaWake1.atleta);
    
    System.out.println("");
    
    FabricaWake fabricaWake2 =  FabricaWake.getInstancia();
    fabricaWake2.prancha="RipCurl";
    fabricaWake2.quilha="2.5mm";
    fabricaWake2.atleta="HugoGeronimo";
    
    System.out.println("Informações A.A: " + fabricaWake1 + " prancha: " + fabricaWake1.prancha + " quilha: " + fabricaWake1.quilha + fabricaWake1 + "atleta" + fabricaWake1.atleta);
}
}