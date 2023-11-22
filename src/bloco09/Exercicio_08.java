package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
public class Exercicio_08 {
	public static void Gerador(String frase, int v) {
		for (int i = 0; i < v; i++) {
			System.out.println("*-*-**-*-*-**-*-*-*-**-***-*-*");
			System.out.println(frase);
			System.out.println("*-*-**-*-*-**-*-*-*-**-***-*-*");
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// procedimentos com parametros frase + num de vezes da frase
		Gerador("	Aprendendo Java", 5);

	}

}
