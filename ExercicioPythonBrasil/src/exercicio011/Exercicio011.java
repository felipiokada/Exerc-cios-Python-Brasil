package exercicio011;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// 1 - o produto do dobro do primeiro com metade do segundo .
// 2 - a soma do triplo do primeiro com o terceiro.
// 3 - o terceiro elevado ao cubo.

public class Exercicio011 {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Primeiro número inteiro: ");
			int primeiroNumeroInteiro = scanner.nextInt();
			System.out.print("Segundo número inteiro: ");
			int segundoNumeroInteiro = scanner.nextInt();
			System.out.print("Terceiro número real: ");
			double terceiroNumeroReal = scanner.nextDouble();
			System.out.println();
			
			double primeiraFormula = (2 * primeiroNumeroInteiro) * (segundoNumeroInteiro / 2);
			double segundaFormula = (3 * primeiroNumeroInteiro) + terceiroNumeroReal;
			double terceiraFormula = Math.pow(terceiroNumeroReal, 3);
			
			//formatar---------------------------
			DecimalFormat formatador = new DecimalFormat("0.00");
			formatador.setRoundingMode(RoundingMode.HALF_UP);
			
			String primeiraFormulaFormatada = formatador.format(primeiraFormula);
			String segundaFormulaFormatada = formatador.format(segundaFormula);
			String terceiraFormulaFormatada = formatador.format(terceiraFormula);
			
			String primeiraFormulaFormatadaString = primeiraFormulaFormatada.replace(",", ".");
			String segundaFormulaFormatadaString = segundaFormulaFormatada.replace(",", ".");
			String terceiraFormulaFormatadaString = terceiraFormulaFormatada.replace(",", ".");
			
			double resultadoPrimeiraFormula = Double.parseDouble(primeiraFormulaFormatadaString);
			double resultadoSegundaFormula = Double.parseDouble(segundaFormulaFormatadaString);
			double resultadoTerceiraFormula = Double.parseDouble(terceiraFormulaFormatadaString);
			//-----------------------------------
			
			System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultadoPrimeiraFormula);
			System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoSegundaFormula);
			System.out.println("O terceiro elevado ao cubo: " + resultadoTerceiraFormula);
			
		} catch(Exception e) {
			System.out.println("Não é permitido letras ou números muito extensos.");
			e.getStackTrace();
		}
		
	}
}
