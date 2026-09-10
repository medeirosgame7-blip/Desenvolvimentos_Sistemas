package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] numeros = new int[8];
		int quantPar = 0;
		int quantImpar = 0;
	
		for (int i = 0; i < numeros.length; i++) {
			 System.out.println("Digite um número: ");
			 numeros[i] = leia.nextInt();
		 
			 
		 }
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("Número " + numeros[i] + ": par");
				quantPar++;
			}
			if (numeros[i] % 2 == 1) {
				System.out.println("Número " + numeros[i] + ": ímpar");
				quantImpar++;
			}
		}
		System.out.println("\n\nQuantidade de pares: " + quantPar);
		System.out.println("Quantidade de Ímpares: " + quantImpar);
		
  }
}
