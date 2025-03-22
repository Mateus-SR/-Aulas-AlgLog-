package aula06;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double A = -999, B, C, delta, raiz_mais = -999, raiz_menos = -999;
		
		System.out.println("Insira \"A\":");
		
		do {
		System.out.println("\"A\" não pode ser 0.\n");
		A = input.nextDouble();
		} while (A == 0);
		
		System.out.println("\nInsira \"B\":");
		B = input.nextDouble();
		
		System.out.println("\nInsira \"C\":");
		C = input.nextDouble();
		
		delta = Math.pow(B, 2) - 4 * A * C;
		
		if (delta < 0) {
			System.out.print("\nDelta = 0\nNão há raiz real.");
			
		} else if (delta == 0) {
			raiz_mais = ((B*-1) + Math.sqrt(delta)) / (2 * A);
			System.out.printf("\nDuas raízes iguais: {%.2f , %.2f}", raiz_mais);
			
		} else {
			raiz_mais = ((B*-1) + Math.sqrt(delta)) / (2 * A);
			raiz_menos = ((B*-1) - Math.sqrt(delta)) / (2 * A);
			System.out.printf("\nDuas raízes distintas: {%.2f , %.2f}", raiz_mais, raiz_menos);
		}
	}

}

//	a = 2, b = 0, c= 0 dá erro