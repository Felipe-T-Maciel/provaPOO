import java.util.Date;

public class OrdemManutencao extends OrdemDeServico{
    private final String equipamento;
    private final String dataManutencao;

    public OrdemManutencao(int numeroOrdem, String descricao, String status, String equipamento, String dataManutencao) {
        super(numeroOrdem, descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("OrdemManutencao{" +
                "equipamento='" + equipamento + '\'' +
                ", dataManutencao=" + dataManutencao +
                "} " + super.toString());
    }
}
