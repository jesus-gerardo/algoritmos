package algoritm;

public class Calc {
	
	private int x, y;
	
	// polimorfismo
	public Calc(int x) {
		System.out.println("No se puede hacer la suma correctamente. asegurese de mandar todos los valores correctos");
	}
	
	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.sum());
	}
	
	public int sum(){
		return x + y;
	}
	
	public void algo() {
		/*
		System.out.println("hola mundo como estamos");
		Scanner scan = new Scanner(System.in);
		System.out.println("escriba un numero");
		int numer = scan.nextInt();
		System.out.println(numer);
		
		Calc pros = new Calc(5,5);
		System.out.println(pros.sum());
		
		ArrayList<Integer> name = new ArrayList<Integer>();
		for (int i = 0; i< 20; i++) {
			name.add(i);	
		}
		name.forEach((n) -> System.out.println(n));
		*/
	}
}
