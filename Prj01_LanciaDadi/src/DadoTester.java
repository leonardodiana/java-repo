
public class DadoTester {

	public static void main(String[] args) {
		
		Dado d1 = new Dado(); 
		Dado d2 = new Dado();
		
		int res1 = d1.lancia();
		int res2 = d2.lancia();
		
		
	if(res1==res2) { 
		System.out.println("Hai vinto!!");
	}
	else {
		System.out.println("Non hai vinto!!");
	}
	
	}
	
}
