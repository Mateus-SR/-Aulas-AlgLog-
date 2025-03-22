package teste;

import java.util.Scanner;

public class InverterNumero {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int numero, centena, dezena, unidade;
		System.out.print("Insira um número inteiro de 3 digitos: ");
		numero = input.nextInt();
		unidade = numero%10;
		dezena = ((numero%100)-unidade)/10;
		centena = numero/100;

		
		
		System.out.print(+unidade +"" +dezena +"" +centena);
	}

}
