package entidade;

public class Carro {
    private int ano;
    private String modelo;
    private String fabricante;
    private double poteciaMotor;
    private Roda roda;

    public Carro(int ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPoteciaMotor() {
        return poteciaMotor;
    }

    public void setPoteciaMotor(double poteciaMotor) {
        this.poteciaMotor = poteciaMotor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public void acelerar(){
        System.out.println("O carro acelerou!");
    }

    public void frear(){
        System.out.println("O carro freou!");
    }
}