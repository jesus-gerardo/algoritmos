package algoritm;

import java.util.Scanner;

public class MediaArmonica {
	
	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el total de numeros:");
		int iteraciones = scan.nextInt();
		
		float media = 0;
		for (int count = iteraciones-1; count >= 0 ; count--) {
			System.out.print("ingrese el numero:");
			float n = scan.nextFloat();
			media += (1 / n);
		}
		scan.close();
		System.out.println("H: "+ (iteraciones/media));	
	}
}
