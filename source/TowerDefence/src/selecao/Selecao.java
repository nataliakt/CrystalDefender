package selecao;

import campo.Caminho;
import unidade.Torre;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Selecao extends JPanel {

	private ArrayList<Caminho> caminhos;
	private ArrayList<Torre> torres;

	public Selecao() {
		torres = new ArrayList<Torre>();

		Torre torre1 = new Torre(10, 100, 1, 1, 50, "src/imagens/Torre1.png");
		torres.add(torre1);
		Torre torre2 = new Torre(50, 300, 2, 2, 150, "src/imagens/Torre2.png");
		torres.add(torre2);
		Torre torre3 = new Torre(100, 2000, 3, 3, 400, "src/imagens/Torre3.png");
		torres.add(torre3);

		caminhos = new ArrayList<Caminho>();

		Caminho c1 = new Caminho(1);
		caminhos.add(c1);
		Caminho c2 = new Caminho(2);
		caminhos.add(c2);
		Caminho c3 = new Caminho(3);
		caminhos.add(c3);
	}

	public int inimigos(){
		int contador = 0;
		for(int i = 0; i < 3; i++){
			Caminho c = caminhos.get(i);
			contador += c.getInimigos().size();
		}
		return contador;
	}
	
	public Torre getTorre(String imagem) {
		Torre t;
		if (imagem.equals("src/imagens/Torre1.png"))
			t = new Torre(torres.get(0));
		else if (imagem.equals("src/imagens/Torre2.png"))
			t = new Torre(torres.get(1));
		else if (imagem.equals("src/imagens/Torre3.png"))
			t = new Torre(torres.get(2));
		else{
			t = null;
		}

		return t;
	}

	public ArrayList<Caminho> getCaminhos() {
		return caminhos;
	}

	public void setCaminhos(ArrayList<Caminho> caminhos) {
		this.caminhos = caminhos;
	}

	public ArrayList<Torre> getTorres() {
		return torres;
	}

	public void setTorres(ArrayList<Torre> torres) {
		this.torres = torres;
	}

}
