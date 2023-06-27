package verificarNumero;

public class evaluaNum {

	private double num1;
	
	public evaluaNum() {
	}
	
	public void setnum1(double num1){
		this.num1 = num1;
	}
	
	
	public void calcNum() {
		if(num1 < 0) {
			System.out.println("El numero : " +num1+ " es negativo" );
	}else if(num1>0) {
		System.out.println("El numero : " +num1+ " es positivo" );
	}else {
		System.out.println("El numero : " +num1+ " es cero" );
	}

}
}