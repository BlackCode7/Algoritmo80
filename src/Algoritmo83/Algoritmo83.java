package Algoritmo83;

import java.util.Scanner;

public class Algoritmo83 {
			
	public static void main(String[] args) {

		double numero = 10;
		double inverso;
		double absoluto;
		
		if( numero > 0 ) {
			inverso = 1/numero;
			System.out.println("Numero Inverso : " + inverso);
		}else {
			absoluto = numero * (-1) ;
			System.out.println("Numero absoluto : "+ absoluto);
		}
	
	

	}

}
