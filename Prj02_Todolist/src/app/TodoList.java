package app;

public class TodoList {

	Todo[] lista;
	
	public TodoList(int nPosti) {
		lista = new Todo[nPosti];
	}
	
	
	
	void addTodo(String desc, int pos) {
		Todo temp = new Todo(desc);
		//temp.descrizione = desc;
		lista[pos] = temp;
	}

	Todo getTodo(int pos) {
		return lista[pos];
	}
	
}