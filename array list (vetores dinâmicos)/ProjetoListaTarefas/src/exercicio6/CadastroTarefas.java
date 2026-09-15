package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> atividades = new ArrayList<>();
			
		String atividade;
		String continuar;
		
		do {
			System.out.println("Digite uma tarefa: ");
			atividade = leia.nextLine();
			
			atividades.add(atividade);
			
			System.out.println("Deseja cadastrar outra tarefa? (s/n): ");
			continuar = leia.nextLine();
		
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println("\nTarefas cadastradas:");
		
		
		for (String tarefas : atividades) {
			System.out.println(tarefas);
		}
		
		leia.close();
	}

}
