java
class Pesquisa {
    private String titulo;
    private String descricao;
    private String dataCriacao;
    private List<Questao> questoes;
    public Pesquisa(String titulo, String descricao, String dataCriacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.questoes = new ArrayList<>();
    }
    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }
}
class Questao {
    private String enunciado;
    private List<String> opcoes;  // Usado para questões de múltipla escolha
    public Questao(String enunciado) {
        this.enunciado = enunciado;
        this.opcoes = new ArrayList<>();
    }
    public void adicionarOpcao(String opcao) {
        opcoes.add(opcao);
    }
}
class Respondente {
    private String nome;
    private String email;
    public Respondente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
class SistemaPesquisa {
    private List<Pesquisa> pesquisas;
    private List<Respondente> respondentes;
    public SistemaPesquisa() {
        pesquisas = new ArrayList<>();
        respondentes = new ArrayList<>();
    }
    public void criarPesquisa(Pesquisa pesquisa) {
        pesquisas.add(pesquisa);
    }
    public void cadastrarRespondente(Respondente respondente) {
        respondentes.add(respondente);
    }
}
public class Main {
    public static void main(String[] args) {
        SistemaPesquisa sistema = new SistemaPesquisa();
        
        Pesquisa pesquisa = new Pesquisa("Pesquisa de Satisfação", "Avaliação do serviço", "09/25/2024");
        Questao questao1 = new Questao("Como você avalia nosso atendimento?");
        questao1.adicionarOpcao("Excelente");
        questao1.adicionarOpcao("Bom");
        questao1.adicionarOpcao("Regular");
        questao1.adicionarOpcao("Ruim");
        pesquisa.adicionarQuestao(questao1);
        sistema.criarPesquisa(pesquisa);
        Respondente respondente = new Respondente("João", "joao@email.com");
        sistema.cadastrarRespondente(respondente);
        
    }
}
