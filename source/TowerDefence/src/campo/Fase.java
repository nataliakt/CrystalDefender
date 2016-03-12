package campo;

import unidade.Inimigo;

public class Fase {

    private final int MAXIMA = 5;
    private int fase, inimigos, moedas;
    private Inimigo inimigo;

    public Fase() {
        fase = 1;
        inimigos = 2;
        moedas = 1;
        inimigo = new Inimigo(10, 50, 10, 1, 1);
    }
    
    public void proximaFase(){
        if(fase < MAXIMA){
            fase++;
            inimigos = (int)(inimigos * 1.7);
            moedas = moedas * 2;
            inimigo.setDano((int)(inimigo.getDano() * 1.7));
            inimigo.setVidaMaxima(inimigo.getVidaMaxima() * 2);
            inimigo.setVelocidadeAndar((int)(inimigo.getVelocidadeAndar() * 1.6));
            inimigo.setVelocidadeAtaque((int)(inimigo.getVelocidadeAtaque() * 1.6));
            inimigo.setVelocidadeSpam((int)(inimigo.getVelocidadeAtaque() * 1.8));
        }
    }

}
