package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double A, B, Resultado;
		System.out.print("Insira numero: ");
		A = input.nextDouble();
		System.out.print("Insira expoente: ");
		B = input.nextDouble();
		Resultado = Math.pow(A, B);
		System.out.printf("Resultado: %.4f", Resultado);
	}

}
