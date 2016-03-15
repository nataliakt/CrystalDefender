package janela;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.TransferHandler;

import campo.Campo;

public class Jogo extends javax.swing.JFrame {

	public Jogo() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		MouseEvent me = new MouseEvent();

		tudo = new javax.swing.JPanel();
		compra1 = new javax.swing.JLabel();
		preco1 = new javax.swing.JLabel();
		compra2 = new javax.swing.JLabel();
		preco2 = new javax.swing.JLabel();
		compra3 = new javax.swing.JLabel();
		preco3 = new javax.swing.JLabel();
		gold = new javax.swing.JLabel();
		jogador = new javax.swing.JLabel();
		fase = new javax.swing.JLabel();
		campo = new Pintor();
		torre1x1 = new javax.swing.JLabel();
		torre1x2 = new javax.swing.JLabel();
		torre1x3 = new javax.swing.JLabel();
		torre1x4 = new javax.swing.JLabel();
		torre1x5 = new javax.swing.JLabel();
		torre1x6 = new javax.swing.JLabel();
		torre2x1 = new javax.swing.JLabel();
		torre2x2 = new javax.swing.JLabel();
		torre2x3 = new javax.swing.JLabel();
		torre2x4 = new javax.swing.JLabel();
		torre2x5 = new javax.swing.JLabel();
		torre2x6 = new javax.swing.JLabel();
		torre3x1 = new javax.swing.JLabel();
		torre3x2 = new javax.swing.JLabel();
		torre3x3 = new javax.swing.JLabel();
		torre3x4 = new javax.swing.JLabel();
		torre3x5 = new javax.swing.JLabel();
		torre3x6 = new javax.swing.JLabel();
		fundo = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("TowerDefence");
		setLocation(new java.awt.Point(0, 0));
		setMaximumSize(new java.awt.Dimension(1000, 700));
		setMinimumSize(new java.awt.Dimension(1000, 700));
		setPreferredSize(new java.awt.Dimension(1000, 700));
		setResizable(false);
		getContentPane().setLayout(null);

		tudo.setLayout(null);

		compra1.setIcon(new javax.swing.ImageIcon("src/imagens/Torre1.png")); // NOI18N
		tudo.add(compra1);
		compra1.setBounds(30, 30, 120, 120);
		compra1.addMouseListener(me);

		preco1.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
		tudo.add(preco1);
		preco1.setBounds(30, 160, 120, 50);

		compra2.setIcon(new javax.swing.ImageIcon("src/imagens/Torre2.png")); // NOI18N
		tudo.add(compra2);
		compra2.setBounds(190, 30, 120, 120);
		compra2.addMouseListener(me);

		preco2.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
		tudo.add(preco2);
		preco2.setBounds(190, 160, 120, 50);

		compra3.setIcon(new javax.swing.ImageIcon("src/imagens/Torre3.png")); // NOI18N
		tudo.add(compra3);
		compra3.setBounds(350, 30, 120, 120);
		compra3.addMouseListener(me);

		preco3.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
		tudo.add(preco3);
		preco3.setBounds(350, 160, 120, 50);

		gold.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		gold.setText("0");
		tudo.add(gold);
		gold.setBounds(600, 90, 60, 50);

		jogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jogador.setText("Fulano");
		tudo.add(jogador);
		jogador.setBounds(770, 50, 170, 50);

		fase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		fase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fase.setText("Fase 1");
		tudo.add(fase);
		fase.setBounds(770, 140, 170, 50);

		campo.setOpaque(false);
		tudo.add(campo);
		campo.setBounds(150, 250, 850, 420);

		tudo.add(torre2x1);
		torre2x1.setBounds(160, 400, 120, 120);

		tudo.add(torre2x3);
		torre2x3.setBounds(440, 400, 120, 120);

		tudo.add(torre1x3);
		torre1x3.setBounds(440, 260, 120, 120);

		tudo.add(torre3x2);
		torre3x2.setBounds(300, 540, 120, 120);

		tudo.add(torre2x6);
		torre2x6.setBounds(860, 400, 120, 120);

		tudo.add(torre3x1);
		torre3x1.setBounds(160, 540, 120, 120);

		tudo.add(torre1x6);
		torre1x6.setBounds(860, 260, 120, 120);

		tudo.add(torre1x1);
		torre1x1.setBounds(160, 260, 120, 120);

		tudo.add(torre2x4);
		torre2x4.setBounds(580, 400, 120, 120);

		tudo.add(torre1x5);
		torre1x5.setBounds(720, 260, 120, 120);

		tudo.add(torre2x2);
		torre2x2.setBounds(300, 400, 120, 120);

		tudo.add(torre2x5);
		torre2x5.setBounds(720, 400, 120, 120);

		tudo.add(torre3x5);
		torre3x5.setBounds(720, 540, 120, 120);

		tudo.add(torre3x3);
		torre3x3.setBounds(440, 540, 120, 120);

		tudo.add(torre1x2);
		torre1x2.setBounds(300, 260, 120, 120);

		tudo.add(torre3x6);
		torre3x6.setBounds(860, 540, 120, 120);

		tudo.add(torre1x4);
		torre1x4.setBounds(580, 260, 120, 120);

		tudo.add(torre3x4);
		torre3x4.setBounds(580, 540, 120, 120);

		fundo.setIcon(new javax.swing.ImageIcon("src/imagens/Fundo.png")); // NOI18N
		tudo.add(fundo);
		fundo.setBounds(0, 0, 1000, 700);

		getContentPane().add(tudo);
		tudo.setBounds(0, 0, 1000, 700);

		compra1.setTransferHandler(new TransferHandler("icon"));
		compra2.setTransferHandler(new TransferHandler("icon"));
		compra3.setTransferHandler(new TransferHandler("icon"));
		torre1x1.setTransferHandler(new TransferHandler("icon"));
		torre1x2.setTransferHandler(new TransferHandler("icon"));
		torre1x3.setTransferHandler(new TransferHandler("icon"));
		torre1x4.setTransferHandler(new TransferHandler("icon"));
		torre1x5.setTransferHandler(new TransferHandler("icon"));
		torre1x6.setTransferHandler(new TransferHandler("icon"));
		torre2x1.setTransferHandler(new TransferHandler("icon"));
		torre2x2.setTransferHandler(new TransferHandler("icon"));
		torre2x3.setTransferHandler(new TransferHandler("icon"));
		torre2x4.setTransferHandler(new TransferHandler("icon"));
		torre2x5.setTransferHandler(new TransferHandler("icon"));
		torre2x6.setTransferHandler(new TransferHandler("icon"));
		torre3x1.setTransferHandler(new TransferHandler("icon"));
		torre3x2.setTransferHandler(new TransferHandler("icon"));
		torre3x3.setTransferHandler(new TransferHandler("icon"));
		torre3x4.setTransferHandler(new TransferHandler("icon"));
		torre3x5.setTransferHandler(new TransferHandler("icon"));
		torre3x6.setTransferHandler(new TransferHandler("icon"));

		pack();
		setLocationRelativeTo(null);
	}

	public static void iniciar() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Jogo j = new Jogo();
				j.setVisible(true);
				Campo c = new Campo(j);
			}
		});
	}

	private Pintor campo;
	private javax.swing.JLabel compra1;
	private javax.swing.JLabel compra2;
	private javax.swing.JLabel compra3;
	private javax.swing.JLabel fase;
	private javax.swing.JLabel fundo;
	private javax.swing.JLabel gold;
	private javax.swing.JLabel jogador;
	private javax.swing.JLabel preco1;
	private javax.swing.JLabel preco2;
	private javax.swing.JLabel preco3;
	private javax.swing.JLabel torre1x1;
	private javax.swing.JLabel torre1x2;
	private javax.swing.JLabel torre1x3;
	private javax.swing.JLabel torre1x4;
	private javax.swing.JLabel torre1x5;
	private javax.swing.JLabel torre1x6;
	private javax.swing.JLabel torre2x1;
	private javax.swing.JLabel torre2x2;
	private javax.swing.JLabel torre2x3;
	private javax.swing.JLabel torre2x4;
	private javax.swing.JLabel torre2x5;
	private javax.swing.JLabel torre2x6;
	private javax.swing.JLabel torre3x1;
	private javax.swing.JLabel torre3x2;
	private javax.swing.JLabel torre3x3;
	private javax.swing.JLabel torre3x4;
	private javax.swing.JLabel torre3x5;
	private javax.swing.JLabel torre3x6;
	private javax.swing.JPanel tudo;

	public javax.swing.JLabel getCompra1() {
		return compra1;
	}

	public void setCompra1(javax.swing.JLabel compra1) {
		this.compra1 = compra1;
	}

	public javax.swing.JLabel getCompra2() {
		return compra2;
	}

	public void setCompra2(javax.swing.JLabel compra2) {
		this.compra2 = compra2;
	}

	public javax.swing.JLabel getCompra3() {
		return compra3;
	}

	public void setCompra3(javax.swing.JLabel compra3) {
		this.compra3 = compra3;
	}

	public javax.swing.JLabel getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase.setText("Fase " + fase);
	}

	public javax.swing.JLabel getFundo() {
		return fundo;
	}

	public void setFundo(javax.swing.JLabel fundo) {
		this.fundo = fundo;
	}

	public javax.swing.JLabel getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold.setText(Integer.toString(gold));
	}

	public javax.swing.JLabel getJogador() {
		return jogador;
	}

	public void setJogador(javax.swing.JLabel jogador) {
		this.jogador = jogador;
	}

	public javax.swing.JLabel getPreco1() {
		return preco1;
	}

	public void setPreco1(javax.swing.JLabel preco1) {
		this.preco1 = preco1;
	}

	public javax.swing.JLabel getPreco2() {
		return preco2;
	}

	public void setPreco2(javax.swing.JLabel preco2) {
		this.preco2 = preco2;
	}

	public javax.swing.JLabel getPreco3() {
		return preco3;
	}

	public void setPreco3(javax.swing.JLabel preco3) {
		this.preco3 = preco3;
	}

	public Pintor getCampo() {
		return campo;
	}

	public void setCampo(Pintor campo) {
		this.campo = campo;
	}

	public javax.swing.JLabel getTorre(int linha, int coluna) {
		switch (linha) {
		case 1:
			switch (coluna) {
			case 1:
				return torre1x1;
			case 2:
				return torre1x2;
			case 3:
				return torre1x3;
			case 4:
				return torre1x4;
			case 5:
				return torre1x5;
			case 6:
				return torre1x6;
			default:
				return null;
			}
		case 2:
			switch (coluna) {
			case 1:
				return torre2x1;
			case 2:
				return torre2x2;
			case 3:
				return torre2x3;
			case 4:
				return torre2x4;
			case 5:
				return torre2x5;
			case 6:
				return torre2x6;
			default:
				return null;
			}
		case 3:
			switch (coluna) {
			case 1:
				return torre3x1;
			case 2:
				return torre3x2;
			case 3:
				return torre3x3;
			case 4:
				return torre3x4;
			case 5:
				return torre3x5;
			case 6:
				return torre3x6;
			default:
				return null;
			}
		default:
			return null;
		}
	}

	public void setTorre(int torre, int linha, int coluna) {
		switch (torre) {
		case 0:
			getTorre(linha, coluna).setIcon(null);
			break;
		case 1:
			getTorre(linha, coluna).setIcon(new ImageIcon("src/imagens/Torre1.png"));
			break;
		case 2:
			getTorre(linha, coluna).setIcon(new ImageIcon("src/imagens/Torre2.png"));
			break;
		case 3:
			getTorre(linha, coluna).setIcon(new ImageIcon("src/imagens/Torre3.png"));
			break;
		}
	}

}
