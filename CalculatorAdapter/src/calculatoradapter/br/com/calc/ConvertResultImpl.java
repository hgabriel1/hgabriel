/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoradapter.br.com.calc;

/**
 *
 * @author 0422
 */


public class ConvertResultImpl implements IConvertResult {

	@Override
	public String valueToBinario(Integer value) {
		return Integer.toBinaryString(value);
       	}

}
