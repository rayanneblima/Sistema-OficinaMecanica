package gui;

import classes.Client;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ClientForm extends javax.swing.JFrame {

    List<Client> list;
    Client clientEditing;

    public ClientForm() {
        this.list = new ArrayList<>();
        this.clientEditing = null;
        
        initComponents();
        try {
            MaskFormatter maskTel = new MaskFormatter("(##) #####-####");
            MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
            MaskFormatter maskCpf2 = new MaskFormatter("###.###.###-##");
            
            maskTel.install(ftxtTel);
            maskCpf.install(ftxtCpf);
            maskCpf2.install(ftxtSearch);
        } catch(ParseException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.enableFields(false);
        this.clearFields();
        txtListing.setEnabled(false);
    }

    public void enableFields(boolean flag) {
        for(int i = 0; i < pnlInputs.getComponents().length; i++){
            pnlInputs.getComponent(i).setEnabled(flag);
        }
    }
    
    public void clearFields() {
        txtName.setText("");
        ftxtCpf.setText("");
        ftxtTel.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtVehicles.setText("");
    }
    
    public void fieldsToObject() {
        Client c = new Client();
        
        c.setName(txtName.getText());
        c.setCpf(ftxtCpf.getText());
        c.setTel(ftxtTel.getText());
        c.setEmail(txtEmail.getText());
        c.setAddress(txtAddress.getText());
        c.setVehicles(txtVehicles.getText());       
        
        list.add(c);
    }
    
    public void objectToFields(Client c) {        
        txtName.setText(c.getName());
        ftxtCpf.setText(c.getCpf());
        ftxtTel.setText(c.getTel());
        txtEmail.setText(c.getEmail());
        txtAddress.setText(c.getAddress());
        txtVehicles.setText(c.getVehicles()); 
    }
    
    public String printClientList() {
        String totalList = "";
        for(int i = 0; i < list.size(); i++) {
            totalList = totalList + list.get(i).printClientToString();
        }
        return totalList;
    }
    
    public Client searchClient(String code) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getCpf().equals(code)) return list.get(i);
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblOutput = new javax.swing.JLabel();
        scpOutput = new javax.swing.JScrollPane();
        txtListing = new javax.swing.JTextArea();
        pnlInputs = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        scpVehicles = new javax.swing.JScrollPane();
        txtVehicles = new javax.swing.JTextArea();
        lblVehicles = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        ftxtTel = new javax.swing.JFormattedTextField();
        ftxtCpf = new javax.swing.JFormattedTextField();
        ftxtSearch = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(674, 633));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setText("Cadastro de Cliente");

        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\search.png")); // NOI18N
        btnSearch.setIconTextGap(0);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\add.png")); // NOI18N
        btnNew.setText("Novo");
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\edit.png")); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setMaximumSize(new java.awt.Dimension(89, 33));
        btnEdit.setMinimumSize(new java.awt.Dimension(89, 33));
        btnEdit.setPreferredSize(new java.awt.Dimension(89, 33));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\delete.png")); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setMaximumSize(new java.awt.Dimension(89, 33));
        btnDelete.setMinimumSize(new java.awt.Dimension(89, 33));
        btnDelete.setPreferredSize(new java.awt.Dimension(89, 33));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        BtnCancel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnCancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\cancel.png")); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancel.setMaximumSize(new java.awt.Dimension(89, 33));
        BtnCancel.setMinimumSize(new java.awt.Dimension(89, 33));
        BtnCancel.setPreferredSize(new java.awt.Dimension(89, 33));
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\save.png")); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setMaximumSize(new java.awt.Dimension(89, 33));
        btnSave.setMinimumSize(new java.awt.Dimension(89, 33));
        btnSave.setPreferredSize(new java.awt.Dimension(89, 33));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblOutput.setText("Output:");

        txtListing.setColumns(20);
        txtListing.setRows(5);
        scpOutput.setViewportView(txtListing);

        pnlInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        lblName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblName.setText("Nome Completo:");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddress.setText("Endereço Completo:");

        txtVehicles.setColumns(20);
        txtVehicles.setRows(5);
        scpVehicles.setViewportView(txtVehicles);

        lblVehicles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVehicles.setText("Veículos:");

        lblCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCPF.setText("CPF:");

        lblTel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTel.setText("Telefone / Whatsapp:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout pnlInputsLayout = new javax.swing.GroupLayout(pnlInputs);
        pnlInputs.setLayout(pnlInputsLayout);
        pnlInputsLayout.setHorizontalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblVehicles)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scpVehicles, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputsLayout.createSequentialGroup()
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInputsLayout.createSequentialGroup()
                                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAddress))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlInputsLayout.createSequentialGroup()
                                                .addComponent(lblCPF)
                                                .addGap(149, 149, 149))
                                            .addComponent(ftxtCpf)))
                                    .addComponent(txtAddress))
                                .addGap(18, 18, 18)
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTel)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(ftxtTel))))
                        .addGap(20, 20, 20))))
        );
        pnlInputsLayout.setVerticalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblVehicles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ftxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOutput)
                                    .addComponent(scpOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlInputs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ftxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pnlInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnCancel, btnDelete, btnEdit, btnNew, btnSave});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String chosenCpf = ftxtSearch.getText();
        Client c = this.searchClient(chosenCpf);
        
        if(chosenCpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O CPF não foi informado!");
            txtListing.setText(this.printClientList());
        }
        else if(c == null) {
            JOptionPane.showMessageDialog(this, "Não existe cliente para o CPF informado!");
            txtListing.setText(this.printClientList());
        } else {
            ftxtSearch.setText("");
            txtListing.setText("******** Resultado da Pesquisa *********\n" 
                                + c.printClientToString()
                                + "******** Lista de Clientes*********\n"
                                + this.printClientList());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.enableFields(true);
        this.clearFields();
        txtName.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String chosenCode = JOptionPane.showInputDialog("Informe o cpf do cliente que deseja editar", "");
        
        this.clientEditing = this.searchClient(chosenCode);
        
        if(clientEditing == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado um cliente para o cpf informado.");
        } else {
            this.clearFields();
            this.enableFields(true);
            this.objectToFields(clientEditing);
            txtName.requestFocus();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String chosenCode = JOptionPane.showInputDialog("Informe o cpf do cliente que deseja excluir", "");
        
        Client c = this.searchClient(chosenCode);
        
        if(c == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado um cliente para o cpf informado.");
        } else {
            int i = JOptionPane.showConfirmDialog(this, "O cliente foi encontrado. Deseja realmente excluir?");
            if(i == JOptionPane.YES_OPTION) {
                list.remove(c);
                JOptionPane.showMessageDialog(this, "O cliente foi excluído com sucesso.");
            }else {
                JOptionPane.showMessageDialog(this, "Exclusão cancelada.");
            }
        }
        txtListing.setText(this.printClientList());        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.clearFields();
        this.enableFields(false);
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(this.clientEditing == null) { // inserindo novo cliente
            this.fieldsToObject(); 
        } else { // salvando um cliente que foi alterado
            this.list.remove(this.clientEditing);
            this.fieldsToObject();       
        }
              
        this.clearFields();
        this.enableFields(false);
        
        JOptionPane.showMessageDialog(this, "O cliente foi salvo com sucesso.");
        txtListing.setText(this.printClientList());
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JFormattedTextField ftxtSearch;
    private javax.swing.JFormattedTextField ftxtTel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblVehicles;
    private javax.swing.JPanel pnlInputs;
    private javax.swing.JScrollPane scpOutput;
    private javax.swing.JScrollPane scpVehicles;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtListing;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtVehicles;
    // End of variables declaration//GEN-END:variables
}
