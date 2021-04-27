package Check01;

import java.util.Scanner;

public class Ex_3_HTTP {

	public static void main(String[] args) {

		int status;
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Insira o c�digo de status HTTP: " + "\nObserva��o: apenas n�meros INTEIROS s�o admitidos.");
		status = tec.nextInt();
		
		
		
		switch (status) {
		case 400:
			System.out.println("Requisi��o inv�lida: Pedido n�o p�de ser processado devido � sintaxe incorreta.");
			break;
		case 403:
			System.out.println("Proibido: Pedido reconhecido pelo servidor, mas este recusa-se a execut�-lo.");
		break;
		case 404:
			System.out.println("N�o encontrado: Recurso requisitado n�o foi encontrado.");
			break;
		case 408:
			System.out.println("Tempo de requisi��o esgotado: Servidor sofreu timeout ao aguardar pela solicita��o.");
			break;
		case 500:
			System.out.println("Erro interno do servidor: Indica um erro do servidor ao processar a solicita��o.");
			break;
		case 501:
			System.out.println("N�o implementado: Servidor n�o suporta a funcionalidade ativada.");
			break;
		case 503:
			System.out.println("Servi�o indispon�vel: Servidor est� em manuten��o ou sobrecarregado.");
		default:
			System.out.println("N�mero n�o encontrado, consulte a p�gina https://tools.ietf.org/html/rfc2616 para procurar o c�digo.");
			break;
			
	}
tec.close();
}
}