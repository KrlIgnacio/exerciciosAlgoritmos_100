package bloco02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_06 {

	public static void main(String[] args) {
		/*Calcule a redu��o do tempo de vida de um fumante e mostre os dias perdidos, considere que a cada cigarro fumado
		 *  ele perde 10min de vida. Pergunte a quantidade de cigarros fumados e quantos anos ele j� fumou*/
		//variaveis
		double anosFumando, qtdCigarroDia, diasPerdidos;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Calculo de redu��o do tempo de vida de um fumante:\n");
		System.out.print("Voc� fuma quantos cigarros por dia? ");
		qtdCigarroDia= sc.nextDouble();
		System.out.print("Voc� fuma h� quantos anos? ");
		anosFumando = sc.nextDouble();
		//calculo dias Perdidos -- abaixo o calculo de anos fumados
		diasPerdidos = (qtdCigarroDia * 10 * 365 * anosFumando) / (60 * 24); // 60min x 24h (calculo p/ dias)
							
		System.out.println("\nAt� o momento, voc� perdeu "+formatador.format(diasPerdidos)+" dias de vida devido ao v�cio em cigarro.");
		sc.close();
	}

}
