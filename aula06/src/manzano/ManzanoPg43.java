package manzano;

import java.util.Scanner;

public class ManzanoPg43 {
//	Se, senão
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int A, B, X, R;
		A = input.nextInt();
		B = input.nextInt();
		X = A + B;
		if (X>10) {
			R = X + 5;
		} else {
			R = X - 7;
		}
		System.out.print(R);

	}

}
