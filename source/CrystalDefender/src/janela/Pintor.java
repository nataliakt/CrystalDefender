package janela;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import campo.Caminho;
import selecao.Selecao;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Pintor extends JPanel {

	private Selecao selecao = null;

	protected void paintComponent(Graphics g) {
		try {
			if (selecao != null) {
				for (Caminho c : selecao.getCaminhos()) {
					for (Tiro tiro : c.getTiros()) {
						int x = tiro.getX();
						int y = ((c.getLinha() - 1) * 120) + 65;
						g.setColor(tiro.getCor());
						g.fillOval(x, y, 15, 15);
					}
					for (Inimigo inimigo : c.getInimigos()) {
						int x = inimigo.getX();
						int y = ((c.getLinha() - 1) * 140) + 10;

						g.setColor(inimigo.getCor());
						g.fillRect(x, y, 120, 120);

						x = inimigo.getX() + 50;
						y = ((c.getLinha() - 1) * 140) + 10;
						g.setColor(Color.red);
						String vida = Integer.toString(inimigo.getVidaAtual()) + "/"
								+ Integer.toString(inimigo.getVidaMaxima());
						FontMetrics fm = g.getFontMetrics();
						Rectangle2D rect = fm.getStringBounds(vida, g);
						g.fillRect(x, y - fm.getAscent(), (int) rect.getWidth(), (int) rect.getHeight());

						g.setColor(Color.black);
						g.drawString(vida, x, y);
					}
					for (Torre torre : c.getTorres()) {
						if (torre != null) {
							int x = ((torre.getColuna() - 1) * 140) + 50;
							int y = ((c.getLinha() - 1) * 140) + 10;

							g.setColor(Color.green);
							String vida = Integer.toString(torre.getVidaAtual()) + "/"
									+ Integer.toString(torre.getVidaMaxima());
							FontMetrics fm = g.getFontMetrics();
							Rectangle2D rect = fm.getStringBounds(vida, g);
							g.fillRect(x, y - fm.getAscent(), (int) rect.getWidth(), (int) rect.getHeight());

							g.setColor(Color.black);
							g.drawString(vida, x, y);
						}
					}
				}
			}
		} catch (Exception e) {
			// Quando for excluido
			System.out.println(e.getMessage());
		}
	}

	public Selecao getSelecao() {
		return selecao;
	}

	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
	}

}
