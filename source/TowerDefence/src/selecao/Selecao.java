package selecao;

import campo.Caminho;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Selecao extends JPanel{
    
    private ArrayList<Caminho> caminhos;

    public Selecao(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }

    public Selecao() {
        
    }
    
    public ArrayList<Caminho> getCaminhos() {
        return caminhos;
    }

    public void setCaminhos(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }
    
    
    
}
