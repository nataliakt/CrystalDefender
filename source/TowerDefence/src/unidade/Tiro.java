package unidade;

import caminho.Caminho;

public class Tiro extends Unidade implements Runnable{
    
    private int dano, velocidade;

    public Tiro(int dano, int velocidade, int x, int y, Caminho caminho) {
        super(x, y, caminho);
        this.dano = dano;
        this.velocidade = velocidade;
    }
    
    @Override
    public void run(){
        
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    
}
