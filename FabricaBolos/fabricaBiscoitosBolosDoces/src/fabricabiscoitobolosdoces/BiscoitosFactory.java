/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricabiscoitobolosdoces;

/**
 *
 * @author hugo
 */
public class BiscoitosFactory {
 public Biscoito getBiscoito(String sabor,String quantidade) {
        if (sabor.equals("Biscoito queijo"))
            return new BiscoitoQueijo(quantidade);
        if (sabor.equals("Biscoito flocos"))
            return new BiscoitoFlocos (quantidade);
        if (sabor.equals("Biscoito chocolate"))
            return new BiscoitoChocolate(quantidade);
        if (sabor.equals("Biscoito pimenta"))
            return new BiscoitoPimenta(quantidade);
        
        return null;    
}
}