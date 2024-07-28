package principal;

import models.NavegadorInternet;
import models.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versaoSO;

    public iPhone(String modelo, String versaoSO) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Reprodução parada.");
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando para o número...");
    }

    @Override
    public void desligar() {
        System.out.println("Chamada desligada.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void rejeitar() {
        System.out.println("Chamada rejeitada.");
    }

    // Métodos de NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void fechar() {
        System.out.println("Página fechada.");
    }

}
