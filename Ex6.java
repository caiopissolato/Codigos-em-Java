import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> lot = new ArrayList<Integer>();
		Random rand   = new Random();
		int n = 0, x = 49; // x = 49 pois quando o for para preencher os valores da loteria vai interando ele vai diminuindo de tamanho por isso x-- na linha 15
		
		for(int i = 1; i < 50; i++) {// for para preencher o arraylist
			num.add(i);
		}
		
		for(int i = 0; i < 6; i++) {//for para pegar os valores da loteria
			n = rand.nextInt(x--);
			lot.add(num.get(n));
			num.remove(n);
		}
		
		Collections.sort(lot);// ordenando ArrayList
		for(int i = 0; i < lot.size(); i++) {
			System.out.printf("%d ", lot.get(i));
		}
	}
}