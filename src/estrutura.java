
public class estrutura {
    public static void main(String[] args) {

        String nome = "Messi";
        int idade = 36;
        float altura = 1.77F;
        double peso = 92.5;
        boolean fumante = false;

        boolean atividade = true;
        int atividadePorSemana = 4;
        boolean dor = true;
        int dorInt = 3;


        if (atividade == true){

            System.out.println("Paciente realiza atividade física");

            if (atividadePorSemana >= 3){

                System.out.println("Excelente. Você pratica uma quantidade bacana!");

            } else if (atividadePorSemana < 3) {

                System.out.println("Precisa aumentar a quantidade de dias");

            } else {

                System.out.println("É melhor iniciar algum exercício.");
            }

        } else {
            System.out.println("Paciente NÃO realiza atividade física");
        }

        //  Acaba atividade física - Inicia formulário de dor

        if (dor == true){

            System.out.println("Precisamos verificar essa dor.");

            if (dorInt > 5){
                System.out.println("É preciso procurar uma médico.");

            } else {

                System.out.println("Podemos tratar com o fisioterapeuta.");
            }

        } else {

            System.out.println("Excelente que você não sinta dores!");

        }

    }
}