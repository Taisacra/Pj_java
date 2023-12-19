package Pk_LojaCarros;

public class Tela_CarroPersonalizado extends javax.swing.JFrame {

   
    public Tela_CarroPersonalizado() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnselecionado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();
        rbtnCarro1 = new javax.swing.JRadioButton();
        rbtnCarro2 = new javax.swing.JRadioButton();
        rbtnCarro3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setText("Carro Personalizado");

        btnSair.setBackground(new java.awt.Color(0, 153, 102));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnRetornar.setBackground(new java.awt.Color(0, 153, 102));
        btnRetornar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetornar.setText("Retornar...");
        btnRetornar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        btnselecionado.add(rbtnCarro1);
        rbtnCarro1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        rbtnCarro1.setForeground(new java.awt.Color(204, 204, 204));
        rbtnCarro1.setText("Renault Kwid Zen");
        rbtnCarro1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        rbtnCarro1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbtnCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCarro1ActionPerformed(evt);
            }
        });

        btnselecionado.add(rbtnCarro2);
        rbtnCarro2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        rbtnCarro2.setForeground(new java.awt.Color(204, 204, 204));
        rbtnCarro2.setText("Fiat C3 Live");

        btnselecionado.add(rbtnCarro3);
        rbtnCarro3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        rbtnCarro3.setForeground(new java.awt.Color(204, 204, 204));
        rbtnCarro3.setText("Peugeot 208 Like");
        rbtnCarro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCarro3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Escolha o modelo:");

        btnContinuar.setBackground(new java.awt.Color(102, 102, 102));
        btnContinuar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(rbtnCarro2)
                                .addComponent(rbtnCarro3)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rbtnCarro1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnRetornar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(rbtnCarro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnCarro3)
                .addGap(12, 12, 12)
                .addComponent(rbtnCarro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnRetornar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        Tela_Inicial tela_inicial = new Tela_Inicial();
        tela_inicial.setVisible(true);
        Tela_CarroPersonalizado.this.setVisible(false);
    
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void rbtnCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCarro1ActionPerformed
       
    }//GEN-LAST:event_rbtnCarro1ActionPerformed

    private void rbtnCarro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCarro3ActionPerformed

    }//GEN-LAST:event_rbtnCarro3ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     
     
        Carro meuCarro = new Carro();
        
        
        Personalizar1 personalizar1 = new Personalizar1();
      
        if(rbtnCarro1.isSelected()){
          String nome1 = "Renault Kwid Zen";
          meuCarro.setNome(nome1);
          //personalizar1.lblCarro2.setText(nome1);
        }
        if(rbtnCarro1.isSelected()){
          String nome1 = "Peugeot 208 Like";
          meuCarro.setNome(nome1);
          //personalizar1.lblCarro2.setText(nome1);
        }
        if(rbtnCarro1.isSelected()){
          String nome1 = "Fiat C3 Live";
          meuCarro.setNome(nome1);
          //personalizar1.lblCarro2.setText(nome1);
        }
        personalizar1.pegarNome(meuCarro);
        
       
        personalizar1.setVisible(true);
        Tela_CarroPersonalizado.this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_CarroPersonalizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup btnselecionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnCarro1;
    private javax.swing.JRadioButton rbtnCarro2;
    private javax.swing.JRadioButton rbtnCarro3;
    // End of variables declaration//GEN-END:variables
}
