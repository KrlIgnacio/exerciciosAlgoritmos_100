package bloco01;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */
public class Exercicio_02 {

	public static void main(String[] args) {
		// leia o nome do usu�rio e fa�a uma sauda��o ao mesmo.
		Scanner teclado = new Scanner(System.in);
		String nome, sobrenome;
		System.out.println("Ol� meu caro, qual seu nome?");
		nome = teclado.next();
		System.out.println("E sobrenome?");
		sobrenome = teclado.next();
		System.out.println("Seja bem vindo ao meu reposit�rio, "+ nome + " "+sobrenome+", estou feliz em te ver por aqui!");
		
		teclado.close();

	}

}
