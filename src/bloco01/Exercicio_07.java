package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */

public class Exercicio_07 {

	public static void main(String[] args) {
		//  leia um n�mero real e mostre na tela o seu dobro e a sua ter�a parte
		double numero, numDobro, numTercaPrt;
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Digite um n�mero real: Ex: 3.5");
		numero = teclado.nextDouble();
		numDobro = numero * 2;
		numTercaPrt = numero / 3;
		System.out.println("O dobro de "+numero+": "+formatador.format(numDobro));
		System.out.println("A ter�a parte de "+numero+": "+formatador.format(numTercaPrt));
		
		teclado.close();

	}

}
