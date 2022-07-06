package exercicio002;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

public class Exercicio002 {
	public static void main(String[] args) {
		System.out.print("Insira um número inteiro: ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int numero = scanner.nextInt();
			System.out.println("Número digitado: " + numero);
		} catch(Exception e) {
			System.out.println("Não é possível inserir dados diferentes do tipo número inteiro(int) ou null");
			e.printStackTrace();
		}
		
	}
}
