package comparação;

import java.util.Scanner;

public class Maior_que_vinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int numero = Integer.parseInt(leia.nextLine());
		 
		 if ( numero > 20) {
			 System.out.println("número acima de 20");
		 } else {
			System.out.println("número abaixo de 20"); 
	
		 }
	}

}
