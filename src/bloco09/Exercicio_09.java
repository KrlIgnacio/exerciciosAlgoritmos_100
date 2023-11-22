package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
public class Exercicio_09 {
	public static void Gerador(String frase, int vezes, int borda) {
		for (int i = 0; i < vezes; i++) {
			switch (borda) {
			case 1:
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				break;
			case 2:
				System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("<<<<<<<<<--------------->>>>>>>>>");
				break;
			}
			System.out.println(frase);
			switch (borda) {
			case 1:
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				break;
			case 2:
				System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("<<<<<<<<<--------------->>>>>>>>>");
				break;
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		// gerador com parametro de borda
		Gerador("	Aprendendo Java", 3, 1);

	}

}
