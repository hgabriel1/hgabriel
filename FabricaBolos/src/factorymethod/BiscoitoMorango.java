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
public class BiscoitoMorango extends Biscoito{
    
     public BiscoitoMorango(String nome)
    {
        this.nome = nome;
        System.out.println("Biscoito de :" + this.nome);
    }
}
