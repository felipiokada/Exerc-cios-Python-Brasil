package estruturaDeDecisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.

public class Exercicio006 {
	public static void main(String[] args) {
		
		List<Double> numeros = new ArrayList<Double>();
		
		try (Scanner reader = new Scanner(System.in)) {
			reader.useLocale(Locale.ENGLISH);
			System.out.print("1º número: ");
			numeros.add(reader.nextDouble());
			System.out.print("2º número: ");
			numeros.add(reader.nextDouble());
			System.out.print("3º número: ");
			numeros.add(reader.nextDouble());
			
			double maiorNumero = numeros.stream().mapToDouble(numero -> numero).max().getAsDouble();
			System.out.println("Maior número: " + maiorNumero);
			
		} catch (Exception e) {
			System.out.println("Não é permitido letras. Números decimais, substitua a vírgula por ponto");
			e.getStackTrace();
		}
		
	}
}
