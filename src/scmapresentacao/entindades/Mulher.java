package scmapresentacao.entindades;

public class Mulher extends Humano {
	
	private Boolean maquiagem;
	private Boolean saltoAlto;
	private Boolean vestido;
	
	public Mulher(String tamanho, String olhos, String cabelo, String corDaPele, String nome, Boolean maquiagem,
			Boolean saltoAlto, Boolean vestido) {
		super(tamanho, olhos, cabelo, corDaPele, nome);
		this.maquiagem = maquiagem;
		this.saltoAlto = saltoAlto;
		this.vestido = vestido;
	}
	
	public Boolean getMaquiagem() {
		return maquiagem;
	}
	public void setMaquiagem(Boolean maquiagem) {
		this.maquiagem = maquiagem;
	}
	public Boolean getSaltoAlto() {
		return saltoAlto;
	}
	public void setSaltoAlto(Boolean saltoAlto) {
		this.saltoAlto = saltoAlto;
	}
	public Boolean getVestido() {
		return vestido;
	}
	public void setVestido(Boolean vestido) {
		this.vestido = vestido;
	}
	
	

}
