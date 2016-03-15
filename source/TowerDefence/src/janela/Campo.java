package janela;

public class Campo extends javax.swing.JFrame {

    public Campo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        compra1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        compra2 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        compra3 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        jogador = new javax.swing.JLabel();
        fase = new javax.swing.JLabel();
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

        compra1.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(compra1);
        compra1.setBounds(30, 30, 120, 120);

        preco1.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
        getContentPane().add(preco1);
        preco1.setBounds(30, 160, 120, 50);

        compra2.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(compra2);
        compra2.setBounds(190, 30, 120, 120);

        preco2.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
        getContentPane().add(preco2);
        preco2.setBounds(190, 160, 120, 50);

        compra3.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(compra3);
        compra3.setBounds(350, 30, 120, 120);

        preco3.setIcon(new javax.swing.ImageIcon("src/imagens/Preco.png")); // NOI18N
        getContentPane().add(preco3);
        preco3.setBounds(350, 160, 120, 50);

        gold.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        gold.setText("500");
        getContentPane().add(gold);
        gold.setBounds(600, 90, 60, 50);

        jogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador.setText("Fulano");
        getContentPane().add(jogador);
        jogador.setBounds(770, 50, 170, 50);

        fase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fase.setText("Fase 1");
        getContentPane().add(fase);
        fase.setBounds(770, 140, 170, 50);

        torre1x1.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x1);
        torre1x1.setBounds(160, 260, 120, 120);

        torre1x2.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x2);
        torre1x2.setBounds(300, 260, 120, 120);

        torre1x3.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x3);
        torre1x3.setBounds(440, 260, 120, 120);

        torre1x4.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x4);
        torre1x4.setBounds(580, 260, 120, 120);

        torre1x5.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x5);
        torre1x5.setBounds(720, 260, 120, 120);

        torre1x6.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre1x6);
        torre1x6.setBounds(860, 260, 120, 120);

        torre2x1.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x1);
        torre2x1.setBounds(160, 400, 120, 120);

        torre2x2.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x2);
        torre2x2.setBounds(300, 400, 120, 120);

        torre2x3.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x3);
        torre2x3.setBounds(440, 400, 120, 120);

        torre2x4.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x4);
        torre2x4.setBounds(580, 400, 120, 120);

        torre2x5.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x5);
        torre2x5.setBounds(720, 400, 120, 120);

        torre2x6.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre2x6);
        torre2x6.setBounds(860, 400, 120, 120);

        torre3x1.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x1);
        torre3x1.setBounds(160, 540, 120, 120);

        torre3x2.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x2);
        torre3x2.setBounds(300, 540, 120, 120);

        torre3x3.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x3);
        torre3x3.setBounds(440, 540, 120, 120);

        torre3x4.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x4);
        torre3x4.setBounds(580, 540, 120, 120);

        torre3x5.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x5);
        torre3x5.setBounds(720, 540, 120, 120);

        torre3x6.setIcon(new javax.swing.ImageIcon("src/imagens/Torre.png")); // NOI18N
        getContentPane().add(torre3x6);
        torre3x6.setBounds(860, 540, 120, 120);

        fundo.setIcon(new javax.swing.ImageIcon("src/imagens/Fundo.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1000, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
