package selecao;

import campo.Caminho;
import java.util.ArrayList;

public class Selecao {
    
    private ArrayList<Caminho> caminhos;

    public Selecao(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }
    
    public ArrayList<Caminho> getCaminhos() {
        return caminhos;
    }

    public void setCaminhos(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }
    
    
    
}
