/*
 * 	Escreva um algoritomo utilizando Java que leia uma idade, caso a idade seja negativa você deve informar
 *  que não aceita valores negativos e peça para ele digitar o valor novamente e encerre a aplicação quando 
 *  ele digitar um valor válido.
 * */

package br.com.q4;

import java.util.Scanner;

public class Q4_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = entradaUsuario.nextInt();
		
		while(idade < 0) {
			System.out.println("Eu não aceito valores negativos!\n\nPor favor digite sua idade: ");
			idade = entradaUsuario.nextInt();
		}
		System.out.println("Valor válido!");
		System.out.println("\nPrograma finalizado!");
	}
}
