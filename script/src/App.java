public class App {
    public static void main(String[] args) throws Exception {
        iPhone myPhone = new iPhone();

        myPhone.selecionarMusica();
        myPhone.tocar();
        myPhone.pausar();

        myPhone.ligar();
        myPhone.atender();
        myPhone.iniciarCorreioVoz();

        myPhone.exibirPagina();
        myPhone.adicionarNovaAba();
        myPhone.atualizarPagina();
    }
}
