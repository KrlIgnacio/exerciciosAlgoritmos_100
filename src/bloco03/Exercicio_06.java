package bloco03;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 13/10/2023
 * */
public class Exercicio_06 {

	public static void main(String[] args) {
		//leia dois n�meros inteiros e compare-os: num1 � o maior | num2 � o maior | num1 == num2 
		int num1, num2;
		System.out.println("Vamos comparar dois valores:");
		num1 = Teclado.lerInt("\nDigite um valor inteiro:");
		num2 = Teclado.lerInt("Digite outro valor inteiro:");
			if(num1 > num2){
				System.out.println("\n"+num1+" � o maior valor!");
			}
			else if(num2 > num1) {
				System.out.println("\n"+num2+" � o maior valor!");
			}
			else {
				System.out.println("Os valores s�o iguais, portanto n�o h� maior valor!");
			}
	}

}
