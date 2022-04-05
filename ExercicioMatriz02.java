package ExerciciosVetoreMatrizes;

import java.util.Scanner;

public class ExercicioMatriz02 {
/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		double[][] numeros = new double[3][3];
		double soma = 0.0, somaDiag = 0.0;
		
		System.out.println("******MATRIZ3x3******");
		for(int i=0; i<numeros.length; i++) {
			for( int j=0; j<numeros[i].length; j++) {
				
				System.out.printf("Digite os números da Matriz3x3: %d %d: ", i+1,j+1);
				numeros[i][j] = leia.nextDouble();
				
				soma+= numeros[i][j];
				somaDiag = numeros[0][0]+numeros[1][1]+numeros[2][2];
			
			}System.out.println("Escreva: "+ soma);
			System.out.println();
			
			
		}System.out.println("Soma total: "+ soma);
		System.out.println("Soma diagonal principal: "+ somaDiag);
		leia.close();
	}

}
	

