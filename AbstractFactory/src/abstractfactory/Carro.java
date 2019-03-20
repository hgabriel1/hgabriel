package abstractfactory;

/**
 *
 * @author 0422
 */
public class Carro {
    Roda roda;
    Motor motor; 
    
    public Roda getRoda() {
        return roda;
    }
    
    public void setRoda (Roda roda){
        this.roda = roda;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor (Motor motor){
        this.motor = motor;
    }
}



