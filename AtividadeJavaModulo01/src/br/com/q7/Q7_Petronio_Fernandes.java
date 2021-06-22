/*
 * Escreva um alritomo usando java que leia 5 valores, salve em um array e exiba os valores na ordem inversa.
 * */

package br.com.q7;

import java.util.Scanner;

public class Q7_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int quantVetor = 5;
		int [] numeros = new int [quantVetor];
		
		System.out.println("Vetor de " + quantVetor + " posições...");
		
		for (int contador = 0; contador < quantVetor; contador++) {
			
			System.out.println("Digite um valor: ");
			numeros[contador] = entradaUsuario.nextInt();	
		}
		
		System.out.println("\nOs valores digitados na ordem inversa são: ");
		
		for (int contador = numeros.length -1; contador >= 0; contador--) {
			System.out.println(numeros[contador]);
		}
		System.out.println("\nPrograma finalizado!");
	}
}
