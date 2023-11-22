package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 11/10/2023
 * */
public class Exercicio_10 {

	public static void main(String[] args) {
		/* leia a largura e altura de uma parede, calcule e 
		mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o, 
		sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.
*/		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//variaveis
		double largura, altura, area, litroTinta;
		// 1 litro de tinta = area de 2m quadrados
		System.out.println("Descobrindo a quantidade necess�ria de tinta para pintar uma parede: \n");
		System.out.print("Digite a largura da parede: ");
		largura = teclado.nextDouble();
		System.out.print("Digite a altura da parede: ");
		altura = teclado.nextDouble();
		System.out.println("Dimens�es da parede "+largura+ "x"+altura+".");
		area = altura * largura;
		System.out.println("\nA area desta parede equivale a "+formatador.format(area)+"m�");
		//calculo tinta
		litroTinta = area / 2;
		System.out.println("\nA quantidade de litros para pintar esta tinta equivale a "+formatador.format(litroTinta)+"L.");
		

		teclado.close();
	}

}
