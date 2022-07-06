package estruturaSequencial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
//o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
//maior que o estabelecido pelo regulamento de  pesca do estado de São Paulo (50 quilos)
//deve pagar uma multa de R$ 4,00  por quilo excedente. João precisa que você faça um
//programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável 
//excesso a quantidade de quilos além do limite e na variável multa o valor da multa que
//João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
public class Exercicio014 {
	public static void main(String[] args) {
		System.out.println("Controlador de pesca");
		double pesoLimite = 50;
		BigDecimal multaPorQuilo = new BigDecimal("4.00");
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Peso em quilos: ");
			double pesoPeixe = scanner.nextDouble();
			double pesoExcedente = formatarDouble(pesoPeixe - pesoLimite);
			
			if(pesoExcedente > 0) {
				System.out.println("ALERTA: ULTRAPASSOU O PESO LIMITE DE PESCA (" + pesoLimite + "kg)");
				BigDecimal valorMulta = new BigDecimal(pesoExcedente).multiply(multaPorQuilo).setScale(2, RoundingMode.HALF_UP);
				System.out.println();
				System.out.println("MULTA APLICADA");
				System.out.println("Segundo a legislação do estado de SP, a multa aplica R$4.00 para cada quilo excedente pescado.");
				System.out.println("Peso excedente: " + pesoExcedente + "kg");
				System.out.println("Valor da multa: R$" + valorMulta);
			} else {
				System.out.println("Não ultrapassou peso limite de pesca (" + pesoLimite + "kg)");
				System.out.println("OK");
			}
			
		} catch (Exception e) {
			System.out.println("Não é permitido letras e/ou vírgula");
			e.getStackTrace();
		}
		
	}
	
	private static double formatarDouble(double valor) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		formatador.setRoundingMode(RoundingMode.HALF_UP);
		String valorFormatadoString = formatador.format(valor);
		return Double.parseDouble(valorFormatadoString.replace(",", "."));
	}

}
