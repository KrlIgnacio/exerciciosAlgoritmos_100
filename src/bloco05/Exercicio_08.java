package bloco05;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 19/10/2023
 * */
public class Exercicio_08 {

	public static void main(String[] args) {
		//leia 7 n�meros inteiros e no final mostre o somat�rio
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int contador = 1;
		int num = 0;
			while(contador <= 7) {
				System.out.print("Digite o "+contador+"� n�mero: ");
				num = sc.nextInt();
				soma = soma + num;
				contador++;
				
			}
			
			sc.close();
			System.out.println("A soma dos valores �: "+soma);
	
	}

}
