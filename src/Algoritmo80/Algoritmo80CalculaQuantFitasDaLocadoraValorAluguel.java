package Algoritmo80;

import java.util.Scanner;

public class Algoritmo80CalculaQuantFitasDaLocadoraValorAluguel {

	public static void main(String[] args) {
		
		/* Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo possui
			e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a
			seguir:
			
			• Sabendo que um terço das fitas são alugadas por mês, exiba o
			faturamento anual da locadora;
			
			• Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o
			valor do aluguel. Sabendo que um décimo das fitas alugadas no mês são
			devolvidas com atraso, calcule o valor ganho com multas por mês;
			
			• Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo
			do total é comprado para reposição, exiba a quantidade de fitas que a locadora
			terá no final do ano.
		*/
		
		Scanner scanner = new Scanner(System.in);
		int quantidade;
		double valAluguel, fatAnual, multas, quantFinal;
		
		System.out.println(" Digite a quantidade de fitas: ");
		quantidade = scanner.nextInt();
		System.out.println(" Digite o valor do aluguel: ");
		valAluguel = scanner.nextDouble();
		
		calculaMultaQuantFinalFatAnual(quantidade, valAluguel);
		
	
	}

	public static void calculaMultaQuantFinalFatAnual(int quantidade, double valAluguel) {
		
		double fatAnual;
		double multas;
		double quantFinal;
		
		fatAnual = (quantidade / 3) * (valAluguel * 12) ;
		System.out.println(" Imprimir Faturamento Anual:  " + fatAnual);
		
		multas = (valAluguel*0.1) * (quantidade/3) / 10;
		System.out.println(" Imprimir Multas Mensais:  " + multas);
		
		quantFinal = quantidade - (quantidade * 0.02) + (quantidade/10);
		System.out.println(" Quantidade de fitas no final do ano :  " + quantFinal);
	}

}







