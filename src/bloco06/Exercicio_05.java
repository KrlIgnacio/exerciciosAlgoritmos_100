package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 02/11/2023
 * */
import util.Teclado;

public class Exercicio_05 {

	public static void main(String[] args) {
		// Refaça o exercício número 2 do bloco04
		//Dessa vez o jogador terá 4 tentativas e os números sorteados serão entre 1 e 10!
		int jogador, computador, tentativa=1;
		System.out.println("		JOGO SORTEIO");
		System.out.println("\nO computador vai sortear um número e você deve advinhar este número!"); 
			
			while(tentativa <= 4) {
				System.out.println(tentativa+"° tentativa");
				jogador = Teclado.lerInt("Digite um número entre 1 e 10:");
				//gerando número aleatório entre 1 e 10
			    computador = (int)(Math.random() * 10 + 1 );
			    System.out.println("Valor digitado: "+jogador);
			    System.out.println("Valor computador: "+computador);
			    if(jogador == computador) {
			    	System.out.println("\nParabéns, você acertou!");
			    }
			    else {
			    	System.out.println("\nNão foi dessa vez!");
			    }
				tentativa++;
			}
	}

}
