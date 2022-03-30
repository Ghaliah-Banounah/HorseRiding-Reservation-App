
import javax.swing.JFrame;

public class BookClass extends javax.swing.JFrame {

    public BookClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstClass = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SecondClass = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ThirdClass = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        FourthClass = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 234, 230));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 61, 61));
        jLabel1.setText("Kinndah Stables");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kinn.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setMaximumSize(new java.awt.Dimension(290, 125));
        jLabel2.setPreferredSize(new java.awt.Dimension(290, 125));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 63, 63));
        jLabel3.setText("Available Classes:");

        FirstClass.setBackground(new java.awt.Color(150, 149, 104));
        FirstClass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FirstClass.setPreferredSize(new java.awt.Dimension(154, 170));
        FirstClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstClassMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Advanced.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(138, 66));
        jLabel4.setVerifyInputWhenFocusTarget(false);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 76, 76));
        jLabel8.setText("Class Level: Advanced");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 76, 76));
        jLabel9.setText("Coach: Ahmed");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 76, 76));
        jLabel10.setText("Date: 11 \\ 8 \\ 2021");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 76, 76));
        jLabel11.setText("Time: 1:00pm to 3:00pm");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 76, 76));
        jLabel12.setText("Price: 500 SR");

        javax.swing.GroupLayout FirstClassLayout = new javax.swing.GroupLayout(FirstClass);
        FirstClass.setLayout(FirstClassLayout);
        FirstClassLayout.setHorizontalGroup(
            FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FirstClassLayout.setVerticalGroup(
            FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SecondClass.setBackground(new java.awt.Color(150, 149, 104));
        SecondClass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SecondClass.setPreferredSize(new java.awt.Dimension(154, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/beginner.jpg"))); // NOI18N
        jLabel5.setMinimumSize(new java.awt.Dimension(129, 60));
        jLabel5.setPreferredSize(new java.awt.Dimension(138, 66));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 76, 76));
        jLabel13.setText("Class Level: Beginner");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(76, 76, 76));
        jLabel14.setText("Coach: Salem");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 76, 76));
        jLabel15.setText("Date: 11 \\ 8 \\ 2021");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 76, 76));
        jLabel16.setText("Time: 5:30pm to 7:00pm");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(76, 76, 76));
        jLabel17.setText("Price: 300 SR");

        javax.swing.GroupLayout SecondClassLayout = new javax.swing.GroupLayout(SecondClass);
        SecondClass.setLayout(SecondClassLayout);
        SecondClassLayout.setHorizontalGroup(
            SecondClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecondClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SecondClassLayout.setVerticalGroup(
            SecondClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(jLabel15)
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        ThirdClass.setBackground(new java.awt.Color(150, 149, 104));
        ThirdClass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ThirdClass.setPreferredSize(new java.awt.Dimension(154, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Intermediate.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(138, 66));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(76, 76, 76));
        jLabel18.setText("Class Level: Intermediate");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(76, 76, 76));
        jLabel19.setText("Coach: Mohammed");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(76, 76, 76));
        jLabel20.setText("Date: 13 \\ 8 \\ 2021");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(76, 76, 76));
        jLabel21.setText("Time: 4:00pm to 6:00pm");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(76, 76, 76));
        jLabel22.setText("Price: 500 SR");

        javax.swing.GroupLayout ThirdClassLayout = new javax.swing.GroupLayout(ThirdClass);
        ThirdClass.setLayout(ThirdClassLayout);
        ThirdClassLayout.setHorizontalGroup(
            ThirdClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThirdClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThirdClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThirdClassLayout.setVerticalGroup(
            ThirdClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThirdClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(jLabel21)
                .addGap(0, 0, 0)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FourthClass.setBackground(new java.awt.Color(150, 149, 104));
        FourthClass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FourthClass.setPreferredSize(new java.awt.Dimension(145, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/beginner.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(138, 66));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(76, 76, 76));
        jLabel23.setText("Class Level: Beginner");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(76, 76, 76));
        jLabel24.setText("Coach: Salem");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(76, 76, 76));
        jLabel25.setText("Date: 12 \\ 8 \\ 2021");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(76, 76, 76));
        jLabel26.setText("Time: 4:30pm to 6:00pm");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(76, 76, 76));
        jLabel27.setText("Price: 300 SR");

        javax.swing.GroupLayout FourthClassLayout = new javax.swing.GroupLayout(FourthClass);
        FourthClass.setLayout(FourthClassLayout);
        FourthClassLayout.setHorizontalGroup(
            FourthClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FourthClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FourthClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FourthClassLayout.setVerticalGroup(
            FourthClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FourthClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(0, 0, 0)
                .addComponent(jLabel24)
                .addGap(0, 0, 0)
                .addComponent(jLabel25)
                .addGap(0, 0, 0)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(209, 203, 198));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(331, 51));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-48 (1).png"))); // NOI18N
        jLabel28.setToolTipText("");
        jLabel28.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-heart-50.png"))); // NOI18N
        jLabel29.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabel29.setRequestFocusEnabled(false);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bell-60.png"))); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-60.png"))); // NOI18N
        jLabel31.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ThirdClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FirstClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FourthClass, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(SecondClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(12, 12, 12))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SecondClass, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(FirstClass, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThirdClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FourthClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void FirstClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstClassMouseClicked

        ReservationDetails details = new ReservationDetails();
        details.setVisible(true);
        details.pack();
        details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_FirstClassMouseClicked

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
            java.util.logging.Logger.getLogger(BookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FirstClass;
    private javax.swing.JPanel FourthClass;
    private javax.swing.JPanel SecondClass;
    private javax.swing.JPanel ThirdClass;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
