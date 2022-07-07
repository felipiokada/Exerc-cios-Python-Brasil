package estruturaDeDecisao;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
// 1. A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// 2. A mensagem "Reprovado", se a média for menor do que sete;
// 3. A mensagem "Aprovado com Distinção", se a média for igual a dez.

public class Exercicio005 {
	public static void main(String[] args) {
		
		System.out.println("Cálculo de notas");
		List<Double> notas = new ArrayList<Double>();
		double mediaParaAprovacao = 7;
		double nota001 = 0;
		double nota002 = 0;
		
		try (Scanner reader = new Scanner(System.in)) {
			reader.useLocale(Locale.ENGLISH);
			System.out.print("Nota 1: ");
			double entradaNota001 = reader.nextDouble();
			nota001 = arredondar(entradaNota001);
			System.out.print("Nota 2: ");
			double entradaNota002 = reader.nextDouble();
			nota002 = arredondar(entradaNota002);
			
			notas.add(nota001);
			notas.add(nota002);
			
			double media = arredondar(notas.stream().mapToDouble(nota -> nota).average().getAsDouble()); //é mais prático do que fazer for
			
			System.out.println("Média do aluno: " + media);
			if (media == 10) {
				System.out.println("ALUNO: APROVADO COM DISTINÇÃO");
			} else if (media >= mediaParaAprovacao) {
				System.out.println("ALUNO: APROVADO");
			} else if (media < mediaParaAprovacao) {
				System.out.println("ALUNO: REPROVADO");
			}
			
		} catch (Exception e) {
			System.out.println("Não é permitido letras. Números decimais, substitua a vírgula por ponto");
			e.getStackTrace();
		}
		
	}
	
	private static double arredondar(double valor) {
		DecimalFormat formatador = new DecimalFormat("0.0");
		formatador.setRoundingMode(RoundingMode.CEILING);
		String valorString = formatador.format(valor);
		return Double.parseDouble(valorString.replace(",", "."));
	}
	
}
