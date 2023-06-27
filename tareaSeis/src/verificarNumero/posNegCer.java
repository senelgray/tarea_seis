package verificarNumero;

import java.util.Scanner;

public class posNegCer {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		evaluaNum number = new evaluaNum();
		
		System.out.println("Ingrese el numero a evaluar: " );
		number.setnum1(input.nextDouble());
		
	
		
		number.calcNum();
		
	}

}