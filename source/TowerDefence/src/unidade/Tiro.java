package unidade;

import java.awt.Color;

public class Tiro extends Unidade implements Runnable {

    private int dano, velocidade;

    public Tiro(int x, int dano, int velocidade) {
        vivo = true;
        cor = Color.black;
        this.x = x;
        this.dano = dano;
        this.velocidade = velocidade;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (vivo) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            caminho.moverTiro(this);
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
