import list.OperacoesBasicas.CarrinhoCompras.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefa.ListaTarefa;

public class Main {
    public static void main(String[] args) {
        //Teste lista de tarefa
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.asicionarTarefa("Tarefa 1");
        listaTarefa.asicionarTarefa("Tarefa 2");
        listaTarefa.asicionarTarefa("Tarefa 3");

        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();

        //Teste de carrinho de compras
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2.00, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2.00, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35.00, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.00, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

