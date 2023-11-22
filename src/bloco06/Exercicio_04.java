package bloco06;

import java.text.DecimalFormat;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 02/11/2023
 * */
public class Exercicio_04 {
	public static void main(String[] args) {
		/*Leia o peso e altura de 7 pessoas e mostre: 1- a média de altura do grupo | 2- Quantos pesam > 90kg |
		 * 3- Quantos que pesam < 50kg tem menos de 1,60m | 4- Quantos medem > 1,90m pesam > 100kg*/
		//variaveis
		double peso, altura;
		int cont=1;
		double somaAltura = 0, mediaAltura=0;
		int peso90kg= 0, peso50kg=0, peso100kg=0;
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
				while(cont <=7) {
				System.out.println(cont+"° Pessoa: ");
				peso = Teclado.lerDouble("Digite seu peso:");
				altura = Teclado.lerDouble("Digite sua altura: ");
				
				//calculo media altura do grupo
				somaAltura += altura;
				mediaAltura = somaAltura / 7;
				//condição peso > 90
				if(peso > 90) {
					peso90kg++;
				}
				if(peso < 50 && altura < 1.60) {
					peso50kg++;
				}
				if(peso > 100 && altura > 1.90) {
					peso100kg++;
				}
				//contador
				cont++;
				}
			
			System.out.println("Média de altura do grupo: "+formatador.format(mediaAltura));
			System.out.println("Pesam mais de 90kg: "+peso90kg);
			System.out.println("Pesam menos de 50kg e medem menos de 1,60m: "+peso50kg);
			System.out.println("Pesam mais de 100kg e medem mais de 1,90m: "+peso100kg);
	}
}
