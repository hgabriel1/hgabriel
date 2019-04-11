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
public class BolosFactory implements Bolos{

    @Override
    public BoloChocolate createBoloChocolate() {
    return new BoloChocolate();
    }

    @Override
    public BoloCenoura createBoloCenoura() {
      return new BoloCenoura();
    }

    @Override
    public BoloLaranja createBoloLaranja() {
      return new BoloLaranja();
    }

    @Override
    public BoloLimao createBoloLimao() {
      return new BoloLimao();
    }
    
}
