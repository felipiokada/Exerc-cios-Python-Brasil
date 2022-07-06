package estruturaSequencial;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
//que calcule seu peso ideal, utilizando as seguintes fórmulas:
// 1. Para homens: (72.7*h) - 58
// 2. Para mulheres: (62.1*h) - 44.7

public class Exercicio013 {
	public static void main(String[] args) {
		System.out.println("Cálculo do peso ideal para homens e mulheres");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Insira altura: ");
			double altura = scanner.nextDouble();
			
			double pesoIdealHomem = formulaPesoIdeal(altura, "H");
			double pesoIdealMulher = formulaPesoIdeal(altura, "M");
			
			System.out.println("Peso ideal para homens: " + pesoIdealHomem + "kg");
			System.out.println("Peso ideal para mulheres: " + pesoIdealMulher + "kg");
		} catch (Exception e) {
			System.out.println("Não é permitido inserir letras");
			e.getStackTrace();
		}
	}
	
	private static double formulaPesoIdeal(double altura, String sexo) {
		
		if(sexo == null && (sexo != "H" || sexo != "M")) {
			throw new IllegalArgumentException("Só é 'H' ou 'M'");
		} else if (altura <= 0) {
			throw new IllegalArgumentException("Não é permitido altura menor ou igual a zero");
		}
		
		double pesoIdeal = 0;	
		if(sexo == "H") {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo == "M") {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		return formatadorPesoIdeal(pesoIdeal);
	}
	
	private static double formatadorPesoIdeal(double peso) {
		
		if(peso <= 0) {
			throw new IllegalArgumentException("Não é permitido peso menor ou igual a zero");
		}
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		formatador.setRoundingMode(RoundingMode.HALF_UP);
		String pesoIdeal = formatador.format(peso);
		
		return Double.parseDouble(pesoIdeal.replace(",", "."));
		
	}
	
}
