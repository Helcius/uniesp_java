package entidade;

public class Roda {
    // Atributos da classe
    private String fabricante;
    private int aro;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    // Método construtor
    public Roda(String fabricante, int aro){
        this.fabricante = fabricante;
        this.aro = aro;
    }
}