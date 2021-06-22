/*
 * 	Escreva um algoritimo utilizando Java que leia um numero N e imprima a soma todos os numeros de 0 até N.
 * */

package br.com.q3;

import java.util.Scanner;

public class Q3_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero: ");
		n = entradaUsuario.nextInt();
		
		System.out.println("Contando e somando "+n+" vezes...");
		
		for(int contador = 0, soma = 0; contador <= n; contador++) {
			soma = soma + contador;
			System.out.println("A nova soma é: " + soma);
			
		}
		System.out.println("\nPrograma finalizado!");
	}
}