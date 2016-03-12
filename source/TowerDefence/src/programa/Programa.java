package programa;

import campo.Campo;
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
            
            // Campo
            jPanelCampo.add(getCampo(), BorderLayout.EAST);
            campo.setPreferredSize(new Dimension(800, 700));
            campo.setMaximumSize(campo.getPreferredSize());
            campo.setMinimumSize(campo.getPreferredSize());            
            campo.setBorder(BorderFactory.createLineBorder(Color.black));
            
            // Selecao
            jPanelCampo.add(getSelecao(), BorderLayout.WEST);
            selecao.setPreferredSize(new Dimension(200, 700));
            selecao.setMaximumSize(campo.getPreferredSize());
            selecao.setMinimumSize(campo.getPreferredSize());
            selecao.setBorder(BorderFactory.createLineBorder(Color.black));
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

    //Construtor
    public Programa() {
        super();
        initializeCampo();
    }

    private void initializeCampo() {
        this.setResizable(false);
        this.setBounds(new Rectangle(312, 184, 1000, 600));
        this.setMinimumSize(new Dimension(1000, 600));
        this.setMaximumSize(new Dimension(1000, 600));
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
