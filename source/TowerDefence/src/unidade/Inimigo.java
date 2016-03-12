package unidade;

import java.awt.Color;

import campo.Caminho;

public class Inimigo implements Runnable{


    private Thread thread;
    private int x, y, clock, dano, vidaMaxima, vidaAtual, velocidadeAndar, velocidadeSpam, velocidadeAtaque;
    private boolean vivo;
    private Color cor;
    private Caminho caminho;

    public Inimigo(int dano, int vidaMaxima, int velocidadeAndar, int velocidadeSpam, int velocidadeAtaque) {
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

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
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

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public Caminho getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho caminho) {
		this.caminho = caminho;
	}
    
}
