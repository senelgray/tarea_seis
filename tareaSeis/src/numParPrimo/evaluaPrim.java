package numParPrimo;

public class evaluaPrim {

	private double numberpi;
	private int contador;
	boolean primo = true;
	
	public evaluaPrim() {
	}
	
	
	public void setnumberpi(double numberpi){
		this.numberpi = numberpi;
	}
	
	
	public void calcNum() {
		if(numberpi%2 == 0 && numberpi!=0) {
			System.out.println("El numero : " +numberpi+ " es par" );
	}else if(numberpi%2 !=0 && numberpi !=0) {
		System.out.println("El numero : " +numberpi+ " es impar" );
		 
	}else{
		System.out.println("El numero : " +numberpi+ " es cero" );
	}
	contador =0;
		 if (numberpi <= 1) {
	            primo = false;
		 }
		  for (int x = 2; x <  numberpi ; x++) {

		    if (numberpi % x == 0) {
		    	contador++;
		      
		  }
		  }
		  if(contador<=1) {
		 
          System.out.println("El numero : " +numberpi+ " es primo" );
		  }else {
			  
		  }

		}

}
	