
package checkpoint_ex1;

import java.util.Scanner;
public class checkpoint_ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salBruto, INSS, salPosINSS, IRRF, salLiquido; 

		System.out.print("Informe o salário bruto: ");
		salBruto = entrada.nextDouble();

		if(salBruto <= 1100.00)
		INSS = salBruto * 0.075;
		else
		if((salBruto >= 1100.01) && (salBruto <= 2203.48))
		INSS = (salBruto * 0.09) - 16.50;
		else
		if ((salBruto >= 2203.49) && (salBruto <= 3305.22))
		INSS = (salBruto * 0.12) - 82.60;
		else
		if((salBruto >= 3305.23) && (salBruto <= 6433.57))
		INSS = (salBruto * 0.14) - 148.71;
		else
		INSS = 751.99;
		System.out.printf("para salário bruto  de R$ %4.2f", salBruto);
		System.out.printf("\nsalário de contribuição R$%3.2f ", INSS);

		salPosINSS = (salBruto - INSS);
		
		if ((salPosINSS <= 1903.98))
			IRRF = salPosINSS * 0;
		else
			if ((salPosINSS >= 1903.99) && (salPosINSS <= 2826.65))
				IRRF = salPosINSS * 0.075;
		else
			if ((salPosINSS >= 2826.66) && (salPosINSS <= 3751.05))
				IRRF = salPosINSS * 0.15;
		else
			if ((salPosINSS >= 3751.06) && (salPosINSS <= 4664.68))
				IRRF = salPosINSS * 0.225;
			else
				IRRF = salPosINSS * 0.275;
		
		salLiquido = salPosINSS - IRRF;
		
		System.out.println("O valor do IRRF é de: " + IRRF);
		System.out.println(" O salário líquido final é de: " + salLiquido);
		
		entrada.close();
	
	}

}