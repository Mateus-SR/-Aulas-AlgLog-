package teste;

import java.util.Random;
import java.util.Scanner;

public class ParImpar {

//	Impar ou par?	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		int escolha, numero;
		int numero_random=(rand.nextInt(10))+1;
		double resultado;
		System.out.println("Par ou Impar? (v1.1)\n(0) Par\n(1) Impar");
		escolha = input.nextInt();
		switch (escolha) {
		case 0:
			System.out.print("\nVocê escolheu par. A máquina fica com impar.\nAgora, escolha um número de 1 a 10: ");
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
					System.out.printf("\nPar... Você ganhou.\n(%d + %d = %d)", numero, numero_random, (numero+numero_random));
				}
				else
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nImpar! Você perdeu.\n(%d + %d = %d)", numero, numero_random, (numero+numero_random));
				}
			}
			break;
		
		case 1:
			System.out.print("\nVocê escolheu impar. A máquina fica com par.\nAgora escolha um número de 1 a 10: ");
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
					System.out.printf("\nPar! Você perdeu.\n(%d + %d = %d)", numero, numero_random, (numero+numero_random));
				}
				else
				{
					System.out.printf("\nEu escolho... %d.", numero_random);
					System.out.printf("\nImpar... Você ganhou.\n(%d + %d = %d)", numero, numero_random, (numero+numero_random));
				}
			}
		break;
		
		default: System.out.print("Escolha inválida.");
		}


	}

}
