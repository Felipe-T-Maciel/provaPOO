public class Administrador extends Usuario implements IRemoverOrdem, IProcurarOrdem{
    public Administrador(long cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void deletarOrdem(int numeroOrdem) {
        getGerenciadorOrdens().deletarOrdem(numeroOrdem);
    }

    @Override
    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        return getGerenciadorOrdens().procurarOrdem(numeroOrdem);
    }
}
