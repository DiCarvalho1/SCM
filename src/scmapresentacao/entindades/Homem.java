package scmapresentacao.entindades;

public class Homem extends Humano {
		
	private Boolean bigode;
	private Boolean barba;
	private Boolean musculos;
	
	public Homem(String tamanho, String olhos, String cabelo, String corDaPele, String nome, Boolean bigode,
			Boolean barba, Boolean musculos) {
		super(tamanho, olhos, cabelo, corDaPele, nome);
		this.bigode = bigode;
		this.barba = barba;
		this.musculos = musculos;
	}
	
	public Boolean getBigode() {
		return bigode;
	}
	public void setBigode(Boolean bigode) {
		this.bigode = bigode;
	}
	public Boolean getBarba() {
		return barba;
	}
	public void setBarba(Boolean barba) {
		this.barba = barba;
	}
	public Boolean getMusculos() {
		return musculos;
	}
	public void setMusculos(Boolean musculos) {
		this.musculos = musculos;
	}
	
	@Override
	public void fazerCabeloCurto() {
		// TODO Auto-generated method stub
		//super.fazerCabeloCurto();
		super.setCabelo("social");
	}
	
	
}
