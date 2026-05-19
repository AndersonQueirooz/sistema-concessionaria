public class Veiculo {

    private String fabricante;
    private String modelo;
    private String placa;
    private int ano;

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Veiculo(String fabricante, String modelo, String placa, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    
}
