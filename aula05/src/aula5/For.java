package aula5;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int resultado, numero, loop, max=5;
		for (loop = 0; loop<max; loop++) {
			System.out.printf("(%d)Insira um número inteiro: ", loop);
			numero = input.nextInt();
			resultado = numero % 2;
			if (resultado == 0) {
				System.out.printf("%d é par.\n\n", numero);
			} else {
				System.out.printf("%d é impar.\n\n", numero);			
			}
		}
		System.out.println("\nSaimos do loop!");
	}

}
