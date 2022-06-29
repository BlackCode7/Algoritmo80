package Algoritmo84;

public class CalculateNumberOddOrEven {

	static int number = 13;
	
	public static void main(String[] args) {		
		calculateNumberOddOrEven(number);
	}

	private static int calculateNumberOddOrEven( int number ) {
				
		if( number % 2 == 0 ) {
			System.out.println(" Number is Odd > "+number);
		}else {
			System.out.println("Number is Even > "+number);
		}
		return number;
	}

}
