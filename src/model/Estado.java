package model;

public class Estado {

	private String uf;
	
	private String nome;
	
	public Estado() {
		
		
	}

	public Estado(String uf, String nome) {
		
		this.uf = uf;
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
