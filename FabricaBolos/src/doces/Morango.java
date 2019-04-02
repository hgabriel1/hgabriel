/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doces;

import sun.print.PeekGraphics;

/**
 *
 * @author hugo
 */
public class Morango extends ProdutoPrototype{
    
    public Morango(Morango moto) {

    }

    public Morango() {

    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("sabor:"+ getSabor());
        System.out.println("tipo:"+ getTipo());
    }

    @Override
    public Morango clonar() {

        return new Morango(this);
    }
    
}
