import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t_linhas0 = 0, t_linhas1 = 0, t_linhas2 = 0;
		int t_coluna0 = 0, t_coluna1 = 0, t_coluna2 = 0;
		int t_diagon0 = 0, t_diagon1 = 0;
		int[][] square = new int[3][3];
		
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j < square[i].length; j++) {
				square[i][j] = in.nextInt();
			}
		}
		if((square[0].length == square.length) && (square[1].length == square.length) && (square[2].length == square.length)){
			System.out.println("É um quadrado.");
		}
		
		for(int i = 0; i < square[0].length; i++) {
			t_linhas0 += square[0][i];
		}
		for(int i = 0; i < square[1].length; i++) {
			t_linhas1 += square[1][i];
		}
		for(int i = 0; i < square[2].length; i++) {
			t_linhas2 += square[2][i];
		}
		System.out.printf("Linha 0: %d\n", t_linhas0);
		System.out.printf("Linha 1: %d\n", t_linhas1);
		System.out.printf("Linha 2: %d\n", t_linhas2);
		
		for(int i = 0; i < square[0].length; i++) {
			t_coluna0 += square[i][0];
		}
		for(int i = 0; i < square[1].length; i++) {
			t_coluna1 += square[i][1];
		}
		for(int i = 0; i < square[2].length; i++) {
			t_coluna2 += square[i][2];
		}
		System.out.printf("Coluna 0: %d\n", t_coluna0);
		System.out.printf("Coluna 1: %d\n", t_coluna1);
		System.out.printf("Coluna 2: %d\n", t_coluna2);
		
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j < square[i].length; j++) {
				if(i == j) {
					t_diagon0 += square[i][j];
				}
			}
		}
		int x = square.length - 1;
		
		for(int i = 0; i < square.length; i++) {		
			t_diagon1 += square[i][x];
			x--;
		}
		System.out.printf("Diagonal 0: %d\n", t_diagon0);
		System.out.printf("Diagonal 1: %d\n", t_diagon1);
		
		int[] total = {t_linhas0, t_linhas1, t_linhas2, t_coluna0, t_coluna1, t_coluna2, t_diagon0, t_diagon1};
		int c = 0;
		for(int i = 0; i < total.length - 1; i++) {
			if(total[i] == total[i+1]) {
				c++;
			}
		}
		if(c == total.length -1) {
			System.out.println("É um quadrado mágico");
		} else {
			System.out.println("Não é um quadrado mágico.");
		}	
	}
}