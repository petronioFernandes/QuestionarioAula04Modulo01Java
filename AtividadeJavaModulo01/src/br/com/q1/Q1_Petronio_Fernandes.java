/*
 * 	Escreva um algoritimo utilizando Java que leia um numero N e imprima todos os valores pares de 0 até N.
 * */

package br.com.q1;

import java.util.Scanner;

public class Q1_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero: ");
		n = entradaUsuario.nextInt();
		
		System.out.println("Contando pares até "+n+"...");
		
		for(int contador = 0; contador <= n; contador = contador + 2) {
			System.out.println(contador);
		}	
		System.out.println("\nPrograma finalizado!");
	}
}