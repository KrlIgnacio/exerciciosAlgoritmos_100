package bloco07;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat formatador = new DecimalFormat("#0.00");

	public static void main(String[] args) {
		//Leia vários números e mostre: o somatório | o menor valor | a média | Quantos são pares
		int menorValor = Integer.MAX_VALUE ;
		int cont=0, soma=0, mediaNumeros=0, numPares=0, numero;
		boolean flag = false;
		char continuar;
		System.out.println("-------------------------------");
		System.out.println("     SOMATÓRIO DE NÚMEROS:");
		System.out.println("-------------------------------");
			do {
				cont++;
				System.out.println(cont+"° valor: ");
				numero = sc.nextInt();
				System.out.println("Desejas continuar? (s/n)");
				continuar = sc.next().charAt(0);
				if(continuar == 'n'|| continuar == 'N') {
					flag = true;
				}
				soma+=numero;
				if(numero < menorValor) {
					menorValor = numero;
				}
				mediaNumeros = soma / cont;
				if(numero % 2 == 0) {
					numPares++;
				}
			}while(!flag);
			
			System.out.println("Somátorio: "+soma);
			System.out.println("Menor valor digitado: "+menorValor);
			System.out.println("Média dos valores: "+formatador.format(mediaNumeros));
			System.out.println("Números pares digitados: "+numPares);
	}

}
