package exercicioClasse;

//Classe Bola: Crie uma classe que modele uma bola:

//   Atributos: Cor, circunferência, material
//   Métodos: trocaCor e mostraCor

public class Bola {
	
	private String cor = "";
	private double circunferencia = 0;
	private String material = "";
	
	public Bola(String cor, double circunferencia, String material) throws Exception{
		if (cor == null || material == null){
			throw new IllegalArgumentException("Não é permitido valores null");
		} else if (circunferencia <= 0) {
			throw new IllegalAccessException("Não é permitido circunferencia menor ou igual a 0");
		}
		this.cor = cor;
		this.circunferencia = circunferencia;
		this.material = material;
	}
	
	public String setCor() {
		return this.cor;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public double getCircunferencia() {
		return this.circunferencia;
	}
	
	public void trocarCor(String cor) {
		this.cor = cor;
	}
	
	public void mostrarCor() {
		System.out.println("Cor da bola: " + this.cor);
	}
	
}
