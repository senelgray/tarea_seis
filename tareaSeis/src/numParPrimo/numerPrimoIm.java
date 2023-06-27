package numParPrimo;

import java.util.Scanner;


public class numerPrimoIm {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		evaluaPrim numberpi = new evaluaPrim();
		
		System.out.println("Ingrese el numero a evaluar: " );
		numberpi.setnumberpi(input.nextDouble());
		
	
		
		numberpi.calcNum();
		
	}

}