package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> convidados = new ArrayList<>();
		int opcao = 0;
		
		do {
			System.out.println("1 - Adicionar convidado" + "2 - Alterar convidado" + "3 - Remover convidado"
					+ "4 - Procurar convidado"
					+ "5 - Exibir convidados"
					+ "6 - Encerra");
			 = leia.nextLine();
			
		} while (opcao != 6);
		
		
		
	}

}
