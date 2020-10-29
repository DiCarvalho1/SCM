package scmapresentacao.entindades;import java.awt.List;

public class Humano {
	
	private String tamanho;
	private String olhos;
	private String cabelo;
	private String corDaPele;
	private String nome;
	
	public Humano(String tamanho, String olhos, String cabelo, String corDaPele, String nome) {
		this.tamanho = tamanho;
		this.olhos = olhos;
		this.cabelo = cabelo;
		this.corDaPele = corDaPele;
		this.nome = nome;
	}
	
	public Humano(java.util.List<Humano> humano, Integer numeroDaLista) {
		this.tamanho = humano.get(numeroDaLista).getTamanho();
		this.olhos = humano.get(numeroDaLista).getOlhos();
		this.cabelo = humano.get(numeroDaLista).getCabelo();
		this.corDaPele = humano.get(numeroDaLista).getCorDaPele();
		this.nome = humano.get(numeroDaLista).getNome();
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getOlhos() {
		return olhos;
	}
	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}
	public String getCabelo() {
		return cabelo;
	}
	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}
	public String getCorDaPele() {
		return corDaPele;
	}
	public void setCorDaPele(String corDaPele) {
		this.corDaPele = corDaPele;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected void fazerCabeloMedio() {
		this.setCabelo("medio");
	}
	
	protected void fazerCabeloCurto() {
		this.setCabelo("curto");
	}
	
	protected void fazerCabeloLongo() {
		this.setCabelo("longo");
	}
	

}
