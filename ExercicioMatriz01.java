package ExerciciosVetoreMatrizes;

import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
//	3. Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
//		a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
//		das matrizes N1 e N2;
//		b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
//		posi��o das matrizes N1 e N2.
	
		Scanner leia = new Scanner (System.in);
		
		int[][] N1 = new int[2][3];
		int[][] N2 = new int[2][3];
		int[][] M1 = new int [2][3];
		int[][] M2 = new int [2][3];

		System.out.println("Digite os valores da matriz N1 ");
		for (int i = 0;i<N1.length;i++) {
			for (int j = 0;j<N1[i].length;j++) {

			System.out.printf("Digite os valores na posi��o %d %d: " , i,j); 
			N1[i][j] = leia.nextInt();
				
			}
			System.out.println();
		}
		System.out.println("Digite os valores da matriz N2 ");
		for (int i = 0;i<N2.length;i++) {
			for (int j = 0;j<N2[i].length;j++) {
				
			System.out.printf("Digite os valores na posi��o %d %d: " , i,j);
			N2[i][j] = leia.nextInt();
				
			}
			System.out.println();
		}
		leia.close();
		System.out.print("Matriz M1: \n");
		
		for (int i = 0;i<M1.length;i++) {
			for (int j = 0;j<M1[i].length;j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
			
				System.out.print( M1[i][j] + "|");
			}
		System.out.println();
		}
		System.out.print("\nMatriz M2: \n");
		
		for (int i = 0;i<M2.length;i++) {
			for (int j = 0;j<M2[i].length;j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.print(M2[i][j] + "|");
			}
		System.out.println();
		}
	
	}

}
	
		