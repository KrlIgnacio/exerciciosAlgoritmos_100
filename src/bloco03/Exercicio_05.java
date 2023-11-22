package bloco03;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 13/10/2023
 * */
public class Exercicio_05 {

	public static void main(String[] args) {
		// leia tr�s segmentos de reta e informe se � ou n�o poss�vel formar um TRI�NGULO
		//para formar um tri�ngulo: o lado maior deve ser MENOR que a soma dos outros dois lados!
		double ladoA, ladoB, ladoC;
		System.out.println("Informe valores e descubra se forma um tri�ngulo ou n�o:\n");
		ladoA = Teclado.lerDouble("Informe um valor para o lado A:");
		ladoB = Teclado.lerDouble("Informe um valor para o lado B:");
		ladoC = Teclado.lerDouble("Informe um valor para o lado C:");
		//leia - se: C > que A e B ->  A + B > C (assim sucessivamente)
			if((ladoA + ladoB > ladoC)&&(ladoA + ladoC > ladoB)&&(ladoB + ladoC > ladoA)){
				//se tudo isso for VERDADEIRO � UM Triangulo!
					System.out.println("� poss�vel formar um tri�ngulo!");
			}
			else {
				System.out.println("N�o � poss�vel formar um tri�ngulo!");
			}
			
	}

}
