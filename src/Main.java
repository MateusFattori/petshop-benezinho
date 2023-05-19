import br.com.model.petshopbenezinho.Animal;
import br.com.model.petshopbenezinho.Documento;
import br.com.model.petshopbenezinho.Servico;
import br.com.petshop.pessoa.model.PessoaFisica;
import br.com.petshop.pessoa.model.PessoaJuridica;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    }
    public static Animal novoAnimal(String raca, String nome, Long id, String descricao, String observacao ){
            Animal animal = new Animal();
            animal.setRaca(raca);
            animal.setNome(nome);
            animal.setId(id);
            animal.setDescricao(descricao);
            animal.setObservacao(observacao);
            return animal;
    }

    public static Documento novoDocumento(String numero, String id){
        Documento documento = new Documento();
        documento.setNumero(numero);
        documento.setId(id);
        return documento;
    }

    public static Servico novoServico(int id, String nome, Double valor, String descricacao, String obeservacao){
        Servico servico = new Servico();
        servico.setId(id);
        servico.setNome(nome);
        servico.setValor(valor);
        servico.setDescricacao(descricacao);
        servico.setObeservacao(obeservacao);
        return servico;
    }

    public PessoaFisica novaPessoaFisica(Long id, String nome, String CPF){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setCPF(CPF);
        return pf;
    }

    public PessoaJuridica novaPessoaJuridica(Long id, String nome, String CNPJ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setCNPJ(CNPJ);
        return pj;
    }

    Servico servico = novoServico(
            "ds",
            JOptionPane.showInputDialog("Digite o nome do serviço"),
            JOptionPane.showInputDialog("Digite o valor do serviço: "),
            JOptionPane.showInputDialog("Digite a descricao do serviço: "),
            JOptionPane.showInputDialog("Digite uma observação")
    );


}