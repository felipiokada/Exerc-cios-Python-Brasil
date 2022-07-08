package estruturaDeDecisao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class Exercicio009 {
	public static void main(String[] args) {
		
		System.out.println("Ordena a lista em ordem decrescente");
		
		List<Double> numeros = new ArrayList<Double>();
		int qntDeNumerosInseridos = 3;
		
		try (Scanner reader = new Scanner(System.in)) {
			for(int i = 0; i < qntDeNumerosInseridos; i++) {
				System.out.print("Inserir número: ");
				numeros.add(reader.nextDouble());
			}
		} catch (Exception e) {
			System.out.println("Não é permitido letras. Números decimais, substitua a vírgula por ponto");
			e.getStackTrace();
		}
		
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista decrescente");
        numeros.stream().forEach(numero -> System.out.println(numero));
        
	}
}
