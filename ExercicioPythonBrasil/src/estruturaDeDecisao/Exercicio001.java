package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.
public class Exercicio001 {
	public static void main(String[] args) {
		
		double primeiroNumero = 0;
		double segundoNumero = 0;
		double maiorNumero = primeiroNumero;
		
		System.out.println("Seleciona o maior número");
		try (Scanner ler = new Scanner(System.in)) {
			ler.useLocale(Locale.ENGLISH);
			System.out.print("Número 1: ");
			primeiroNumero = ler.nextDouble();
			System.out.print("Número 2: ");
			segundoNumero = ler.nextDouble();
		} catch (Exception e) {
			System.out.println("Não é permitido usar letras. Substitua vírgulas por pontos.");
			e.getStackTrace();
		}
		
		if(primeiroNumero >= segundoNumero) {
			maiorNumero = primeiroNumero;
		} else if (segundoNumero > primeiroNumero) {
			maiorNumero = segundoNumero;
		}
		
		System.out.println("Maior número: " + maiorNumero);
		
	}
}
