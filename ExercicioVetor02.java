package ExerciciosVetoreMatrizes;

import java.util.Random;

public class ExercicioVetor02 {
	/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
		int [] array= new int[10];
		int soma=0, media, maiorN=0;
		
		System.out.println("lançando os dados...");		
		for(int i=0; i<10;i++) {
			array[i] = random.nextInt(6)+1;// +1 para que não comece no 0 e sim no 1
			System.out.println(array[i]);
			Thread.sleep(500);
			soma+= array[i];
			
			if(array[i]>maiorN) {
				
				maiorN++;
			}
		}
		{
			media = soma/10;
			System.out.println("A média de lançamento é: "+media);
			System.out.println("As ocorrências da maior pontuação foram: "+maiorN);
		}
		
		
		//impressão da Matriz...	
			for(int i=0; i<array.length; i++) {
					
					System.out.print(array[i] + " | ");
				}
					System.out.println();
					
					
			}
		
	}


