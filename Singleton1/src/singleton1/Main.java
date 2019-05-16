package singleton1;

/**
 *
 * @author hugo
 */
public class Main {
    public static void main(String[] args) {
        
         
    CadastroSunset cadastroSunset1 =  CadastroSunset.getInstancia();
    cadastroSunset1.prancha="RipCurl";
    cadastroSunset1.quilha="2mm";
    cadastroSunset1.atleta="Hugo";
  
    System.out.println("Informações A: " + cadastroSunset1 + " prancha: " + cadastroSunset1.prancha + " quilha: " + cadastroSunset1.quilha + cadastroSunset1 + "atleta" + cadastroSunset1.atleta);
    
    System.out.println("");
    
    CadastroSunset cadastroSunset2 =  CadastroSunset.getInstancia();
    cadastroSunset2.prancha="RipCurl";
    cadastroSunset2.quilha="2.5mm";
    cadastroSunset2.atleta="HugoGeronimo";
    
    System.out.println("Informações A.A: " + cadastroSunset1 + " prancha: " + cadastroSunset1.prancha + " quilha: " + cadastroSunset1.quilha + cadastroSunset1 + "atleta" + cadastroSunset1.atleta);
}
}

