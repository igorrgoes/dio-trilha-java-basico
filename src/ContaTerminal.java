import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Conta!");
		int numConta = input.nextInt();
		
		System.out.println("Por favor, digite o número da Agência!");
		String codAgencia = input.next();
		
		input.nextLine();
		
		System.out.println("Por favor, digite o seu nome!");
		String nomeCliente = input.nextLine();
		
		System.out.println("Por favor, digite quanto deseja depositar!");
		double saldoConta = input.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta "
				+ "em nosso banco, sua agência é %s, conta %d e "
				+ "seu saldo de R$%.2f já está disponível para saque", nomeCliente, codAgencia, numConta, saldoConta);		
	}

}
