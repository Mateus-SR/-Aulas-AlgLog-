package teste;

import java.util.Scanner;

public class PerfilPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int dia, mes, ano, resultado;
		System.out.print("Vamos analisar seu perfil...\nInsira o dia de seu nascimento: ");
		dia = input.nextInt();
		System.out.print("Insira o mês de nascimento: ");
		mes = input.nextInt();
		System.out.print("Insira o ano de seu nascimento: ");
		ano = input.nextInt();
		resultado = (dia+mes+ano)%2;
		switch (resultado) {
			case 0:
				System.out.printf("%d: Tímido.", resultado);
			break;
			
			case 1:
				System.out.printf("%d: Sonhador.", resultado);
			break;
			
			case 2:
				System.out.printf("%d: Paquerador.", resultado);
			break;
			
			case 3:
				System.out.printf("%d: Atraente.", resultado);
			break;

			case 4:
				System.out.printf("%d: Irresistível.", resultado);
			break;

			default: System.out.print("Erro (failsafe): resultado não previsto.");
			
		}
	}

}
