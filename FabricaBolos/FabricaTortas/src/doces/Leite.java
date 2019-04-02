/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doces;

/**
 *
 * @author hugo
 */
public class Leite extends ProdutoPrototype{
    
    
    public Leite(Leite moto) {

    }

    public Leite() {

    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("sabor:"+ getSabor());
        System.out.println("tipo:"+ getTipo());
    }

    @Override
    public Leite clonar() {

        return new Leite(this);
    }
    
}
