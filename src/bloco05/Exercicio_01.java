package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 17/10/2023
 * */
public class Exercicio_01 {

	public static void main(String[] args) {
		//Contagem regressiva do numero 100 ao 0(seguencia de 5 em 5)
		int num = 100;
		//enquanto 100 for menor que 0 subtraia 5
			while(num >= 0) {
				System.out.print(" "+num);
				num = num - 5;
			}

	}

}
