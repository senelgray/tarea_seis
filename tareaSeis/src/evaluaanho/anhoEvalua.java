package evaluaanho;

public class anhoEvalua {


	
	private int evalua;
	
	public anhoEvalua() {
	}
	
	public void setevalua(int evalua){
		this.evalua = evalua;
	}
	
	
	public void evaluadias() {
	if(evalua %4 == 0 && evalua%100 == 0 ){
		System.out.println("El año es bisiesto");
	}else {
		System.out.println("El año no es bisiesto");

}
}
}