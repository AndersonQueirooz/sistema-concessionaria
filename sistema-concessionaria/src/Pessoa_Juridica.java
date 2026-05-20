public class Pessoa_Juridica extends Cliente {

    public Pessoa_Juridica(String nome, String cnpj, String contato) {
        super(nome, contato);
        this.cnpj = cnpj;
    }

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa_Juridica [nome = " + getNome() + ", cnpj = " + cnpj + ", contato = " + getContato() + "]";
    }
}