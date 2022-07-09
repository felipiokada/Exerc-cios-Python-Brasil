package exercicioClasse;

//Classe Quadrado: Crie uma classe que modele um quadrado:

//  Atributos: Tamanho do lado
//  Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

public class Quadrado {
	private double lado = 0;
	
	public Quadrado(double lado) throws Exception {
		if(lado <= 0) {
			throw new IllegalArgumentException("Não é possível inserir valor menor ou igual a 0");
		}
		this.lado = lado;
	}
	
	public void mudarLado(double lado) {
		this.lado = lado;
	}
	
	public void mostrarLado() {
		System.out.println("Lado: " + this.lado);
	}
	
	public void calculoArea() {
		System.out.println(Math.pow(lado, 2));
	}
	
}
