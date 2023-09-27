import java.util.ArrayList;

abstract class Usuario implements ICriadorOrdem, IEditorOrdem, IVisualizadorOrdem{

    //O professor permitiu o uso do atributo na classe Usuario, pois o resultado não sera prejudicado.
    static GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();
    static ArrayList<Usuario> usuarios = new ArrayList<>();

    private long cpf;
    private String nome;

    private final ArrayList<OrdemDeServico> ordensUsuario = new ArrayList<>();

    public Usuario(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        usuarios.add(this);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (Usuario user:
                usuarios) {
            if(user instanceof Solicitante && user.getOrdens().contains(getGerenciadorOrdens().procurarOrdem(numeroOrdem))){
                user.getOrdens().remove(getGerenciadorOrdens().procurarOrdem(numeroOrdem));
                user.getOrdens().add(ordem);
            }
        }
        getGerenciadorOrdens().deletarOrdem(numeroOrdem);
        getGerenciadorOrdens().criarOrdem(ordem);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        getGerenciadorOrdens().criarOrdem(ordem);
        this.getOrdens().add(ordem);
    }

    @Override
    public void verOrdens() {
        getGerenciadorOrdens().mostrarDados();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ",quantidade de ordens=" + getOrdens().size() +
                '}';
    }

    public GerenciadorOrdens getGerenciadorOrdens() {
        return gerenciadorOrdens;
    }


    public ArrayList<OrdemDeServico> getOrdens() {
        return ordensUsuario;
    }
}
