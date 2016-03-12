package unidade;

import caminho.Caminho;
import java.awt.Color;

public class Inimigo extends Unidade implements Runnable{

    private int dano, vidaMaxima, vidaAtual, velocidadeAndar, velocidadeSpam, velocidadeAtaque;

    public Inimigo(int dano, int vidaMaxima, int velocidadeAndar, int velocidadeSpam, int velocidadeAtaque, int x, int y, Caminho caminho) {
        super(x, y, caminho);
        cor = Color.red;
        this.dano = dano;
        this.vidaMaxima = vidaMaxima;
        vidaAtual = vidaMaxima;
        this.velocidadeAndar = velocidadeAndar;
        this.velocidadeSpam = velocidadeSpam;
        this.velocidadeAtaque = velocidadeAtaque;
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

    public int getVelocidadeAndar() {
        return velocidadeAndar;
    }

    public void setVelocidadeAndar(int velocidadeAndar) {
        this.velocidadeAndar = velocidadeAndar;
    }

    public int getVelocidadeSpam() {
        return velocidadeSpam;
    }

    public void setVelocidadeSpam(int velocidadeSpam) {
        this.velocidadeSpam = velocidadeSpam;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }
    

}
