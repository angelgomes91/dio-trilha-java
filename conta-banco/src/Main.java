import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("=== Bem vindo ao JavaBank! ===");
        System.out.println("==========================================");

        System.out.println("Por favor, preencha os dados a seguir:");
       
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        ContaTerminal conta = new ContaTerminal(nomeCliente, agencia, numeroConta,1000.05 ); 

        System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");

        System.out.println("Sua agência é: " + conta.getAgencia() + " e sua conta é: " + conta.getNumeroConta());
        System.out.println("Seu saldo é: R$ " + String.format("%.2f", conta.getSaldo())+ "  já está disponível para saque.");

             
        int opcao;
        do {
            System.out.println("Cliente: " + conta.getNomeCliente());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getNumeroConta());
            System.out.println("\n=== Menu Inicial ===");
            System.out.println("escolha uma opção:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                 conta.consultarSaldo();
                 break;
                case 2:
                 System.out.print("Digite o valor a depositar: ");
                 double valorDeposito = scanner.nextDouble();
                 conta.depositar(valorDeposito);
                 break;
                case 3:
                 System.out.print("Digite o valor a sacar: ");
                 double valorSaque = scanner.nextDouble();
                 conta.sacar(valorSaque);
                 break;
                case 0:
                 System.out.println("Obrigado! Até logo!");
                 break;
                default:
                    System.out.println("Opção inválida!");
        } 
     } while (opcao != 0);
    
     scanner.close();
    }
}
