package estruturaSequencial;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.

public class Exercicio003 {
	public static void main(String[] args) {
		
		System.out.print("Insira o primeiro número: ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int primeiroNumero = scanner.nextInt();
			System.out.print("Insira o segundo número: ");
			int segundoNumero = scanner.nextInt();
			int soma = primeiroNumero + segundoNumero;
			System.out.println("Soma: " + soma);
			
		} catch(Exception e) {
			System.out.println("Não é possível inserir dados diferentes de números inteiros(int), null ou valores muitos altos.");
			e.getStackTrace();
		}
		
		
		
	}
}
