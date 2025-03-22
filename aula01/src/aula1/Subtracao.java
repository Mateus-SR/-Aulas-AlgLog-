package aula1;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double n1,n2,sub;
		System.out.print("Insira o 1º número: ");
		n1=input.nextDouble();
		System.out.print("Insira o 2º número: ");
		n2=input.nextDouble();
		sub = n1 - n2;
		System.out.println("Resultado da Subtração: " +sub);
	}

}
