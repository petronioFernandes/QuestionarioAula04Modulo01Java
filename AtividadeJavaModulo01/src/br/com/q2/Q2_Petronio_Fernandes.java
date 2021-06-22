/*
 * 	Escreva um algoritimo utilizando Java que leia um numero N e imprima todos os valores ímpares de 0 até N
 * */

package br.com.q2;

import java.util.Scanner;

public class Q2_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero: ");
		n = entradaUsuario.nextInt();
		
		System.out.println("Contando ímpares até " +n+ "...");
		
		for(int contador = 1; contador <= n; contador = contador +2) {
			System.out.println(contador);
		}
		System.out.println("\nPrograma finalizado!");
	}
}
