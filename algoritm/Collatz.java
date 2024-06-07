package algoritm;

import java.util.Scanner;

public class Collatz {
	
	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el numero de inicio:");
		int n = scan.nextInt();
		scan.close();

		int i = 1000;
		while (n != 1 && i != 0) {
			System.out.print(n+"-");
			if(n % 2 == 0) {
				n = n / 2;
			}else {
				n = (n*3)+1;
			}
			
			i--;
		}
		System.out.println("1");
		System.out.println("total iteracciones:" + i);
	}
}
