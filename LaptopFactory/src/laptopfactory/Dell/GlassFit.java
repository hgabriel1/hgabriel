/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.InfinityBook;

/**
 *
 * @author 0422
 */
public class GlassFit implements InfinityBook{
    
    @Override
    public void exibirInfoInfinityBook() {
        System.out.println("Modelo: GlassFit\nFábrica: Dell\nCategoria: InfinityPro\n");
    }
    
}
