package Entities;

public class PessoaJuridica extends Pessoa{
    private int numFuncionarios;
    public PessoaJuridica(){

    }
    public PessoaJuridica(String pessoa, Double rendaAnual, int numFuncionarios) {
        super(pessoa, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }
    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    @Override
    public double calculoImposto() {
        return numFuncionarios > 10 ? rendaAnual * 0.14 : rendaAnual * 0.16;
    }
}
