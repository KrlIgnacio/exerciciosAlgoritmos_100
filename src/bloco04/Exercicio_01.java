package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 14/10/2023
 * */
import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		// Crie um Joken Po - Pedra Papel Tesoura
		//esse jogo já fiz com uma aula do Prof José de Assis (Youtube)
		int jogadorHumano, jogadorPC;
		System.out.println("JoKenPo! PEDRA - PAPEL - TESOURA!");
		System.out.println("\nVamos jogar JokenPO com o computador.");
		System.out.println("\n1. Pedra.");
		System.out.println("2. Papel.");
		System.out.println("3. Tesoura.");
		jogadorHumano = Teclado.lerInt("Jogador, escolha uma das opções: ");
			switch(jogadorHumano) {
			case 1:
				System.out.println("Jogador escolheu PEDRA.");
				break;
			case 2: 
				System.out.println("Jogador escolheu PAPEL.");
				break;
			case 3: 
				System.out.println("Jogador escolheu TESOURA.");
				break;
				default: 
					System.out.println("OPÇÃO INVÁLIDA.");
			}
			//computador recebe um valor inteiro de 0 a 3 + 1
		jogadorPC = (int)(Math.random() * 3 + 1);
			switch(jogadorPC) {
			case 1: 
				System.out.println("Computador escolheu PEDRA.");
				break;
			case 2:
				System.out.println("Computador escolheu PAPEL.");
				break;
			case 3:
				System.out.println("Computador escolheu TESOURA.");
			}
			//condição empate
			if(jogadorHumano == jogadorPC ) {
				System.out.println("EMPATE.");
				//condição humano venceu
			}else if((jogadorHumano == 3 && jogadorPC == 2) || (jogadorHumano == 2 && jogadorPC == 1) || (jogadorHumano == 1 && jogadorPC == 3 )) {
				System.out.println("JOGADOR VENCEU!");
			} else {
				System.out.println("COMPUTADOR VENCEU!");
			}
	}

}
