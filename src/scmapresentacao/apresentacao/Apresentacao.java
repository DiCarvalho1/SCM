package scmapresentacao.apresentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import scmapresentacao.entindades.Homem;
import scmapresentacao.entindades.Humano;
import scmapresentacao.entindades.Mulher;

public class Apresentacao {

	public static void main(String[] args) {
		System.out.println("projetinho novo");
		
		Scanner perguntaSexo = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("É homem(H) ou mulher(M)?");

	    String sexo = perguntaSexo.nextLine();  // Read user input
	    System.out.println(sexo.equalsIgnoreCase("H")  ? "homem" : "mulher");  // Output user input
	    
		if (sexo.equalsIgnoreCase("H")) {
			criaHomem();			
		} else if (sexo.equalsIgnoreCase("M")) {
			//criaMulher();
		} else {
			System.out.println("Você não digitou um sexo válido (H) ou (M)");
		}

		
	}
	
	private static Homem criaHomem() {
		Scanner perguntaNome = new Scanner(System.in); 
		System.out.println("Qual é o nome do indivíduo?");
		String nome = perguntaNome.nextLine();
					
		Scanner perguntaAltura = new Scanner(System.in);
		System.out.println("Qual é a altura do indivíduo?");
		String altura = perguntaAltura.nextLine();
		
		Scanner perguntaOlhos = new Scanner(System.in);
		System.out.println("Qual é a cor dos olhos do indivíduo?");
		String olhos = perguntaOlhos.nextLine();
		
		Scanner perguntaCabelo = new Scanner(System.in);
		System.out.println("Qual é o tipo de cabelo do indivíduo?");
		String cabelo = perguntaCabelo.nextLine();
		
		Scanner perguntaPele = new Scanner(System.in);
		System.out.println("Qual é a cor da pele do indivíduo?");
		String pele = perguntaPele.nextLine();
		
		Scanner perguntaBigode = new Scanner(System.in);
		System.out.println("O indivíduo tem bigode? (Sim) (Nao)");
		String bigode = perguntaBigode.nextLine();
		Boolean temBigode = false;
		
		if (perguntaBigode.nextLine().equalsIgnoreCase("sim")) {
			 temBigode = true;
		} else if (perguntaBigode.nextLine().equalsIgnoreCase("nao")) {
			temBigode = false;
		} else {
			System.out.println("você não digitou uma das condições validas");
		}
		
		Scanner perguntaBarba = new Scanner(System.in);
		System.out.println("O indivíduo tem barba?");			
		String barba = perguntaBarba.nextLine();
		Boolean temBarba = false;			
		
		switch (barba) {
		case "sim":
			temBarba = true;
			break;
		case "nao":
			temBarba = false;
		default:
			System.out.println("você não digitou uma das condições validas");
			break;
		}
					
		Scanner perguntaMusculos = new Scanner(System.in);
		System.out.println("O indivíduo tem musculos?");
		String musculos = perguntaMusculos.nextLine();
		Boolean temMusculos = false;
		
		switch (musculos) {
		case "sim":
			temMusculos = true;
			break;
		case "nao":
			temMusculos = false;
			break;
		default:
			System.out.println("você não digitou uma das condições validas");
			break;
		}
		
		Homem homem = new Homem(altura, olhos, cabelo, pele, nome, temBigode, temBarba, temMusculos);
		
		switch (cabelo) {
		case "curto":
			homem.fazerCabeloCurto();
			break;

		default:
			break;
		}
		
		System.out.println(
				"O homem se chama: " + homem.getNome() +
				", tem: " + homem.getTamanho() + "de altura, "
				+ " seus olhos são " + homem.getOlhos() + 
				" seu cabelo é " + homem.getCabelo() + 
				" sua pele é " + homem.getCorDaPele() +
				" ele tem bigode? " + homem.getBigode() +
				" tem barba? " + homem.getBarba() + 
				" tem musculos? " + homem.getMusculos());
		
		return homem;
	}
	
//	private static Mulher criaMulher() {
//		Mulher mulher = new Mulher(tamanho, olhos, cabelo, corDaPele, nome, maquiagem, saltoAlto, vestido);
//		
//		return mulher;
//	}

}
