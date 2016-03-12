package selecao;

import campo.Caminho;
import unidade.Torre;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Selecao extends JPanel {

    private ArrayList<Caminho> caminhos;
    private ArrayList<Torre> torres;

    public Selecao() {
    	// Adicionar as torres padrão
    }

    public ArrayList<Caminho> getCaminhos() {
        return caminhos;
    }

    public void setCaminhos(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }

}
