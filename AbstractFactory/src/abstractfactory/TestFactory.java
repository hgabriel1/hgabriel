package abstractfactory;

/**
 *
 * @author 0422
 */
public class TestFactory {
     private static Carro montarCarro(String tipo){
        CarroFactory cf = null;
        switch(tipo){
            case"novo":
                cf = new CarroNovoFactory();
                break;
            case "atual":
                cf = new CarroAtualFactory();
            }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setMotor(cf.montarMotor());
        return carro;
     }
     
     public static void main(String [] args){
         Carro c1 = montarCarro("novo");
         Carro c12 = montarCarro("atual");
         System.out.println("END"); 
     }
     

        
        
}
    
