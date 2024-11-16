public class PesquisaMista extends Pesquisa implements IPesquisa {

    public PesquisaMista(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void realizarPesquisa() {
        // Simulando a coleta de respostas mistas (quantitativas e qualitativas)
        System.out.println("Realizando pesquisa mista...");
        incrementarRespostas();
    }
}
