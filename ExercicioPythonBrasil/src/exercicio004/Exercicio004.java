package exercicio004;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Exercicio004 {
	public static void main(String[] args) {
		
		System.out.println("Média de 4 notas bimestrais");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Primeira nota bimestral: ");
			double primeiraNota = scanner.nextDouble();
			System.out.print("Segunda nota bimestral: ");
			double segundaNota = scanner.nextDouble();
			System.out.print("Terceira nota bimestral: ");
			double terceiraNota = scanner.nextDouble();
			System.out.print("Quarta nota bimestral: ");
			double quartaNota = scanner.nextDouble();
			
			double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;
			
			//formatar para evitar floating point ou números extensos
			DecimalFormat formataMedia = new DecimalFormat("0.00");
			formataMedia.setRoundingMode(RoundingMode.HALF_UP);
			String mediaBimestral = formataMedia.format(media);
			System.out.println("Média bimestral: " + mediaBimestral);
			
		} catch(Exception e) {
			System.out.println("Não é possível valores null");
			e.getStackTrace();
		}
		
	}
}
