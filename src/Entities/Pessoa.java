package Entities;

public abstract class Pessoa {
    private String nome;
    protected Double rendaAnual;
    public Pessoa(){

    }
    public Pessoa(String pessoa, Double rendaAnual) {
        this.nome = pessoa;
        this.rendaAnual = rendaAnual;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public abstract double calculoImposto();

    @Override
    public String toString(){
        return nome + ": $ " + String.format("%.2f", calculoImposto());
    }
}
