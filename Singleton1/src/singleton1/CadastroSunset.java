/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

/**
 *
 * @author hugo
 */
 public class CadastroSunset {
   public static CadastroSunset instancia;
    
    protected String prancha;
    protected String quilha;
    protected String atleta;
        
    protected CadastroSunset(){
    }

     public static CadastroSunset getInstancia() {
        if (instancia==null)
        instancia = new CadastroSunset();  
        
        return instancia;
        
        }
    }
