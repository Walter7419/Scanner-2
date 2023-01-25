import java.util.Scanner;

public class Figuras {
	static Scanner entrada;
	Scanner figura;
	
	public static void main(String[] args) {
		Scanner lado = new Scanner(System.in);
		System.out.println("Dame tu ID");
		String ID = lado.nextLine();
		
		int i=Integer.parseInt(ID);
		
		Figurass cir = new	

		Figurass(i);
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("¿Que figura quieres hacer cu para cuadrado o ci para circulo?");
	String fir = entrada.nextLine();  
	
	if (fir.contains("ci")) {
		Scanner formula = new Scanner(System.in);
		System.out.println("¿Quieres obtener perimetro o area?");
		String form = formula.nextLine();  
		if (form.contains("pe")) {
			System.out.println("El perimetro es: "+cir.cPCi());

		}
		if (form.contains("ar")) {
			System.out.println("El area es: "+cir.cACi());

		}
	}
	
	if (fir.contains("cu")) {
		Scanner formula = new Scanner(System.in);
		System.out.println("¿Quieres obtener perimetro o area?");
		String form = formula.nextLine();  
		if (form.contains("pe")) {
			System.out.println("El perimetro es: "+cir.cPCu());

		}
		if (form.contains("ar")) {
			System.out.println("El area es: "+cir.cACu());

		}
		}
}
}