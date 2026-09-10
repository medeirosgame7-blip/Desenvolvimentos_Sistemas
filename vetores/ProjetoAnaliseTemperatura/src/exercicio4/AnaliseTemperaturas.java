package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[] temperatura = new double[7];
		double maiorTemp, menorTemp;


		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Digite a temperatura do " + (i + 1) + "º dia da semana: ");
			temperatura[i] = leia.nextDouble();
		}
// perguntar ao vitor sobre isso. 
		maiorTemp = temperatura[0];
		menorTemp = temperatura[0];

		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maiorTemp) {
				maiorTemp = temperatura[i];
			}

					if (temperatura[i] < menorTemp) {
				menorTemp = temperatura[i];
			}
		}
		
		System.out.println("\n\nMaior temperatura: " + maiorTemp);
		System.out.println("\nMenor temperatura: " + menorTemp);

	}

}
