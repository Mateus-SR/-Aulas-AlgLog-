package aula1;

import java.util.Scanner;

public class Totalcompra {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double valor,total;
		int quantidade;
		System.out.print("Insira o valor unitário do produto: ");
		valor=input.nextDouble();
		System.out.print("Insira a quantidade: ");
		quantidade=input.nextInt();
		total = quantidade * valor;
		System.out.print("Total a pagar: R$" +total);
	}

}
