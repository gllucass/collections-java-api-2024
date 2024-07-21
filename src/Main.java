import list.OperacoesBasicas.ListaTarefa;
public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa  = new ListaTarefa();
        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.asicionarTarefa("Tarefa 1");
        listaTarefa.asicionarTarefa("Tarefa 2");
        listaTarefa.asicionarTarefa("Tarefa 3");

        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O numero Total de elemnto na lisat é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
