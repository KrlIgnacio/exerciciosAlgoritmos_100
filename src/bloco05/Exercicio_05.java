package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 17/10/2023
 * */
import util.Teclado;

public class Exercicio_05 {
	public static void main(String[] args) {
		//Faça o código anterior funcionar mesmo se o valor inicial for maior que o valor final
		int valorInicial, valorFinal, incremento;
		System.out.println("Vamos brincar de Contagem \n");
		valorInicial = Teclado.lerInt("Digite um valor inicial: ");
		valorFinal = Teclado.lerInt("Digite um valor final: ");
		incremento = Teclado.lerInt("Digite um valor incremento: ");
		while(valorInicial < valorFinal) {
			 System.out.print(" "+ valorInicial);
			 valorInicial = valorInicial + incremento;
		}
			if(valorInicial > valorFinal) {
				while(valorFinal <= valorInicial) {
					System.out.print(" "+valorFinal);
					valorFinal = valorFinal + incremento;	
					}
				
				}
			}
	}

