package hatfieldjuniorswimmingschool.view;

import hatfieldjuniorswimmingschool.controller.LessonController;
import hatfieldjuniorswimmingschool.controller.RatingController;
import hatfieldjuniorswimmingschool.controller.UserController;
import hatfieldjuniorswimmingschool.model.Lesson;
import hatfieldjuniorswimmingschool.model.User;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ratings extends javax.swing.JFrame {

    private int lessonId;
    private int userId;
    private String date;
    private String coachId;

    /**
     * Creates new form ratings
     */
    public Ratings(int lessonId, int userId, String date) {
        initComponents();
        this.lessonId = lessonId;
        this.userId = userId;
        this.date = date;
        //set userimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim3.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
        displayDetail();
    }

    public Ratings() {
        initComponents();
        //set userimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim3.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingForm = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        ratingField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewField = new javax.swing.JTextArea();
        timeField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        dayField = new javax.swing.JLabel();
        dateField = new javax.swing.JLabel();
        lnameField = new javax.swing.JLabel();
        unameField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        coachField = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Reviews    :");

        ratingField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ratingField.setForeground(new java.awt.Color(0, 102, 255));
        ratingField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ratingFieldFocusLost(evt);
            }
        });
        ratingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Attended Lesson Ratings");

        reviewField.setColumns(20);
        reviewField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reviewField.setForeground(new java.awt.Color(0, 102, 255));
        reviewField.setRows(5);
        reviewField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                reviewFieldFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(reviewField);

        timeField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timeField.setForeground(new java.awt.Color(0, 102, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Ratings      :");

        submit.setBackground(new java.awt.Color(0, 102, 255));
        submit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        dayField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dayField.setForeground(new java.awt.Color(0, 102, 255));

        dateField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateField.setForeground(new java.awt.Color(0, 102, 255));

        lnameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lnameField.setForeground(new java.awt.Color(0, 102, 255));

        unameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        unameField.setForeground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Lesson Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("User Name     :   ");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Date              :");

        coachField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coachField.setForeground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Day             :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Time            :");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Coach           :");

        javax.swing.GroupLayout ratingFormLayout = new javax.swing.GroupLayout(ratingForm);
        ratingForm.setLayout(ratingFormLayout);
        ratingFormLayout.setHorizontalGroup(
            ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingFormLayout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingFormLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingFormLayout.createSequentialGroup()
                        .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ratingFormLayout.createSequentialGroup()
                                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ratingFormLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coachField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ratingFormLayout.createSequentialGroup()
                                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ratingFormLayout.createSequentialGroup()
                                        .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingFormLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))
                                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
            .addGroup(ratingFormLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ratingFormLayout.setVerticalGroup(
            ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(ratingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(ratingForm);
        ratingForm.setBounds(250, 130, 440, 570);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 255));
        backButton.setText("Back to dashboard");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(90, 80, 170, 30);

        backgroundImage.setText("jLabel3");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ratingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingFieldActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        saveRatings();

    }//GEN-LAST:event_submitActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserDashboard(userId).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ratingFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratingFieldFocusLost
        // TODO add your handling code here:
        if (ratingField.getText().matches("[0-9]")) {
            //change rating into integer from string
            int ratings = Integer.parseInt(ratingField.getText());
            if (!(ratings <= 5 && ratings >= 1)) {
                JOptionPane.showMessageDialog(this, "Please give rating 1 to 5 \n 1: Very dissatisfied\n2: Dissatisfied\n3: Ok\n4: Satisfied\n5:"
                        + "Very Satisfied", "Alert", JOptionPane.WARNING_MESSAGE);
                ratingField.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please give rating 1 to 5 \n 1: Very dissatisfied\n2: Dissatisfied\n3: Ok\n4: Satisfied\n5:"
                    + "Very Satisfied", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ratingFieldFocusLost

    private void reviewFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reviewFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_reviewFieldFocusLost

    //display user and lesson details in rating form
    public void displayDetail() {
        //get user detail by id
        User user = new UserController().getUserById(userId);
        unameField.setText(user.username);
        //get lesson details by id
        List<Lesson> lesson_details = new LessonController().loadLessonDetails();
        for (int i = 0; i < lesson_details.size(); i++) {
            //get lesson detail by lesson id
            if (lesson_details.get(i).getLessonID() == lessonId) {
                coachId = lesson_details.get(i).getCoachId();
                lnameField.setText(new LessonController().getLessonById(lessonId).lessonName);
                dateField.setText(lesson_details.get(i).date);
                dayField.setText(lesson_details.get(i).day);
                timeField.setText(lesson_details.get(i).timeSlot);
                coachField.setText(new UserController().getUserById(Integer.parseInt(lesson_details.get(i).getCoachId())).username);
            }
        }
    }

    //save Ratings details in csv file
    public void saveRatings() {
        String ratings = ratingField.getText();
        String review = reviewField.getText();
        //validation of any field not empty
        if (!(ratings.isBlank() || review.isBlank() || userId == 0 || lessonId == 0 || date.isBlank())) {
            if (ratings.matches("[1-5]")) {
                //change rating into integer
                int rating = Integer.parseInt(ratings);
                if (rating >= 1 && rating <= 5) {
                    boolean giveRatings = new RatingController().saveRating(lessonId, "" + userId, ratings, review);
                    if (giveRatings) {
                        JOptionPane.showMessageDialog(this, "Ratings submit successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        new UserDashboard(userId).setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter valid rating \n"
                            + "between 1 to 5 ", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid rating \n"
                        + "between 1 to 5 ", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "All field required", "Alert", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(Ratings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ratings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ratings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ratings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ratings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel coachField;
    private javax.swing.JLabel dateField;
    private javax.swing.JLabel dayField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnameField;
    private javax.swing.JTextField ratingField;
    private java.awt.Panel ratingForm;
    private javax.swing.JTextArea reviewField;
    private javax.swing.JButton submit;
    private javax.swing.JLabel timeField;
    private javax.swing.JLabel unameField;
    // End of variables declaration//GEN-END:variables
}
