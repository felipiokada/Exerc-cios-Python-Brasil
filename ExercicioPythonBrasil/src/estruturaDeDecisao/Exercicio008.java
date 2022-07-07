package estruturaDeDecisao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import estruturaDeDecisao.modelo.Produto;

//Faça um programa que pergunte o preço de três produtos e informe qual produto
//você deve comprar, sabendo que a decisão é sempre pelo mais barato.

public class Exercicio008 {
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		BigDecimal produtoMaisBarato = null;
		
		try (Scanner reader = new Scanner(System.in)) {
			reader.useLocale(Locale.ENGLISH);
			int qntProdutosNaLista = 3;
			
			for(int i = 0; i < qntProdutosNaLista; i++) {
				System.out.print("Preço do produto " + (i+1) +": ");
				BigDecimal entradaPreco = new BigDecimal(reader.nextDouble()).setScale(2, RoundingMode.CEILING);
				produtos.add(new Produto(entradaPreco));
			}
			
		} catch (Exception e) {
			System.out.println("Não é permitido letras. Números decimais, substitua a vírgula por ponto");
			e.getStackTrace();
		}
		
		for (Produto produto : produtos) {
			if(produtoMaisBarato == null) {
				produtoMaisBarato = produto.getPreco();
			}
			if(produto.getPreco().compareTo(produtoMaisBarato) <= 0) {
				produtoMaisBarato = produto.getPreco();
			}
		}

		System.out.println("O produto mais barato é de: R$" + produtoMaisBarato);
		
	}

}
