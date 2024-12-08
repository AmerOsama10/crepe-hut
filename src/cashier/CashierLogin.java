/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Statement;


/**
 *
 * @author Amer Osama
 */
public class CashierLogin extends javax.swing.JFrame {
   ImageIcon uplogo =new ImageIcon (Objects.requireNonNull(getClass().getResource("/images/uppo.jpg")));
    /**
     * Creates new form AdminLogin
     */
    public CashierLogin() {
        initComponents();
        
        this.setResizable(false);
         this.setLocationRelativeTo(null);
        this.setTitle("Cashier Login");
                       this.setIconImage(uplogo.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton btnlogin = new JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        JLabel jLabel2 = new JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        checkshowpassword = new javax.swing.JCheckBox();
        javax.swing.JButton exit = new javax.swing.JButton();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        btnlogin.setBackground(new java.awt.Color(0, 51, 51));
        btnlogin.setFont(new java.awt.Font("Orbitron", Font.BOLD, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("CONTINUE");
        btnlogin.addActionListener(this::btnloginActionPerformed);

        username.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        username.addActionListener(this::usernameActionPerformed);

        password.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", Font.BOLD, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("تسجيل الدخول");

        jLabel2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/user.jpg")))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/password.png")))); // NOI18N

        checkshowpassword.setBackground(new java.awt.Color(255, 255, 204));
        checkshowpassword.setText("show password");
        checkshowpassword.addActionListener(this::checkshowpasswordActionPerformed);

        exit.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 102));
        exit.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/exit.png")))); // NOI18N
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.addActionListener(this::exitActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(username))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 193, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkshowpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addComponent(checkshowpassword)
                .addGap(38, 38, 38)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/cashierbackground.jpg")))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkshowpasswordActionPerformed
        // TODO add your handling code here:
          if(checkshowpassword.isSelected())
        {
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkshowpasswordActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
    String dbUrl = "jdbc:mysql://localhost:3306/crepehut";
    String dbUser = "root";
    String dbPassword = "";

    String email = username.getText();
    String pass = String.valueOf(password.getPassword());

    if (email.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(null, "اسم المستخدم وكلمة المرور مطلوبان");
        return;
    }

    try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
        // Check username and password
        String loginQuery = "SELECT `cashier_email`, `cashier_password`, `cashier_state` FROM `cashiers` WHERE `cashier_email`=? AND `cashier_password`=?";
        try (PreparedStatement ps = con.prepareStatement(loginQuery)) {
            ps.setString(1, email);
            ps.setString(2, pass);
            try (ResultSet result = ps.executeQuery()) {
                if (result.next()) {
                    byte cashierState = result.getByte("cashier_state");
                    if (cashierState == 0) {
                        // Update state to working
                        updateCashierState(con, email);
                    }

                    // Transition to the next screen
                    this.setVisible(false);
                    this.dispose();
                    CashMain main = new CashMain();
                    main.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "اسم المستخدم او الرقم السري غير صحيح");
                    username.setText("");
                    password.setText("");
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "خطأ: لا يمكن الاتصال بالسيرفر. تأكد من الاتصال وأعد المحاولة.");
    }                     
                                
    }//GEN-LAST:event_btnloginActionPerformed

    private void updateCashierState(Connection con, String email) throws SQLException {
    String updateQuery = "UPDATE `cashiers` SET `cashier_state`=? WHERE `cashier_email`=?";
    try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
        ps.setByte(1, (byte) 1);
        ps.setString(2, email);
        ps.executeUpdate();
    }
}
    
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

         public void exitdata()
    {
        Connection con;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crepehut", "root", "");
             Statement s;    
             Cash cashier=new Cash();
             cashier.clockOut();
             String query="UPDATE `cashiers` SET `cashier_state`='"+cashier.getWorkState()+"'WHERE `cashier_state`=1;";
             s = con.createStatement();
             s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(CashMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:  
        exitdata();             
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     */
    public static void main() {
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CashierLogin().setVisible(true));
    }

    private javax.swing.JCheckBox checkshowpassword;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
