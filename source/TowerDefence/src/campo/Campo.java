package campo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fase.Fase;
import fase.ListaFase;
import selecao.Selecao;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Campo extends JPanel implements Runnable {

    private Thread thread;
    private boolean jogo;
    private int clock, moedas, inimigos, proporcao;
    private Fase fase;
    private Selecao selecao;

    public Campo() {
        jogo = true;
        clock = 0;
        proporcao = 100;
        ListaFase fases = new ListaFase();
        fase = fases.getInicio();
        selecao = new Selecao();

        ArrayList<Caminho> caminhos = new ArrayList<>();
        Caminho caminho1 = new Caminho(0 * proporcao);
        caminhos.add(caminho1);
        Caminho caminho2 = new Caminho(1 * proporcao);
        caminhos.add(caminho2);
        Caminho caminho3 = new Caminho(2 * proporcao);
        caminhos.add(caminho3);
        Caminho caminho4 = new Caminho(3 * proporcao);
        caminhos.add(caminho4);
        Caminho caminho5 = new Caminho(4 * proporcao);
        caminhos.add(caminho5);
        selecao.setCaminhos(caminhos);
        
        gerarBlocos();

        thread = new Thread(this);
        thread.start();
    }
    
    public void gerarBlocos(){
    	for(Caminho caminho: selecao.getCaminhos()){
    		for(int i = 0; i < 8; i++){
    			Torre t = new Torre(i * proporcao, caminho.getPosicaoY());
    			caminho.getTorres().add(t);
    			this.add(t);
                this.add(t, BorderLayout.WEST);
                t.setOpaque(true);
                t.setAlignmentX(100*i+5);
                t.setAlignmentY(caminho.getPosicaoY()+5);
                t.setPreferredSize(new Dimension(90, 90));
                t.setMaximumSize(t.getPreferredSize());
                t.setMinimumSize(t.getPreferredSize());
                t.setBackground(Color.gray);
    		}
    	}
    }

    @Override
    public void run() {
        while (true) {
            if (jogo) {
                clock++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {

                }
                System.out.println(clock);
                redesenhar();
            }
        }
    }

    public void redesenhar() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics gc) {
        //setOpaque(false);
        super.paintComponent(gc);

        for (Caminho caminho : selecao.getCaminhos()) {

        	if(clock % 10 == 0){
	            for (Torre torre : caminho.getTorres()) {
	            	//torre.setIcon(new ImageIcon("src/imagens/Torre.png"));
	            }
        	}

            for (Tiro tiro : caminho.getTiros()) {
                gc.setColor(tiro.getCor());
                gc.fillOval(tiro.getX(), caminho.getPosicaoY() + proporcao / 2 - 5, 10, 10); //Desenha o tiro
            }
//
//            for (Inimigo inimigo : batalha.getInimigos()) {
//                gc.setColor(inimigo.getCor());
//                gc.fillRect(inimigo.getX() + 15, inimigo.getY() + 15, 80, 80); //Desenha a torre
//            }
        }

//        gc.drawString("Threads: " + Thread.activeCount(), 100, 125);
//
//        if (!jogo) {
//            gc.drawString("Fim de Jogo", 100, 125);
//        }
    }

}
