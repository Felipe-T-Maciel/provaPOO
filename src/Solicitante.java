public class Solicitante extends Usuario{

    public Solicitante(long cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordem:
             this.getOrdens()) {
            ordem.mostrarDados();
        }
    }
}
