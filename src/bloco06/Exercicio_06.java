package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 02/11/2023
 * */
import util.Teclado;

public class Exercicio_06 {

	public static void main(String[] args) {
		// Leia v�rios n�meros e no final mostre o som�torio entre eles
		// Para o loop ser interrompido dever� ser digitado 1111!
		int num =0, soma=0, cont=0;
		boolean flag = false;
			while(!flag) {
				num = Teclado.lerInt("Digite um "+(cont+1)+"� n�mero: (1111 p/ parar)");
				//flag
				if(num == 1111) {
					flag = true;
				}else {
					//somatorio
					soma += num;
					
				}
				cont++;
				
			}
			System.out.println("somat�rio dos valores digitados: "+soma);
			
			
	}

}
