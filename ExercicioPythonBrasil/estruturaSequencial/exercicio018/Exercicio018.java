package exercicio018;

import java.util.Scanner;

//Faça um programa que peça o tamanho de um arquivo para download (em MB)
//e a velocidade de um link de Internet (em Mbps), calcule e informe o
//tempo aproximado de download do arquivo usando este link (em minutos).
public class Exercicio018 {

	public static void main(String[] args) {
		
		double tamanhoDoArquivo = 0;
		double velocidadeMbps = 0;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Tamanho do arquivo (em MB): ");
			tamanhoDoArquivo = scanner.nextDouble();
			System.out.print("Velocidade Mbps: ");
			velocidadeMbps = scanner.nextDouble();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		int tempoParaDownloadEmMinutos = (int) Math.ceil((tamanhoDoArquivo/velocidadeMbps) / 60);
		System.out.println("Tempo aproximado de download: " + tempoParaDownloadEmMinutos + "min");

	}
	
	
}
