package janela;

public class Ajustes extends javax.swing.JFrame {

	public Ajustes() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		logo = new javax.swing.JLabel();
		general_label = new javax.swing.JLabel();
		general_mute = new javax.swing.JLabel();
		general_sound = new javax.swing.JLabel();
		general_control = new javax.swing.JSlider();
		general_moldure = new javax.swing.JLabel();
		music_label = new javax.swing.JLabel();
		music_mute = new javax.swing.JLabel();
		music_sound = new javax.swing.JLabel();
		music_control = new javax.swing.JSlider();
		music_moldure = new javax.swing.JLabel();
		effects_label = new javax.swing.JLabel();
		effects_mute = new javax.swing.JLabel();
		effects_sound = new javax.swing.JLabel();
		effects_control = new javax.swing.JSlider();
		effects_moldure = new javax.swing.JLabel();
		voltar = new javax.swing.JButton();
		bg = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(1000, 700));
		setResizable(false);
		getContentPane().setLayout(null);

		logo.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/logo.png"));
		getContentPane().add(logo);
		logo.setBounds(330, 50, 317, 86);

		general_label.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_general_label.png"));
		getContentPane().add(general_label);
		general_label.setBounds(60, 170, 440, 67);

		general_mute.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/mute.png"));
		getContentPane().add(general_mute);
		general_mute.setBounds(550, 170, 80, 50);

		general_sound.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound.png"));
		getContentPane().add(general_sound);
		general_sound.setBounds(850, 170, 80, 50);

		general_control.setMaximum(3);
		getContentPane().add(general_control);
		general_control.setBounds(560, 220, 360, 30);

		general_moldure.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_moldure.png"));
		getContentPane().add(general_moldure);
		general_moldure.setBounds(540, 150, 400, 110);

		music_label.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_music_label.png"));
		getContentPane().add(music_label);
		music_label.setBounds(60, 290, 440, 67);

		music_mute.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/mute.png"));
		getContentPane().add(music_mute);
		music_mute.setBounds(550, 290, 80, 50);

		music_sound.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound.png"));
		getContentPane().add(music_sound);
		music_sound.setBounds(850, 290, 80, 50);

		music_control.setMaximum(3);
		getContentPane().add(music_control);
		music_control.setBounds(560, 340, 360, 30);

		music_moldure.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_moldure.png"));
		getContentPane().add(music_moldure);
		music_moldure.setBounds(540, 270, 400, 110);

		effects_label.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_effects_label.png"));
		getContentPane().add(effects_label);
		effects_label.setBounds(60, 410, 440, 67);

		effects_mute.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/mute.png"));
		getContentPane().add(effects_mute);
		effects_mute.setBounds(550, 410, 80, 50);

		effects_sound.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound.png"));
		getContentPane().add(effects_sound);
		effects_sound.setBounds(850, 410, 80, 50);

		effects_control.setMaximum(3);
		getContentPane().add(effects_control);
		effects_control.setBounds(560, 460, 360, 30);

		effects_moldure.setIcon(new javax.swing.ImageIcon("src/resources/img/settings/sound_moldure.png"));
		getContentPane().add(effects_moldure);
		effects_moldure.setBounds(540, 390, 400, 110);

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

		bg.setIcon(new javax.swing.ImageIcon("src/resources/img/common/bg.jpg"));
		getContentPane().add(bg);
		bg.setBounds(10, 10, 1000, 700);

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
			java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Ajustes().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel bg;
	private javax.swing.JSlider effects_control;
	private javax.swing.JLabel effects_label;
	private javax.swing.JLabel effects_moldure;
	private javax.swing.JLabel effects_mute;
	private javax.swing.JLabel effects_sound;
	private javax.swing.JSlider general_control;
	private javax.swing.JLabel general_label;
	private javax.swing.JLabel general_moldure;
	private javax.swing.JLabel general_mute;
	private javax.swing.JLabel general_sound;
	private javax.swing.JLabel logo;
	private javax.swing.JSlider music_control;
	private javax.swing.JLabel music_label;
	private javax.swing.JLabel music_moldure;
	private javax.swing.JLabel music_mute;
	private javax.swing.JLabel music_sound;
	private javax.swing.JButton voltar;
}
