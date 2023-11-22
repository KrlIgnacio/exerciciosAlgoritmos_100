package bloco03;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 13/10/2023
 * */
public class Exercicio_05 {

	public static void main(String[] args) {
		// leia três segmentos de reta e informe se é ou não possível formar um TRIÂNGULO
		//para formar um triângulo: o lado maior deve ser MENOR que a soma dos outros dois lados!
		double ladoA, ladoB, ladoC;
		System.out.println("Informe valores e descubra se forma um triângulo ou não:\n");
		ladoA = Teclado.lerDouble("Informe um valor para o lado A:");
		ladoB = Teclado.lerDouble("Informe um valor para o lado B:");
		ladoC = Teclado.lerDouble("Informe um valor para o lado C:");
		//leia - se: C > que A e B ->  A + B > C (assim sucessivamente)
			if((ladoA + ladoB > ladoC)&&(ladoA + ladoC > ladoB)&&(ladoB + ladoC > ladoA)){
				//se tudo isso for VERDADEIRO É UM Triangulo!
					System.out.println("É possível formar um triângulo!");
			}
			else {
				System.out.println("Não é possível formar um triângulo!");
			}
			
	}

}
