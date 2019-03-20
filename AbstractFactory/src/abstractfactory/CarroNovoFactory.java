package abstractfactory;

/**
 *
 * @author 0422
 */
public class CarroNovoFactory extends CarroFactory{
    public Roda montarRoda() {
        return new RodaAroLeve();
        } 
    public Motor montarMotor() {
        return new MotorEletrico();
    }
    
}