package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 14/10/2023
 * */
import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {
		//Refaça o Exercício_05 do bloco03, informando qual tipo de triângulo é
		//EQUILÁTERO: todos os lados iguais | ISÓSCELES: dois lados iguais | ESCALENO: todos os lados diferentes
		
		//Copiei o mesmo código para fazer algumas alterações:
		double ladoA, ladoB, ladoC;
		System.out.println("Informe valores e forme um TRIÂNGULO:\n");
		ladoA = Teclado.lerDouble("Informe um valor para o lado A:");
		ladoB = Teclado.lerDouble("Informe um valor para o lado B:");
		ladoC = Teclado.lerDouble("Informe um valor para o lado C:");
		//leia - se: C > que A e B ->  A + B > C (assim sucessivamente)
			if((ladoA + ladoB > ladoC)&&(ladoA + ladoC > ladoB)&&(ladoB + ladoC > ladoA)){
				//se tudo isso for VERDADEIRO É UM Triangulo!
					System.out.println("É possível formar um triângulo!");
					
					//condição para todos os lados serem iguais
					if(ladoA == ladoB && ladoB == ladoC) {
						System.out.println("Seu triângulo é EQUILÁTERO!");
					} 
					//condição para dois lados iguais e um lado diferente
					else if((ladoA == ladoB && ladoB != ladoC)||(ladoC == ladoB && ladoB != ladoA)){
						System.out.println("Seu triângulo é ISÓSCELES!");
					} 
					//condição para todos os lados serem diferentes
					else if(ladoA != ladoC && ladoC != ladoB) {
						System.out.println("Seu triângulo é ESCALENO!");
					}
			}
			else {
				System.out.println("Não é possível formar um triângulo!");
			}

	}

}
