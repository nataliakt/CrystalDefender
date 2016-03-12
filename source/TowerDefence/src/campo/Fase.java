package campo;

import unidade.Inimigo;

public class Fase {

    private final int MAXIMA = 5;
    private int fase, inimigos, inimigosRestantes, moedas;
    private Inimigo inimigo;

    public Fase() {
        fase = 1;
        inimigos = 2;
        inimigosRestantes = inimigos;
        moedas = 1;
        inimigo = new Inimigo(10, 50, 10, 1, 1);
    }

    public void proximaFase() {
        if (fase < MAXIMA) {
            fase++;
            inimigos = (int) (inimigos * 1.7);
            inimigosRestantes = inimigos;
            moedas = moedas * 2;
            inimigo.setDano((int) (inimigo.getDano() * 1.7));
            inimigo.setVidaMaxima(inimigo.getVidaMaxima() * 2);
            inimigo.setVelocidadeAndar((int) (inimigo.getVelocidadeAndar() * 1.6));
            inimigo.setVelocidadeAtaque((int) (inimigo.getVelocidadeAtaque() * 1.6));
            inimigo.setVelocidadeSpam((int) (inimigo.getVelocidadeAtaque() * 1.8));
        }
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getInimigos() {
        return inimigos;
    }

    public void setInimigos(int inimigos) {
        this.inimigos = inimigos;
    }

    public int getInimigosRestantes() {
        return inimigosRestantes;
    }

    public void setInimigosRestantes(int inimigosRestantes) {
        this.inimigosRestantes = inimigosRestantes;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

}
