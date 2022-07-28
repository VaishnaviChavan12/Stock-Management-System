
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class Purchased extends javax.swing.JFrame {

    
    public Purchased() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCancle = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbProduct = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbLName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DateCh1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        cmbFName = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchased  Product");
        setName("frame01"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(51, 255, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchased Product");

        tb1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchased Date", "PName", "Price", "Category", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(4).setResizable(false);
            tb1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Quantity:");

        btnCancle.setText("Clear");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        txtPrice.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Price:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Product Name:");

        jLabel8.setText("Total");

        cmbProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Product Name--" }));
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Category:");

        cmbCategory.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Categories--" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("0.0");

        jPanel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Supplier First Name:");

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
        jLabel9.setText("Supplier Details");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Select the Date:");

        DateCh1.setDateFormatString("yyyy-MM-dd");
        DateCh1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Supplier last name:");

        cmbFName.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        cmbFName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select First Name--" }));
        cmbFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
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
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Total of All Product is:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(544, 544, 544)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        DefaultTableModel tb1Model=(DefaultTableModel)tb1.getModel();
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
            String PDate,PName,Category,Price,Quantity,Total;
            ////   insert data into purchased table
            SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
            
            String date=s1.format(DateCh1.getDate());
            //add date to purchased block
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                
                for(int i=0;i<tb1Model.getRowCount();i++)
                {
                    PDate=tb1Model.getValueAt(i, 0).toString();
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
                    PreparedStatement pd,ps,b1;
                    ps=con.prepareStatement(str);
                    ps.setString(1, PName.toString());
                    ResultSet res=ps.executeQuery();
                    
                    b1=con.prepareStatement("select * from purchased where PDate=? and SFName=? and SLName=? and PName=?");
                    b1.setString(1,PDate.toString());
                    b1.setString(2,f.toString());
                     b1.setString(3,l.toString());
                     b1.setString(4,PName.toString());
                    ResultSet t=b1.executeQuery();
                    
                    
                    
                    if(t.next())
                    { 
                            int sum=0,total=0;
                        sum=Integer.parseInt(t.getString("Quantity"));
                        total=sum+Integer.parseInt(Quantity);
                        String st="update purchased set Quantity=? where PDate=? and SFName=? and SLName=? and PName=?";
                        ps=con.prepareStatement(st);
                        ps.setString(1,Integer.toString(total));
                        ps.setString(2, PDate.toString());
                        ps.setString(3,f.toString());
                         ps.setString(4,l.toString());
                          ps.setString(5,PName.toString());
                        ps.executeUpdate();
                        
                    }
                    else
                    {
                        while(res.next())
                        {
                          String PID=res.getString("PID");
                        String query="insert into purchased(PDate,SFName,SLName,Contact,PName,Price,Category,Quantity,Total,PID) values(?,?,?,?,?,?,?,?,?,?)";
                        pd=con.prepareStatement(query);
                        pd.setString(1,PDate.toString());
                        pd.setString(2,f.toString());
                        pd.setString(3,l.toString());
                        pd.setString(4,c.toString());
                        pd.setString(5,PName.toString());
                        pd.setString(6,Price.toString());
                        pd.setString(7, Category.toString());
                         pd.setString(8, Quantity.toString());
                          pd.setString(9, Total.toString());
                           pd.setString(10, PID);
                        pd.execute();  
                        }
                        
                    }
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
  // --------------------------------------------Report Table----------------------------------------
  try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                for(int i=0;i<tb1Model.getRowCount();i++)
                {

                    PDate=tb1Model.getValueAt(i, 0).toString();
                    PName=tb1Model.getValueAt(i, 1).toString();
                    Price=tb1Model.getValueAt(i, 2).toString();
                    Category=tb1Model.getValueAt(i, 3).toString();
                    Quantity=tb1Model.getValueAt(i, 4).toString();
                    Total=tb1Model.getValueAt(i, 5).toString();
                    
                    PreparedStatement pd,ps,pt,pl,al,cs,rsdate,e,lp;
                    pl=con.prepareStatement("select * from Report where PName=? and RDate=?");
                    pl.setString(1,PName.toString());
                    pl.setString(2,PDate.toString());
                    ResultSet t=pl.executeQuery();
                    
                    al=con.prepareStatement("select * from Available where PName=? order by ADate desc");
                    al.setString(1,PName.toString());
                    ResultSet t1=al.executeQuery();
                    
                    if(t.next())
                    {
                        int qsum=0,qtotal=0,psum=0,ptotal;
                        qsum=Integer.parseInt(t.getString("purchased_stock"));
                        qtotal=qsum+Integer.parseInt(Quantity);
                        psum=Integer.parseInt(t.getString("purchased_amount"));
                        ptotal=psum+Integer.parseInt(Total);
                        String st="update report set purchased_stock=?,purchased_amount=? where PName=? and RDate=?";
                        ps=con.prepareStatement(st);
                        ps.setString(1,Integer.toString(qtotal));
                        ps.setString(2,Integer.toString(ptotal));
                        ps.setString(3, PName.toString());
                        ps.setString(4, PDate.toString());
                        ps.executeUpdate();
                    }
                   
                    else
                    {
                        String str="select PPID from Purchased where PName=? and PDate=?";
                        ps=con.prepareStatement(str);
                        ps.setString(1, PName.toString());
                        ps.setString(2, PDate.toString());
                        ResultSet res=ps.executeQuery();

                        String str1="select PID from Product where PName=?";
                        pt=con.prepareStatement(str1);
                        pt.setString(1, PName.toString());
                        ResultSet res1=pt.executeQuery();

                          
                          while(res.next()&&res1.next()&&t1.next())
                        {
                            
                            String PPID=res.getString("PPID");
                            String PID=res1.getString("PID");
                            String ostock=t1.getString("Quantity");
                            String query="insert into report(RDate,PName,Category,Opening_Stock,purchased_stock,purchased_amount,PID,PPID) values(?,?,?,?,?,?,?,?)";
                            pd=con.prepareStatement(query);
                            pd.setString(1,PDate.toString());
                            pd.setString(2,PName.toString());
                            pd.setString(3,Category.toString());
                           pd.setString(4,ostock);
                            pd.setString(5,Quantity.toString());
                            pd.setString(6,Total.toString());
                            pd.setString(7,PID.toString());
                            pd.setString(8, PPID.toString());
                            //pd.setStrin(7, SPID.toString());
                            pd.execute();
                        }
                          
                           //to add the Closing Stock
                       // ---------------Closing Stock--------------
                        e=con.prepareStatement("SELECT * from available where PName=? ORDER by ADate DESC limit 1");
                    e.setString(1,PName.toString());
                   // e.setString(2,d1);
                    ResultSet g1=e.executeQuery();
                       while(g1.next())
                       {
                         String u=g1.getString("Quantity");
                          String dl=g1.getString("ADate");
                         String k="update Report set Closing_Stock=? where PName=? and RDate=?"; 
                         lp=con.prepareStatement(k);
                         lp.setString(1,u);
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
  
  
  
   //-----------------------------------Available Table-----------------------------------------------         
            //insert data into available table
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                for(int i=0;i<tb1Model.getRowCount();i++)
                {

                    PDate=tb1Model.getValueAt(i, 0).toString();
                    PName=tb1Model.getValueAt(i, 1).toString();
                    Price=tb1Model.getValueAt(i, 2).toString();
                    Category=tb1Model.getValueAt(i, 3).toString();
                    Quantity=tb1Model.getValueAt(i, 4).toString();

                    PreparedStatement pd,ps,pt,pl,al,ul;
                    pl=con.prepareStatement("select * from Available where PName=? and ADate=?");
                    pl.setString(1,PName.toString());
                     pl.setString(2,PDate.toString());
                    ResultSet t=pl.executeQuery();
                    
                   
                    if(t.next())
                    {
                        //int apro=Integer.parseInt("Quantity");
                            int sum=0,total=0;
                        sum=Integer.parseInt(t.getString("Quantity"));
                        total=sum+Integer.parseInt(Quantity);
                        String st="update Available set Quantity=? where PName=? and ADate=? ";
                        ps=con.prepareStatement(st);
                        ps.setString(1,Integer.toString(total));
                        ps.setString(2, PName.toString());
                        ps.setString(3, PDate.toString());
                        ps.executeUpdate();
                       
                    }
                    
                    else
                    {
                        
                        String str1="select PID from Product where PName=?";
                        pt=con.prepareStatement(str1);
                        pt.setString(1, PName.toString());
                        ResultSet res1=pt.executeQuery();
                        
                        String str2="select PPID from purchased where PName=?";
                        pt=con.prepareStatement(str1);
                        pt.setString(1, PName.toString());
                        ResultSet res2=pt.executeQuery();
                        
 
                        ul=con.prepareStatement("select * from Available where PName=? order by ADate desc");
                    ul.setString(1,PName.toString());
                    ResultSet t1=ul.executeQuery();
                    while(res1.next()&&t1.next())
                    {
                        String PID,PPID;
                        PID=res1.getString("PID");
                        
                       int sum=0,total=0;
                        sum=Integer.parseInt(t1.getString("Quantity"));
                        total=sum+Integer.parseInt(Quantity);
                        String st="insert into available(ADate,PName,Price,Category,Quantity,PID) values(?,?,?,?,?,?)";
                        ps=con.prepareStatement(st);
                        ps.setString(1,PDate);
                        ps.setString(2, PName);
                        ps.setString(3, Price);
                        ps.setString(4, Category);
                        ps.setString(5,Integer.toString(total) );
                        ps.setString(6, PID);
                       
                        ps.executeUpdate(); 
                    }
                    }
                } 
                 JOptionPane.showMessageDialog(this,"Data Inserted Successfully!");
                tb1Model.setRowCount(0);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            Clear();
            SubClear();
            lblTotal.setText("0");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model=(DefaultTableModel)tb1.getModel();

        if(tb1.getSelectedRowCount()==1)
        {
            if(txtPrice.getText()==" "||txtQuantity.getText()==" "||cmbProduct.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(this,"Please Select Product For Delete..!!!");
            }
            else{
                try{
                    int row=tb1.getSelectedRow();
                    String cell=tb1.getModel().getValueAt(row, 0).toString();
                    Double sumTable=0.00;
                    sumTable=Double.valueOf(lblTotal.getText())-Double.valueOf(txtTotal.getText());
                    lblTotal.setText(String.valueOf(sumTable));
                    JOptionPane.showMessageDialog(null,"Product Deleted Successfully..!");
                    tb1Model.removeRow(tb1.getSelectedRow());
                    Clear();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            
        }
        else
        {
            if(tb1.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(this,"Table is Empty..!!!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please Select Single Row for Delete..!!!!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel excs=(DefaultTableModel)tb1.getModel();
         Object pname=cmbProduct.getSelectedItem();
         Date d=new Date();
        Date dat=DateCh1.getDate();
        SimpleDateFormat o5=new SimpleDateFormat("yyyy-MM-dd");
        String datej=o5.format(d);
        String get=o5.format(dat);
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
           JOptionPane.showMessageDialog(this,"Please Select Supplier!!!");            
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
        else{
            if(h==1)
            {
                JOptionPane.showMessageDialog(this,"Please First Delete Product From Below Table Then Add It !!!"); 
                txtQuantity.setText("");
                txtTotal.setText("");
            }
            else
            {
                 SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
            String date=s1.format(DateCh1.getDate());

            String data[]={date,(String)cmbProduct.getSelectedItem(),txtPrice.getText(),(String)cmbCategory.getSelectedItem(),txtQuantity.getText(),txtTotal.getText()};
            DefaultTableModel tb1Model=(DefaultTableModel)tb1.getModel();
            tb1Model.addRow(data);
            Double sumTable=0.00;
            sumTable=Double.valueOf(lblTotal.getText())+Double.valueOf(txtTotal.getText());
            lblTotal.setText(String.valueOf(sumTable));
            JOptionPane.showMessageDialog(this,"Product Added Successfully!");
            Clear();
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

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
        // TODO add your handling code here:
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

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnCancleActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        // TODO add your handling code here:
        int  i=tb1.getSelectedRow();
        TableModel model=tb1.getModel();
        cmbProduct.setSelectedItem(model.getValueAt(i, 1));
        txtPrice.setText(model.getValueAt(i, 2).toString());
        cmbCategory.setSelectedItem(model.getValueAt(i, 3));
        txtQuantity.setText(model.getValueAt(i, 4).toString());
        txtTotal.setText(model.getValueAt(i, 5).toString());
        
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tb1MouseClicked

    private void cmbLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Object sfname=cmbFName.getSelectedItem();
            Object slname=cmbLName.getSelectedItem();
            PreparedStatement pd;
            pd=con.prepareStatement("select contact from supplier where FName=? and LName=?");
            pd.setString(1,sfname.toString());
            pd.setString(2,slname.toString());
            ResultSet rs=pd.executeQuery();
            if(rs.next())
            {
                String contact=rs.getString("Contact"); 
                txtContact.setText(contact);
                JOptionPane.showMessageDialog(this,"Supplier Found!!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Supplier Not Found!!!");
                txtContact.setText(""); 
            }
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_cmbLNameActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void cmbFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0)
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Object sfname=cmbFName.getSelectedItem();
            Object slname=cmbLName.getSelectedItem();
            PreparedStatement pd;
            pd=con.prepareStatement("select contact from supplier where FName=? and LName=?");
            pd.setString(1,sfname.toString());
            pd.setString(2,slname.toString());
            ResultSet rs=pd.executeQuery();
            if(rs.next())
            {
                String contact=rs.getString("Contact"); 
                txtContact.setText(contact);
                 JOptionPane.showMessageDialog(this,"Supplier Found!");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Supplier Not Found!!!");
                txtContact.setText(""); 
            }
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_cmbFNameActionPerformed
    
    public void SubClear()
    {
       cmbFName.setSelectedIndex(0); 
       cmbLName.setSelectedIndex(0);
        txtContact.setText("");
        DateCh1.setCalendar(null);
    }
//   
        
    
    public void Clear(){
        txtPrice.setText("");
        txtQuantity.setText("");
        txtTotal.setText("");       
        cmbProduct.setSelectedIndex(0);       
        cmbCategory.setSelectedIndex(0); 
        cmbCategory.enable(true);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        tb1.setSelectionMode(0);
    }
    public void updateProduct()
    {
        String sql="select distinct PName from product order by PName";
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
    
    public void updateCategory()
    {
        String sql="select CatName from Category order by CatName";
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
      public void updateFName()
    {
        String sql="select distinct FName from supplier order by FName";
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
      
      public String getdate()
      {
          SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
            Date sd=DateCh1.getDate();
       Date yst=new Date(sd.getTime()-(24*60*60*1000));
       String dateOnly=s1.format(yst);
        return dateOnly; 
      }
      
       public void updateLName()
    {
        String sql="select distinct LName from supplier order by LName";
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
            java.util.logging.Logger.getLogger(Purchased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchased().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateCh1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancle;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
