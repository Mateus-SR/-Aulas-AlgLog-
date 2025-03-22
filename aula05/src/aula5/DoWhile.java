package aula5;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero = 7;
		System.out.println("Estou pensando em um número inteiro entre 0 e 10...\nAdivinhe qual é!");
		do {
		numero = input.nextInt();
		if (numero == 7) {
			System.out.print("Acertou!");
		} else {
			System.out.println("Errou. Tente de novo.");
			}
		}while (numero != 7);
	}
}
// Se numero for 7, ele pergunta mesmo assim, ao contrario do While