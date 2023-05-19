package br.com.petshop.pessoa.model;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long id, String nome, String CNPJ) {
        super(id, nome);
        this.setCNPJ(CNPJ);
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + getCNPJ() + '\'' +
                "} " + super.toString();
    }
}
