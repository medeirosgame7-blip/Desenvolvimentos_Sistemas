package capitais;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná" , "Curitiba");
		
		System.out.println("Digite o nome de um estado: ");
		String estado = leia.nextLine();
		
		if (capitais.containsKey(estado)) {
			String cidade = capitais.get(estado);
			System.out.println("A capital de " + estado + " é " + cidade);		
		} else {
			System.out.println("cidade não encontrada!!!");
		}
		
	}

}
