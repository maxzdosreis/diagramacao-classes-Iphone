public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero );
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualização a página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo nova página no destino: " + url);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Escolhendo a música: " + musica);
    }
    
}
