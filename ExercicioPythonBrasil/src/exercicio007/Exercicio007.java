package exercicio007;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado,
//em seguida mostre o dobro desta área para o usuário.

public class Exercicio007 {
	public static void main(String[] args) {
		
		System.out.println("Calcula a área do quadrado e dobre");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Insira o lado do quadrado: ");
			double lado = scanner.nextDouble();
			
			double areaDoQuadrado = Math.pow(lado, 2);
			double areaDobrada = areaDoQuadrado * 2;
						
			DecimalFormat formatador = new DecimalFormat("0.000");
			formatador.setRoundingMode(RoundingMode.HALF_UP);
			
			String areaDoQuadradoFormatado = formatador.format(areaDoQuadrado);
			String areaDobradaFormatado = formatador.format(areaDobrada);
			
			System.out.println("Área do quadrado: " + areaDoQuadradoFormatado + "cm²");
			System.out.println("Área dobrada do quadrado: " + areaDobradaFormatado + "cm²");
			
		} catch(Exception e) {
			System.out.println("Não é possível inserir letras");
			e.getStackTrace();
		}
	}

}
