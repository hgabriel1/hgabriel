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
public class DoceJaca extends Doces {
     protected DoceJaca(DoceJaca doceJaca) {
        this.tipo = doceJaca.getTipo();
    }
 
    public DoceJaca() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de Jaca  \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
       return new DoceJaca(this);
    }
}
