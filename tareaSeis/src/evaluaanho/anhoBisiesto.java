package evaluaanho;

import java.util.Scanner;


public class anhoBisiesto {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		anhoEvalua diaseval = new anhoEvalua();
		
		System.out.println("Ingrese el año seleccionado: " );
		diaseval.setevalua(input.nextInt());

		
		diaseval.evaluadias();
	}

}