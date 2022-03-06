import java.util.*;

public class Ex6 {
	public static void main(String[] args) {
		ArrayList<Integer> meses = new ArrayList<Integer>(List.of(15000, 23000, 17000));
		int total = 0;
		
		for(int i = 0; i < meses.size(); i++) {
			total += meses.get(i);
		}
		
		System.out.printf("Total: %d\n", total);
		System.out.printf("Média: %.2f\n", (float) total/3);
	}
}
