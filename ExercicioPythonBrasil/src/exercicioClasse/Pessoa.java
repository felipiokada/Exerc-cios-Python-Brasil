package exercicioClasse;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//Classe Pessoa: Crie uma classe que modele uma pessoa:

//Atributos: nome, idade, peso e altura
//Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a
//cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.

public class Pessoa {
	private String nome = "";
	private int idade = 0;
	private double peso = 0;
	private double altura = 0;
	
	public Pessoa(String nome, int idade, double peso, double altura) throws Exception{
		if(peso <= 0 || altura <= 0) {
			throw new IllegalArgumentException("Não é permitido valor menor ou igual a zero");
		} else if (idade < 0) {
			throw new IllegalAccessException("Não é permitido valor menor a zero");
		}
		if(nome == null) {
			throw new IllegalAccessException("Não é permitido valor igual a zero");
		}
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	

	public void engordar(double quilograma) {
		this.peso += quilograma;
	}

	public void emagrecer(double quilograma) {
		this.peso -= quilograma;
	}
	
	public void crescer(double metros) {
		this.altura += metros;
		this.altura = arredondarDouble(this.altura);
	}
	
	public void envelhecer(int anos) {
		for(int i = this.idade; i < 21; i++) {
			crescer(0.05);
		}
		this.idade += anos;
	}
	private double arredondarDouble(double valor) {
		DecimalFormat formatador = new DecimalFormat("#.00");
		formatador.setRoundingMode(RoundingMode.HALF_UP);
		String novaAltura = formatador.format(this.altura);
		return Double.parseDouble(novaAltura.replace(",", "."));
	}
	
}