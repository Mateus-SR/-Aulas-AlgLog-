package aula5;

import java.util.Scanner;

public class Random {
//	Advinhando um número aleatório
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double rng = (Math.random() * 10)+1;
		int rng_int = (int)rng, numero = -1;
		System.out.println("Estou pensando em um número inteiro entre 0 e 10...\nAdivinhe qual é!");;
		while (numero != rng_int) {
		//DoWhile também serviria	
			numero = input.nextInt();
			if (numero == rng_int) {
				System.out.printf("\nVocê acertou!\nO número que pensei foi: %d (%f)", rng_int, rng);
			} else {
				System.out.println("\nErrou... Tente novamente.");
			}
		}
	}

}

//System.out.printf("%d (%f)", rng_int, rng);
//Pra conferir o numero aleatorio