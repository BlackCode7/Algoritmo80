package Algoritmo86;

public class ImprimirNumeroPositivoNegativo {

	public static void main(String[] args) {
		// Ler um número e imprimir se ele é positivo, negativo ou nulo.
		int numero = -32;	
		
		printNumberParImpar(numero);

	}

	private static void printNumberParImpar(int numero) {
		// 1º começa com o caso feliz, no caso da condição ser true
		if( numero > 0 ) {
			System.out.println("Númeor é positivo! " + numero);
		}
		// 2º começa com o caso triste, no caso da condição ser false
		else {
			if( numero < 0 ) {
				System.out.println(" Número é Negativo! " + numero);
			}else {
				if( numero == 0 ) {
					System.out.println(" Número é Nulo: " + numero);
				}
			}
		}
	}

}
