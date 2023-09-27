import java.util.Date;

public class OrdemInstalacao extends OrdemDeServico{
    private final Usuario cliente;
    private final String dataInstalacao;

    public OrdemInstalacao(int numeroOrdem, String descricao, String status, Usuario cliente, String dataInstalacao) {
        super(numeroOrdem, descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("OrdemInstalacao{" +
                "cliente=" + cliente.getNome() +
                ", dataInstalacao=" + dataInstalacao +
                "} " + super.toString());
    }
}
