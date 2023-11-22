package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
import java.text.DecimalFormat;
import java.util.Scanner;

import util.Teclado;

public class Exercicio_03 {

	public static void main(String[] args) {
		// leia o sexo do cliente, e o valor do seu produto: homens ganham 5% de desconto e mulheres ganham 13% de desconto
		char sexo;
		double produto, desconto, valorFinal;
		System.out.println("Para comemorar o dia da mulher a loja toda está com desconto!");
		System.out.println("Descubra o valor do seu produto com desconto!");
		DecimalFormat formatador = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite: \n'F'. feminino \n'M'. masculino");
		sexo = sc.next().charAt(0);
		
		
			if(sexo == 'f' || sexo == 'F') {
				produto = Teclado.lerDouble("Digite o valor do seu produto R$: ");
				desconto = (produto * 13) / 100;
				valorFinal = produto - desconto;
				System.out.print("Valor final a pagar R$: "+formatador.format(valorFinal));
			}
			else if(sexo == 'm' || sexo == 'M'){
				produto = Teclado.lerDouble("Digite o valor do seu produto R$: ");
				desconto = (produto * 5) / 100;
				valorFinal = produto - desconto;
				System.out.print("Valor final a pagar R$: "+formatador.format(valorFinal));
			}
			else {
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
			}

			sc.close();
	}

}
