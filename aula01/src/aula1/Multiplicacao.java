package aula1;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double n1,n2,mul;
		System.out.print("Insira 1º número: ");
		n1=input.nextDouble();
		System.out.print("Insira 2º número: ");
		n2=input.nextDouble();
		mul = n1 * n2;
		System.out.print("Resultado da Multiplicação: " +mul);
	}

}
