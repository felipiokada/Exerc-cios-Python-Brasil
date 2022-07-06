package estruturaSequencial;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
//que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class Exercicio012 {
	public static void main(String[] args) {
		
		System.out.println("Cálculo do peso ideal");
		
		try(Scanner scanner = new Scanner(System.in)){
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Insira altura em metros: ");
			double entradaAltura = scanner.nextDouble();
			double pesoIdeal = formulaPesoIdeal(entradaAltura);
			System.out.println("Peso ideal para altura de " + entradaAltura + ": " + pesoIdeal + "kg");
		} catch(Exception e) {
			System.out.println("Não é possível inserir letras");
			e.getStackTrace();
		}
	}
	
	private static double formulaPesoIdeal(double altura) {
		double pesoIdeal = (72.7 * altura) - 58;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		formatador.setRoundingMode(RoundingMode.HALF_UP);
		String pesoIdealString = formatador.format(pesoIdeal);

		return Double.parseDouble(pesoIdealString.replace(",", "."));
		
	}
}
