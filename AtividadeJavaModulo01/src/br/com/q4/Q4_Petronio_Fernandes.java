/*
 * 	Escreva um algoritomo utilizando Java que leia uma idade, caso a idade seja negativa voc� deve informar
 *  que n�o aceita valores negativos e pe�a para ele digitar o valor novamente e encerre a aplica��o quando 
 *  ele digitar um valor v�lido.
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
			System.out.println("Eu n�o aceito valores negativos!\n\nPor favor digite sua idade: ");
			idade = entradaUsuario.nextInt();
		}
		System.out.println("Valor v�lido!");
		System.out.println("\nPrograma finalizado!");
	}
}
