package ExerciciosVetoreMatrizes;

import java.util.Random;

public class ExercicioVetor02 {
	/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
		int [] array= new int[10];
		int soma=0, media, maiorN=0;
		
		System.out.println("lan�ando os dados...");		
		for(int i=0; i<10;i++) {
			array[i] = random.nextInt(6)+1;// +1 para que n�o comece no 0 e sim no 1
			System.out.println(array[i]);
			Thread.sleep(500);
			soma+= array[i];
			
			if(array[i]>maiorN) {
				
				maiorN++;
			}
		}
		{
			media = soma/10;
			System.out.println("A m�dia de lan�amento �: "+media);
			System.out.println("As ocorr�ncias da maior pontua��o foram: "+maiorN);
		}
		
		
		//impress�o da Matriz...	
			for(int i=0; i<array.length; i++) {
					
					System.out.print(array[i] + " | ");
				}
					System.out.println();
					
					
			}
		
	}


