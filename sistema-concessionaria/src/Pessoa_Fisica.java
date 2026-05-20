public class Pessoa_Fisica extends Cliente {

    public Pessoa_Fisica(String nome, String cpf, String contato) {
        super(nome, contato);
        this.cpf = cpf;
    }
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        
    @Override
    public String toString() {
        return "Pessoa_Fisica [nome = " + getNome() + ", cpf = " + cpf + ", contato = " + getContato() + "]";
    }
}
