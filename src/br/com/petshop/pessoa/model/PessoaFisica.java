package br.com.petshop.pessoa.model;

public class PessoaFisica extends Pessoa {

    private String CPF;

    public PessoaFisica() {
    }


    public PessoaFisica(Long id, String nome, String CPF) {
        super(id, nome);
        this.setCPF(CPF);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + getCPF() + '\'' +
                "} " + super.toString();
    }
}
