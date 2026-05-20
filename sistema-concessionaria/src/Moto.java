public class Moto extends Veiculo {

    public Moto(String fabricante, String modelo, String placa, int ano) {
        super(fabricante, modelo, placa, ano);
    }

    @Override
    public String toString() {
        return "Moto [fabricante = " + getFabricante() + ", modelo = " + getModelo() + ", placa = " + getPlaca() + ", ano = " + getAno() + "]";
    }

    
}
