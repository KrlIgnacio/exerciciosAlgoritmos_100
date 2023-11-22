package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_07 {

	public static void main(String[] args) {
		/* Pergunte a velocidade de um carro, caso ultrapasse 80km/h exiba uma mensagem de multa
		 *  valor multa:  R$5 por cada Km acima da velocidade permitida*/
		Scanner sc = new Scanner(System.in);
		double velocidadeCarro, valorMulta;
		System.out.print("Digite a velocidade do seu carro: ");
		velocidadeCarro = sc.nextDouble();
			if(velocidadeCarro > 80) {
				valorMulta = (velocidadeCarro - 80) * 5;
				System.out.println("\nVocê está acima da velocidade permitida!");
				System.out.print("Valor da multa R$: "+valorMulta);
			}
			else {
				System.out.println("Você está dentro da velocidade permitida, parabéns!");
			}
		sc.close();

	}

}
