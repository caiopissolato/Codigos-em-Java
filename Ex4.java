import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str;
		String[] vet = new String[3];
		
		
		for(int i = 0; i < vet.length; i++) {
			str = in.next();
			vet[i] = str;
		}
		
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("String %d: %s\n", i, vet[i]);
		}
		in.close();
	}
}