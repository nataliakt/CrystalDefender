package fase;

import unidade.Inimigo;

public class Fase {

	private int fase, inimigos, moedas, inimigosQuant;
	private Inimigo inimigo;
	private Fase proxima;

	public Fase(int fase, int inimigos, int moedas, Inimigo inimigo, int inimigosQuant, Fase proxima) {
		super();
		this.fase = fase;
		this.inimigos = inimigos;
		this.moedas = moedas;
		this.inimigo = inimigo;
		this.inimigosQuant = inimigosQuant;
		this.proxima = proxima;
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

	public int getInimigosQuant() {
		return inimigosQuant;
	}

	public void setInimigosQuant(int inimigosQuant) {
		this.inimigosQuant = inimigosQuant;
	}

	public Fase getProxima() {
		return proxima;
	}

	public void setProxima(Fase proxima) {
		this.proxima = proxima;
	}

}
