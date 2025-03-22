package teste;

import java.util.Random;
import java.util.Scanner;

public class Aula4 {

//	Impar or par?	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		int escolha, numero;
		int numero_random=(rand.nextInt(10))+1;
		double resultado;
		System.out.println("Par ou Ímpar?\n(0) Par\n(1) Ímpar");
		escolha = input.nextInt();
		switch (escolha) {
		case 0:
			System.out.print("\nEscolha um número de 1 a 10: ");
			numero = input.nextInt();
			if (numero <= 0 || numero >10)
			{
				System.out.print("Número inválido.");
			}
			else
			{
				resultado = (numero+numero_random)%2;
				if (resultado == 0)
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nPar... Você ganhou.");
				}
				else
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nÍmpar! Você perdeu.");
				}
			}
			break;
		
		case 1:
			System.out.print("Escolha um número de 1 a 10: ");
			numero = input.nextInt();
			if (numero <= 0 || numero >10)
			{
				System.out.print("Número inválido.");
			}
			else
			{
				resultado = (numero+numero_random)%2;
				if (resultado == 0)
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nPar! Você perdeu.");
				}
				else
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nÍmpar... Você ganhou.");
				}
			}
		break;
		
		default: System.out.print("Escolha inválida.");
		}


	}

}
