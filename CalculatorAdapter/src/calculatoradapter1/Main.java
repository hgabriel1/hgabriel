/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoradapter1;



import javax.swing.JOptionPane;

import calculatoradapter.br.com.calc.ICalculator;
import calculatoradapter.br.com.calc.IConvertResult;

public class Main {

	public static void main(String[] args) {
// JOJOptionPane.showInputDialog =CaixaVisualDe dialogo
//Integer.parseInt= a conversão de um dado para inteiro, utilizando o método estático parseInt da classe Integer:int x

		calculatoradapter.br.com.calc.CalculatorImpl calc = new calculatoradapter.br.com.calc.CalculatorImpl();
		calculatoradapter.br.com.calc.ConvertResultImpl convert = new calculatoradapter.br.com.calc.ConvertResultImpl();
		int primeiroValor =Integer.parseInt(JOptionPane.showInputDialog("Digite o  Primeiro valor "
				+ "D \n \n "));
		
		int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o  Segundo valor "
				+ "D \n \n "));
		
		int option =Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao: "
				+ "D \n \n  1- Somar \n 2- Dividir \n 3- Multiplicar \n 4-Subtrair"));
		
		double resultado=0;
		
		switch (option) {
		case 1:
			resultado= calc.sum(primeiroValor, segundoValor);
			break;

		default:
			break;
		}

                ///toHexString= variação dos caracteres serem usados 
                ///intValue= onde a referencia no objeto onde pode Integer receber ele mesmo porém usando o método
		
		
		int option2 =Integer.parseInt(JOptionPane.showInputDialog("Em que deseja ver o resultado: "
				+ "D \n \n  1- Binario \n 2- Hexadecimal \n 3- Octal"));
		
		double resultado2=0;
		
		switch (option2) {
		case 1:
		JOptionPane.showMessageDialog(null, "Resultado em Binário \n"+ convert.valueToBinario(new Integer((int) resultado)));
			break;
                        
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado em hexadecimal \n"+ Integer.toHexString(Double.valueOf(resultado).intValue()));
                    break;
                 
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado em octal \n" + Integer.toOctalString(Double.valueOf(resultado).intValue()));
                    
                    
          
                    
                    

		default:
			break;
		}
		
	}

}