package campo;

import java.util.ArrayList;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Caminho {
    
    private ArrayList<Torre> torres;
    private ArrayList<Tiro> tiros;
    private ArrayList<Inimigo> inimigos;
    private int posicaoY;

    public Caminho(int posicaoY) {
        this.posicaoY = posicaoY;
        torres = new ArrayList<Torre>();
        tiros = new ArrayList<Tiro>();
        inimigos = new ArrayList<Inimigo>();
        for(int i = 0; i < 8; i++){
        	Torre t = new Torre(i * 100, posicaoY);
        	torres.add(t);
        }
    }
    
    public void atirar(Torre torre){
        Tiro t = new Tiro(torre.getX() + 100, torre.getDano(), torre.getVelocidadeTiro());
        t.setCaminho(this);
        tiros.add(t);
    }
    
    public void moverTiro(Tiro tiro) {
        tiro.setX(tiro.getX() + 1);
        if(tiro.getX() > 809){
            tiro.setVivo(false);
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

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    
    
}
