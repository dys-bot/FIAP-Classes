package checkEx1;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int i, j, k;
		
		System.out.println("Selecione a op��o desejada para ordena��o: ");
		System.out.println("1 - N�meros inteiros");
		System.out.println("2 - Palavras");
		i = tec.nextInt();
		
		switch(i) {
		
		case 1:
			System.out.println("Quantos n�meros inteiros ser�o ordenados?");
			j = tec.nextInt();
			int[] case1 = new int[j];
			for (i = 1; i <= (j+1); i++) {
			System.out.println("Digite o n�mero " + i);
			case1[i] = tec.nextInt();
			}
			break;
		case 2:
			System.out.println("Quantas palavras ser�o ordenadas?");
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
			default: System.out.println("Tente novamente, comando inv�lido!");
		}
		System.out.println("Gostaria de buscar em qual dos nossos banco de dados?");
		System.out.println("1 - N�meros inteiros");
		System.out.println("2 - Palavras");
		k = tec.nextInt();
		
		switch (k) {
		case 1:
			break;
		case 2:
			System.out.println("Qual � a palavra que deseja buscar?");
			
			break;
			default: System.out.println("Comando inv�lido, tente novamente.");
		}
tec.close();
	}

}

