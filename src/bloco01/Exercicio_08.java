package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 11/10/2023
 *  
 * */
public class Exercicio_08 {

	public static void main(String[] args) {
		//leia uma distância em metros e mostre os valores em outras unidades de medida
		//variaveis
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatadorMedidas = new DecimalFormat("#0.00");
		double metro, dm, cm, mm, dam, hm, km;
		System.out.println("CONVERTENDO METROS EM OUTRAS UNIDADES DE MEDIDAS: ");
		System.out.println(" ");
		System.out.print("Digite um valor em metros: ");
		metro = teclado.nextDouble();
		System.out.println("O valor "+formatadorMedidas.format(metro)+"m corresponde a:");
		//convertendo para decimetro
		dm = metro * 10;
		System.out.println("\n"+dm+"dm(decímetro);");
		//convertendo para centimetro 
		cm = metro * 100;
		System.out.println("\n"+cm+"cm(centímetro);");
		//convertendo para milímetro
		mm = metro * 1000;
		System.out.println("\n"+mm+"mm(milímetro);");
		//convertendo p/ decâmetro
		dam = metro / 10;
		System.out.println("\n"+dam+"dam(decâmetro);");
		//convertendo - hectômetro
		hm = metro / 100;
		System.out.println("\n"+hm+"hm(hectômetro);");
		//convertendo - kilômetro
		km = metro / 1000;
		System.out.println("\n"+km+"km(kilômetro);");
		
		teclado.close();
		

	}

}
