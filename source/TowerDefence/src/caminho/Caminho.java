package caminho;

import java.util.ArrayList;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Caminho {
    
    private ArrayList<Torre> torres;
    private ArrayList<Tiro> tiros;
    private ArrayList<Inimigo> inimigos;
    int posicaoY;

    public Caminho(int posicaoY) {
        this.posicaoY = posicaoY;
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

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    
    
}
