package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 17/10/2023
 * */
public class Exercicio_03 {

	public static void main(String[] args) {
		// Contagem regressiva de 30 até 1, destaque os números divisiveis por [4]
		int num = 31;
			while(num > 1) {
				num--;
				if(num % 4 == 0) {
					System.out.print(" ["+num+"]");
				} else if(num % 4 != 0) {
					System.out.print(" "+num);
				}
				
			}
		
		
		
	}

}
