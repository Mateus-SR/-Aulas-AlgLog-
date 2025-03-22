package manzano;

import java.util.Scanner;

public class ManzanoPg46 {
//	Novo salário
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double salario, novo_salario;
		salario = input.nextDouble();
		if (salario < 500) {
			novo_salario = salario * 1.15;
		} else if (salario <=1000) {
			novo_salario = salario * 1.10;
		} else {
			novo_salario = salario * 1.05;
		}
		System.out.printf("%.2f", novo_salario);
		

	}

}
