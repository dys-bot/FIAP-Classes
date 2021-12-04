package cp5;

import java.util.Scanner;

public class Exercicio2 {
public static int i, tam;
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		String sentenca = new String();
		System.out.println("Insira uma frase: ");
		sentenca = tec.nextLine();
		tam = sentenca.length();
		char Sentenca[] = sentenca.toCharArray();
		
		for (i = 0; i < tam; i++)
		{
			if (i == 0)
				Sentenca[i] = Character.toUpperCase(Sentenca[i]);
			if (Sentenca[i] == ' ')
				Sentenca[i+1] = Character.toUpperCase(Sentenca[i+1]);
		}
		System.out.println("A frase inicial inserida foi: " + sentenca);
		System.out.print("A frase foi finalizada da seguinte forma: ");
		for (i = 0; i < tam; i++)
			System.out.print(Sentenca[i]);
		
		
		tec.close();		
	}

}
