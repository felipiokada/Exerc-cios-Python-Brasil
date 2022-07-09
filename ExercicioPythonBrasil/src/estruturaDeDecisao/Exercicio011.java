package estruturaDeDecisao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

import estruturaDeDecisao.modelo.Colaborador;

//As Organizações Tabajara resolveram dar um aumento de salário aos seus
//colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
//seguinte critério, baseado no salário atual:
// salários até R$ 280,00 (incluindo) : aumento de 20%
// salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
// salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
// salários de R$ 1500,00 em diante : aumento de 5%
//Após o aumento ser realizado, informe na tela:
// o salário antes do reajuste;
// o percentual de aumento aplicado;
// o valor do aumento;
// o novo salário, após o aumento.

public class Exercicio011 {
	public static void main(String[] args) {
		System.out.println("Aumento aos funcionário da Organização Tabajara");
		BigDecimal salarioDoColaborador = null;
		Colaborador colaborador = new Colaborador();
		
		try (Scanner reader = new Scanner(System.in)) {
			reader.useLocale(Locale.ENGLISH);
			System.out.print("Salário do funcionário: R$");
			salarioDoColaborador = new BigDecimal(reader.nextDouble()).setScale(2, RoundingMode.HALF_UP);
			colaborador.setSalario(salarioDoColaborador);;
		} catch (Exception e) {
			System.out.println("Não é permitido letras. Números decimais, substitua a vírgula por ponto");
			e.getStackTrace();
		}
		
		BigDecimal percentualDeAumento = percentualDeAumento(colaborador);
		BigDecimal valorAumento = valorAumento(colaborador, percentualDeAumento);
		BigDecimal novoValorSalario = novoValorSalarial(colaborador);
		
		System.out.println();
		System.out.println("Salário do colaborador: R$" + colaborador.getSalario());
		System.out.println("Percentual do aumento: " + percentualDeAumento.multiply(new BigDecimal("100")) + "%");
		System.out.println("Valor do aumento: R$" + valorAumento);
		System.out.println("Novo salário do colaborador: R$" + novoValorSalario);
		colaborador.setSalario(novoValorSalario);
	}
	
	private static BigDecimal percentualDeAumento(Colaborador colaborador) {
		if(colaborador.getSalario().compareTo(new BigDecimal("280")) <= 0) {
			return new BigDecimal("0.2");
		} else if (colaborador.getSalario().compareTo(new BigDecimal("700")) < 0) {
			return new BigDecimal("0.15");
		} else if (colaborador.getSalario().compareTo(new BigDecimal("1500")) < 0) {
			return new BigDecimal("0.1");
		} else if (colaborador.getSalario().compareTo(new BigDecimal("1500")) >= 0) {
			return new BigDecimal("0.05");
		} else {
			return new BigDecimal("1");
		}
	}
	
	private static BigDecimal valorAumento(Colaborador colaborador, BigDecimal percentualDeAumento) {
		return colaborador.getSalario().multiply(percentualDeAumento).setScale(2, RoundingMode.HALF_UP);
	}
	
	private static BigDecimal novoValorSalarial(Colaborador colaborador) {
		BigDecimal percentualDeAumento = percentualDeAumento(colaborador);
		BigDecimal valorAumento = valorAumento(colaborador, percentualDeAumento);
		BigDecimal salarioReajustado = colaborador.getSalario().add(valorAumento);
		return salarioReajustado;
	}
	
}
