package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 13/10/2023
 * */
import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		//  leia a largura e o comprimento de um terreno retangular e mostre sua classifica��o
		// < 100m� POPULAR | 100m� - 500m� MASTER | > 500m� VIP
		double area, largura, comprimento;
		System.out.println("\nVamos descobrir a �rea de um terreno e sua classifica��o.");
		largura = Teclado.lerDouble("\nDigite a largura do terreno: ");
		comprimento = Teclado.lerDouble("Digite o comprimento do terreno: ");
		//calculo area
		area = largura * comprimento;
			if(area < 100) {
				System.out.println("\n�rea: "+area+"m�");
				System.out.print("\nCLASSIFICA��O: TERRENO POPULAR.");
			}
			else if(area >= 100 && area < 500) {
				System.out.println("\n�rea: "+area+"m�");
				System.out.print("\nCLASSIFICA��O: TERRENO MASTER.");
			}
			else {
				System.out.println("\n�rea: "+area+"m�");
				System.out.print("\nCLASSIFICA��O: TERRENO VIP.");
			}
	}

}
