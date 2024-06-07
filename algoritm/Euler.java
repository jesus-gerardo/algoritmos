package algoritm;

public class Euler {
	public static void run() {
		int count = 0;
		float euler = 0;
		float aux =0;
		float dif = 1;
		
		while (dif > 0.0001) {
			aux = euler;
			euler += (1/(float)factorial(count));
			dif = euler-aux;
			count++;
		}
		System.out.println("numero de euler:"+ euler);
		System.out.println("total de iteraciones:"+ count);
	}
	
	private static long factorial(int fact) {
		long result_fact = 1;
		for(int i = 1; i <= fact; i++) {
			result_fact = result_fact * i;
		}
		return result_fact;
	}

}
