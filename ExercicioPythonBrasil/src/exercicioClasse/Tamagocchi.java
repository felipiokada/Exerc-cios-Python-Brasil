package exercicioClasse;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//Atributos: Nome, Fome, Saúde e Idade
//b. Métodos: Alterar Nome, Fome,Saúde e Idade;
//Retornar Nome, Fome, Saúde e Idade Obs:
//Existe mais
//uma informação que devemos levar em consideração, o Humor do nosso 
//tamagushi, este humor é uma combinação entre os atributos Fome e Saúde, 
//ou seja, um campo calculado, então não devemos criar um atributo para armazenar 
//esta informação por que ela pode ser calculada a qualquer momento.

public class Tamagocchi {
	private String nome = "";
	private double fome = 50;
	private double saude = 50;
	private int idade = 0;
	
	public Tamagocchi(String nome) {
		if(nome == null || nome.equals("")) {
			throw new IllegalArgumentException("Não é permitido null ou vazio");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getFome() {
		if(fome <= 5) {
			System.out.println("INANIÇÃO");
		} else if (fome <= 15) {
			System.out.println("MUITA FOME");
		} else if (fome <= 30) {
			System.out.println("FOME");
		} else if(fome <= 45){
			System.out.println("LEVE FOME");
		} else if (fome <= 55) {
			System.out.println("SATISFEITO");
		} else if (fome <= 80) {
			System.out.println("MUITO SATISFEITO");
		} else if (fome <= 100) {
			System.out.println("BARRIGA CHEIA");
		}
		return this.fome;
	}
	
	public double getSaude() {
		if(fome <= 5) {
			System.out.println("EM PERIGO");
		} else if (fome <= 30) {
			System.out.println("MUITO MAL");
		} else if(fome <= 40){
			System.out.println("MAL");
		} else if (fome <= 70) {
			System.out.println("SAUDÁVEL");
		} else if (fome <= 100) {
			System.out.println("MUITO SAUDÁVEL");
		}
		return this.fome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		if(nome == null) {
			System.out.println("Não é permitido null");
		} else {
			this.nome = nome;
		}
	}
	
	public void setFome(double fome) {
		if(fome <= 0 || fome > 100) {
			System.out.println("Não é permitido valores iguais ou menores a 0 e/ou maiores que 100");
		} else {
			this.fome = fome;
		}
	}
	
	public void setSaude(double saude) {
		if(saude <= 0 || saude > 100) {
			System.out.println("Não é permitido valores iguais ou menores a 0 e/ou maiores que 100");
		} else {
			this.saude = saude;
		}
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Não é permitido idade negativa");
		} else {
			this.idade = idade;
		}
	}
	
	public void reset() {
		this.setNome("");
		this.setIdade(0);
		this.setSaude(50);
		this.setFome(50);
	}
	
	public String alterarNome(String nome) {
		return this.nome = nome;
	}
	
	public void alimentar(double pontosDeComida) {
		if(fome > 0 || fome <= 100) {
			this.fome += pontosDeComida;			
		}
	}
	
	public void tratar(double pontosDeCura) {
		if(this.saude > 0 || this.saude <= 100) {
			this.saude += pontosDeCura;			
		}
	}
	
	public double humor(double fome, double saude) {
		double humor = arredondar(fome*0.5 + saude*0.5);
		if(fome <= 5) {
			System.out.println("ABANDONADO");
		} else if (fome <= 30) {
			System.out.println("DEPRIMIDO");
		} else if(fome <= 45){
			System.out.println("TRISTE");
		} else if (fome <= 55) {
			System.out.println("NORMAL");
		} else if (fome <= 80) {
			System.out.println("FELIZ");
		} else if (fome <= 100) {
			System.out.println("MUITO FELIZ");
		}
		return humor;
	}
	
	private double arredondar(double valor) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.setRoundingMode(RoundingMode.CEILING);
		String valorString = df.format(valor).replace(",", ".");
		return Double.parseDouble(valorString);
	}

}
