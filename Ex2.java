import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int x, y, z, n;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if(x > y && x > z) {
			System.out.printf("x: %d eh o maior valor.\n", x);
		} else if(y > x && y > z) {
			System.out.printf("y: %d eh o maior valor.\n", y);
		} else {
			System.out.printf("z: %d eh o maior valor.\n", z);
		}
		n = Math.max(x, y);
		System.out.printf("%d o maior valor.\n", n);
	}
}