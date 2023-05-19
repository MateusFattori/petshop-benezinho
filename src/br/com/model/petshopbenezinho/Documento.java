package br.com.model.petshopbenezinho;

public class Documento {

    private String id;
    private String numero;

    public Documento() {
    }

    public Documento(String id, String numero) {
        this.setId(id);
        this.setNumero(numero);
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id='" + getId() + '\'' +
                ", numero='" + getNumero() + '\'' +
                '}';
    }
}
