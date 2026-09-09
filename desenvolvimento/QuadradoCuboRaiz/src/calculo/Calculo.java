package calculo;

import java.net.Socket;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numero;
	    
	    
	    System.out.println("\nDigite um número: ");
	    numero = leia.nextInt();
	    
	    while (numero > 0) {
	    	System.out.printf("valor digitado: %d%n"
	    			+ "Quadrado: %d%n"
	    			+ "Cubo: %d%n"
	    			+ "Raiz: %.2%n", numero, numero * numero, numero * numero * numero, Math.sqrt(numero));
	    	
	    	System.out.println("Digite um número: ");
	    	numero = leia.nextInt();
	    	
	    }
	}

}
