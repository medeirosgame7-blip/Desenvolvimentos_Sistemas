package semana;

import java.util.Scanner;

public class Dia {

	public static void main(String[] args) {
		
		int opcao = 7;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Dígite um dia da semana (1 á 7): ");
		opcao = Integer.parseInt(numero.nextLine());
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-feira");
			break;

		case 3:
			System.out.println("Terça-feira");
			break;

		case 4:
			System.out.println("Quarta-feira");
			break;

		case 5:
			System.out.println("Quinta-feira");
			break;

		case 6:
			System.out.println("Sexta-feira");
			break;

		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("opção inválida");
		}
	}

}
