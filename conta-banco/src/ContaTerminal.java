public class ContaTerminal{
    private String nomeCliente;
    private String agencia;
    private String numeroConta;
    private double saldo;

    public ContaTerminal( String nomeCliente, String agencia, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;   
    }

    public String getNomeCliente() {
        return nomeCliente;
    }   

    public String getAgencia() {
        return agencia;
    }   

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) +  " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor ) +  " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para saque ou saldo insuficiente.");
        }
    }
}
