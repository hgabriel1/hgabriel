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
public class BiscoitoQueijo extends Biscoito {
    
    public BiscoitoQueijo(String nome)
    {
        this.nome = nome;
        System.out.println("Biscoito de :" + this.nome);
    }
}
