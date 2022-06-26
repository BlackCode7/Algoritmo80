package Algoritmo81_CalculeDigitoVerificador;

public class Algoritmo81_CalculeDigitoVerificador {

	public static void main(String[] args) {
				
		int conta = 102, inv, digito, d1,d2,d3, soma;
		System.out.println(" Digite uma conta com 3 digitos: ");
		d1 = conta/100;
		d2 = ( conta%100 ) / 10;
		d3 = conta%100%10;
		
		inv = ( d3*100 ) + ( d2*10 ) + d1;
		soma = conta + inv;
		
		d1 = (soma / 100) * 1;
		d2 = (soma % 100 / 10) * 2;
		d3 = (soma % 100 % 10) *3;
		
		digito = (d1 +d2 +d3) % 10;
		
		System.out.println("Digito verificardor: " + digito);

	}

}












