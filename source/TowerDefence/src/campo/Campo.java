package campo;

import java.util.Random;

import javax.swing.ImageIcon;

import fase.Fase;
import fase.ListaFase;
import janela.Jogo;
import selecao.Selecao;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Campo implements Runnable {

	private Thread thread;
	private boolean jogo, ganhar;
	private int clock, moedas, inimigos;
	private Fase fase;
	private Selecao selecao;
	private Jogo janela;

	public Campo(Jogo janela) {
		this.janela = janela;
		jogo = true;
		ganhar = false;
		clock = 0;
		moedas = 0;
		selecao = new Selecao();
		ListaFase fases = new ListaFase();
		fase = fases.getInicio();
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		while (jogo) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (clock % milissegundos(fase.getInimigo().getVelocidadeSpam()) == 0) {
				if (fase.getInimigos() > inimigos) {
					for (int i = 0; i < fase.getInimigosQuant(); i++) {
						if (fase.getInimigos() > inimigos) {
							inimigos++;
							int rand = new Random().nextInt(3);
							Caminho c = selecao.getCaminhos().get(rand);
							Inimigo inimigo = new Inimigo(fase.getInimigo(), c);
							c.getInimigos().add(inimigo);
						}
					}
				}else if(selecao.inimigos() == 0){
					fase = fase.getProxima();
					if(fase != null){
						janela.setFase(fase.getFase());
					}else{
						jogo = false;
						ganhar = true;
					}
				}
			}
			if (clock % 1000 == 0) {
				moedas += fase.getMoedas();
				janela.setGold(moedas);
			}
			verificarTorres();
			janela.repaint();
			janela.getCampo().setSelecao(selecao);
			janela.getCampo().repaint();
			clock++;
		}

	}

	public int milissegundos(int velocidade) {
		switch (velocidade) {
		case 1:
			return 8000;
		case 2:
			return 5000;
		case 3:
			return 1500;
		default:
			return 0;
		}

	}

	public void verificarTorres() {
		try {
			for (int i = 0; i < 3; i++) {
				Caminho c = selecao.getCaminhos().get(i);
				for (int j = 0; j < 6; j++) {
					Torre t = c.getTorres().get(j);
					if (t != null) {
						if (!janela.getTorre(i + 1, j + 1).getIcon().toString().equals(t.getImagem())) {
							t = selecao.getTorre(janela.getTorre(i + 1, j + 1).getIcon().toString());
							c.getTorres().set(j, t);
							t.ativar(j + 1, c);
						}
						if (!t.isVivo()) {
							janela.setTorre(0, i + 1, j + 1);
						}
					} else {
						if (janela.getTorre(i + 1, j + 1).getIcon() != null) {
							t = selecao.getTorre(janela.getTorre(i + 1, j + 1).getIcon().toString());
							c.getTorres().set(j, t);
							t.ativar(j + 1, c);
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Erro na verificação de torres!");
		}
	}

}
