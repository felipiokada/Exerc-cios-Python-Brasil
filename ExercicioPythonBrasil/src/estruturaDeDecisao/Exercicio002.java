package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class Exercicio002 {
	public static void main(String[] args) {
		
		System.out.println("Verifica se o valor é positivo ou negativo");
		
		double valor = 0;
		
		try (Scanner ler = new Scanner(System.in)) {
			ler.useLocale(Locale.ENGLISH);
			System.out.print("Insira o número: ");
			valor = ler.nextDouble();
		} catch (Exception e) {
			System.out.println("Não é permitido usar letras. Substitua vírgulas por pontos.");
			e.getStackTrace();
		}
		
		if(valor > 0) {
			System.out.println("Valor é positivo");
		} else if (valor == 0 ) {
			System.out.println("Valor é neutro");
		} else {
			System.out.println("Valor é negativo");
		}
		
	}
}
