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
public class DoceBrigadeiro extends Doces{

    protected DoceBrigadeiro(DoceBrigadeiro doceBrigadeiro) {
        this.tipo = doceBrigadeiro.getTipo();
    }
 
    public DoceBrigadeiro() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de Brigadeiro \n" + "Tipo: "
                + getTipo(); 
    }
    
    @Override
    public Doces clonar() {
     return new DoceBrigadeiro(this);
    }
    
}
