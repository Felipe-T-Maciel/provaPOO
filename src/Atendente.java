public class Atendente extends Usuario implements IProcurarOrdem{
    public Atendente(long cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        return getGerenciadorOrdens().procurarOrdem(numeroOrdem);
    }
}
