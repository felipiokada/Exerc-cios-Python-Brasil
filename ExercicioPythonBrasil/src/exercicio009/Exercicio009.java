package exercicio009;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
//mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

public class Exercicio009 {
	public static void main(String[] args) {
		
		System.out.println("Temperatura de graus Fahrenheit(Fº) para graus Celsius(Cº)");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Insira graus Fahrenheit: ");
			double grausFahrenheit = scanner.nextDouble();
			double GrausFahrenheitParaGrausCelsius = 5 * ((grausFahrenheit - 32) / 9);
			
			//formatar
			DecimalFormat formatarGrausCelsius = new DecimalFormat("0.0");
			formatarGrausCelsius.setRoundingMode(RoundingMode.HALF_UP);
			String grausCelsiusString = formatarGrausCelsius.format(GrausFahrenheitParaGrausCelsius);
			String grausCelsiusStringFormatado = grausCelsiusString.replaceAll(",", ".");
			double grausCelsius = Double.parseDouble(grausCelsiusStringFormatado);
			
			System.out.println("Equivale: " + grausCelsius + "Cº");
			
		} catch(Exception e) {
			System.out.println("Não é permitido inserir letras");
			e.getStackTrace();
		}
	}
}
