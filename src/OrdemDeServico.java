abstract class OrdemDeServico implements IImprimivel{
    private final int numeroOrdem;
    private final String descricao;
    private String status;

    public OrdemDeServico(int numeroOrdem, String descricao, String status) {
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
        this.status = status;
    }

    void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    @Override
    public String toString() {
        return "OrdemDeServico{" +
                "numeroOrdem=" + numeroOrdem +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
