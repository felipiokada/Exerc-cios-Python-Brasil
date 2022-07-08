package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar
//M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
//"Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

public class Exercicio010 {
	public static void main(String[] args) {
		System.out.println("Turno de estudo");
		System.out.println("M - Matutino | V - Vespertino | N - Noturno");
		
		try (Scanner reader = new Scanner(System.in)) {
			reader.useLocale(Locale.ENGLISH);
			System.out.print("Qual o seu turno? ");
			String turno = reader.next().toUpperCase();
			
			if(turno.equals("V")) {
				System.out.println("VESPERTINO");
			} else if (turno.equals("M")) {
				System.out.println("MATUTINO");
			} else if (turno.equals("N")) {
				System.out.println("NOTURNO");
			} else {
				System.out.println("Valor inválido. Insira M, N ou V.");
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
