package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido

public class Exercicio003 {
	public static void main(String[] args) {
		
		System.out.println("Verifica sexo F - Feminino, M - Masculino ou Informação Inválida");
		
		String sexo = "";
		
		try (Scanner ler = new Scanner(System.in)) {
			ler.useLocale(Locale.ENGLISH);
			System.out.print("Insira o sexo: ");
			String entradaSexo = ler.next();
			sexo = entradaSexo.toUpperCase();
		} catch (Exception e) {
			System.out.println("Não é permitido usar letras. Substitua vírgulas por pontos.");
			e.getStackTrace();
		}
		
		if (sexo.equals("F")) {
			System.out.println("Feminino");
		} else if (sexo.equals("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Informação Inválida");
		}
		
	}
}
