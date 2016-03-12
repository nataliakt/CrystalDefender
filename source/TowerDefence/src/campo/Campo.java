package campo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import selecao.Selecao;
import unidade.Inimigo;
import unidade.Tiro;
import unidade.Torre;

public class Campo extends JPanel implements Runnable {

    private Thread thread;
    private boolean jogo;
    private int clock, moedas, inimigos;
    private Fase fase;
    private Selecao selecao;
    private int proporcao;

    public Campo() {
        jogo = true;
        clock = 0;
        proporcao = 100;
        fase = new Fase();
        selecao = new Selecao();

        ArrayList<Caminho> caminhos = new ArrayList<>();
        Caminho caminho1 = new Caminho(0 * proporcao);
        Caminho caminho2 = new Caminho(1 * proporcao);
        Caminho caminho3 = new Caminho(2 * proporcao);
        Caminho caminho4 = new Caminho(3 * proporcao);
        Caminho caminho5 = new Caminho(4 * proporcao);
        caminhos.add(caminho1);
        caminhos.add(caminho2);
        caminhos.add(caminho3);
        caminhos.add(caminho4);
        caminhos.add(caminho5);
        selecao.setCaminhos(caminhos);
        
        Torre torre = new Torre(5, 500, 1, 10, 10); // Cria a torre
        caminho1.getTorres().add(torre); // Adiciona a torre no caminho1
        torre.setCaminho(caminho1); // Seta o caminho da torre como caminho1

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            if (jogo) {
                clock++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
                redesenhar();
            }
        }
    }

    public void redesenhar() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics gc) {
        setOpaque(false);
        super.paintComponent(gc);

        for (Caminho caminho : selecao.getCaminhos()) {
            for (int i = 0; i < 8; i++) {
                gc.setColor(Color.GRAY);
                gc.fillRect(i * proporcao + 5, caminho.getPosicaoY() + 5, proporcao - 10, proporcao - 10); //Desenha o tabuleiro
            }

            for (Tiro tiro : caminho.getTiros()) {
                gc.setColor(tiro.getCor());
                gc.fillOval(tiro.getX(), caminho.getPosicaoY() + proporcao / 2 - 5, 10, 10); //Desenha o tiro
            }

            for (Torre torre : caminho.getTorres()) {
                gc.setColor(torre.getCor());
                gc.fillRect(torre.getX() + 10, caminho.getPosicaoY() + 10, proporcao - 20, proporcao - 20); //Desenha a torre
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
