
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaishnavi Chavan
 */
public class Selled extends javax.swing.JFrame {

   
    public Selled() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        updateProduct();
       updateCategory();
        updateFName();
        updateLName();
        btnDelete.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        cmbProduct = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSelled = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbLName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbFName = new javax.swing.JComboBox<>();
        DateCh1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sold Products");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(51, 255, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sold Product");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Price:");

        txtPrice.setEditable(false);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtQuantity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtQuantityInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        cmbProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Product--" }));
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel8.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalMouseClicked(evt);
            }
        });
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Select Category:");

        cmbCategory.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Categories--" }));

        btnDelete.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAdd)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal)
                            .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSave.setText("Bill Receipt");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(245, 16, 16));
        lblTotal.setText("0.0");

        tbSelled.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tbSelled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selled Date", "Product Name", "Price", "Category", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSelled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSelledMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSelled);
        if (tbSelled.getColumnModel().getColumnCount() > 0) {
            tbSelled.getColumnModel().getColumn(0).setResizable(false);
            tbSelled.getColumnModel().getColumn(1).setResizable(false);
            tbSelled.getColumnModel().getColumn(2).setResizable(false);
            tbSelled.getColumnModel().getColumn(3).setResizable(false);
            tbSelled.getColumnModel().getColumn(4).setResizable(false);
            tbSelled.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Customer First Name:");

        cmbLName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbLName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select last Name--" }));
        cmbLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Contact No:");

        txtContact.setEditable(false);
        txtContact.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 255, 153));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer Details");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Select the Date:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Customer last name:");

        cmbFName.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        cmbFName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select First Name--" }));
        cmbFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFNameActionPerformed(evt);
            }
        });

        DateCh1.setToolTipText("");
        DateCh1.setDateFormatString("yyyy-MM-dd");
        DateCh1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Total of All Product is:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel excs=(DefaultTableModel)tbSelled.getModel();
        Object pname=cmbProduct.getSelectedItem();
        //to get todays date
        Date d=new Date();
       Date dat=DateCh1.getDate();
        SimpleDateFormat o5=new SimpleDateFormat("yyyy-MM-dd");
        String datej=o5.format(d);
        String get=o5.format(dat);
        
               //to check product is available in table 
               int h=0;
                for(int i=0;i<excs.getRowCount();i++)
                 {
                    String proName=excs.getValueAt(i, 1).toString();
                    if(proName==pname)
                      {
                          h=1;
                      } 
                 } 

        if(cmbFName.getSelectedIndex()==0||cmbLName.getSelectedIndex()==0)
        {
           JOptionPane.showMessageDialog(this,"Please Select Customer!!!");            
        }
          else  if(dat==null||datej.compareTo(get)!=0)
            {
               JOptionPane.showMessageDialog(this,"Please Select Todays Date!!!"); 
            }
            else if(cmbProduct.getSelectedIndex()==0||cmbCategory.getSelectedIndex()==0)
        {
           JOptionPane.showMessageDialog(this,"Please Select Product..!!!"); 
        }
        else if(txtQuantity.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Add Quantity!!!");
        }
        else if(txtTotal.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Click On Total!!!");
        }
           
        else
        {  
            
            if(h==1)
            {
                JOptionPane.showMessageDialog(this,"Please First Delete Product From Below Table Then Add It !!!");
                txtQuantity.setText("");
                txtTotal.setText("");
            }
            else
            {
                 int sum=0,num,i;
                 DefaultTableModel tb1Model=(DefaultTableModel)tbSelled.getModel();
                 num=tbSelled.getRowCount();
                 String product=cmbProduct.getSelectedItem().toString();
             
                SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
                String date=s1.format(DateCh1.getDate());
            try{
             
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                        PreparedStatement pal1; 
          
                        String str6="select * from Available where PName=? order by ADate desc";                      
                        pal1=con.prepareStatement(str6);
                        pal1.setString(1,(String) cmbProduct.getSelectedItem());
                     //pal1.setString(2,s1.format(DateCh1.getDate()));
                        ResultSet res6=pal1.executeQuery();                     
  
                  if(res6.next())
                    {
                          String p=txtQuantity.getText();
                          String quan=res6.getString("Quantity");
                          if(Integer.parseInt(quan)<Integer.parseInt(p))
                          {
                             JOptionPane.showMessageDialog(this,"Quantity is Greater Than Available..!!!"); 
                              txtTotal.setText("");
                              txtQuantity.setText("");
                          }
                          else
                          {
                               String data[]={date,(String)cmbProduct.getSelectedItem(),txtPrice.getText(),(String)cmbCategory.getSelectedItem(),txtQuantity.getText(),txtTotal.getText()};
                               //DefaultTableModel tb1Model=(DefaultTableModel)tb1.getModel();
                               tb1Model.addRow(data);
                               Double sumTable=0.00;
                               sumTable=Double.valueOf(lblTotal.getText())+Double.valueOf(txtTotal.getText());
                               lblTotal.setText(String.valueOf(sumTable));
                               JOptionPane.showMessageDialog(this,"Product Added Successfully!");
                                Clear();
                          }                      
                   }
                else
                  {
                         JOptionPane.showMessageDialog(this,"Product is Not Available!!!");
                        Clear();
                  }
                                                      
               }
           catch(Exception e)
             {
                System.out.println(e.getMessage());
             }
           }
        }        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model=(DefaultTableModel)tbSelled.getModel();

        if(tbSelled.getSelectedRowCount()==1)
        {
            if(txtPrice.getText()==" "||txtQuantity.getText()==" "||cmbProduct.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(this,"Please Select Product For Delete..!");
            }else{
                try{                  
                    int row=tbSelled.getSelectedRow();
                    String cell=tbSelled.getModel().getValueAt(row, 0).toString();                   
                    Double sumTable=0.00;
                    sumTable=Double.valueOf(lblTotal.getText())-Double.valueOf(txtTotal.getText());
                    lblTotal.setText(String.valueOf(sumTable));
                    JOptionPane.showMessageDialog(null,"Product Deleted Successfully..!");
                    tb1Model.removeRow(tbSelled.getSelectedRow());
                    Clear();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            
        }
        else
        {
            if(tbSelled.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(this,"Table is Empty..!!!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please Select Single Row for Delete..!!!!");
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalMouseClicked
        // TODO add your handling code here:
          if(txtPrice.getText()==" "&&txtQuantity.getText()==" ")
        {
            JOptionPane.showMessageDialog(this,"Please Enter Price and Qunatity..!");
        }
        else{
        int price,quantity,res;
        price=Integer.parseInt(txtPrice.getText());
        quantity=Integer.parseInt(txtQuantity.getText());
        res=price*quantity;
        txtTotal.setText(Integer.toString(res));
        
        }
    }//GEN-LAST:event_txtTotalMouseClicked

    private void cmbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductActionPerformed
        
          try{
                Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         Object s=cmbProduct.getSelectedItem();
         PreparedStatement pd;        
         pd=con.prepareStatement("select Price,Category from product where PName=?");
         pd.setString(1,s.toString());
         ResultSet rs=pd.executeQuery();
        while(rs.next())
         {
             String price=rs.getString("Price");
             Object category=rs.getString("category");
             txtPrice.setText(price);
             cmbCategory.setSelectedItem(category);
              cmbCategory.enable(false);
              txtTotal.setText("");
               txtQuantity.setText("");
         }
          }
           catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_cmbProductActionPerformed

    private void tbSelledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSelledMouseClicked
        // TODO add your handling code here:
         int  i=tbSelled.getSelectedRow();
        TableModel model=tbSelled.getModel();
        cmbProduct.setSelectedItem(model.getValueAt(i, 1));
        txtPrice.setText(model.getValueAt(i, 2).toString());
        cmbCategory.setSelectedItem(model.getValueAt(i, 3));
        txtQuantity.setText(model.getValueAt(i, 4).toString());
        txtTotal.setText(model.getValueAt(i, 5).toString());
         
         btnDelete.setEnabled(true);
         btnAdd.setEnabled(false);
    }//GEN-LAST:event_tbSelledMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        DefaultTableModel tb1Model=(DefaultTableModel)tbSelled.getModel();
        if(tb1Model.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this,"Table is Empty..!!!");
        }
        else  if(lblTotal.getText()=="0")
        {
            JOptionPane.showMessageDialog(this,"Please Click On Total!!!");
            
        }
       
        else
        {
            String SDate,PName,Category,Price,Quantity,Total;
            //add data to selled table
           // ----------------------------------------Selled Table-------------------------------------
            try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");                
                 for(int i=0;i<tb1Model.getRowCount();i++)
                 {
                     SDate=tb1Model.getValueAt(i, 0).toString();
                     PName=tb1Model.getValueAt(i, 1).toString();
                     Price=tb1Model.getValueAt(i, 2).toString();
                     Category=tb1Model.getValueAt(i, 3).toString();
                     Quantity=tb1Model.getValueAt(i, 4).toString();
                     Total=tb1Model.getValueAt(i, 5).toString();
                     Object f,l,c;
                    f= cmbFName.getSelectedItem();
                    l=cmbLName.getSelectedItem();
                    c=txtContact.getText();
                                                              
                     String str="select PID from product where PName=?";
                    PreparedStatement pd,ps,ht,b1;
                    ps=con.prepareStatement(str);
                    ps.setString(1, PName.toString());
                    ResultSet res=ps.executeQuery();
                    
                    String aq1="select APID from available where PName=?";
                    ht=con.prepareStatement(aq1);
                    ht.setString(1, PName.toString());
                    ResultSet resd=ht.executeQuery();
                    
                     b1=con.prepareStatement("select * from selled where SDate=? and CFName=? and CLName=? and PName=?");
                    b1.setString(1,SDate.toString());
                    b1.setString(2,f.toString());
                     b1.setString(3,l.toString());
                     b1.setString(4,PName.toString());
                    ResultSet t=b1.executeQuery();
                    
                    if(t.next())
                    { 
                            int sum=0,total=0;
                        sum=Integer.parseInt(t.getString("Quantity"));
                        total=sum+Integer.parseInt(Quantity);
                        String st="update selled set Quantity=? where SDate=? and CFName=? and CLName=? and PName=?";
                        ps=con.prepareStatement(st);
                        ps.setString(1,Integer.toString(total));
                        ps.setString(2, SDate.toString());
                        ps.setString(3,f.toString());
                         ps.setString(4,l.toString());
                          ps.setString(5,PName.toString());
                        ps.executeUpdate();
                        
                    }
                    else
                    {
                      while(res.next()&&resd.next())
                      {
                         String PID=res.getString("PID");
                         String APID=resd.getString("APID");
                        String query="insert into selled(SDate,CFName,CLName,Contact,PName,Price,Category,Quantity,Total,PID,APID) values(?,?,?,?,?,?,?,?,?,?,?)";
                        pd=con.prepareStatement(query);
                        pd.setString(1,SDate.toString());
                        pd.setString(2,f.toString());
                        pd.setString(3,l.toString());
                        pd.setString(4,c.toString());
                        pd.setString(5,PName.toString());
                        pd.setString(6,Price);
                        pd.setString(7, Category.toString());
                         pd.setString(8, Quantity);
                          pd.setString(9, Total);
                           pd.setString(10, PID);
                            pd.setString(11, APID);
                        pd.execute();
                        
                     }    
                    }                                                         
                 }
                 
            }
            catch(Exception e){
            System.out.println(e.getMessage());
        }
            
            //------------------------------Report Table--------------------------------------
               try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                for(int i=0;i<tb1Model.getRowCount();i++)
                {

                    SDate=tb1Model.getValueAt(i, 0).toString();
                    PName=tb1Model.getValueAt(i, 1).toString();
                    Price=tb1Model.getValueAt(i, 2).toString();
                    Category=tb1Model.getValueAt(i, 3).toString();
                    Quantity=tb1Model.getValueAt(i, 4).toString();
                    Total=tb1Model.getValueAt(i, 5).toString();
                    
                    PreparedStatement pd,ps,pt,pl,al,rsdate,lp;
                    pl=con.prepareStatement("select * from report where PName=? and RDate=?");
                    pl.setString(1,PName.toString());
                    pl.setString(2,SDate.toString());                   
                    ResultSet t=pl.executeQuery();
                    
                    rsdate=con.prepareStatement("select * from Available where PName=? order by ADate desc");
                    rsdate.setString(1,PName.toString());
                    ResultSet t1=rsdate.executeQuery();
                                       
                    PreparedStatement sp,e;           
                    sp=con.prepareStatement("select SPID from selled where PName=? and SDate=?");
                    sp.setString(1,PName.toString());
                    sp.setString(2,SDate.toString());
                    ResultSet at=sp.executeQuery();
                    
                    if(t.next()&&at.next())
                    {
                       int qsum=0,qtotal=0,psum=0,ptotal=0,SPID;
                        qsum=Integer.parseInt(t.getString("selled_stock"));
                        qtotal=qsum+Integer.parseInt(Quantity);
                        psum=Integer.parseInt(t.getString("selled_amount"));
                        ptotal=psum+Integer.parseInt(Total);
                        SPID=Integer.parseInt(at.getString("SPID"));
                        
                        
                        String st="update report set selled_stock=?,selled_amount=?,SPID=? where PName=? and RDate=?";
                        ps=con.prepareStatement(st);
                        ps.setString(1,Integer.toString(qtotal));
                        ps.setString(2,Integer.toString(ptotal));
                        ps.setString(3,Integer.toString(SPID));
                        ps.setString(4, PName.toString());
                        ps.setString(5,SDate.toString());
                        ps.executeUpdate(); 
                    }
                    else
                    {
                       

                        String str1="select PID from Product where PName=?";
                        pt=con.prepareStatement(str1);
                        pt.setString(1, PName.toString());
                        ResultSet res1=pt.executeQuery();

                        String str2="select SPID from Selled where PName=? and SDate=?";
                        al=con.prepareStatement(str2);
                        al.setString(1, PName.toString());
                        al.setString(2, SDate.toString());
                        ResultSet res2=al.executeQuery();

                        while(res2.next()&&res1.next()&&t1.next())
                        {
                            String SPID=res2.getString("SPID");
                            String PID=res1.getString("PID");

                            String ostock=t1.getString("Quantity");
                            String query="insert into report(RDate,PName,Category,Opening_Stock,selled_stock,selled_amount,PID,SPID) values(?,?,?,?,?,?,?,?)";
                            pd=con.prepareStatement(query);
                            pd.setString(1,SDate.toString());
                            pd.setString(2,PName.toString());
                            pd.setString(3,Category.toString());
                            pd.setString(4,ostock);
                            pd.setString(5,Quantity.toString());
                            pd.setString(6,Total.toString());
                            pd.setString(7,PID.toString());
                            pd.setString(8, SPID.toString());
                            //pd.setString(8, APID.toString());
                            pd.execute();     
                        }
                        
                        //to add the Closing Stock
                         //String d1=getdate();
                        e=con.prepareStatement("SELECT * from available where PName=? ORDER by ADate DESC limit 1");
                    e.setString(1,PName.toString());
                    //e.setString(2,d1);
                    ResultSet g1=e.executeQuery();
                       
                           while(g1.next())
                           {
                         String cs=g1.getString("Quantity");
                         String dl=g1.getString("ADate");
                         String s1="update Report set Closing_Stock=? where PName=? and RDate=?"; 
                         lp=con.prepareStatement(s1);
                         lp.setString(1,cs);
                         lp.setString(2,PName);
                         lp.setString(3,dl);
                         lp.execute();
                           }
                       
                    }
                                        
                }
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
  
            //------------------------------Available Tabel----------------------------------
            //Insert data in the available table
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");                  
                 for(int i=0;i<tb1Model.getRowCount();i++)
                 {
         
                     SDate=tb1Model.getValueAt(i, 0).toString();
                     PName=tb1Model.getValueAt(i, 1).toString();
                     Price=tb1Model.getValueAt(i, 2).toString();
                     Category=tb1Model.getValueAt(i, 3).toString();
                     Quantity=tb1Model.getValueAt(i, 4).toString();
                     
         PreparedStatement pd,ps,pt,pl,al;           
         pl=con.prepareStatement("select APID,Quantity,PName from Available where PName=? and ADate=?");
         pl.setString(1,PName.toString());
         pl.setString(2,SDate.toString());
         ResultSet at=pl.executeQuery();
         
         String sel="select SPID from Selled where PName=? and SDate=?";
                     ps=con.prepareStatement(sel);
                     ps.setString(1, PName.toString());
                     ps.setString(2, SDate.toString());
                     ResultSet tat=ps.executeQuery();
                 
                   if(at.next()&&tat.next())
                   {                          
                              String quan=at.getString("Quantity");
                              String SPID=tat.getString("SPID");
                              int sum=0,total=0;
                              sum=Integer.parseInt(quan);
                              total=sum-Integer.parseInt(Quantity);
                              String st="update Available set Quantity=?,SPID=? where PName=? and ADate=?";
                              ps=con.prepareStatement(st);
                              ps.setString(1,Integer.toString(total));
                              ps.setString(2,SPID);
                             ps.setString(3, PName.toString());
                              ps.setString(4, SDate.toString());
                              ps.executeUpdate();                                
                   }
                   else
                   {
                         String str1="select PID from Product where PName=?";
                        pt=con.prepareStatement(str1);
                        pt.setString(1, PName.toString());
                        ResultSet res1=pt.executeQuery();
                        
                        String str2="select SPID from Selled where PName=?";
                        pt=con.prepareStatement(str2);
                        pt.setString(1, PName.toString());
                        ResultSet res2=pt.executeQuery();
                        
 
                        al=con.prepareStatement("select * from Available where PName=? order by ADate desc");
                    al.setString(1,PName.toString());
                    ResultSet t1=al.executeQuery();
                    
                    while(res1.next()&&res2.next()&&t1.next())
                    {
                        String PID,SPID;
                        PID=res1.getString("PID");
                        SPID=res2.getString("SPID");
                       int sum=0,total=0;
                        sum=Integer.parseInt(t1.getString("Quantity"));
                        total=sum-Integer.parseInt(Quantity);
                        String st="insert into available(ADate,PName,Price,Category,Quantity,PID,SPID) values(?,?,?,?,?,?,?)";
                        ps=con.prepareStatement(st);
                        ps.setString(1,SDate);
                        ps.setString(2, PName);
                        ps.setString(3, Price);
                        ps.setString(4, Category);
                        ps.setString(5,Integer.toString(total) );
                        ps.setString(6, PID);
                        ps.setString(7, SPID);
                        ps.executeUpdate(); 
                    }
                        
                   }
                 }                 
            }
           catch(Exception e){
            System.out.println(e.getMessage());
        }  
            //to genarate receipt number
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root",""); 
                 Object custname1=cmbFName.getSelectedItem();
                 Object custname2=cmbLName.getSelectedItem();
                 SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
                  String date=s1.format(DateCh1.getDate());
                 String f1="insert into receiptno(SDate,FName,LName) values(?,?,?)";
                 PreparedStatement rt;
                 rt=con.prepareStatement(f1);
                 rt.setString(1,date);
                 rt.setString(2, custname1.toString());
                  rt.setString(3, custname2.toString());
                 rt.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
            //to get the receipt no
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root",""); 
                 String f1="select ID from receiptno order by ID desc limit 1";
                 PreparedStatement rt;
                 rt=con.prepareStatement(f1);
                 ResultSet d1=rt.executeQuery();
                 while(d1.next())
                 {
                     String  fname,lname,contact,total,id;
                      fname=cmbFName.getSelectedItem().toString();
                     lname=cmbLName.getSelectedItem().toString();
                    contact=txtContact.getText();
                     SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
                     String date=s1.format(DateCh1.getDate());
                    total=lblTotal.getText();
                    id=d1.getString("ID");
                      DefaultTableModel tb=(DefaultTableModel)tbSelled.getModel();
                     new Bill(
                               fname,lname,contact,date,total,id,tb 
                             ).setVisible(true);  
                 }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

            Clear();
            SubClear();
            tb1Model.setRowCount(0);
        lblTotal.setText("0");
           
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtQuantityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtQuantityInputMethodTextChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtQuantityInputMethodTextChanged

    private void cmbLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0)
        {
             try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Object cfname=cmbFName.getSelectedItem();
            Object clname=cmbLName.getSelectedItem();
            PreparedStatement pd;
            pd=con.prepareStatement("select contact from customer where FName=? and LName=?");
            pd.setString(1,cfname.toString());
            pd.setString(2,clname.toString());
            ResultSet rs=pd.executeQuery();
            if(rs.next())
            {

                String contact=rs.getString("Contact");
                txtContact.setText(contact);
                JOptionPane.showMessageDialog(this,"Customer Found!!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Customer Not Found!!!");
               txtContact.setText(""); 
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
       
    }//GEN-LAST:event_cmbLNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtContactKeyPressed

    private void cmbFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0)
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Object cfname=cmbFName.getSelectedItem();
            Object clname=cmbLName.getSelectedItem();
            PreparedStatement pd;
            pd=con.prepareStatement("select contact from customer where FName=? and LName=?");
            pd.setString(1,cfname.toString());
            pd.setString(2,clname.toString());
            ResultSet rs=pd.executeQuery();
            if(rs.next())
            {

                String contact=rs.getString("Contact");
                txtContact.setText(contact);
                JOptionPane.showMessageDialog(this,"Customer Found!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Customer Not Found!!!");
                txtContact.setText(""); 
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_cmbFNameActionPerformed

     public void updateProduct()
    {
        String sql="select * from product order by PName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbProduct.addItem(rs.getString("PName"));
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     public void updateFName()
    {
        String sql="select distinct(FName) from customer order by FName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbFName.addItem(rs.getString("FName"));
             
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      public void updateLName()
    {
        String sql="select distinct(LName) from customer order by LName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbLName.addItem(rs.getString("LName"));
             
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     public void updateCategory()
    {
        String sql="select * from category order by CatName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbCategory.addItem(rs.getString("CatName"));
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
      public String getdate()
      {
          SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
            Date sd=DateCh1.getDate();
       Date yst=new Date(sd.getTime()-(24*60*60*1000));
       String dateOnly=s1.format(yst);
        return dateOnly; 
      }
      
     public int search(String str)
     {
        DefaultTableModel model=(DefaultTableModel) tbSelled.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
        tbSelled.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        int n;
        n=trs.getModelRowCount();
        return n;
     }
    
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
            java.util.logging.Logger.getLogger(Selled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selled().setVisible(true);
            }
        });
    }
    
    public void SubClear()
    {
         txtContact.setText("");
         cmbFName.setSelectedIndex(0);
         cmbLName.setSelectedIndex(0);
         DateCh1.setCalendar(null);
    }
    
public void Clear(){
        txtPrice.setText("");
        txtQuantity.setText("");
        txtTotal.setText("");       
        cmbProduct.setSelectedIndex(0);
        cmbCategory.setSelectedIndex(0);
       cmbCategory.enable(true);
       tbSelled.setSelectionMode(0);
       btnDelete.setEnabled(false);
         btnAdd.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateCh1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbFName;
    private javax.swing.JComboBox<String> cmbLName;
    private javax.swing.JComboBox<String> cmbProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tbSelled;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
