package model;

public class Impiegato {
	
	/* Stato interno */
	
	private String nome;
	private String cognome;
	private String id;
	private int annoNascita;
	private int stipendio;
	
	/* Stato interno */
	
	//metodo Costruttore
	
	//metodo Costruttore
	
	public String getNome() {
		return nome;
	}
	public Impiegato(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		this.stipendio = 0;
		this.id = Segreteria.creaID(nome, cognome, annoNascita);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAnno() {
		return annoNascita;
	}
	public void setAnno(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nome impiegato: " + nome + ", cognome impiegato: " + cognome + ", id impiegato: " + id + "]";
	}
	
	
	
}
