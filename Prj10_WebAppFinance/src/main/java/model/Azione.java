package model;

public class Azione {

	private String nome;
	private double valore;
	
	public Azione(String nome, double valore) {
		super();
		this.nome = nome;
		this.valore = valore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Azione [nome=");
		builder.append(nome);
		builder.append(", valore=");
		builder.append(valore);
		builder.append("]");
		return builder.toString();
	}
	

	
}
