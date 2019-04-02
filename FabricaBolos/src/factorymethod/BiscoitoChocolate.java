/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author hugo
 */
public class BiscoitoChocolate extends Biscoito{
    
    
    public BiscoitoChocolate(String nome){
        
         this.nome = nome;
         System.out.println("Biscoito de :" + this.nome);
    }
    
}
