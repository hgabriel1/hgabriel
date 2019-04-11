/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricabiscoitobolosdoces;

import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       	int escolha;
        int escolha2;
        System.out.println(" Escolha à opções: \n 1-Biscoitos 🍪 \n 2-Bolos 🎂 \n 3-Doces 🍯 \n");
        escolha = input.nextInt();
        switch (escolha) {
		
    case 1: //BISCOITOS (FACTORY METHOD)
 System.out.println(" Escolha opções: \n 1-BiscoitoChocolate🔽   \n 2-BiscoitoFlocos🔽  \n 3-BiscoitoPimenta🔽 \n 4-BiscoitoQueijo🔽  \n");
 escolha2= input.nextInt();
 switch(escolha2)
   
                {
    case 1:
BiscoitosFactory biscoito = new BiscoitosFactory();
String sabor = "Biscoito chocolate";
String quantidade = "20 UN";
biscoito.getBiscoito(sabor, quantidade);
break;
    case 2:
BiscoitosFactory biscoito2 = new BiscoitosFactory();
String sabor2 = "Biscoito flocos";
String quantidade2 = "20 UN";
biscoito2.getBiscoito(sabor2, quantidade2);
break;  
    case 3:
BiscoitosFactory biscoito3 = new BiscoitosFactory();
String sabor3 = "Biscoito pimenta";
String quantidade3 = "2O UN";
biscoito3.getBiscoito(sabor3, quantidade3);
break; 
    case 4:
BiscoitosFactory biscoito4 = new BiscoitosFactory();
String sabor4 = "Biscoito queijo";
String quantidade4 = "20 UN";
biscoito4.getBiscoito(sabor4, quantidade4);
break;                                                   
}
break;
                
case 2: //BOLOS (ABSTRACT FACTORY)
System.out.println(" Escolha opções: \n 1-BoloCenoura🔽  \n 2-BoloChocolate🔽  \n 3-BoloLaranja🔽  \n 4-BoloLimao🔽  \n");
    escolha2= input.nextInt();
    switch(escolha2)
   
{
    case 1:
Bolos bolo = new BolosFactory();
BoloCenoura boloCenoura = bolo.createBoloCenoura();
boloCenoura.exibirInfoBolo();
break;
    
    case 2:
Bolos bolo2 = new BolosFactory(); 
BoloChocolate boloChocolate = bolo2.createBoloChocolate();
boloChocolate.exibirInfoBolo();
break;
   
    case 3:
Bolos bolo3 = new BolosFactory();
BoloLaranja boloLaranja = bolo3.createBoloLaranja();
boloLaranja.exibirInfoBolo();
break;  

    case 4:
Bolos bolo4 = new BolosFactory();
BoloLimao boloLimao = bolo4.createBoloLimao();
boloLimao.exibirInfoBolo();
break;    
}
break;


case 3: 
System.out.println(" Escolha opções: \n 1-DoceBrigdeiro🔽  \n 2-DoceFigo🔽  \n 3-DoceJaca🔽  \n 4-DoceLeite🔽  \n");
escolha2= input.nextInt();
    switch(escolha2)
      
{
case 1:
    DoceBrigadeiro docesBrigadeiro = new DoceBrigadeiro();
    Doces doceBrigadeiro = docesBrigadeiro.clonar();
    doceBrigadeiro.setTipo("Com Lactose 342g/mol");
    
      
    System.out.println(doceBrigadeiro.exibirInfo());
break;
                        
case 2:
    DoceFigo docesFigo = new DoceFigo();
    Doces doceFigo = docesFigo.clonar();
    doceFigo.setTipo("Sem Lactose");
      
    System.out.println(doceFigo.exibirInfo());
break;  

case 3:
    DoceJaca docesJaca = new DoceJaca();
    Doces doceJaca = docesJaca.clonar();
    doceJaca.setTipo("Sem Lactose");
    
    System.out.println(doceJaca.exibirInfo());
break;

case 4:
    DoceLeite docesLeite = new DoceLeite();
    Doces doceLeite = docesLeite.clonar();
    doceLeite.setTipo("Com Lactose 342g/mol");
    
    System.out.println(doceLeite.exibirInfo());
break;    
                                               
}  
                                               
}
}
}
