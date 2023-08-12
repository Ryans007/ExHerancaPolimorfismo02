package Entities;

public class PessoaFisica extends Pessoa{
    private Double gastosSaude;
    public PessoaFisica(){

    }
    public PessoaFisica(String pessoa, Double rendaAnual, Double gastosSaude) {
        super(pessoa, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
    public Double getGastosSaude() {
        return gastosSaude;
    }
    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    @Override
    public double calculoImposto() {
        return rendaAnual >= 20000.00 ? (rendaAnual * 0.25) - (gastosSaude * 0.50) : (rendaAnual * 0.15) - (gastosSaude * 0.50);
    }

}
