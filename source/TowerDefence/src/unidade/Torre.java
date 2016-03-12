package unidade;

import java.awt.Color;

import javax.swing.JLabel;

import campo.Caminho;

public class Torre extends JLabel implements Runnable{


    private Thread thread;
    private int x, y, clock, dano, vidaMaxima, vidaAtual, velocidadeSpam, velocidadeTiro, custo;
    private boolean vivo;
    private Color cor;
    private Caminho caminho;

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
