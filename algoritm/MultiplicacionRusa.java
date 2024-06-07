package algoritm;

import java.util.Scanner;

public class MultiplicacionRusa {
	
	public static void run() {
		Scanner keyboar = new Scanner(System.in);
		
		System.out.print("ingrese el multiplador:");
		int multiplicador = keyboar.nextInt();
		
		System.out.print("ingrese el multiplacando:");
		int multiplicando = keyboar.nextInt();
		keyboar.close();
		
		int total = 0;
		while(multiplicador >= 1) {
			if(multiplicador % 2 != 0 ) {
				total += multiplicando;
			}
			
			multiplicador = multiplicador / 2;
			multiplicando = multiplicando * 2;
		}
		
		System.out.println("Resultado:"+total);
	}

}
