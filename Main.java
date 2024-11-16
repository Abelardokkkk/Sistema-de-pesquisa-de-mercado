public class Main {
    public static void main(String[] args) {
        // Criando instâncias das pesquisas
        Pesquisa pesquisa1 = new PesquisaQuantitativa("Pesquisa de Satisfação", "Pesquisa sobre a satisfação dos clientes.");
        Pesquisa pesquisa2 = new PesquisaQualitativa("Pesquisa de Feedback", "Coleta de feedback aberto sobre o produto.");
        Pesquisa pesquisa3 = new PesquisaMista("Pesquisa de Mercado", "Pesquisa combinando dados quantitativos e qualitativos.");

        // Realizando e exibindo resultados
        pesquisa1.realizarPesquisa();
        pesquisa1.exibirResultado();

        pesquisa2.realizarPesquisa();
        pesquisa2.exibirResultado();

        pesquisa3.realizarPesquisa();
        pesquisa3.exibirResultado();
    }
}
