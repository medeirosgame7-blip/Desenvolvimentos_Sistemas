package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int idade = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		String nome = leia.nextLine();
		
         System.out.println("nome: " + nome);		
		 System.out.println("idade: " + idade);
	}

}
