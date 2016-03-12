package campo;

import javax.swing.JPanel;
import selecao.Selecao;

public class Campo extends JPanel implements Runnable{
    
    private Thread thread;
    private boolean jogo;
    private int clock, moedas;
    private Fase fase;
    private Selecao selecao;
    
    @Override
    public void run(){
        
    }
    
}
