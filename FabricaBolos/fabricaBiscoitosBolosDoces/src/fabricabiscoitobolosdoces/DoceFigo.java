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
public class DoceFigo extends Doces{

    protected DoceFigo(DoceFigo doceFigo) {
        this.tipo = doceFigo.getTipo();
    }
 
    public DoceFigo() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de Figo \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
       return new DoceFigo(this);
    }
    
}
