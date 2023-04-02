public class ContaPoupanca {
    private Cliente cliente;
    private double saldo;

    public ContaPoupanca(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito efetuado com sucesso. Novo saldo: " + saldo);
    }

    public boolean transferir(double valor, ContaPoupanca contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para a transferência.");
            return false;
        } else {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência efetuada com sucesso. Novo saldo na conta corrente: " + getSaldo());
            return true;
        }
    }

    public boolean transferir(double valor, ContaCorrente contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para a transferência.");
            return false;
        } else {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência efetuada com sucesso. Novo saldo na conta corrente: " + getSaldo());
            return true;
        }
    }
}