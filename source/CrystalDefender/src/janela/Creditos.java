package janela;

public class Creditos extends javax.swing.JFrame {

	public Creditos() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		logo = new javax.swing.JLabel();
		voltar = new javax.swing.JButton();
		pallet = new javax.swing.JLabel();
		code = new javax.swing.JLabel();
		music_note = new javax.swing.JLabel();
		natalia = new javax.swing.JLabel();
		dan = new javax.swing.JLabel();
		bg = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Créditos");
		setPreferredSize(new java.awt.Dimension(1000, 700));
		setResizable(false);
		getContentPane().setLayout(null);

		logo.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/logo.png"));
		getContentPane().add(logo);
		logo.setBounds(330, 50, 328, 87);

		voltar.setIcon(new javax.swing.ImageIcon("src/resources/img/common/back.png"));
		voltar.setBorderPainted(false);
		voltar.setContentAreaFilled(false);
		voltar.setDefaultCapable(false);
		voltar.setFocusPainted(false);
		voltar.setFocusable(false);
		voltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				voltarActionPerformed(evt);
			}
		});
		getContentPane().add(voltar);
		voltar.setBounds(20, 530, 130, 110);

		pallet.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/pallet.png"));
		getContentPane().add(pallet);
		pallet.setBounds(250, 130, 150, 180);

		code.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/code.png"));
		getContentPane().add(code);
		code.setBounds(590, 150, 140, 160);

		music_note.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/music_note.png"));
		getContentPane().add(music_note);
		music_note.setBounds(410, 220, 160, 140);

		natalia.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/natalia.png"));
		getContentPane().add(natalia);
		natalia.setBounds(310, 460, 380, 60);

		dan.setIcon(new javax.swing.ImageIcon("src/resources/img/credits/dan.png"));
		getContentPane().add(dan);
		dan.setBounds(330, 390, 330, 60);

		bg.setIcon(new javax.swing.ImageIcon("src/resources/img/common/bg.jpg"));
		getContentPane().add(bg);
		bg.setBounds(0, 0, 1000, 700);

		pack();
		setLocationRelativeTo(null);
	}

	private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		new Inicial().setVisible(true);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Creditos().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel bg;
	private javax.swing.JLabel code;
	private javax.swing.JLabel dan;
	private javax.swing.JLabel logo;
	private javax.swing.JLabel music_note;
	private javax.swing.JLabel natalia;
	private javax.swing.JLabel pallet;
	private javax.swing.JButton voltar;
}
