public class Pessoa_Juridica extends Cliente {

    public Pessoa_Juridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private String cnpj;
    private String inscricao_estadual;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricao_estadual() {
        return inscricao_estadual;
    }
    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

}
