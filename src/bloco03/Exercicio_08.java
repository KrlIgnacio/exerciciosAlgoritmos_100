package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 13/10/2023
 * */
import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		//  leia a largura e o comprimento de um terreno retangular e mostre sua classificação
		// < 100m² POPULAR | 100m² - 500m² MASTER | > 500m² VIP
		double area, largura, comprimento;
		System.out.println("\nVamos descobrir a área de um terreno e sua classificação.");
		largura = Teclado.lerDouble("\nDigite a largura do terreno: ");
		comprimento = Teclado.lerDouble("Digite o comprimento do terreno: ");
		//calculo area
		area = largura * comprimento;
			if(area < 100) {
				System.out.println("\nÁrea: "+area+"m²");
				System.out.print("\nCLASSIFICAÇÃO: TERRENO POPULAR.");
			}
			else if(area >= 100 && area < 500) {
				System.out.println("\nÁrea: "+area+"m²");
				System.out.print("\nCLASSIFICAÇÃO: TERRENO MASTER.");
			}
			else {
				System.out.println("\nÁrea: "+area+"m²");
				System.out.print("\nCLASSIFICAÇÃO: TERRENO VIP.");
			}
	}

}
