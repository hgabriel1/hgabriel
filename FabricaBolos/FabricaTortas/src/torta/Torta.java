/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torta;

/**
 *
 * @author hugo
 */
public class Torta {
    private Torta torta;
    
     public void criarTorta( String c String tipo ){

        if( tipo.equals("baunilha") ){
            torta = new TortaBaunilha( Torta Molhada );
        }
        else if( tipo.equals("frango") ){
            torta = new TortaLeiteNinho( Torta Cremosa );
        }
        else if( tipo.equals("palmito") ){
            torta = new TortaMorango( Torta Molhada );
        }
        }
        else if( tipo.equals("palmito") ){
            torta = new TortaPrestigio( Torta Cremosa );
        }
}
