public class Pessoa_Fisica extends Cliente {

    public Pessoa_Fisica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private String cpf;
    private String rg;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

}
