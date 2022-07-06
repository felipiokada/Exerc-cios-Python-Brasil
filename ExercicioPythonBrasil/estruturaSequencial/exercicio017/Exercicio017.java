package exercicio017;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
//quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada
//6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou
//em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// > comprar apenas latas de 18 litros;
// > comprar apenas galões de 3,6 litros;
// > misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente
//   10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

public class Exercicio017 {
	public static void main(String[] args) {

		double area = 0;
		double metroQuadradoPorLitro = 6;
		double litroDoLatao = 18;
		double litroDoGalao = 3.6;
		double percentualFolga = 0.1;
				
		System.out.println("Loja de Tinta");
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Metros quadrados: ");
			area = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Não é permitido letra. Em caso de vírgula, substitua por ponto");
			e.getStackTrace();
		}
		
		double totalDeLitros = arredondar(area/metroQuadradoPorLitro);

		System.out.println("Total de litros necessários: " + totalDeLitros + "L");
		System.out.println();
		
		BigDecimal precoDoLatao = new BigDecimal("80.00");
		int qntLatao = (int) Math.ceil(totalDeLitros/litroDoLatao);
		BigDecimal precoTotalLatao = precoDoLatao.multiply(new BigDecimal(qntLatao));

		System.out.println("OPÇÕES:");
		System.out.println("Opção 1 > Comprar apenas latas de 18L:");
		System.out.println("Quantidade de latas: " + qntLatao);
		System.out.println("Preço por lata: R$" + precoDoLatao);
		System.out.println("Preço total: R$" + precoTotalLatao);
		System.out.println();
		
		BigDecimal precoDoGalao = new BigDecimal("25.00");
		int qntGalao = (int) Math.ceil(totalDeLitros/litroDoGalao);
		BigDecimal precoTotalGalao = precoDoGalao.multiply(new BigDecimal(qntGalao));
		
		System.out.println("Opção 2 > Comprar apenas galões de 3,6L: ");
		System.out.println("Quantidade de galões: " + qntGalao);
		System.out.println("Preço por galão: R$" + precoDoGalao);
		System.out.println("Preço total: R$" + precoTotalGalao);
		System.out.println();
		
		BigDecimal litroFolga = new BigDecimal(totalDeLitros * percentualFolga).setScale(2, RoundingMode.CEILING);
		BigDecimal totalLitroComFolga = new BigDecimal(totalDeLitros).add(litroFolga).setScale(2, RoundingMode.FLOOR);
		
		int qntLataoEficiente = 0;
		int qntGalaoEficiente = 0;
		double totalLitrosEficiente = totalLitroComFolga.doubleValue();
		
		if(totalLitrosEficiente >= litroDoLatao) {
			qntLataoEficiente = (int) (totalLitrosEficiente / litroDoLatao);
			totalLitrosEficiente = arredondar(totalLitrosEficiente % litroDoLatao);
		} if (totalLitrosEficiente > 0 && totalLitrosEficiente < litroDoLatao) {
			qntGalaoEficiente = (int) Math.ceil(totalLitrosEficiente / litroDoGalao);
			totalLitrosEficiente = 0;
		}
		
		BigDecimal precoTotalLataoEficiente = new BigDecimal(qntLataoEficiente).multiply(precoDoLatao).setScale(2, RoundingMode.CEILING);
		BigDecimal precoTotalGalaoEficiente = new BigDecimal(qntGalaoEficiente).multiply(precoDoGalao).setScale(2, RoundingMode.CEILING);
		BigDecimal precoTotalEficiente = precoTotalLataoEficiente.add(precoTotalGalaoEficiente).setScale(2, RoundingMode.CEILING);
		
		System.out.println("Opção 3 > Compra de galões e latas: ");
		System.out.println(" + 10% dos litros totais: " + litroFolga + "L");
		System.out.println(" = Total de litros: " + totalLitroComFolga + "L");
		System.out.println(" > latas de 18L: " + qntLataoEficiente);
		System.out.println(" > galões de 3,6L: " + qntGalaoEficiente);
		System.out.println(" = R$" + precoTotalEficiente);
		
	}
	
	private static double arredondar(double valor) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		formatador.setRoundingMode(RoundingMode.CEILING);
		String valorString = formatador.format(valor);
		return Double.parseDouble(valorString.replace(",", "."));
	}
	
}
