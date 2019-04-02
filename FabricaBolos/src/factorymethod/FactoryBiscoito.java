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
public class FactoryBiscoito {
    
    public Biscoito getBiscoito(String nome,String tipo){
    
         if(tipo.equals("biscoito queijo"))
         {
             return new BiscoitoQueijo(nome);
         }
         if(tipo.equals("biscoito morango"))
         {
             return new BiscoitoMorango(nome);
         }
         if(tipo.equals("biscoito limao"))
         {
             return new BiscoitoLimao(nome);
         }
         if(tipo.equals("chocolate"))
         {
             return new BiscoitoChocolate(nome);
         }
       return null;
      }
}
