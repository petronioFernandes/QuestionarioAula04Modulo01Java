/*
 * Escreva um algoritomo utilizando Java que leia 5 valores, salve em um array e exiba o maior valor digitado.
 * */

package br.com.q5;

import java.util.Scanner;

public class Q5_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int quantVetor = 5;
		int maior=0;
		int [] numeros = new int [quantVetor];
		
		System.out.println("Vetor de " + quantVetor + " posições...\n");
		
		for (int contador = 0; contador < quantVetor; contador++) {
			
			System.out.println("Digite um valor: ");
			numeros[contador] = entradaUsuario.nextInt();
			
			if(numeros[contador] > maior) {
				maior = numeros[contador];
			}
		}
		System.out.println("\nO maior valor do seu vetor é: " + maior);
		System.out.println("\nPrograma finalizado!");
	}
}
