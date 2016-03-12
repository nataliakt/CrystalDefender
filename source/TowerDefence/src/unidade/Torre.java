package unidade;

import java.awt.Color;

public class Torre extends Unidade implements Runnable{

    private int dano, vidaMaxima, vidaAtual, velocidadeSpam, velocidadeTiro, custo;

    public Torre(int dano, int vidaMaxima, int velocidadeSpam, int velocidadeTiro, int custo) {
        vivo = true;
        cor = Color.green;
        clock = 0;
        vidaAtual = vidaMaxima;
        this.dano = dano;
        this.vidaMaxima = vidaMaxima;
        this.velocidadeSpam = velocidadeSpam;
        this.velocidadeTiro = velocidadeTiro;
        this.custo = custo;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run(){
        while (vivo) {
            clock++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            if(clock == 1){
                caminho.atirar(this);
            }
        }
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getVelocidadeSpam() {
        return velocidadeSpam;
    }

    public void setVelocidadeSpam(int velocidadeSpam) {
        this.velocidadeSpam = velocidadeSpam;
    }

    public int getVelocidadeTiro() {
        return velocidadeTiro;
    }

    public void setVelocidadeTiro(int velocidadeTiro) {
        this.velocidadeTiro = velocidadeTiro;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    
    
    
    
    
}
