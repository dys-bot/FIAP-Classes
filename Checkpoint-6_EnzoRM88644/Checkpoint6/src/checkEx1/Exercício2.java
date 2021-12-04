package checkEx1;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int i, j, k;
		
		System.out.println("Selecione a opção desejada para ordenação: ");
		System.out.println("1 - Números inteiros");
		System.out.println("2 - Palavras");
		i = tec.nextInt();
		
		switch(i) {
		
		case 1:
			System.out.println("Quantos números inteiros serão ordenados?");
			j = tec.nextInt();
			int[] case1 = new int[j];
			for (i = 1; i <= (j+1); i++) {
			System.out.println("Digite o número " + i);
			case1[i] = tec.nextInt();
			}
			break;
		case 2:
			System.out.println("Quantas palavras serão ordenadas?");
			j = tec.nextInt();
			String[] case2 = new String[j];
			for (i = 0; i <= (j); i++) {
				k = 0;
				System.out.println("Digite a palavra " + (i));
				System.out.println();
				case2 [k] = tec.nextLine();
				k++;
			}
			break;
			default: System.out.println("Tente novamente, comando inválido!");
		}
		System.out.println("Gostaria de buscar em qual dos nossos banco de dados?");
		System.out.println("1 - Números inteiros");
		System.out.println("2 - Palavras");
		k = tec.nextInt();
		
		switch (k) {
		case 1:
			break;
		case 2:
			System.out.println("Qual é a palavra que deseja buscar?");
			
			break;
			default: System.out.println("Comando inválido, tente novamente.");
		}
tec.close();
	}

}

