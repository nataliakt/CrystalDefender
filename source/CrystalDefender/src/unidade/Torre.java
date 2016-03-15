package unidade;

import campo.Caminho;

public class Torre implements Runnable {

	private Thread thread;
	private int coluna, clock, dano, vidaMaxima, vidaAtual, velocidadeSpam, velocidadeTiro, custo;
	private boolean vivo;
	private Caminho caminho;
	private String imagem;

	public Torre(int dano, int vidaMaxima, int velocidadeSpam, int velocidadeTiro, int custo, String imagem) {
		vivo = true;
		clock = 0;
		vidaAtual = vidaMaxima;
		this.dano = dano;
		this.vidaMaxima = vidaMaxima;
		this.velocidadeSpam = velocidadeSpam;
		this.velocidadeTiro = velocidadeTiro;
		this.custo = custo;
		this.imagem = imagem;
	}

	public Torre(Torre torre) {
		vivo = true;
		clock = 0;
		vidaAtual = torre.vidaMaxima;
		this.dano = torre.dano;
		this.vidaMaxima = torre.vidaMaxima;
		this.velocidadeSpam = torre.velocidadeSpam;
		this.velocidadeTiro = torre.velocidadeTiro;
		this.custo = torre.custo;
		this.imagem = torre.imagem;
	}

	@Override
	public void run() {
		while (vivo) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {

			}
			if (clock % milissegundos(velocidadeSpam) == 0) {
				caminho.atirar(this);
			}
			clock++;
		}
		caminho.getTorres().set(coluna - 1, null);
	}
	
	public void receberDano(int dano){
		vidaAtual -= dano;
		if(vidaAtual <= 0){
			vivo = false;
			vidaAtual = 0;
		}
	}
	
	public int milissegundos(int velocidade) {
		switch (velocidade) {
		case 1:
			return 2000;
		case 2:
			return 1500;
		case 3:
			return 1000;
		default:
			return 0;
		}
	}

	public void ativar(int coluna, Caminho caminho) {
		setColuna(coluna);
		setCaminho(caminho);
		thread = new Thread(this);
		thread.start();
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
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

	public Caminho getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho caminho) {
		this.caminho = caminho;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
