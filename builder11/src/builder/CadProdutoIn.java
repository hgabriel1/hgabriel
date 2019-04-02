package builder;

public class CadProdutoIn extends javax.swing.JFrame {

    public CadProdutoIn() {
        initComponents();
        painelCarteira.setVisible(false);
        painelRoupa.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        corProd = new javax.swing.JTextField();
        painelRoupa = new javax.swing.JPanel();
        tamanho = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        painelCarteira = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        materialCarteira = new javax.swing.JComboBox<>();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exibeRetorno = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Produto")));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sapato", "Carteira", "Roupa" }));
        comboTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboTipoMouseClicked(evt);
            }
        });
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo");

        jLabel2.setText("Nome");

        jLabel3.setText("Valor");

        jLabel4.setText("Cor");

        tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG" }));

        jLabel5.setText("Tamanho");

        javax.swing.GroupLayout painelRoupaLayout = new javax.swing.GroupLayout(painelRoupa);
        painelRoupa.setLayout(painelRoupaLayout);
        painelRoupaLayout.setHorizontalGroup(
            painelRoupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRoupaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        painelRoupaLayout.setVerticalGroup(
            painelRoupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRoupaLayout.createSequentialGroup()
                .addGroup(painelRoupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jLabel6.setText("Material");

        materialCarteira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Couro", "Generico" }));

        javax.swing.GroupLayout painelCarteiraLayout = new javax.swing.GroupLayout(painelCarteira);
        painelCarteira.setLayout(painelCarteiraLayout);
        painelCarteiraLayout.setHorizontalGroup(
            painelCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarteiraLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(56, 56, 56)
                .addComponent(materialCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );
        painelCarteiraLayout.setVerticalGroup(
            painelCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarteiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(materialCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });

        exibeRetorno.setColumns(20);
        exibeRetorno.setRows(5);
        jScrollPane1.setViewportView(exibeRetorno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(painelRoupa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(72, 72, 72))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(63, 63, 63))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(jLabel4)
                                            .addGap(70, 70, 70)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(valorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(corProd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(21, 21, 21)))
                            .addComponent(painelCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastrar))
                        .addContainerGap(67, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(corProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelRoupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
        System.out.println(comboTipo.getSelectedItem().toString());
        Cadastro cad = new Cadastro();
        Produto base = new Produto();

        base.setNome(nomeProd.getText());
        base.setValor(Double.parseDouble(valorProd.getText()));
        base.setCor(corProd.getText());
        if (comboTipo.getSelectedItem().toString().equals("Sapato")) {
            Sapato prod = new Sapato();
            base.setTipo("Sapato");
            base.setMaterial("");
            cad.Cadastrar(prod, base);
            exibeRetorno.append(prod.getProd().getNome());
        } else if ((comboTipo.getSelectedItem().toString().equals("Carteira"))) {
            painelCarteira.setVisible(true);
            Carteira prod = new Carteira();
            base.setTipo("Carteira");
            base.setMaterial(materialCarteira.getSelectedItem().toString());
            cad.Cadastrar(prod, base);
        } else if ((comboTipo.getSelectedItem().toString().equals("Roupa"))) {
            painelRoupa.setVisible(true);
            Roupa prod = new Roupa();
            base.setTipo("Roupa");
            cad.Cadastrar(prod, base);
        }


    }//GEN-LAST:event_botaoCadastrarMouseClicked

    private void comboTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboTipoMouseClicked

    }//GEN-LAST:event_comboTipoMouseClicked

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if ((comboTipo.getSelectedItem().toString().equals("Roupa"))) {
            painelCarteira.setVisible(false);
            painelRoupa.setVisible(true);

        } else if ((comboTipo.getSelectedItem().toString().equals("Carteira"))) {
            painelRoupa.setVisible(false);
            painelCarteira.setVisible(true);

        }
    }//GEN-LAST:event_comboTipoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProdutoIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JTextField corProd;
    private javax.swing.JTextArea exibeRetorno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> materialCarteira;
    private javax.swing.JTextField nomeProd;
    private javax.swing.JPanel painelCarteira;
    private javax.swing.JPanel painelRoupa;
    private javax.swing.JComboBox<String> tamanho;
    private javax.swing.JTextField valorProd;
    // End of variables declaration//GEN-END:variables
}
