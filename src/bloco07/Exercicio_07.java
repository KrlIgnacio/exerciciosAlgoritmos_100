package bloco07;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 03/11/2023
 * */
import util.Teclado;

public class Exercicio_07 {

	public static void main(String[] args) {
		//Leia um n�mero inteiro positivo e mostre a contagem desse valor at� o zero!
		int numero;
		System.out.println("CONTAGEM REGRESSIVA!");
		numero = Teclado.lerInt("\nDigite um n�mero inteiro positivo:");
			for(; numero >=0; numero--) {
				System.out.print(" "+numero);
			}
			System.out.println(" FIM!");
			
	}

}
