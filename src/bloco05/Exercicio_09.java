package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 19/10/2023
 * */
import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		//  leia 6 n�meros inteiros e no final mostre quantos pares e quantos impares
		int contador = 1;
		int numero = 0;
		int par = 0;
		int impar = 0;
		Scanner sc = new Scanner(System.in);
			while(contador <=6) {
				System.out.print("Digite um "+contador+"� n�mero: ");
				numero = sc.nextInt();
				//n�o cometa o mesmo erro que eu, � fundamental a estrutura condicional dentro do while!
				if(numero % 2 == 0) {
					par++;
				}else {
					impar++;
				}
				//variavel contador somando +1
				contador++;
			}
			System.out.println("N�meros pares: "+par);
			System.out.println("N�meros impares: "+impar);
			
			
		sc.close();
	}

}
