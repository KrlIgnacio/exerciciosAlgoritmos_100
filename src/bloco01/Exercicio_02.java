package bloco01;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */
public class Exercicio_02 {

	public static void main(String[] args) {
		// leia o nome do usuário e faça uma saudação ao mesmo.
		Scanner teclado = new Scanner(System.in);
		String nome, sobrenome;
		System.out.println("Olá meu caro, qual seu nome?");
		nome = teclado.next();
		System.out.println("E sobrenome?");
		sobrenome = teclado.next();
		System.out.println("Seja bem vindo ao meu repositório, "+ nome + " "+sobrenome+", estou feliz em te ver por aqui!");
		
		teclado.close();

	}

}
