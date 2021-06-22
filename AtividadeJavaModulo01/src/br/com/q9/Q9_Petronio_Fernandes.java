/*
 * Escreva um algoritimo utilizando Java que leia uma palavra do teclado. 
 * Segundo a documentação da classe String é possivel converter uma String em 
 * um Array do tipo Char (char[]) utilizandoo comando: toCharArray(); 
 * Exiba a palavra digitada pelo usuário na ordem inversa. Por exe: Fuctura será exibido como arutcuF.
 * Documentação: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary
 * */

package br.com.q9;

import java.util.Scanner;

public class Q9_Petronio_Fernandes {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
		String palavra;
		System.out.println("Digite uma palavra para exibila da ordem inversa: ");
		
		palavra = entradaUsuario.next();
		char [] vetChars = palavra.toCharArray();
		
		for (int contador = vetChars.length-1; contador >= 0; contador--) {
			System.out.println(vetChars[contador]);
		}
	}
}
