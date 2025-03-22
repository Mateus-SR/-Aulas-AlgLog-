package aula1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double p1,p2,m;							
		System.out.print("Insira nota (P1): ");
		p1=input.nextDouble();
		System.out.print("Insira nota (P2): ");
		p2=input.nextDouble();
		m=(p1+p2)/2;
		System.out.print("A média é: "+m);

	}
}
