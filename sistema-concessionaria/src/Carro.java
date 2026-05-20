public class Carro extends Veiculo {

    public Carro(String fabricante, String modelo, String placa, int ano) {
        super(fabricante, modelo, placa, ano);
    }

    @Override
    public String toString() {
        return "Carro [fabricante = " + getFabricante() + ", modelo = " + getModelo() + ", placa = " + getPlaca() + ", ano = " + getAno() + "]";
    }

    
}
