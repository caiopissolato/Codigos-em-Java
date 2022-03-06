public class Ex4 {
	public static void main(String[] args) {
		int[] meses = {15000, 23000, 17000};
		int total = 0;
		
		for(int i = 0; i < 3; i++) {
			total += meses[i];
		}
		
		System.out.printf("Total: %d\n", total);
		System.out.printf("Média: %.2f\n", (float) total/3);
	}
}
