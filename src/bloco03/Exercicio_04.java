package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 13/10/2023
 * */
import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_04 {

	public static void main(String[] args) {
		//pergunte quantos km um passageiro deseja percorrer e calcule o valor da sua passagem
		//R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.
		double valorPassagem, kmViagem;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Olá caro passageiro, vamos descobrir o valor de sua passagem!");
		kmViagem = Teclado.lerDouble("\nInforme quantos km será a sua viagem:");
		System.out.print("Viagem de "+kmViagem+"Km.");
			if(kmViagem <= 200) {
				valorPassagem = kmViagem * 0.50;
				System.out.print("\nValor passagem: "+formatador.format(valorPassagem)+".");
			}
			else if(kmViagem > 200){
				valorPassagem = kmViagem * 0.45;
				System.out.print("\nValor passagem: "+formatador.format(valorPassagem)+".");
			}

	}

}
