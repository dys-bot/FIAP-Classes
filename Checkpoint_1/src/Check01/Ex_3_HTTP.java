package Check01;

import java.util.Scanner;

public class Ex_3_HTTP {

	public static void main(String[] args) {

		int status;
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Insira o código de status HTTP: " + "\nObservação: apenas números INTEIROS são admitidos.");
		status = tec.nextInt();
		
		
		
		switch (status) {
		case 400:
			System.out.println("Requisição inválida: Pedido não pôde ser processado devido à sintaxe incorreta.");
			break;
		case 403:
			System.out.println("Proibido: Pedido reconhecido pelo servidor, mas este recusa-se a executá-lo.");
		break;
		case 404:
			System.out.println("Não encontrado: Recurso requisitado não foi encontrado.");
			break;
		case 408:
			System.out.println("Tempo de requisição esgotado: Servidor sofreu timeout ao aguardar pela solicitação.");
			break;
		case 500:
			System.out.println("Erro interno do servidor: Indica um erro do servidor ao processar a solicitação.");
			break;
		case 501:
			System.out.println("Não implementado: Servidor não suporta a funcionalidade ativada.");
			break;
		case 503:
			System.out.println("Serviço indisponível: Servidor está em manutenção ou sobrecarregado.");
		default:
			System.out.println("Número não encontrado, consulte a página https://tools.ietf.org/html/rfc2616 para procurar o código.");
			break;
			
	}
tec.close();
}
}