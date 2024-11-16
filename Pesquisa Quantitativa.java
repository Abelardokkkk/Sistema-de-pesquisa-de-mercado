public class PesquisaQuantitativa extends Pesquisa implements IPesquisa {

    public PesquisaQuantitativa(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void realizarPesquisa() {
        // Simulando a coleta de respostas quantitativas
        System.out.println("Realizando pesquisa quantitativa...");
        incrementarRespostas();
    }
}
