package estruturaDeDecisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

public class Exercicio004 {
	public static void main(String[] args) {
		
		System.out.println("Verifica se a letra digitada é vogal ou consoante");
		System.out.println("Obs.: algumas vogais e consoantes acentuadas serão informações invalidadas");
		String letra = "";
		
		try (Scanner ler = new Scanner(System.in)) {
			ler.useLocale(Locale.ENGLISH);
			System.out.print("Insira a letra: "); 
			String entradaLetra = ler.next();
			letra = entradaLetra.toLowerCase();
			if(letra.length() > 1) {
				throw new IllegalArgumentException("Foi inserido mais que 1 letra");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		List<String> consoantes = new ArrayList<String>(Arrays.asList("b","c","d","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","v","y","x","w","z"));
		List<String> vogais = new ArrayList<String>(Arrays.asList("a","e","i","o","u","á","à","ã","â","ä","é","è","ê","ì","ï","î","í","ó","ò","ö","ô","ú","û","ü","ù"));
		
		if(consoantes.contains(letra)) {
			System.out.println("É consoante");
		} else if (vogais.contains(letra)) {
			System.out.println("É vogal");
		} else {
			System.out.println("Informação inválida");
		}
	}
}
