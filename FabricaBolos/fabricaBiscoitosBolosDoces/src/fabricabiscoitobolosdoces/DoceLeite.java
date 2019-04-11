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
public class DoceLeite extends Doces{

    protected DoceLeite(DoceLeite doceLeite) {
        this.tipo = doceLeite.getTipo();
    }
 
    public DoceLeite() {
        tipo = "";
    }
   
    @Override
    public String exibirInfo() {
    return "Doce: Doce de Leite \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
    return new DoceLeite(this);
    }
    
}
