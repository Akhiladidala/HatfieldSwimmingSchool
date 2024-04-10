package hatfieldjuniorswimmingschool.view;

import hatfieldjuniorswimmingschool.controller.BookingController;
import hatfieldjuniorswimmingschool.controller.LessonController;
import hatfieldjuniorswimmingschool.controller.UserController;
import hatfieldjuniorswimmingschool.model.Lesson;
import hatfieldjuniorswimmingschool.model.User;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChangeLesson extends javax.swing.JFrame {

    private int userId;
    private String bookingId;
    private int user_grade;
    private String previous_lessonId;
    private String lesson_id;
    private String grade;
    private String lessonName;
    private String date;
    private String day;
    private String slot;
    private String seat;
    private String coachId;
    private String coachName;
    private String price;
    private List<Lesson> lesson_details;
    private List<User> coach_details;
    private String day_select = "All Day";
    private String grade_select = "All Grade";
    private String coach_select = "All Coach";
    DefaultTableModel tbmodel;
    private int row;
    //create array to store coach name
    private int arraySize = new LessonController().loadLessonDetails().size() + 1;
    String[] coaches = new String[arraySize];

    /**
     * Creates new form TimeTable
     * @param bookingId
     * @param userId
     * @param previous_lessonId
     */
    public ChangeLesson(String bookingId,int userId,String previous_lessonId) {
        this.coach_details = new UserController().fetchAllCoach();
        this.lesson_details = new LessonController().loadLessonDetails();
        this.user_grade=Integer.parseInt(new UserController().getUserById(userId).getGrade().substring(12));
        this.previous_lessonId=previous_lessonId;
        this.bookingId=bookingId;
        initComponents();
        tbmodel = (DefaultTableModel) lessonDetails.getModel();
        this.userId = userId;
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim6.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
        //store coach name in select button
        storeCoachInSelectButton();
        //get coach name in arraylist
        displayLessonDetails();
        bookLesson.setVisible(false);
        bookingPanel.setVisible(false);
    }

    public ChangeLesson() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coachSelect = new javax.swing.JComboBox<>();
        daySelect = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lessonDetails = new javax.swing.JTable();
        gradeSelect = new javax.swing.JComboBox<>();
        bookingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selectCoach = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selectDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        selectDay = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selectTime = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        selectGrade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selectSeat = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        selectPrice = new javax.swing.JLabel();
        bookLesson = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        selectLesson = new javax.swing.JLabel();
        selectName1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Lesson Time Table");

        coachSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coachSelect.setForeground(new java.awt.Color(0, 102, 255));
        coachSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachSelectActionPerformed(evt);
            }
        });

        daySelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        daySelect.setForeground(new java.awt.Color(0, 102, 255));
        daySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Day", "Monday", "Wednesday", "Friday", "Saturday" }));
        daySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daySelectActionPerformed(evt);
            }
        });

        lessonDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lessonDetails.setForeground(new java.awt.Color(0, 102, 255));
        lessonDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson ID", "Lesson Name", "Date", "Day", "Time Slot", "Grade Level", "Coach", "seat Available", "Price"
            }
        ));
        lessonDetails.setRowHeight(30);
        lessonDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lessonDetailsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lessonDetails);

        gradeSelect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gradeSelect.setForeground(new java.awt.Color(0, 102, 255));
        gradeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Grade", "Grade Level 1", "Grade Level 2", "Grade Level 3", "Grade Level 4", "Grade Level 5" }));
        gradeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gradeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coachSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coachSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 20, 880, 690);

        bookingPanel.setBackground(new java.awt.Color(255, 255, 255));
        bookingPanel.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Select Lesson");

        selectCoach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectCoach.setForeground(new java.awt.Color(0, 102, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Coach Name     :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Date                  :");

        selectDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectDate.setForeground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Day                    :");

        selectDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectDay.setForeground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Time                 :");

        selectTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectTime.setForeground(new java.awt.Color(0, 102, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Grade Level       :");

        selectGrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectGrade.setForeground(new java.awt.Color(0, 102, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Seat Available  :");

        selectSeat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectSeat.setForeground(new java.awt.Color(0, 102, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("Price                  :");

        selectPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectPrice.setForeground(new java.awt.Color(0, 102, 255));

        bookLesson.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookLesson.setForeground(new java.awt.Color(0, 102, 255));
        bookLesson.setText("Change Lesson");
        bookLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookLessonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Lesson Name   :");

        selectLesson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectLesson.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2))
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bookingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(selectCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bookingPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(bookLesson)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(bookLesson)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(bookingPanel);
        bookingPanel.setBounds(1150, 220, 370, 410);

        selectName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectName1.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(selectName1);
        selectName1.setBounds(0, 0, 0, 0);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 255));
        backButton.setText("Back to dashboard");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(20, 50, 170, 30);

        backgroundImage.setText("jLabel3");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, -1, 1530, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daySelectActionPerformed
        // TODO add your handling code here:
        day_select = (String) daySelect.getSelectedItem();
        filterLessonTable(day_select, coach_select, grade_select);
    }//GEN-LAST:event_daySelectActionPerformed

    private void coachSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachSelectActionPerformed
        // TODO add your handling code here:
        coach_select = (String) coachSelect.getSelectedItem();
        filterLessonTable(day_select, coach_select, grade_select);
    }//GEN-LAST:event_coachSelectActionPerformed

    private void lessonDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonDetailsMouseReleased
        // TODO add your handling code here:
        if (userId != 0) {
            bookingPanel.setVisible(true);
            getSelectLessonDetails();
        } else {
            bookingPanel.setVisible(true);
            getSelectLessonDetails();
        }


    }//GEN-LAST:event_lessonDetailsMouseReleased

    private void bookLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookLessonActionPerformed
        // TODO add your handling code here:
        changeLesson();
    }//GEN-LAST:event_bookLessonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if (userId == 0) {
            this.setVisible(false);
            new AdminDashboard().setVisible(true);
        } else {
            this.setVisible(false);
            new UserDashboard(userId).setVisible(true);
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void gradeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeSelectActionPerformed
        // TODO add your handling code here:
        grade_select = (String) gradeSelect.getSelectedItem();
        filterLessonTable(day_select, coach_select, grade_select);
    }//GEN-LAST:event_gradeSelectActionPerformed

    public void displayLessonDetails() {
        int id = 0;
        LessonController lesson = new LessonController();
        for (Lesson lessons : lesson_details) {
            id++;
            lesson_id = "" + lessons.getLessonID();
            lessonName = lessons.lessonName;
            date = lessons.date;
            day = lessons.day;
            slot = lessons.timeSlot;
            grade = lessons.getGradeLevel();
            seat = lessons.getSeat();
            price = lessons.getPrice();
            coachId = lessons.getCoachId();
            coachName = new UserController().getUserById(Integer.parseInt(coachId)).username;
            //display lessons details in jtable
            String toData[] = {"LESSON_ID_00" + lesson_id, lessonName, date, day, slot, grade, coachName, seat, price};
            DefaultTableModel tbmodel = (DefaultTableModel) lessonDetails.getModel();
            tbmodel.addRow(toData);
        }

    }

    //store coach name in select coach combo box
    public void storeCoachInSelectButton() {
        for (int i = 0; i < coach_details.size(); i++) {
            //set coach name in select coach box
            coaches[0] = "All Coach";
            coaches[i + 1] = coach_details.get(i).username;
            coachSelect.setModel(new DefaultComboBoxModel<>(coaches));
        }

    }

    //filter table according to select type
    public void filterLessonTable(String day_select, String coach_select, String grade_select) {
        boolean dataFound=false;
        //remove old data from jtable to show filter data
        tbmodel.getDataVector().removeAllElements();
        //fetch all lesson details from csv file
        List<Lesson> lesson_details = new LessonController().loadLessonDetails();
        if (!day_select.equalsIgnoreCase("All Day") && !coach_select.equalsIgnoreCase("All Coach") && !grade_select.equalsIgnoreCase("All Grade")) {
            for (int i = 0; i < lesson_details.size(); i++) {
                coachName = new UserController().getUserById(Integer.parseInt(lesson_details.get(i).getCoachId())).username;
                if (lesson_details.get(i).getDay().equalsIgnoreCase(day_select) && coachName.equalsIgnoreCase(coach_select) && lesson_details.get(i).getGradeLevel().equalsIgnoreCase(grade_select)) {
                    lesson_id = "" + lesson_details.get(i).getLessonID();
                    lessonName = lesson_details.get(i).lessonName;
                    date = lesson_details.get(i).date;
                    day = lesson_details.get(i).day;
                    slot = lesson_details.get(i).timeSlot;
                    grade = lesson_details.get(i).gradeLevel;
                    seat = lesson_details.get(i).seat;
                    price = lesson_details.get(i).price;
                    //display lessons details in jtable
                    String toData[] = {"LESSON_ID_00" + lesson_id, lessonName, date, day, slot, grade, coachName, seat, price};
                    tbmodel.addRow(toData);
                    dataFound=true;
                }
            }
        } else if (!day_select.equalsIgnoreCase("All Day") && !coach_select.equalsIgnoreCase("All Coach") || !coach_select.equalsIgnoreCase("All Coach") && !grade_select.equalsIgnoreCase("All Grade") || !day_select.equalsIgnoreCase("All Day") && !grade_select.equalsIgnoreCase("All Grade")) {
            for (int i = 0; i < lesson_details.size(); i++) {
                coachName = new UserController().getUserById(Integer.parseInt(lesson_details.get(i).getCoachId())).username;
                if (lesson_details.get(i).getDay().equalsIgnoreCase(day_select) && coachName.equalsIgnoreCase(coach_select)
                        || coachName.equalsIgnoreCase(coach_select) && lesson_details.get(i).getGradeLevel().equalsIgnoreCase(grade_select)
                        || lesson_details.get(i).day.equalsIgnoreCase(day_select) && lesson_details.get(i).getGradeLevel().equalsIgnoreCase(grade_select)) {
                    lesson_id = "" + lesson_details.get(i).getLessonID();
                    lessonName = lesson_details.get(i).lessonName;
                    date = lesson_details.get(i).date;
                    day = lesson_details.get(i).day;
                    slot = lesson_details.get(i).timeSlot;
                    grade = lesson_details.get(i).gradeLevel;
                    seat = lesson_details.get(i).seat;
                    price = lesson_details.get(i).price;
                    //display lessons details in jtable
                    String toData[] = {"LESSON_ID_00" + lesson_id, lessonName, date, day, slot, grade, coachName, seat, price};
                    tbmodel.addRow(toData);
                    dataFound=true;
                }
            }

        } else if (!day_select.equalsIgnoreCase("All Day") || !coach_select.equalsIgnoreCase("All Coach") || !grade_select.equalsIgnoreCase("All Grade")) {
            for (int i = 0; i < lesson_details.size(); i++) {
                coachName = new UserController().getUserById(Integer.parseInt(lesson_details.get(i).getCoachId())).username;
                if (lesson_details.get(i).getDay().equalsIgnoreCase(day_select) || coachName.equalsIgnoreCase(coach_select)
                        || lesson_details.get(i).getGradeLevel().equalsIgnoreCase(grade_select)) {
                    lesson_id = "" + lesson_details.get(i).getLessonID();
                    lessonName = lesson_details.get(i).lessonName;
                    date = lesson_details.get(i).date;
                    day = lesson_details.get(i).day;
                    slot = lesson_details.get(i).timeSlot;
                    grade = lesson_details.get(i).gradeLevel;
                    seat = lesson_details.get(i).seat;
                    price = lesson_details.get(i).price;
                    //display lessons details in jtable
                    String toData[] = {"LESSON_ID_00" + lesson_id, lessonName, date, day, slot, grade, coachName, seat, price};
                    tbmodel.addRow(toData);
                    dataFound=true;
                }
            }
        } else {
            displayLessonDetails();
        }
        //empty table if not data found
        if (!dataFound) {
             JOptionPane.showMessageDialog(this, "Not data found", "Alert", JOptionPane.WARNING_MESSAGE);
            //remove old data from jtable to show filter data
            tbmodel.getDataVector().removeAllElements();
            String toData[] = {"", "", "", "", "", "", "", "", ""};
            tbmodel.addRow(toData);

        }

    }

    //get details on select lessons
    private void getSelectLessonDetails() {
        row = lessonDetails.getSelectedRow();
        //get data from jtable on select
        lesson_id = lessonDetails.getModel().getValueAt(row, 0).toString();
        lessonName = lessonDetails.getModel().getValueAt(row, 1).toString();
        date = lessonDetails.getModel().getValueAt(row, 2).toString();
        day = lessonDetails.getModel().getValueAt(row, 3).toString();
        slot = lessonDetails.getModel().getValueAt(row, 4).toString();
        grade = lessonDetails.getModel().getValueAt(row, 5).toString();
        coachName = lessonDetails.getModel().getValueAt(row, 6).toString();
        seat = lessonDetails.getModel().getValueAt(row, 7).toString();
        price = lessonDetails.getModel().getValueAt(row, 8).toString();

        //display select lesson details
        selectLesson.setText(lessonName);
        selectCoach.setText(coachName);
        selectDate.setText(date);
        selectDay.setText(day);
        selectTime.setText(slot);
        selectGrade.setText(grade);
        selectSeat.setText(seat);
        selectPrice.setText(price);
        //chage seat into integer for validation seat is not less than 0
        int seat1 = Integer.parseInt(seat);
        if (seat1 <= 4 && seat1 >= 1) {
            bookLesson.setVisible(true);
            selectSeat.setForeground(Color.blue);
        } else {
            bookLesson.setVisible(false);
            selectSeat.setText("Seat Full");
            selectSeat.setForeground(Color.red);
        }
        int lesson_grade = Integer.parseInt(grade.substring(12));
        int user_grade1 = user_grade + 1;
        if (!(user_grade == lesson_grade || user_grade1 == lesson_grade)) {
            bookingPanel.setVisible(false);
            JOptionPane.showMessageDialog(this, "You are learner of grade level " + user_grade + "\n"
                    + "you can change only level " + user_grade + " or level " + user_grade1, "Alert", JOptionPane.WARNING_MESSAGE);

        }

    }

    //clear selected panel
    public void clearSelectedPanle() {
        //display select lesson details
        selectCoach.setText("");
        selectDate.setText("");
        selectDay.setText("");
        selectTime.setText("");
        selectGrade.setText("");
        selectSeat.setText("");
        selectPrice.setText("");
        bookLesson.setVisible(false);
    }
    
   
    //change lesson
    public void changeLesson() {
        int lessonId = Integer.parseInt(lesson_id.substring(12));
        boolean changeLesson = new BookingController().changeLesson(bookingId, lessonId, userId);
        if (changeLesson) {
            //update previous lesson seat
            new LessonController().updateSeatAvailablity(previous_lessonId, "Cancel");
            //update new lesson seat
            new LessonController().updateSeatAvailablity("" + lessonId, "Booked");
            JOptionPane.showMessageDialog(this, "Lesson change successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new UserDashboard(userId).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Lesson arleady booked", "Alert", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(ChangeLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeLesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton bookLesson;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JComboBox<String> coachSelect;
    private javax.swing.JComboBox<String> daySelect;
    private javax.swing.JComboBox<String> gradeSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lessonDetails;
    private javax.swing.JLabel selectCoach;
    private javax.swing.JLabel selectDate;
    private javax.swing.JLabel selectDay;
    private javax.swing.JLabel selectGrade;
    private javax.swing.JLabel selectLesson;
    private javax.swing.JLabel selectName1;
    private javax.swing.JLabel selectPrice;
    private javax.swing.JLabel selectSeat;
    private javax.swing.JLabel selectTime;
    // End of variables declaration//GEN-END:variables
}
