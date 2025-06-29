package calculadora;

import java.util.Scanner;

public class CalculadoraApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Double valorUm;
		Double valorDois;
		String operacao;
		
		System.out.println("Digite o valor um:");
		valorUm = scan.nextDouble();
		
		System.out.println("Digite a operação(+, -, *, /):");
		operacao = scan.next();
		
		System.out.println("Digite o valor dois:");
		valorDois = scan.nextDouble();
		
		System.out.println("Resultado:" + realizarCalculo(valorUm, operacao, valorDois));
	}
	
	public static Double realizarCalculo(Double valorUm, String operacao, Double valorDois) {
		Double respostaCalculo = 0.0;
		
		switch(operacao) {
		
		case "+":
			respostaCalculo = valorUm + valorDois;
			break;
			
		case "-":
			respostaCalculo = valorUm - valorDois;
			break;
			
		case "*":
			respostaCalculo = valorUm * valorDois;
			break;
			
		case "/":
			respostaCalculo = valorUm / valorDois;
			break;
			
			default:
				System.out.println("Operação inválida, tente novamente.");
		}
			return respostaCalculo;
	}

}
