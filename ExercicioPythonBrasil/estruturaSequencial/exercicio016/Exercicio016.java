package exercicio016;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
//em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
//é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
//18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de 
//tinta a serem compradas e o preço total.

public class Exercicio016 {
	public static void main(String[] args) {
		System.out.println("Loja de tintas");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Metros quadrados: ");
			double area = scanner.nextDouble();
			BigDecimal precoTinta = new BigDecimal("80.00");
			double metroQuadradoPorLitro = 3;
			BigDecimal totalLatasDeTinta = new BigDecimal(area/metroQuadradoPorLitro).setScale(0, RoundingMode.CEILING);
			BigDecimal precoTotal = totalLatasDeTinta.multiply(precoTinta);
			System.out.println("Preço do litro da tinta: R$" + precoTinta);
			System.out.println("Quantidade de latas para pintar " + area + "m²: " + totalLatasDeTinta);
			System.out.println("Preço total: R$" + precoTotal);
		} catch (Exception e) {
			System.out.println("Não é permitido letra. Em caso de vírgula, substitua por ponto");
			e.getStackTrace();
		}
	}
	
}
