package exercicio005;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.

public class Exercicio005 {
	public static void main(String[] args) {
		System.out.println("Converte metros para centímetros");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);	//para inserir pontos no console
			System.out.print("Metros: ");
			double metros = scanner.nextDouble();
			double centimetros = metros * 100;
			System.out.println(metros + "m = " + centimetros + "cm" );
			
		} catch(Exception e) {
			System.out.println("Não é possível inserir null, dados muito extensos ou letras");
			e.getStackTrace();
		}
	}
}
