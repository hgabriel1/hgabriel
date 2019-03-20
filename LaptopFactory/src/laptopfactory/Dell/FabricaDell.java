/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;
import laptopfactory.Interfaces.InfinityBook;
import laptopfactory.Interfaces.FabricaDeLaptop;
import laptopfactory.Dell.Glass;
import laptopfactory.Dell.GlassFit;

/**
 *
 * @author user
 */
public class FabricaDell implements FabricaDeLaptop {
    @Override 
    public Notebook criarNotebook(){
        return new GlassFit();
    }
    
    @Override 
    public Ultrabook criarUltrabook(){
        return new Glass();
        
    
        }
    @Override
    public Ultrabook criarInifinityBook(){
        return new InfinityBook();
    }
}
