package programa;

import campo.Campo;
import inicio.Jogador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import selecao.Selecao;

public class Programa extends JFrame {

	//Singleton instance
    private JPanel jPanelCampo = null;

    //Singleon getInstance()
    private JPanel getJPanelCampo() {
        if (jPanelCampo == null) {
            jPanelCampo = new JPanel();
            jPanelCampo.setLayout(new BorderLayout());

            //Topo
            JPanel topo = new JPanel();
            topo.setLayout(new BorderLayout());
            jPanelCampo.add(topo, BorderLayout.NORTH);
            topo.setPreferredSize(new Dimension(1000, 100));
            topo.setMaximumSize(topo.getPreferredSize());
            topo.setMinimumSize(topo.getPreferredSize());
            
            // Selecao < topo
            topo.add(getSelecao(), BorderLayout.WEST);
            selecao.setPreferredSize(new Dimension(400, 100));
            selecao.setMaximumSize(selecao.getPreferredSize());
            selecao.setMinimumSize(selecao.getPreferredSize());
            selecao.setBackground(Color.blue);

            // Jogador < topo
            topo.add(getJogador(), BorderLayout.EAST);
            jogador.setPreferredSize(new Dimension(600, 100));
            jogador.setMaximumSize(jogador.getPreferredSize());
            jogador.setMinimumSize(jogador.getPreferredSize());
            jogador.setBackground(Color.lightGray);
            
            // Baixo
            JPanel baixo = new JPanel();
            baixo.setLayout(new BorderLayout());
            jPanelCampo.add(baixo, BorderLayout.SOUTH);
            baixo.setPreferredSize(new Dimension(1000, 600));
            baixo.setMaximumSize(baixo.getPreferredSize());
            baixo.setMinimumSize(baixo.getPreferredSize());
            baixo.setBackground(Color.pink);
            
            // Muro > baixo
            JPanel muro = new JPanel();
            baixo.add(muro, BorderLayout.NORTH);
            muro.setPreferredSize(new Dimension(1000, 70));
            muro.setMaximumSize(muro.getPreferredSize());
            muro.setMinimumSize(muro.getPreferredSize());
            muro.setOpaque(false);
            
            // Caminho > baixo
            JPanel caminho = new JPanel();
            caminho.setLayout(new BorderLayout());
            baixo.add(caminho, BorderLayout.SOUTH);
            caminho.setPreferredSize(new Dimension(1000, 530));
            caminho.setMaximumSize(caminho.getPreferredSize());
            caminho.setMinimumSize(caminho.getPreferredSize());
            caminho.setOpaque(false);

            // Campo > caminho
            caminho.add(getCampo(), BorderLayout.EAST);
            campo.setPreferredSize(new Dimension(800, 530));
            campo.setMaximumSize(campo.getPreferredSize());
            campo.setMinimumSize(campo.getPreferredSize());
            campo.setOpaque(false);
        }
        return jPanelCampo;
    }

    //Singleton instance
    private Campo campo = null;

    //Singleton getInstance()
    private Campo getCampo() {
        if (campo == null) {
            campo = new Campo();
        }
        return campo;
    }

    //Singleton instance
    private Selecao selecao = null;

    //Singleton getInstance()
    private Selecao getSelecao() {
        if (selecao == null) {
            selecao = new Selecao();
        }
        return selecao;
    }

    //Singleton instance
    private Jogador jogador = null;

    //Singleton getInstance()
    private Jogador getJogador() {
        if (jogador == null) {
        	jogador = new Jogador();
        }
        return jogador;
    }

    //Construtor
    public Programa() {
        super();
        initializeCampo();
    }

    private void initializeCampo() {
        this.setResizable(false);
        this.setBounds(new Rectangle(1000, 700));
        this.setMinimumSize(new Dimension(1000, 700));
        this.setMaximumSize(new Dimension(1000, 700));
        this.setLocationRelativeTo(null);
        this.setContentPane(getJPanelCampo());
        this.setTitle("Tower Defence - Jogar");
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Programa programa = new Programa();
            programa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            programa.setVisible(true);
        });
    }

}
