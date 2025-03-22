package aula5;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero = -1;
		System.out.println("Estou pensando em um número inteiro entre 0 e 10...\nAdivinhe qual é!");
		while (numero != 7) {
		numero = input.nextInt();
		if (numero == 7) {
			System.out.print("Acertou!");
		} else {
			System.out.println("Errou. Tente de novo.");
			}
		}
	}
}
//Se "numero" for 7, o programa nao deixa escrever, ao contrario do DoWhile