package bloco07;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_09 {

	public static void main(String[] args) {
		//Leia o 1� termo e a raz�o de uma P.A e mostre os 10 primeiros elementos 
		//e a somat�ria dos elementos
		int termo, razao, somatoria=0, termoAtual;
		System.out.println("------------------------------------");
		System.out.println("  PROGRESS�O ARITM�TICA! ");
		System.out.println("-------------------------------------\n");
		termo = Teclado.lerInt("Digite um valor para o primeiro termo de uma P.A:");
		razao = Teclado.lerInt("Digite um valor para a raz�o: ");
		termoAtual = termo;//incializando termoAtual
		System.out.println("P.A:");
		for(int i=1; i<=10; i++) {
			//somando os termos do loop
			somatoria+=termoAtual;
			//imprimindo o termo atual
			System.out.print(" "+termoAtual);
			//termoAtual + razao = P.A
			termoAtual += razao;
		}
		System.out.println(" ");
		System.out.println("\nSomat�ria: "+somatoria);
		
	}

}
