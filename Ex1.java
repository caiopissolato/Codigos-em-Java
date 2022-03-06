import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int aux = 1, fib = 1, n, ant = 0;
		System.out.printf("Entre com n: ");
		n = in.nextInt();
		if(n > 0) {
			System.out.printf("1, ");
			while(n >= fib) {
					System.out.printf("%d, ", fib);
					ant = fib;
					fib = aux + fib;
					aux = ant;
			}			
		} else {
			System.out.println("Valor invalido de n.");
		}
	}
}