package unidade;

import java.awt.Color;

import campo.Caminho;
import campo.Campo;

public class Inimigo implements Runnable {

	private Thread thread;
	private int x, clock, dano, vidaMaxima, vidaAtual, velocidadeAndar, velocidadeSpam, velocidadeAtaque;
	private boolean vivo;
	private Color cor;
	private Caminho caminho;

	public Inimigo(int dano, int vidaMaxima, int velocidadeAndar, int velocidadeSpam, int velocidadeAtaque) {
		vivo = true;
		clock = 0;
		cor = Color.red;
		this.dano = dano;
		this.vidaMaxima = vidaMaxima;
		vidaAtual = vidaMaxima;
		this.velocidadeAndar = velocidadeAndar;
		this.velocidadeSpam = velocidadeSpam;
		this.velocidadeAtaque = velocidadeAtaque;
	}

	public Inimigo(Inimigo inimigo, Caminho caminho) {
		vivo = true;
		clock = 0;
		x = 850;
		cor = inimigo.getCor();
		this.caminho = caminho;
		this.dano = inimigo.dano;
		this.vidaMaxima = inimigo.vidaMaxima;
		vidaAtual = inimigo.vidaMaxima;
		this.velocidadeAndar = inimigo.velocidadeAndar;
		this.velocidadeSpam = inimigo.velocidadeSpam;
		this.velocidadeAtaque = inimigo.velocidadeAtaque;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while (vivo) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (clock % milissegundosAndar(velocidadeAndar) == 0) {
				caminho.andar(this);
			}
			if (clock % milissegundosAtaque(velocidadeAtaque) == 0) {
				caminho.atacar(this);
			}
			clock++;
		}
		caminho.getInimigos().remove(this);
	}

	public int milissegundosAndar(int velocidade) {
		switch (velocidade) {
		case 1:
			return 50;
		case 2:
			return 25;
		case 3:
			return 1;
		default:
			return 0;
		}
	}

	public int milissegundosAtaque(int velocidade) {
		switch (velocidade) {
		case 1:
			return 2000;
		case 2:
			return 1000;
		case 3:
			return 500;
		default:
			return 0;
		}
	}
	
	public void receberDano(int dano){
		System.out.println(dano);
		vidaAtual -= dano;
		if(vidaAtual <= 0){
			vivo = false;
			vidaAtual = 0;
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
