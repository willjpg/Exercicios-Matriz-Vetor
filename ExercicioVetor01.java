package ExerciciosVetoreMatrizes;

import java.util.Scanner;

public class ExercicioVetor01 {
	/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double [5];double notaM = 0; 
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("Nota: ");
			notas[i] = leia.nextDouble();
			
			if(notaM < notas[i]) {
				notaM=notas[i];	
			}
		}System.out.println("A maior nota: "+notaM);
		leia.close();
	}

}
