package bloco05;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/10/2023
 * */
public class Exercicio_06 {

	public static void main(String[] args) {
		//Calcule a soma e mostre o resultado da contagem 6 até 100(de 2 em 2)
		// 6 + 8 + 10 + 12(....) + 98 + 100 = soma(x)
		int numero = 6;
		int soma = 0;
		//enquanto numero for menor que 100:
		while(numero <= 100) {
			System.out.print(" "+numero);
			//soma inicializada em 0 + a variavel número:
			soma = soma + numero;
			//incremeto 
			numero = numero + 2;
		}
		
		System.out.println("\nSoma de 6 a 100(de 2 em 2): "+soma);
	
		}

	}


