package estruturaSequencial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de
//horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS
//e 5% para o sindicato, faça um programa que nos dê:
// a. salário bruto.
// b. quanto pagou ao INSS.
// c. quanto pagou ao sindicato.
// d. o salário líquido.
// e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
//   + Salário Bruto : R$
//   - IR (11%) : R$
//   - INSS (8%) : R$
//   - Sindicato ( 5%) : R$
//   = Salário Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido.

public class Exercicio015 {
	public static void main(String[] args) {
		
		System.out.println("Cálculo Total Salário Líquido");
		
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.useLocale(Locale.ENGLISH);
			System.out.print("Valor hora: R$");
			BigDecimal valorHora = new BigDecimal(scanner.nextDouble());
			System.out.print("Horas trabalhadas no mês: ");
			BigDecimal horaTrabalhada = new BigDecimal(scanner.nextDouble());
		
			//impostos
			BigDecimal percentualImpostoDeRenda = new BigDecimal("0.11");
			BigDecimal percentualINSS = new BigDecimal("0.08");
			BigDecimal percentualSindicato = new BigDecimal("0.05");
			
			BigDecimal salarioBruto = valorHora.multiply(horaTrabalhada).setScale(2, RoundingMode.HALF_UP);
			BigDecimal valorImpostoDeRenda = salarioBruto.multiply(percentualImpostoDeRenda).setScale(2, RoundingMode.HALF_DOWN);
			BigDecimal valorINSS = salarioBruto.multiply(percentualINSS).setScale(2, RoundingMode.HALF_DOWN);
			BigDecimal valorSindicato = salarioBruto.multiply(percentualSindicato).setScale(2, RoundingMode.HALF_DOWN);
			
			BigDecimal salarioLiquido = salarioBruto.subtract(valorImpostoDeRenda.add(valorSindicato).add(valorINSS)).setScale(2, RoundingMode.HALF_UP);
			
			System.out.println(" + Salário Bruto: R$" + salarioBruto);
			System.out.println(" - IR (11%): R$" + valorImpostoDeRenda);
			System.out.println(" - INSS (8%): R$" + valorINSS);
			System.out.println(" - Sindicato (5%): R$" + valorSindicato);
			System.out.println(" = Salário Líquido: R$" + salarioLiquido);
			
		} catch (Exception e) {
			System.out.println("Não aceita letras e/ou vírgulas.");
			e.getStackTrace();
		}
	}
	
}
