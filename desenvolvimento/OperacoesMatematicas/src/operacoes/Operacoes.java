package operacoes;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);

		int n1, n2;
		int opcao = 4;

		System.out.println("Digite o primeiro número: ");
		n1 = numeros.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = numeros.nextInt();

		System.out.println("---Escolha entre as opções abixo---\n\n" + "   1 - Calcular a média dos números\n"
				+ "   2 - Subtrair o menor número do maior\n" + "   3 - Multiplicar os números\n"
				+ "   4 - Dividir o primeiro número pelo segundo\n");

		System.out.println("Diga qual calculo quer efetuar: ");
		opcao = numeros.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("média: " + (n1 + n2) / 2);
			break;

		case 2:

			if (n1 > n2) {
				System.out.println("subtração: " + (n1 - n2));
				break;

			} else {
				System.out.println("subtração: " + (n2 - n1));
				break;
			}

		case 3:
			System.out.println("multiplicação: " + (n1 * n2));
			break;

		case 4:
			if (n2 != 0 && n1 != 0) {
				System.out.println("Divisão: " + (n1 % n2));
				break;

			} else {
				System.out.println("números inválidos.");
				break;
			}

		default:
			System.out.println("opção é inválida");
		}
	}

}
