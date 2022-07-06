package exercicio006;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Exercicio006 {
	public static void main(String[] args) {
		System.out.println("Calculando área de um círculo a partir do seu raio");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Raio do círculo em centímetros: ");
			double raio = scanner.nextDouble();
			double formula = Math.pow(raio, 2) * Math.PI;
			
			DecimalFormat formataArea = new DecimalFormat("0.0000");
			formataArea.setRoundingMode(RoundingMode.HALF_UP);
			String area = formataArea.format(formula);
			System.out.println("Área aproximadamente de: " + area + " cm²");
			
		} catch(Exception e) {
			System.out.println("Só é possível inserir números");
			e.getStackTrace();
		}
		
	}
}
