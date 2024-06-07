package algoritm;

import java.util.Scanner;

public class Palindromo {
	
	public static void run() {	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese la oracion:");
		String entrada = scan.nextLine().replace(" ", "");
		scan.close();
		
		int len_entrada = entrada.length()-1;
		
		String reves = "";
		for(int i = len_entrada; i >= 0; i--) {
			reves += entrada.charAt(i);
		}
		
		if(reves.equals(entrada)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
	}
}
