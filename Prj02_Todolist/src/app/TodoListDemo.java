package app;

import java.util.Scanner;

public class TodoListDemo {

	public static void main(String[] args) {
		
		int risposta = chiediIntero();
		TodoList listaSpesa = new TodoList(risposta);
		
		String cosaDaFare = chiediStringa();
		
		listaSpesa.addTodo(cosaDaFare, 0);
		
		cosaDaFare = chiediStringa();
		listaSpesa.addTodo(cosaDaFare, 1);
		
		cosaDaFare = chiediStringa();
		listaSpesa.addTodo(cosaDaFare, 2);
		
		System.out.println(listaSpesa.getTodo(0).stampa());
		System.out.println(listaSpesa.getTodo(1).stampa());
		System.out.println(listaSpesa.getTodo(2).stampa());
			
		;
		
		
		

	}
	


	private static String chiediStringa() {

		System.out.println("scrivi la cosa da comprare");
		Scanner scanner = new Scanner(System.in);
		
		
		return scanner.nextLine();
	}



	static int chiediIntero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		return scanner.nextInt();
	}
	
	
	

}