package exercicio008;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número
//de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class Exercicio008 {
	public static void main(String[] args) {
		
		System.out.println("Cálculo do salário");
		System.out.println();
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Quanto ganha por hora: R$");
			BigDecimal dinheiro = new BigDecimal(scanner.next());	//Melhor para trabalhar com dinheiro
			
			System.out.print("Horas trabalhadas: ");
			BigDecimal horasTrabalhadas = new BigDecimal(scanner.next());
			
			BigDecimal formulaSalario = horasTrabalhadas.multiply(dinheiro);
			
			//formatar valores
			BigDecimal salarioMensal = formulaSalario.setScale(2, RoundingMode.HALF_UP);
			
			System.out.println("Fórmula do salário mensal: ganho por hora(R$/h) x horas trabalhadas(h)");
			System.out.println("Salário do mês: R$" + salarioMensal);
			
		} catch(Exception e) {
			System.out.println("Dinheiro só aceita números");
			System.out.println("Horas trabalhadas só aceita números");
			e.getStackTrace();
		}
	}
}
