package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[] numero = new double[4];
		double somaNumeros = 0;

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			numero[i] = leia.nextDouble();
			somaNumeros += numero[i];
		}

		System.out.println("\n\nNotas cadastradas: ");
		for (double numeros : numero) {
			System.out.println(numeros);
		}

		System.out.println("\n\nMédia: " + somaNumeros / numero.length);

	}

}
