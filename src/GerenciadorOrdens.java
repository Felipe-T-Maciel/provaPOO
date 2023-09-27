import java.util.ArrayList;

public class GerenciadorOrdens implements ICriadorOrdem, IRemoverOrdem, IImprimivel,IProcurarOrdem {
    private final ArrayList<OrdemDeServico> ordens = new ArrayList<>();
    private final Relatorio relatorio = new Relatorio();

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        ordens.add(ordem);
    }

    @Override
    public void deletarOrdem(int numeroOrdem) {
        if(procurarOrdem(numeroOrdem)!=null){
            for (Usuario user:
                    Usuario.usuarios) {
                user.getOrdens().remove(procurarOrdem(numeroOrdem));
            }
            ordens.remove(procurarOrdem(numeroOrdem));
        }
    }



    @Override
    public void mostrarDados() {
        for (OrdemDeServico ordem:
             ordens) {
            relatorio.gerarRelatorio(ordem);
        }
    }

    @Override
    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        for (OrdemDeServico ordem:
                ordens) {
            if(numeroOrdem == ordem.getNumeroOrdem()){
                return ordem;
            }
        }
        return null;
    }
}
