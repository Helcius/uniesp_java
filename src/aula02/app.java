public class App {

        public static void main(String[] args) {

            //Instanciando - criando o objeto
            // o objeto cl vai ter todos os atributos da classe ContaLogin
            ContaLogin cl = new ContaLogin("gabrielaanselmao@gmail.com");


            // cl. vai aparecer todos os metodos
            cl.setNome("Maria Gabriela", 10);

            System.out.println("CL: " + cl.getNome());

        }
    }