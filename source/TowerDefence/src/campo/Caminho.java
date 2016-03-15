package campo;

import java.util.ArrayList;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Caminho {

	private ArrayList<Torre> torres;
	private ArrayList<Tiro> tiros;
	private ArrayList<Inimigo> inimigos;
	private int linha;

	public Caminho(int linha) {
		this.linha = linha;
		torres = new ArrayList<Torre>();
		tiros = new ArrayList<Tiro>();
		inimigos = new ArrayList<Inimigo>();

		for (int i = 0; i < 6; i++) {
			Torre t = null;
			torres.add(t);
		}
	}

	public void atirar(Torre torre) {
		Tiro t = new Tiro(torre.getColuna() * 140, torre.getDano(), torre.getVelocidadeTiro(), torre);
		t.setCaminho(this);
		tiros.add(t);
	}

	public void moverTiro(Tiro tiro) {
		try {
			tiro.setX(tiro.getX() + 1);
			for (Inimigo inimigo : inimigos) {
				if (tiro.getX() > inimigo.getX() && (tiro.getTorre().getColuna() - 1) * 140 + 120 <= inimigo.getX()
						&& tiro.isVivo()) {
					inimigo.receberDano(tiro.getDano());
					tiro.setVivo(false);
				}
			}
			if (tiro.getX() > 865) {
				tiro.setVivo(false);
			}
		} catch (Exception e) {
			System.out.println("Erro no tiro!");
		}
	}

	public void andar(Inimigo inimigo) {
		try {
			for (Torre torre : torres) {
				if (torre != null) {
					if ((torre.getColuna() - 1) * 140 + 120 == inimigo.getX() && inimigo.isVivo() && torre.isVivo()) {
						inimigo.setX(inimigo.getX() + 1);
					}
				}
			}
			inimigo.setX(inimigo.getX() - 1);
		} catch (Exception e) {
			System.out.println("Erro no andar!");
		}
	}

	public void atacar(Inimigo inimigo) {
		try {
			for (Torre torre : torres) {
				if (torre != null) {
					if ((torre.getColuna() - 1) * 140 + 120 == inimigo.getX() && inimigo.isVivo() && torre.isVivo()) {
						torre.receberDano(inimigo.getDano());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Erro no atacar!");
		}
	}

	public ArrayList<Torre> getTorres() {
		return torres;
	}

	public void setTorres(ArrayList<Torre> torres) {
		this.torres = torres;
	}

	public ArrayList<Tiro> getTiros() {
		return tiros;
	}

	public void setTiros(ArrayList<Tiro> tiros) {
		this.tiros = tiros;
	}

	public ArrayList<Inimigo> getInimigos() {
		return inimigos;
	}

	public void setInimigos(ArrayList<Inimigo> inimigos) {
		this.inimigos = inimigos;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

}
