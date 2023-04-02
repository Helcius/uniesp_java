public class Cliente {
    private String cpf;
    private String senha;
    private double saldo;

    public Cliente(String cpf, String senha, double saldo) {
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}