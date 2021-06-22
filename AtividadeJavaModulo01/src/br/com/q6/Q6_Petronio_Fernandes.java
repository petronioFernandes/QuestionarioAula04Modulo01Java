/*
 * Escreva um algoritomo utilizando Java que leia 5 valores, salve em um array e exiba o menor valor digitado.
 * */

package br.com.q6;

import java.util.Scanner;

public class Q6_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int quantVetor = 5, menor = 999999;
		int [] numeros = new int [quantVetor];
		
		System.out.println("Vetor de " + quantVetor + " posições...");
		
		for (int contador = 0; contador < quantVetor; contador++) {
			
			System.out.println("Digite um valor: ");
			numeros[contador] = entradaUsuario.nextInt();
			
			if(numeros[contador] < menor) {
				menor = numeros[contador];
			}
		}
		System.out.println("O menor valor do seu vetor é: " + menor);
		System.out.println("\nPrograma finalizado!");
	}
}
