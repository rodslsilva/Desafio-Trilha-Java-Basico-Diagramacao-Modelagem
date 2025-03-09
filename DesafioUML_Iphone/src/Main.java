// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe principal para testar o Iphone
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Shape of You");
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
