package bloco07;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_08 {
		static Scanner sc = new Scanner(System.in);
		static DecimalFormat formatador = new DecimalFormat("#0.00");
	public static void main(String[] args) {
		//Leia o sexo e peso de 8 pessoas e mostre: Quantas mulheres cadastradas| Quantos homens > 100kg
		//media peso das mulheres | o maior peso entre os homens
		char sexo;
		double peso, mediaPesoMulheres=0, somaMulher=0, maiorPesoHomen=Integer.MIN_VALUE;
		int contMulheres=0, contHomens100=0;
		System.out.println("------------------------------------");
		System.out.println("  CADASTRO DE PESSOAS: ");
		System.out.println("-------------------------------------\n");
		for(int cont = 1; cont<=5; cont++) {
			System.out.println(cont+ "° pessoa:");
			System.out.println("Digite seu peso: ");
			peso = sc.nextDouble();
			System.out.println("Digite seu sexo(f/m)");
			sexo = sc.next().charAt(0);
			if(sexo == 'f'|| sexo == 'F') {
				contMulheres++;
				somaMulher+=peso;
				mediaPesoMulheres = somaMulher / contMulheres;
			}else if(sexo == 'm'|| sexo == 'M') {
				if(peso > 100) {
					contHomens100++;
				}
				if(peso > maiorPesoHomen) {
					maiorPesoHomen = peso;
				}
			}
		}
		System.out.println("Mulheres cadastradas: "+contMulheres);
		System.out.println("Homens com mais de 100kg: "+contHomens100);
		System.out.println("Média peso das mulheres: "+formatador.format(mediaPesoMulheres));
		System.out.println("O  maior peso entre os homns: "+maiorPesoHomen);
		sc.close();
	}

}
