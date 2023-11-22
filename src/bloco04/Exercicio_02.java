package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 14/10/2023
 * */

import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		// faça um jogo onde o computador sorteia números entre 1 e 5 e o jogador tenta adivinhar o número sorteado
		int jogador, computador;
		System.out.println("		JOGO SORTEIO");
		System.out.println("\nO computador vai sortear um número e você deve advinhar esse número!"); 
		jogador = Teclado.lerInt("Digite um número entre 1 e 5:");
		//gerando número aleatório entre 1 e 5
	    computador = (int)(Math.random() * 5 + 1 );
	    	
	    	if(jogador == computador) {
	    		System.out.println("\nParabéns, você advinhou o número do computador!");
	    		System.out.println("\nJogador escolheu: "+jogador);
	    	    System.out.println("Computador escolheu: "+computador);
	    	}
	    	else {
	    		System.out.println("\nInfelizmente não foi dessa vez!");
	    		System.out.println("\nJogador escolheu: "+jogador);
	    	    System.out.println("Computador escolheu: "+computador);
	    	}
	}

}
