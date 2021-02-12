package gui;

import classes.Product;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ProductForm extends javax.swing.JFrame {
    List<Product> list;
    Product productEditing;

    public ProductForm() {
        this.list = new ArrayList<>();
        this.productEditing = null;
        
        initComponents();
         try {
            MaskFormatter maskMoney = new MaskFormatter("R$ ######,##");
            MaskFormatter maskMoney2 = new MaskFormatter("R$ ######,##");
            
            maskMoney.install(ftxtCostPrice);
            maskMoney2.install(ftxtSalePrice);
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
        ftxtCostPrice.setText("");
        ftxtSalePrice.setText("");
        txtQuantity.setText("");
        txtCode.setText("");
        txtDescription.setText("");
    }
    
    public void fieldsToObject() {
        Product p = new Product();
        
        p.setName(txtName.getText());
        p.setCostPrice(ftxtCostPrice.getText());
        p.setSalePrice(ftxtSalePrice.getText());
        int quantity = Integer.parseInt(txtQuantity.getText());
        p.setQuantity(quantity);
        p.setCode(txtCode.getText());
        p.setDescription(txtDescription.getText());
        
        list.add(p);
    }
    
    public void objectToFields(Product p) {        
        txtName.setText(p.getName());
        ftxtCostPrice.setText(p.getCostPrice());
        ftxtSalePrice.setText(p.getSalePrice());
        String quantity = Integer.toString(p.getQuantity());
        txtQuantity.setText(quantity);
        txtCode.setText(p.getCode());
        txtDescription.setText(p.getDescription());
    }
    
    public String printProductList() {
        String totalList = "";
        for(int i = 0; i < list.size(); i++) {
            totalList = totalList + list.get(i).printProductToString();
        }
        return totalList;
    }
    
    public Product searchProduct(String code) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equals(code)) return list.get(i);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtListing = new javax.swing.JTextArea();
        lblOutput = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        pnlInputs = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblCostPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        ftxtCostPrice = new javax.swing.JFormattedTextField();
        lblSalePrice = new javax.swing.JLabel();
        ftxtSalePrice = new javax.swing.JFormattedTextField();
        BtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setText("Cadastro de Produto");

        txtListing.setColumns(20);
        txtListing.setRows(5);
        txtListing.setDisabledTextColor(new java.awt.Color(51, 102, 255));
        jScrollPane2.setViewportView(txtListing);

        lblOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblOutput.setText("Output:");

        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\search.png")); // NOI18N
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
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\delete.png")); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayanne\\Desktop\\Estudos\\IF\\2020.2\\LPS\\ERE_LPS_TAREFA1_RAYANNE\\CRUD\\src\\main\\java\\images\\save.png")); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        pnlInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        lblName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblName.setText("Nome do Produto:");

        lblCostPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCostPrice.setText("Preço de Custo:");

        lblQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblQuantity.setText("Quantidade:");

        lblCode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCode.setText("Código:");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDescription.setText("Descrição:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        ftxtCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCostPriceActionPerformed(evt);
            }
        });

        lblSalePrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSalePrice.setText("Preço de Venda:");

        javax.swing.GroupLayout pnlInputsLayout = new javax.swing.GroupLayout(pnlInputs);
        pnlInputs.setLayout(pnlInputsLayout);
        pnlInputsLayout.setHorizontalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputsLayout.createSequentialGroup()
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addGap(16, 16, 16)
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuantity)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlInputsLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblCostPrice))
                                    .addComponent(lblSalePrice)
                                    .addComponent(ftxtSalePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(ftxtCostPrice))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlInputsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCode)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        pnlInputsLayout.setVerticalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblQuantity)
                    .addComponent(lblCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblCostPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftxtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSalePrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80)
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnlInputs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOutput)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        label1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String chosenCode = txtSearch.getText();
        Product p = this.searchProduct(chosenCode);
        
        if(chosenCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Código do produto não foi informado!");
            txtListing.setText(this.printProductList());
        }
        else if(p == null) {
            JOptionPane.showMessageDialog(this, "Não existe produto para o código informado!");
            txtListing.setText(this.printProductList());
        } else {
            txtSearch.setText("");
            txtListing.setText("******** Resultado da Pesquisa *********\n" 
                                + p.printProductToString()
                                + "******** Lista de Produtos *********\n"
                                + this.printProductList());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.enableFields(true);
        this.clearFields();
        txtName.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if( !txtName.getText().equals("") &&
            !ftxtCostPrice.getText().equals("") &&
            !ftxtSalePrice.getText().equals("") &&
            !txtQuantity.getText().equals("") &&
            !txtCode.getText().equals("") &&
            !txtDescription.getText().equals("")
        ){
          if(this.productEditing == null) { // inserindo novo produto
            this.fieldsToObject(); 
          } else { // salvando um produto que foi alterado
            this.list.remove(this.productEditing);
            this.fieldsToObject();       
          }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }
        
        this.clearFields();
        this.enableFields(false);
        
        JOptionPane.showMessageDialog(this, "O produto foi salvo com sucesso.");
        txtListing.setText(this.printProductList());
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String chosenCode = JOptionPane.showInputDialog("Informe o código do produto que deseja excluir", "");
        
        Product p = this.searchProduct(chosenCode);
        
        if(p == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado um produto para o código informado.");
        } else {
            int i = JOptionPane.showConfirmDialog(this, "O produto foi encontrado. Deseja realmente excluir?");
            if(i == JOptionPane.YES_OPTION) {
                list.remove(p);
                JOptionPane.showMessageDialog(this, "O produto foi excluído com sucesso.");
            }else {
                JOptionPane.showMessageDialog(this, "Exclusão cancelada.");
            }
        }
        txtListing.setText(this.printProductList());        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String chosenCode = JOptionPane.showInputDialog("Informe o código do produto que deseja editar", "");
        
        this.productEditing = this.searchProduct(chosenCode);
        
        if(productEditing == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado um produto para o código informado.");
        } else {
            this.clearFields();
            this.enableFields(true);
            this.objectToFields(productEditing);
            txtName.requestFocus();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.clearFields();
        this.enableFields(false);
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void ftxtCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtCostPriceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JFormattedTextField ftxtCostPrice;
    private javax.swing.JFormattedTextField ftxtSalePrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblCostPrice;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalePrice;
    private javax.swing.JPanel pnlInputs;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtListing;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}