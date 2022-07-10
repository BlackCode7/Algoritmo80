package Algoritmo85_IfsAninhados;

public class Algoritmo85IfsAninhados {
	
	

	public static void main(String[] args) {
		
		double a = 12, b = 54, c = 90, max = 0;
		
		if ( a > b) {
			if( a > c) {
				max = a;
				System.out.println("max recebe a : " + a);
			}
			else {
				max = c;
				System.out.println("max recebe c : " + c);
			}
		} else {
			if( b > c) {
				max = b;
				System.out.println("else - max recebe b : " + b);
			}else {
				max = c;
				System.out.println("else - max recebe c : " + c);
			}
		}
	}
	
	
	
	

}
