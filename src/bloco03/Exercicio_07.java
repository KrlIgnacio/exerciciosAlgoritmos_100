package bloco03;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 13/10/2023
 * */
public class Exercicio_07 {

	public static void main(String[] args) {
		// leia duas notas de um aluno e calcule a sua média
		//  -> 4.9: REPROVADO &  5.0 e 6.9: RECUPERAÇÃO & 7.0 ou superior: APROVADO
		double nota1, nota2, media;
		System.out.println("Caro aluno, dscubra sua média atual:");
		nota1 = Teclado.lerDouble("\nDigite nota 1:");
		nota2 = Teclado.lerDouble("Digite nota 2:");
		media = (nota1 + nota2) / 2;
			if(media < 5) {
				System.out.println("MÉDIA "+media+": REPROVADO.");
			}
			else if(media >= 5 && media < 7) {
				System.out.println("MÉDIA "+media+ ": RECUPERAÇÃO.");
			}
			else {
				System.out.println("MÉDIA "+media+": APROVADO.");
			}
	}

}
