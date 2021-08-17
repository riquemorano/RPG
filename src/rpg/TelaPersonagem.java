
import java.util.Random;
import javax.swing.JOptionPane;

public class TelaPersonagem extends javax.swing.JFrame {

    byte num, lados;
    String[] opcao = {"Sim", "Não"};
    Random random = new Random();
    String nomej[] = new String[21];
    String nomep[] = new String[21];
    String raca[] = new String[21];
    String classe[] = new String[21];
    String arma[] = new String[21];
    int forca[] = new int[21];
    int agilidade[] = new int[21];
    int destreza[] = new int[21];
    int constituicao[] = new int[21];
    int sabedoria[] = new int[21];
    int inteligencia[] = new int[21];
    int percepcao[] = new int[21];
    int carisma[] = new int[21];

    public TelaPersonagem() {
        initComponents();

    }

    public void habilitarEdicao() {
        txtNomeJ.setEditable(true);
        txtNomeP.setEditable(true);
        txtRaca.setEditable(true);
        txtClasse.setEditable(true);
        txtArma.setEditable(true);

        txtFor.setEditable(true);
        txtAgi.setEditable(true);
        txtDes.setEditable(true);
        txtCon.setEditable(true);
        txtSab.setEditable(true);
        txtInt.setEditable(true);
        txtPer.setEditable(true);
        txtCar.setEditable(true);
    }

    public void desabilitarEdicao() {
        txtNomeJ.setEditable(false);
        txtNomeP.setEditable(false);
        txtRaca.setEditable(false);
        txtClasse.setEditable(false);
        txtArma.setEditable(false);

        txtFor.setEditable(false);
        txtAgi.setEditable(false);
        txtDes.setEditable(false);
        txtCon.setEditable(false);
        txtSab.setEditable(false);
        txtInt.setEditable(false);
        txtPer.setEditable(false);
        txtCar.setEditable(false);
    }

    public void limparPersonagem() {

        txtNumeroP.setText("");
        txtNomeJ.setText("");
        txtNomeP.setText("");
        txtRaca.setText("");
        txtClasse.setText("");
        txtArma.setText("");

        txtFor.setText("");
        txtAgi.setText("");
        txtDes.setText("");
        txtCon.setText("");
        txtSab.setText("");
        txtInt.setText("");
        txtPer.setText("");
        txtCar.setText("");
    }

    public void salvarPersonagem() {

        nomej[num] = txtNomeJ.getText();
        nomep[num] = txtNomeP.getText();
        raca[num] = txtRaca.getText();
        classe[num] = txtClasse.getText();
        arma[num] = txtArma.getText();

    }

    public void vizualizarPersonagem() {

        txtNomeJ.setText(nomej[num]);
        txtNomeP.setText(nomep[num]);
        txtRaca.setText(raca[num]);
        txtClasse.setText(classe[num]);
        txtArma.setText(arma[num]);

    }

    public void vizualizarAtributos() {
        txtFor.setText(String.valueOf(forca[num]));
        txtAgi.setText(String.valueOf(agilidade[num]));
        txtDes.setText(String.valueOf(destreza[num]));
        txtCon.setText(String.valueOf(constituicao[num]));
        txtSab.setText(String.valueOf(sabedoria[num]));
        txtInt.setText(String.valueOf(inteligencia[num]));
        txtPer.setText(String.valueOf(percepcao[num]));
        txtCar.setText(String.valueOf(carisma[num]));
    }

    public void visualizarListaPersonagem() {

        txtNumeroP.setText(String.valueOf(lstPersonagens.getSelectedIndex() + 1));
        txtNomeJ.setText(nomej[lstPersonagens.getSelectedIndex() + 1]);
        txtNomeP.setText(nomep[lstPersonagens.getSelectedIndex() + 1]);
        txtRaca.setText(raca[lstPersonagens.getSelectedIndex() + 1]);
        txtClasse.setText(classe[lstPersonagens.getSelectedIndex() + 1]);
        txtArma.setText(arma[lstPersonagens.getSelectedIndex() + 1]);
    }

    public void visualizarListaAtributos() {
        txtFor.setText(String.valueOf(forca[lstPersonagens.getSelectedIndex() + 1]));
        txtAgi.setText(String.valueOf(agilidade[lstPersonagens.getSelectedIndex() + 1]));
        txtDes.setText(String.valueOf(destreza[lstPersonagens.getSelectedIndex() + 1]));
        txtCon.setText(String.valueOf(constituicao[lstPersonagens.getSelectedIndex() + 1]));
        txtSab.setText(String.valueOf(sabedoria[lstPersonagens.getSelectedIndex()+ 1]));
        txtInt.setText(String.valueOf(inteligencia[lstPersonagens.getSelectedIndex() + 1]));
        txtPer.setText(String.valueOf(percepcao[lstPersonagens.getSelectedIndex() + 1]));
        txtCar.setText(String.valueOf(carisma[lstPersonagens.getSelectedIndex() + 1]));
    }

    public void calcularAtributos() {
        checarPersonagem();
        lados = Byte.parseByte(cxcLados.getSelectedItem().toString());
        forca[num] = random.nextInt(lados) + 1;
        agilidade[num] = random.nextInt(lados) + 1;
        destreza[num] = random.nextInt(lados) + 1;
        constituicao[num] = random.nextInt(lados) + 1;
        sabedoria[num] = random.nextInt(lados) + 1;
        inteligencia[num] = random.nextInt(lados) + 1;
        percepcao[num] = random.nextInt(lados) + 1;
        carisma[num] = random.nextInt(lados) + 1;
    }

    public void salvarAtributos() {
        forca[num] = Integer.parseInt(txtFor.getText());
        agilidade[num] = Integer.parseInt(txtAgi.getText());
        destreza[num] = Integer.parseInt(txtDes.getText());
        constituicao[num] = Integer.parseInt(txtCon.getText());
        sabedoria[num] = Integer.parseInt(txtSab.getText());
        inteligencia[num] = Integer.parseInt(txtInt.getText());
        percepcao[num] = Integer.parseInt(txtPer.getText());
        carisma[num] = Integer.parseInt(txtCar.getText());
    }

    public void checarPersonagem() {
        num = Byte.parseByte(txtNumeroP.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JTextField();
        txtNomeJ = new javax.swing.JTextField();
        txtRaca = new javax.swing.JTextField();
        txtClasse = new javax.swing.JTextField();
        txtArma = new javax.swing.JTextField();
        btnVisualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtNumeroP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCalcularAtributos = new javax.swing.JButton();
        txtFor = new javax.swing.JTextField();
        txtAgi = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        txtCar = new javax.swing.JTextField();
        txtPer = new javax.swing.JTextField();
        txtSab = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        txtInt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cxcLados = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersonagens = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personagem");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel2.setText("Nome do Jogador");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setText("Nome da Personagem");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setText("Raça");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setText("Classe");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel6.setText("Arma");

        txtNomeJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeJActionPerformed(evt);
            }
        });

        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });

        btnVisualizar.setBackground(new java.awt.Color(0, 255, 255));
        btnVisualizar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 255, 255));
        btnEditar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel16.setText("Número:");

        txtNumeroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16)
                            .addComponent(txtNumeroP, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVisualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomeJ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtArma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnEditar)
                    .addComponent(btnLimpar))
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel7.setText("Atributos");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel8.setText("FOR");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel9.setText("DES");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel10.setText("AGI");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel11.setText("INT");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel12.setText("CON");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel13.setText("SAB");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel14.setText("PER");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel15.setText("CAR");

        btnCalcularAtributos.setBackground(new java.awt.Color(0, 255, 255));
        btnCalcularAtributos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnCalcularAtributos.setText("Calcular Atributos");
        btnCalcularAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAtributosActionPerformed(evt);
            }
        });

        txtFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtForActionPerformed(evt);
            }
        });

        txtAgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel17.setText("Dado");

        cxcLados.setEditable(true);
        cxcLados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8", "10", "12", "20", "30", "100" }));
        cxcLados.setSelectedIndex(6);
        cxcLados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxcLadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(btnCalcularAtributos)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxcLados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(cxcLados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtFor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txtCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtSab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnCalcularAtributos)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        lstPersonagens.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lstPersonagens.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jogador 1", "Jogador 2", "Jogador 3", "Jogador 4", "Jogador 5", "Jogador 6", "Jogador 7", "Jogador 8", "Jogador 9", "Jogador 10", "Jogador 11", "Jogador 12", "Jogador 13", "Jogador 14", "Jogador 15", "Jogador 16", "Jogador 17", "Jogador 18", "Jogador 19", "Jogador 20" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPersonagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPersonagensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPersonagens);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel18.setText("Selecionar Jogador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeJActionPerformed

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRacaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNumeroP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Número do Personagem");

        } else if (txtNomeJ.getText().isEmpty() && txtNomeP.getText().isEmpty() && txtRaca.getText().isEmpty() && txtClasse.getText().isEmpty() && txtArma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vazios");

        } else {
            if (txtFor.getText().isEmpty() && txtAgi.getText().isEmpty() && txtDes.getText().isEmpty() && txtCon.getText().isEmpty() && txtSab.getText().isEmpty() && txtInt.getText().isEmpty() && txtPer.getText().isEmpty() && txtCar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Calcule os Atributos");
            } else if (txtFor.getText().equals("0") && txtAgi.getText().equals("0") && txtDes.getText().equals("0") && txtCon.getText().equals("0") && txtSab.getText().equals("0") && txtInt.getText().equals("0") && txtPer.getText().equals("0") && txtCar.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Calcule os Atributos");
            } else {
                if (JOptionPane.showOptionDialog(null, "Confirma Gravação?", "Personagem", 1, 3, null, opcao, opcao[0]) == 0) {
                    checarPersonagem();
                    salvarPersonagem();
                    salvarAtributos();
                    limparPersonagem();

                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtForActionPerformed

    private void txtNumeroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed

        if (txtNumeroP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Número do Personagem");
        } else {
            checarPersonagem();
            if (forca[num] <= 0) {
                JOptionPane.showMessageDialog(null, "Pesonagem não encontrado");
            } else {
                checarPersonagem();
                vizualizarPersonagem();
                vizualizarAtributos();
                desabilitarEdicao();
            }
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparPersonagem();
        habilitarEdicao();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAtributosActionPerformed
        calcularAtributos();
        vizualizarAtributos();
    }//GEN-LAST:event_btnCalcularAtributosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarEdicao();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cxcLadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxcLadosActionPerformed

    }//GEN-LAST:event_cxcLadosActionPerformed

    private void txtAgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgiActionPerformed

    private void lstPersonagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPersonagensMouseClicked
        visualizarListaPersonagem();
        visualizarListaAtributos();

    }//GEN-LAST:event_lstPersonagensMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularAtributos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cxcLados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstPersonagens;
    private javax.swing.JTextField txtAgi;
    private javax.swing.JTextField txtArma;
    private javax.swing.JTextField txtCar;
    private javax.swing.JTextField txtClasse;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtFor;
    private javax.swing.JTextField txtInt;
    private javax.swing.JTextField txtNomeJ;
    private javax.swing.JTextField txtNomeP;
    private javax.swing.JTextField txtNumeroP;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JTextField txtSab;
    // End of variables declaration//GEN-END:variables
}
