import java.util.*;
public class Ex_2 {

	public static void main(String[] args) {
		
//		Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
//		valores inteiros aleat�rios (gerados a partir da classe Random) e, em seguida, fa�a a impress�o dos 
//		elementos no formato de uma tabela (impress�o como apresentado durante as aulas). Ap�s a 
//		impress�o o seu programa dever� trocar os elementos armazenados no tri�ngulo superior da matriz 
//		com os elementos armazenados no tri�ngulo inferior. Imprima novamente a matriz no v�deo para 
//		confer�ncia. Veja o exemplo abaixo indicando como a troca dos elementos dever� ser realizada. 
		
		Random gen = new Random();
		int[][] x = new int[4][4];
		int aux;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				x[i][j] = gen.nextInt(10);
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 4; j++) {
				if(i>j) {
					aux = x[i][j];
					x[i][j] = x[j][i];
					x[j][i] = aux;
					System.out.print(x[i][j]+"\t");
				}else {
					System.out.print(x[j][i]+"\t");
				}
			}
			System.out.println();
		}
		
	}

}
