public class PesquisaQualitativa extends Pesquisa implements IPesquisa {

    public PesquisaQualitativa(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void realizarPesquisa() {
        // Simulando a coleta de respostas qualitativas
        System.out.println("Realizando pesquisa qualitativa...");
        incrementarRespostas();
    }
}
