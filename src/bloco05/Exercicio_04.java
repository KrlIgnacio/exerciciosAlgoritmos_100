package bloco05;

import util.Teclado;

public class Exercicio_04 {

	public static void main(String[] args) {
		//Leia o valor inicial, o incremento e o valor final, e mostre a contagem 
		int valorInicial, valorFinal, incremento;
		System.out.println("Vamos brincar de Contagem \n");
		valorInicial = Teclado.lerInt("Digite um valor inicial: ");
		valorFinal = Teclado.lerInt("Digite um valor final: ");
		incremento = Teclado.lerInt("Digite um valor incremento: ");
			while(valorInicial <= valorFinal) {
				 System.out.print(" "+ valorInicial);
				 valorInicial = valorInicial + incremento;
	
			}
	}

}
