package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 14/10/2023
 * */
import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {
		//Refa�a o Exerc�cio_05 do bloco03, informando qual tipo de tri�ngulo �
		//EQUIL�TERO: todos os lados iguais | IS�SCELES: dois lados iguais | ESCALENO: todos os lados diferentes
		
		//Copiei o mesmo c�digo para fazer algumas altera��es:
		double ladoA, ladoB, ladoC;
		System.out.println("Informe valores e forme um TRI�NGULO:\n");
		ladoA = Teclado.lerDouble("Informe um valor para o lado A:");
		ladoB = Teclado.lerDouble("Informe um valor para o lado B:");
		ladoC = Teclado.lerDouble("Informe um valor para o lado C:");
		//leia - se: C > que A e B ->  A + B > C (assim sucessivamente)
			if((ladoA + ladoB > ladoC)&&(ladoA + ladoC > ladoB)&&(ladoB + ladoC > ladoA)){
				//se tudo isso for VERDADEIRO � UM Triangulo!
					System.out.println("� poss�vel formar um tri�ngulo!");
					
					//condi��o para todos os lados serem iguais
					if(ladoA == ladoB && ladoB == ladoC) {
						System.out.println("Seu tri�ngulo � EQUIL�TERO!");
					} 
					//condi��o para dois lados iguais e um lado diferente
					else if((ladoA == ladoB && ladoB != ladoC)||(ladoC == ladoB && ladoB != ladoA)){
						System.out.println("Seu tri�ngulo � IS�SCELES!");
					} 
					//condi��o para todos os lados serem diferentes
					else if(ladoA != ladoC && ladoC != ladoB) {
						System.out.println("Seu tri�ngulo � ESCALENO!");
					}
			}
			else {
				System.out.println("N�o � poss�vel formar um tri�ngulo!");
			}

	}

}
