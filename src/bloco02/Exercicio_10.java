package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_10 {

	public static void main(String[] args) {
		//leia um n�mero inteiro e mostre se ele � PAR ou �MPAR
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Descubra se um n�mero � par ou �mpar:");
		System.out.print("\nDigite um n�mero: ");
		numero = sc.nextInt();
			//resto da divis�o diferente de zero
			if(numero % 2 != 0) 
				System.out.println("\n"+numero+" � um n�mero �MPAR!");
			
			else
				System.out.println("\n"+numero+" � um n�mero PAR!");
		sc.close();

	}

}
