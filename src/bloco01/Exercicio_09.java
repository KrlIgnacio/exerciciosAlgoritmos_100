package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 11/10/2023
 *  
 * */

public class Exercicio_09 {

	public static void main(String[] args) {
		// leia o valor em REAIS na carteira do usu�rio e diga quantos DOLARES ele pode comprar
		//valor d�lar -> 5,05 (11/10/2023)
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//variaveis
		double dolar, real;
		System.out.println("Voc� sabe quantos d�lares pode ter na sua carteira?");
		System.out.print("Digite o valor em dinheiro que voc� tem na sua cateira hoje: ");
		real = teclado.nextDouble();
		System.out.println("Na sua carteira tem R$"+real);
		//convertendo reais em dolar
		dolar = real / 5.05;
		System.out.println("\nLogo, voc� pode comprar USD $"+formatador.format(dolar)+ " hoje!");
		
		
		
		
		teclado.close();

	}

}
