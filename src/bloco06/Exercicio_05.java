package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 02/11/2023
 * */
import util.Teclado;

public class Exercicio_05 {

	public static void main(String[] args) {
		// Refa�a o exerc�cio n�mero 2 do bloco04
		//Dessa vez o jogador ter� 4 tentativas e os n�meros sorteados ser�o entre 1 e 10!
		int jogador, computador, tentativa=1;
		System.out.println("		JOGO SORTEIO");
		System.out.println("\nO computador vai sortear um n�mero e voc� deve advinhar este n�mero!"); 
			
			while(tentativa <= 4) {
				System.out.println(tentativa+"� tentativa");
				jogador = Teclado.lerInt("Digite um n�mero entre 1 e 10:");
				//gerando n�mero aleat�rio entre 1 e 10
			    computador = (int)(Math.random() * 10 + 1 );
			    System.out.println("Valor digitado: "+jogador);
			    System.out.println("Valor computador: "+computador);
			    if(jogador == computador) {
			    	System.out.println("\nParab�ns, voc� acertou!");
			    }
			    else {
			    	System.out.println("\nN�o foi dessa vez!");
			    }
				tentativa++;
			}
	}

}
