package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 14/10/2023
 * */

import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		// fa�a um jogo onde o computador sorteia n�meros entre 1 e 5 e o jogador tenta adivinhar o n�mero sorteado
		int jogador, computador;
		System.out.println("		JOGO SORTEIO");
		System.out.println("\nO computador vai sortear um n�mero e voc� deve advinhar esse n�mero!"); 
		jogador = Teclado.lerInt("Digite um n�mero entre 1 e 5:");
		//gerando n�mero aleat�rio entre 1 e 5
	    computador = (int)(Math.random() * 5 + 1 );
	    	
	    	if(jogador == computador) {
	    		System.out.println("\nParab�ns, voc� advinhou o n�mero do computador!");
	    		System.out.println("\nJogador escolheu: "+jogador);
	    	    System.out.println("Computador escolheu: "+computador);
	    	}
	    	else {
	    		System.out.println("\nInfelizmente n�o foi dessa vez!");
	    		System.out.println("\nJogador escolheu: "+jogador);
	    	    System.out.println("Computador escolheu: "+computador);
	    	}
	}

}
