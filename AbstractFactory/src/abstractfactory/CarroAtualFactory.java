package abstractfactory;

/**
 *
 * @author 0422
 */
public class CarroAtualFactory  extends CarroFactory{
    public Roda montarRoda() {
        return new RodaSimples();
        } 
    public Motor montarMotor() {
        return new MotorCombustao();
    }
    
}