package bloco02;

import java.util.Scanner;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 11/10/2023
 * */

public class Exercicio_05 {

	public static void main(String[] args) {
		/* leia o n�mero de dias trabalhados em um m�s e mostre o 
		sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25
*/		Scanner sc = new Scanner(System.in);
		//variaveis
		int diasTrab, horaDia = 8, valorDiaria;
		double salario;
		System.out.println("	Sal�rio Funcion�rio");
		System.out.println("___________________________________");
		System.out.println("\nQuantos dias voc� trabalha no m�s?");
		diasTrab = sc.nextInt();
		valorDiaria = horaDia * 25;
		salario = valorDiaria * diasTrab;
		System.out.println("De acordo com o valor da sua hora (R$25,00) e dias trabalhados:");
		System.out.print("\nSeu sal�rio � R$: ");
		System.out.println(salario);

		sc.close();
	}

}
