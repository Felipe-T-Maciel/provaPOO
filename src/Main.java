import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando usuarios
        Administrador user = new Administrador(1077997990, "Felipe");
        Solicitante user2 = new Solicitante(1077997990, "Jonas");
        Solicitante user4 = new Solicitante(1077997990, "Miguel");
        Atendente user3 = new Atendente(1077997990, "Davi");

        //criando as ordens, 2 de cada.
        user3.criarOrdem(new OrdemInstalacao(11,"Linux","Done",user,"Ontem"));
        user3.criarOrdem(new OrdemInstalacao(12,"Winrar","Todo",user,"00:00"));
        user2.criarOrdem(new OrdemManutencao(10,"SBT","Me da 10 ai","Machado","hoje"));
        user.criarOrdem(new OrdemManutencao(9,"SBP","Yes baby","Martelo","Amanha"));


        //Teste de edição com o solicitante. O administrador altera a ordem do solicitante e a ordem tem seu valor alterado e continua ligada ao solicitante
        System.out.println("\nTeste do solicitante");
        user2.verOrdens();
        user.editarOrdem(10, new OrdemInstalacao(10,"windows","OMG",user2, "amanha"));
        System.out.println("\nAdmin alterou os valores: ");
        user2.verOrdens();
        System.out.println("\nProprio solicitante alterou os valores: ");


        //Testando se outro solicitante pode ver os dados de outro solicitante. Teste mal sucedido. Funciona!, caso contrario duas informações apareceriam
        //ao inves de uma.
        user4.verOrdens();
        user2.verOrdens();

        //Alterando o status da ordem numero 10 para "Alterado, Funcional".
        System.out.println("\nAlterando o status da ordem numero 10 para 'Alterado, Funcional'");
        (user.procurarOrdem(10)).atualizarStatus("Alterado, Funcional");
        user2.verOrdens();

        //Administrador imprime tudo
        System.out.println("\nTeste se o administrador imprime todas as ordens: ");
        user.verOrdens();

        //Teste de delete com Administrador
        System.out.println("\nTeste de Delete com adm\nTodas as ordens deletadas");
        user.deletarOrdem(9);
        user.deletarOrdem(10);
        user.deletarOrdem(11);
        user.deletarOrdem(12);
        user.verOrdens();
    }
}
