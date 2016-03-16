package janela;

public class Inicial extends javax.swing.JFrame {

	public Inicial() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		logo = new javax.swing.JLabel();
		crystal = new javax.swing.JLabel();
		settings = new javax.swing.JButton();
		close = new javax.swing.JButton();
		play = new javax.swing.JButton();
		credits = new javax.swing.JButton();
		bg = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inicial Inicial");
		setPreferredSize(new java.awt.Dimension(1000, 700));
		setResizable(false);
		getContentPane().setLayout(null);

		logo.setIcon(new javax.swing.ImageIcon("src/resources/img/init/logo.png"));
		getContentPane().add(logo);
		logo.setBounds(180, 20, 650, 80);

		crystal.setIcon(new javax.swing.ImageIcon("src/resources/img/init/crystal.png"));
		getContentPane().add(crystal);
		crystal.setBounds(780, 10, 120, 120);

		settings.setIcon(new javax.swing.ImageIcon("src/resources/img/init/settings.png"));
		settings.setBorderPainted(false);
		settings.setContentAreaFilled(false);
		settings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		settings.setFocusPainted(false);
		settings.setFocusable(false);
		settings.setOpaque(false);
		settings.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				settingsActionPerformed(evt);
			}
		});
		getContentPane().add(settings);
		settings.setBounds(350, 280, 290, 70);

		close.setIcon(new javax.swing.ImageIcon("src/resources/img/init/close.png"));
		close.setBorderPainted(false);
		close.setContentAreaFilled(false);
		close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		close.setFocusPainted(false);
		close.setFocusable(false);
		close.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeActionPerformed(evt);
			}
		});
		getContentPane().add(close);
		close.setBounds(380, 500, 250, 70);

		play.setIcon(new javax.swing.ImageIcon("src/resources/img/init/play.png"));
		play.setBorderPainted(false);
		play.setContentAreaFilled(false);
		play.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		play.setFocusPainted(false);
		play.setFocusable(false);
		play.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				playActionPerformed(evt);
			}
		});
		getContentPane().add(play);
		play.setBounds(370, 160, 250, 70);

		credits.setIcon(new javax.swing.ImageIcon("src/resources/img/init/credits.png"));
		credits.setBorderPainted(false);
		credits.setContentAreaFilled(false);
		credits.setDefaultCapable(false);
		credits.setFocusPainted(false);
		credits.setFocusable(false);
		credits.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				creditsActionPerformed(evt);
			}
		});
		getContentPane().add(credits);
		credits.setBounds(350, 390, 290, 70);

		bg.setIcon(new javax.swing.ImageIcon("src/resources/img/common/bg.jpg"));
		getContentPane().add(bg);
		bg.setBounds(0, 0, 1000, 700);

		pack();
		setLocationRelativeTo(null);
	}

	private void closeActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void settingsActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		new Ajustes().setVisible(true);
	}

	private void creditsActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		new Creditos().setVisible(true);
	}

	private void playActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		Jogo.iniciar();
	}

	public static void iniciar() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Inicial().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel bg;
	private javax.swing.JButton close;
	private javax.swing.JButton credits;
	private javax.swing.JLabel crystal;
	private javax.swing.JLabel logo;
	private javax.swing.JButton play;
	private javax.swing.JButton settings;
}
