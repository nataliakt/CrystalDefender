package unidade;

import java.awt.Color;

import campo.Caminho;

public class Tiro implements Runnable {

    private Thread thread;
    private int x, y, clock, dano, velocidade;
    private boolean vivo;
    private Color cor;
    private Caminho caminho;

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
                Thread.sleep(1);
            } catch (InterruptedException ex) {

            }
            caminho.moverTiro(this);
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

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
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
