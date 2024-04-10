package hatfieldjuniorswimmingschool.view;

import hatfieldjuniorswimmingschool.controller.LessonController;
import hatfieldjuniorswimmingschool.controller.UserController;
import hatfieldjuniorswimmingschool.model.User;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddLesson extends javax.swing.JFrame {

    private String[] timeSlot = new String[0];
    //create array to store coach name
    private int arraySize = new LessonController().loadLessonDetails().size() + 1;
    private int arraySize1 = new UserController().fetchAllCoach().size() + 1;
    String[] coaches = new String[arraySize1];
    private List<User> coach_details;

    /**
     * Creates new form AddLesson
     */
    public AddLesson() {
        initComponents();
        //fetch all coach details 
        this.coach_details = new UserController().fetchAllCoach();
        storeCoachInSelectButton();
        //set backgroundimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim3.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        seatField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addLesson = new javax.swing.JButton();
        gradeSelect = new javax.swing.JComboBox<>();
        lnameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dateSelect = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        slotSelect = new javax.swing.JComboBox<>();
        coachSelect = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        daySelect = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        panel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel1.setForeground(new java.awt.Color(0, 51, 255));
        panel1.setLayout(null);

        seatField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seatField.setForeground(new java.awt.Color(0, 102, 255));
        seatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatFieldActionPerformed(evt);
            }
        });
        panel1.add(seatField);
        seatField.setBounds(160, 320, 232, 32);

        priceField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priceField.setForeground(new java.awt.Color(0, 102, 255));
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        panel1.add(priceField);
        priceField.setBounds(160, 360, 232, 32);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Add New Lesson");
        panel1.add(jLabel1);
        jLabel1.setBounds(115, 41, 180, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Day :");
        panel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 86, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Date :");
        panel1.add(jLabel3);
        jLabel3.setBounds(40, 210, 86, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Grade Level :");
        panel1.add(jLabel4);
        jLabel4.setBounds(40, 250, 86, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Seat :");
        panel1.add(jLabel6);
        jLabel6.setBounds(40, 330, 86, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Price :");
        panel1.add(jLabel8);
        jLabel8.setBounds(40, 370, 86, 17);

        addLesson.setBackground(new java.awt.Color(0, 102, 255));
        addLesson.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addLesson.setForeground(new java.awt.Color(255, 255, 255));
        addLesson.setText("Add Lesson");
        addLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLessonActionPerformed(evt);
            }
        });
        panel1.add(addLesson);
        addLesson.setBounds(90, 420, 233, 38);

        gradeSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gradeSelect.setForeground(new java.awt.Color(0, 51, 255));
        gradeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Grade", "Grade Level 1", "Grade Level 2", "Grade Level 3", "Grade Level 4", "Grade Level 5" }));
        gradeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeSelectActionPerformed(evt);
            }
        });
        panel1.add(gradeSelect);
        gradeSelect.setBounds(160, 240, 232, 32);

        lnameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lnameField.setForeground(new java.awt.Color(0, 102, 255));
        panel1.add(lnameField);
        lnameField.setBounds(160, 80, 232, 32);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Lesson Name :");
        panel1.add(jLabel9);
        jLabel9.setBounds(39, 88, 100, 17);

        dateSelect.setForeground(new java.awt.Color(0, 102, 255));
        dateSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel1.add(dateSelect);
        dateSelect.setBounds(160, 200, 232, 32);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Time :");
        panel1.add(jLabel10);
        jLabel10.setBounds(40, 280, 86, 17);

        slotSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        slotSelect.setForeground(new java.awt.Color(0, 102, 255));
        panel1.add(slotSelect);
        slotSelect.setBounds(160, 280, 230, 32);

        coachSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coachSelect.setForeground(new java.awt.Color(0, 102, 255));
        coachSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachSelectActionPerformed(evt);
            }
        });
        panel1.add(coachSelect);
        coachSelect.setBounds(160, 120, 230, 32);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Coach Id   :");
        panel1.add(jLabel11);
        jLabel11.setBounds(40, 130, 94, 17);

        daySelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        daySelect.setForeground(new java.awt.Color(0, 102, 255));
        daySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Day", "Monday", "Wednesday", "Friday", "Saturday" }));
        daySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daySelectActionPerformed(evt);
            }
        });
        panel1.add(daySelect);
        daySelect.setBounds(160, 160, 230, 32);

        getContentPane().add(panel1);
        panel1.setBounds(120, 160, 440, 490);

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

        backgroundImage.setText("jLabel5");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void addLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLessonActionPerformed
        // TODO add your handling code here:
        addLesson();

    }//GEN-LAST:event_addLessonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void coachSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachSelectActionPerformed

    }//GEN-LAST:event_coachSelectActionPerformed

    private void gradeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeSelectActionPerformed

    private void daySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daySelectActionPerformed

        // TODO add your handling code here:
        String day = (String) daySelect.getSelectedItem();
        if (day.equalsIgnoreCase("Saturday")) {
            timeSlot = new String[]{"Choose Slot", "2pm-3pm", "3pm-4pm"};
        } else {
            timeSlot = new String[]{"Choose Slot", "4pm-5pm", "5pm-6pm", "6pm-7pm"};
        }
        slotSelect.setModel(new DefaultComboBoxModel<String>(timeSlot));
    }//GEN-LAST:event_daySelectActionPerformed

    //add lesson
    public void addLesson() {
        String lessonName = lnameField.getText();
        String date = null;
        if (dateSelect.getDate() != null) {
            Date dates = dateSelect.getDate();
            //convert date into string
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = dateFormat.format(dates);
        }
        String day = (String) daySelect.getSelectedItem();
        String slot = (String) slotSelect.getSelectedItem();
        String grade = (String) gradeSelect.getSelectedItem();
        String seat = seatField.getText();
        String price = priceField.getText();
        String coachName = (String) coachSelect.getSelectedItem();
        List<User>coach_details=new UserController().fetchAllCoach();
         String coachId = null;
        for(int i=0; i<coach_details.size(); i++)
        {
            if(coach_details.get(i).username.equalsIgnoreCase(coachName))
            {
                coachId=""+coach_details.get(i).userId;
            }
        }
       

        if (!(lessonName.isBlank() || date == null || day.equalsIgnoreCase("Choose Day") || slot == null || slot.equalsIgnoreCase("Choose Slot") || grade.equalsIgnoreCase("Choose Grade") || seat.isBlank() || price.isBlank() || coachId.equalsIgnoreCase("Choose Coach"))) {
            //validation for seat
            if (seat.matches("[1-4]")) {
                //validation for price
                if (price.matches("[0-9]+") || price.matches("\\d+\\.\\d{2}")) {
                    //set . if price is without .00
                    if (price.matches("[0-9]+")) {
                        price = price.concat(".00");
                    }
                    //add lesson
                    boolean addNewLesson = new LessonController().addLesson(lessonName, date, day, slot, grade, seat, price, coachId);
                    if (addNewLesson) {
                        JOptionPane.showMessageDialog(this, "New lesson added successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        new AdminDashboard().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "This date alredy lesson added", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter valid price", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid seat 1 to 4", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "All field required", "Alert", JOptionPane.WARNING_MESSAGE);
        }

    }
    //store coach name in select coach combo box

    public void storeCoachInSelectButton() {
        for (int i = 0; i < coach_details.size(); i++) {
            //set coach name in select coach box
            coaches[0] = "Choose Coach";
            coaches[i + 1] =coach_details.get(i).username;
            coachSelect.setModel(new DefaultComboBoxModel<>(coaches));
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
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLesson;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JComboBox<String> coachSelect;
    private com.toedter.calendar.JDateChooser dateSelect;
    private javax.swing.JComboBox<String> daySelect;
    private javax.swing.JComboBox<String> gradeSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnameField;
    private java.awt.Panel panel1;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField seatField;
    private javax.swing.JComboBox<String> slotSelect;
    // End of variables declaration//GEN-END:variables
}
