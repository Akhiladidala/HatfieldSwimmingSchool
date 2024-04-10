package hatfieldjuniorswimmingschool.view;

import hatfieldjuniorswimmingschool.controller.UserController;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserRegister extends javax.swing.JFrame {
    private String grade;
    /**
     * Creates new form UserRegister
     */
    public UserRegister() {
        initComponents();
        gradeLevel.setVisible(false);
        gradeSelect.setVisible(false);
        //set backgroundimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim2.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        postField = new javax.swing.JTextField();
        gradeLevel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        roleSelect = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        registerButton = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        genderSelect = new javax.swing.JComboBox<>();
        gradeSelect = new javax.swing.JComboBox<>();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("User Register");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(145, 32, 122, 28);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Username :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(81, 95, 98, 17);

        nameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(nameField);
        nameField.setBounds(197, 95, 201, 32);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(81, 140, 98, 17);

        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(emailField);
        emailField.setBounds(197, 133, 201, 32);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Contact :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(81, 178, 98, 17);

        contactField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contactField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(contactField);
        contactField.setBounds(197, 171, 201, 32);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 300, 98, 17);

        addressField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addressField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(addressField);
        addressField.setBounds(200, 290, 201, 32);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("State :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 340, 98, 17);

        stateField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stateField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(stateField);
        stateField.setBounds(200, 330, 201, 32);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("City :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 380, 98, 17);

        cityField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cityField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(cityField);
        cityField.setBounds(200, 370, 201, 32);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Postcode :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 420, 98, 17);

        postField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        postField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(postField);
        postField.setBounds(200, 410, 201, 32);

        gradeLevel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gradeLevel.setForeground(new java.awt.Color(0, 102, 255));
        gradeLevel.setText("Grade :");
        jPanel1.add(gradeLevel);
        gradeLevel.setBounds(80, 540, 98, 17);

        loginLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 102, 255));
        loginLabel.setText("Already register ? Login");
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginLabelMouseReleased(evt);
            }
        });
        jPanel1.add(loginLabel);
        loginLabel.setBounds(140, 620, 230, 22);

        roleSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roleSelect.setForeground(new java.awt.Color(0, 102, 255));
        roleSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Learner", "Coach" }));
        roleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleSelectActionPerformed(evt);
            }
        });
        jPanel1.add(roleSelect);
        roleSelect.setBounds(200, 250, 201, 32);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Age :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 460, 98, 17);

        ageField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ageField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(ageField);
        ageField.setBounds(200, 450, 201, 32);

        registerButton.setBackground(new java.awt.Color(0, 102, 255));
        registerButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setLabel("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(160, 570, 185, 32);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Password :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 500, 98, 17);

        passwordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(passwordField);
        passwordField.setBounds(200, 490, 201, 32);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Role      :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 260, 98, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Gender :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(81, 217, 98, 17);

        genderSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        genderSelect.setForeground(new java.awt.Color(0, 102, 255));
        genderSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Gender", "Male", "Female" }));
        jPanel1.add(genderSelect);
        genderSelect.setBounds(197, 209, 201, 32);

        gradeSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gradeSelect.setForeground(new java.awt.Color(0, 51, 255));
        gradeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Grade", "Grade Level 1", "Grade Level 2", "Grade Level 3", "Grade Level 4", "Grade Level 5" }));
        jPanel1.add(gradeSelect);
        gradeSelect.setBounds(200, 530, 200, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1010, 60, 480, 660);

        backgroundImage.setText("jLabel14");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(10, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        userRegister();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseReleased
        //close this page
        this.setVisible(false);
        //open login page
        new UserLogin().setVisible(true);
    }//GEN-LAST:event_loginLabelMouseReleased

    private void roleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectActionPerformed
        // TODO add your handling code here:
        String role=(String) roleSelect.getSelectedItem();
        if(role.equalsIgnoreCase("Coach"))
        {
            grade="";
            gradeLevel.setVisible(false);
            gradeSelect.setVisible(false);
        }else
        {
            gradeLevel.setVisible(true);
            gradeSelect.setVisible(true);
        }
    }//GEN-LAST:event_roleSelectActionPerformed

    //user register
    public void userRegister() {
        //get user input from 
        String name = nameField.getText();
        String email = emailField.getText();
        String contact = contactField.getText();
        String address = addressField.getText();
        String state = stateField.getText();
        String city = cityField.getText();
        String postcode = postField.getText();
        String role = (String) roleSelect.getSelectedItem();
        String password = passwordField.getText();
        String age = ageField.getText();
        String gender = (String) genderSelect.getSelectedItem();
        if (role.equalsIgnoreCase("learner")) {
            grade = (String) gradeSelect.getSelectedItem();
        }
        //set grade level all if role coach

        //set minimum and maximum age according to role
        int minAge = 0;
        int maxAge = 0;
        boolean isRegisteredEmail = UserController.isEmailExist(email);
        //validation any fields not empty
        if (!(name.isBlank() || email.isBlank() || contact.isBlank() || address.isBlank() || state.isBlank() || postcode.isBlank() || role.equalsIgnoreCase("Select Role") || age.isBlank() || password.isBlank() || grade.equalsIgnoreCase("Choose Grade") || gender.equalsIgnoreCase("Choose Gender"))) {
            //validation for email
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                //validation for contact
                if (contact.matches("[0-9]{10}")) {
                    //validation for postcode
                    if (postcode.matches("[0-9]+")) {
                        if (role.equalsIgnoreCase("Learner")) {
                            minAge = 4;
                            maxAge = 11;
                        } else {
                            minAge = 1;
                            maxAge = 150;
                        }
                        //validation for age
                        if (age.matches("[0-9]+")) {
                            //convert age into integer
                            int age1 = Integer.parseInt(age);
                            if (age1 >= minAge && age1 <= maxAge) {
                                if (!isRegisteredEmail) {
                                    UserController user = new UserController(name, email, contact, grade, gender, age, address, state, city, postcode, role, password);
                                    //get register result
                                    boolean isRegister = user.userRegister();
                                    if (isRegister) {
                                        JOptionPane.showMessageDialog(this, "Registration Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                                        this.setVisible(false);
                                        new UserLogin().setVisible(true);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Email already registered", "Alert", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Enter valid age \nEx Age : 4 to 11", "Alert", JOptionPane.WARNING_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Enter valid age", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Enter valid postcode \n Ex. Postcode : 123456", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter valid contact \nEx Contact : 9876543210", "Alert", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Enter valid email \nEx Email : abc@gmail.com", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "All fields are required", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> genderSelect;
    private javax.swing.JLabel gradeLevel;
    private javax.swing.JComboBox<String> gradeSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField postField;
    private java.awt.Button registerButton;
    private javax.swing.JComboBox<String> roleSelect;
    private javax.swing.JTextField stateField;
    // End of variables declaration//GEN-END:variables
}
