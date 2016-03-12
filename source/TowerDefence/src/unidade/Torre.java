package unidade;

import java.awt.Color;

public class Torre extends Unidade implements Runnable{

    private int dano, vidaMaxima, vidaAtual, velocidadeSpam, velocidadeTiro, custo;

    public Torre(int dano, int vidaMaxima, int velocidadeSpam, int velocidadeTiro, int custo) {
        cor = Color.green;
        this.dano = dano;
        this.vidaMaxima = vidaMaxima;
        vidaAtual = vidaMaxima;
        this.velocidadeSpam = velocidadeSpam;
        this.velocidadeTiro = velocidadeTiro;
        this.custo = custo;
    }
    
    @Override
    public void run(){
        
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
