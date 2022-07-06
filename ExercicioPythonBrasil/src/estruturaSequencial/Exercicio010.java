package estruturaSequencial;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

public class Exercicio010 {
	public static void main(String[] args) {
		
		System.out.println("Temperatura de graus Celsius(Cº) para graus Fahrenheit(Fº)");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Insira graus Celsius: ");
			double grausCelsius = scanner.nextDouble();
			double GrausCelsiusParaGrausFahrenheit = ((grausCelsius * 9) / 5) + 32;
			
			//formatar
			DecimalFormat formatarGrausFahrenheit = new DecimalFormat("0.0");
			formatarGrausFahrenheit.setRoundingMode(RoundingMode.HALF_UP);
			String grausFahrenheitString = formatarGrausFahrenheit.format(GrausCelsiusParaGrausFahrenheit);
			String grausFahrenheitStringFormatado = grausFahrenheitString.replaceAll(",", ".");
			double grausFahrenheit = Double.parseDouble(grausFahrenheitStringFormatado);
			
			System.out.println("Equivale: " + grausFahrenheit + "Fº");
			
		} catch(Exception e) {
			System.out.println("Não é permitido inserir letras");
			e.getStackTrace();
		}
		
	}
}
