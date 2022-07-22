package Algoritmo87;

import javax.swing.JOptionPane;

public class Algoritmo87 {

	public static void main(String[] args) {

		String capitalBrasil = JOptionPane.showInputDialog(null, "Qual a capital do Brasil? ");

		if (capitalBrasil == "BRASÍLIA" || capitalBrasil == "Brasília") {
			
			System.out.println("Parabéns !!!");	
			
		} else {
			
			if (capitalBrasil == "brasília" || capitalBrasil == "Brazília" || capitalBrasil == "brazília") {
				
				System.out.println(" Está Correto, só tenha mais atenção com a gráfia! ");
				
			}else {
				
				System.out.println("ERRADO !!!");
			}
		}
		

	}

}
