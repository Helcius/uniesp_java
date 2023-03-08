public class ContaLogin {


    // Variável de instância (Atributos são privados)
    private String nome;
    private int anoNascimento;
    private String email;
    private String senha;

    public ContaLogin(String emial) {
        this.email = email;
    }
    public ContaLogin(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    // Métodos Get e Set para variável nome


    public String getNome() {
        return nome;
    }

    public void setNome(String nome, int x) {
        if (x == 10) {
            this.nome = nome;
        } else {
            System.out.println("Código de alteração errado!");
        }
    }


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}