public abstract class Pesquisa {
    protected String nome;
    protected String descricao;
    protected int totalRespostas;

    public Pesquisa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.totalRespostas = 0;
    }

    public abstract void realizarPesquisa();

    public void exibirResultado() {
        System.out.println("Resultado da pesquisa: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Total de respostas: " + totalRespostas);
    }

    public void incrementarRespostas() {
        totalRespostas++;
    }
}
