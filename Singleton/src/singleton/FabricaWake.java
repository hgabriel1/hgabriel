/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hugo
 */
 public class FabricaWake {
   public static FabricaWake instancia;
    
    protected String prancha;
    protected String quilha;
    protected String atleta;
        
    protected FabricaWake(){
    }

     public static FabricaWake getInstancia() {
        if (instancia==null)
        instancia = new FabricaWake();  
        
        return instancia;
        
        }
    }


   
