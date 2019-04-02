/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatorta;

import doces.Leite;
import doces.ProdutoPrototype;
import factorymethod.FactoryBiscoito;

/**
 *
 * @author hugo
 */
public class FabricaTorta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        //Factoty method
        
        System.out.println("---------------PADRAO FACTORY METHOD--------------\n");
        FactoryBiscoito factory = new FactoryBiscoito();
        String nome = "chocolate";
        String tipo = "chocolate";
        factory.getBiscoito(nome,tipo);
        
        
        
        
        System.out.println("---------------PADRAO PROTOTYPE--------------\n");
        
        Leite prototipoTorta = new Leite();

        ProdutoPrototype TortaComum = prototipoTorta.clonar();
        tortaComum.setSabor("TortaBaunilha");
        tortaComum.setInformaçao("Torta Molhada");

        tortaComum.exibirInformacao();

        ProdutoPrototype TortaComum = prototipoCarro.clonar();
        tortaCremosa.setSabor(" TortaLeiteNinho");
        tortaCremosa.setInformaçao("Torta Cremosa");

        TortaCremosa.exibirInformacao();
        
         tortaMolhada.exibirInformacao();

        ProdutoPrototype carroLuxo = prototipoCarro.clonar();
        tortaCremosa.setSabor(" TortaLeiteNinho");
        tortaCremosa.setInformaçao("Torta Cremosa");

        TortaCremosa.exibirInformacao();


        
        
        
        
        
        
    }
    
    
}
