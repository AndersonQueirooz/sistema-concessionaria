import java.time.LocalDate;

public class Venda extends Veiculo {

    private String cliente;
    private LocalDate dataVenda;
    public Venda(String marca, String modelo, String placa, int ano, String cliente, LocalDate dataVenda) {
        super(marca, modelo, placa, ano);
        this.cliente = cliente;
        this.dataVenda = dataVenda;
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    
}
