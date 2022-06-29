package Algoritmo83;

import java.util.Scanner;

public class Algoritmo83 {
	/*  real numero, inverso, absoluto;
		imprima "digite numero:";
		leia numero;
		se( numero > O. )
		{ inverso <- 1 I numero;
		imprima "\ninverso: "
		inverso;}
		senao
		{ absoluto <- numero * -1;
		# ou absoluto <- abs(numero);
		imprima "\nabsoluto: "
		absoluto;}
		imprima "\n"; */
		
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
