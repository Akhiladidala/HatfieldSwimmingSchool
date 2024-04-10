package hatfieldjuniorswimmingschool.view;

import hatfieldjuniorswimmingschool.controller.BookingController;
import hatfieldjuniorswimmingschool.controller.LessonController;
import hatfieldjuniorswimmingschool.controller.RatingController;
import hatfieldjuniorswimmingschool.controller.UserController;
import hatfieldjuniorswimmingschool.model.Booking;
import java.awt.Image;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class AdminDashboard extends javax.swing.JFrame {

    private int userId;
    private String bookingId;
    private int lessonId;
    private int coachId;
    private String coachName;
    private String lessonName;
    private String date;
    private String day;
    private String time;
    private String grade;
    private String status;
    private String price;
    private int totalBooking = 0;
    private int totalAttended = 0;
    private int totalRatings = 0;
    private int totalCancelled = 0;

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        showUserBookingDetails();
        fetchUserTotalRatings();
        totalBook.setText("" + totalBooking);
        totalAttend.setText("" + totalAttended);
        totalRating.setText("" + totalRatings);
        totalCancels.setText("" + totalCancelled);
        //set backgroundimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim6.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
        //set userimage
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/user.png")).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        adminImage.setIcon(imageIcon1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalBook = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        totalBook1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        totalBook2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        totalBook3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalAttend = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalAttend1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        totalAttend2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        totalAttend3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalAttend4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        totalAttend5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        totalAttend6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        totalAttend7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        totalAttend8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        totalAttend9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        totalAttend10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        totalAttend11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        totalAttend12 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        totalAttend13 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        totalAttend14 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        totalAttend15 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        totalCancels = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        totalBook6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        totalBook7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        totalBook8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        totalBook9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        totalBook10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        totalBook11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        totalBook12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        totalBook13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        totalBook14 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        totalBook15 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        totalBook16 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        totalBook17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        totalBook18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        totalBook19 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        totalBook20 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        adminImage = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        totalRating = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        checkTimeTableButton = new javax.swing.JButton();
        addLessonButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Admin Dashboard");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 110, 160, 22);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        totalBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook.setForeground(new java.awt.Color(0, 51, 255));
        totalBook.setText("0");
        jPanel1.add(totalBook);
        totalBook.setBounds(90, 50, 60, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Total Booking Lesson");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 20, 200, 22);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel11.setForeground(new java.awt.Color(0, 102, 255));
        jPanel11.setLayout(null);

        totalBook1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook1.setForeground(new java.awt.Color(0, 51, 255));
        totalBook1.setText("0");
        jPanel11.add(totalBook1);
        totalBook1.setBounds(130, 50, 60, 22);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Total Booking Lesson");
        jPanel11.add(jLabel13);
        jLabel13.setBounds(50, 20, 210, 22);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(560, 70, 270, 100);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel12.setForeground(new java.awt.Color(0, 102, 255));
        jPanel12.setLayout(null);

        totalBook2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook2.setForeground(new java.awt.Color(0, 51, 255));
        totalBook2.setText("0");
        jPanel12.add(totalBook2);
        totalBook2.setBounds(130, 50, 60, 22);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("Total Booking Lesson");
        jPanel12.add(jLabel14);
        jLabel14.setBounds(50, 20, 210, 22);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel13.setForeground(new java.awt.Color(0, 102, 255));
        jPanel13.setLayout(null);

        totalBook3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook3.setForeground(new java.awt.Color(0, 51, 255));
        totalBook3.setText("0");
        jPanel13.add(totalBook3);
        totalBook3.setBounds(130, 50, 60, 22);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setText("Total Booking Lesson");
        jPanel13.add(jLabel15);
        jLabel15.setBounds(50, 20, 210, 22);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(560, 70, 270, 100);

        jPanel1.add(jPanel12);
        jPanel12.setBounds(560, 70, 270, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 70, 220, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Total Attend Lesson");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 190, 22);

        totalAttend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend.setText("0");
        jPanel2.add(totalAttend);
        totalAttend.setBounds(80, 50, 60, 22);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel4.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Total Attend Lesson");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(50, 20, 210, 22);

        totalAttend1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend1.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend1.setText("0");
        jPanel4.add(totalAttend1);
        totalAttend1.setBounds(130, 50, 60, 22);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(920, 70, 270, 100);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Total Attend Lesson");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(50, 20, 210, 22);

        totalAttend2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend2.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend2.setText("0");
        jPanel5.add(totalAttend2);
        totalAttend2.setBounds(130, 50, 60, 22);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel6.setForeground(new java.awt.Color(0, 102, 255));
        jPanel6.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Total Attend Lesson");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(50, 20, 210, 22);

        totalAttend3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend3.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend3.setText("0");
        jPanel6.add(totalAttend3);
        totalAttend3.setBounds(130, 50, 60, 22);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(920, 70, 270, 100);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(920, 70, 270, 100);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel7.setForeground(new java.awt.Color(0, 102, 255));
        jPanel7.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Total Attend Lesson");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(50, 20, 210, 22);

        totalAttend4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend4.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend4.setText("0");
        jPanel7.add(totalAttend4);
        totalAttend4.setBounds(130, 50, 60, 22);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel8.setForeground(new java.awt.Color(0, 102, 255));
        jPanel8.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Total Attend Lesson");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(50, 20, 210, 22);

        totalAttend5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend5.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend5.setText("0");
        jPanel8.add(totalAttend5);
        totalAttend5.setBounds(130, 50, 60, 22);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(920, 70, 270, 100);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel9.setForeground(new java.awt.Color(0, 102, 255));
        jPanel9.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Total Attend Lesson");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(50, 20, 210, 22);

        totalAttend6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend6.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend6.setText("0");
        jPanel9.add(totalAttend6);
        totalAttend6.setBounds(130, 50, 60, 22);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel10.setForeground(new java.awt.Color(0, 102, 255));
        jPanel10.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("Total Attend Lesson");
        jPanel10.add(jLabel10);
        jLabel10.setBounds(50, 20, 210, 22);

        totalAttend7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend7.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend7.setText("0");
        jPanel10.add(totalAttend7);
        totalAttend7.setBounds(130, 50, 60, 22);

        jPanel9.add(jPanel10);
        jPanel10.setBounds(920, 70, 270, 100);

        jPanel7.add(jPanel9);
        jPanel9.setBounds(920, 70, 270, 100);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(930, 70, 270, 100);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel15.setForeground(new java.awt.Color(0, 102, 255));
        jPanel15.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Total Attend Lesson");
        jPanel15.add(jLabel11);
        jLabel11.setBounds(10, 20, 190, 22);

        totalAttend8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend8.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend8.setText("0");
        jPanel15.add(totalAttend8);
        totalAttend8.setBounds(80, 50, 60, 22);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel16.setForeground(new java.awt.Color(0, 102, 255));
        jPanel16.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("Total Attend Lesson");
        jPanel16.add(jLabel17);
        jLabel17.setBounds(50, 20, 210, 22);

        totalAttend9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend9.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend9.setText("0");
        jPanel16.add(totalAttend9);
        totalAttend9.setBounds(130, 50, 60, 22);

        jPanel15.add(jPanel16);
        jPanel16.setBounds(920, 70, 270, 100);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel17.setForeground(new java.awt.Color(0, 102, 255));
        jPanel17.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("Total Attend Lesson");
        jPanel17.add(jLabel18);
        jLabel18.setBounds(50, 20, 210, 22);

        totalAttend10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend10.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend10.setText("0");
        jPanel17.add(totalAttend10);
        totalAttend10.setBounds(130, 50, 60, 22);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel18.setForeground(new java.awt.Color(0, 102, 255));
        jPanel18.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setText("Total Attend Lesson");
        jPanel18.add(jLabel19);
        jLabel19.setBounds(50, 20, 210, 22);

        totalAttend11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend11.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend11.setText("0");
        jPanel18.add(totalAttend11);
        totalAttend11.setBounds(130, 50, 60, 22);

        jPanel17.add(jPanel18);
        jPanel18.setBounds(920, 70, 270, 100);

        jPanel15.add(jPanel17);
        jPanel17.setBounds(920, 70, 270, 100);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel19.setForeground(new java.awt.Color(0, 102, 255));
        jPanel19.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setText("Total Attend Lesson");
        jPanel19.add(jLabel20);
        jLabel20.setBounds(50, 20, 210, 22);

        totalAttend12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend12.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend12.setText("0");
        jPanel19.add(totalAttend12);
        totalAttend12.setBounds(130, 50, 60, 22);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel20.setForeground(new java.awt.Color(0, 102, 255));
        jPanel20.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 255));
        jLabel21.setText("Total Attend Lesson");
        jPanel20.add(jLabel21);
        jLabel21.setBounds(50, 20, 210, 22);

        totalAttend13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend13.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend13.setText("0");
        jPanel20.add(totalAttend13);
        totalAttend13.setBounds(130, 50, 60, 22);

        jPanel19.add(jPanel20);
        jPanel20.setBounds(920, 70, 270, 100);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel21.setForeground(new java.awt.Color(0, 102, 255));
        jPanel21.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 255));
        jLabel22.setText("Total Attend Lesson");
        jPanel21.add(jLabel22);
        jLabel22.setBounds(50, 20, 210, 22);

        totalAttend14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend14.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend14.setText("0");
        jPanel21.add(totalAttend14);
        totalAttend14.setBounds(130, 50, 60, 22);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel22.setForeground(new java.awt.Color(0, 102, 255));
        jPanel22.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 255));
        jLabel23.setText("Total Attend Lesson");
        jPanel22.add(jLabel23);
        jLabel23.setBounds(50, 20, 210, 22);

        totalAttend15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend15.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend15.setText("0");
        jPanel22.add(totalAttend15);
        totalAttend15.setBounds(130, 50, 60, 22);

        jPanel21.add(jPanel22);
        jPanel22.setBounds(920, 70, 270, 100);

        jPanel19.add(jPanel21);
        jPanel21.setBounds(920, 70, 270, 100);

        jPanel15.add(jPanel19);
        jPanel19.setBounds(930, 70, 270, 100);

        jPanel2.add(jPanel15);
        jPanel15.setBounds(710, 70, 210, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(710, 70, 210, 100);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel23.setForeground(new java.awt.Color(0, 102, 255));
        jPanel23.setLayout(null);

        totalCancels.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalCancels.setForeground(new java.awt.Color(0, 51, 255));
        totalCancels.setText("0");
        jPanel23.add(totalCancels);
        totalCancels.setBounds(90, 50, 60, 22);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("Total Cancel Lesson");
        jPanel23.add(jLabel24);
        jLabel24.setBounds(20, 20, 190, 22);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel24.setForeground(new java.awt.Color(0, 102, 255));
        jPanel24.setLayout(null);

        totalBook6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook6.setForeground(new java.awt.Color(0, 51, 255));
        totalBook6.setText("0");
        jPanel24.add(totalBook6);
        totalBook6.setBounds(130, 50, 60, 22);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 255));
        jLabel25.setText("Total Booking Lesson");
        jPanel24.add(jLabel25);
        jLabel25.setBounds(50, 20, 210, 22);

        jPanel23.add(jPanel24);
        jPanel24.setBounds(560, 70, 270, 100);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel25.setForeground(new java.awt.Color(0, 102, 255));
        jPanel25.setLayout(null);

        totalBook7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook7.setForeground(new java.awt.Color(0, 51, 255));
        totalBook7.setText("0");
        jPanel25.add(totalBook7);
        totalBook7.setBounds(130, 50, 60, 22);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 255));
        jLabel26.setText("Total Booking Lesson");
        jPanel25.add(jLabel26);
        jLabel26.setBounds(50, 20, 210, 22);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel26.setForeground(new java.awt.Color(0, 102, 255));
        jPanel26.setLayout(null);

        totalBook8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook8.setForeground(new java.awt.Color(0, 51, 255));
        totalBook8.setText("0");
        jPanel26.add(totalBook8);
        totalBook8.setBounds(130, 50, 60, 22);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 255));
        jLabel27.setText("Total Booking Lesson");
        jPanel26.add(jLabel27);
        jLabel27.setBounds(50, 20, 210, 22);

        jPanel25.add(jPanel26);
        jPanel26.setBounds(560, 70, 270, 100);

        jPanel23.add(jPanel25);
        jPanel25.setBounds(560, 70, 270, 100);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel27.setForeground(new java.awt.Color(0, 102, 255));
        jPanel27.setLayout(null);

        totalBook9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook9.setForeground(new java.awt.Color(0, 51, 255));
        totalBook9.setText("0");
        jPanel27.add(totalBook9);
        totalBook9.setBounds(130, 50, 60, 22);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 255));
        jLabel28.setText("Total Booking Lesson");
        jPanel27.add(jLabel28);
        jLabel28.setBounds(50, 20, 210, 22);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel28.setForeground(new java.awt.Color(0, 102, 255));
        jPanel28.setLayout(null);

        totalBook10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook10.setForeground(new java.awt.Color(0, 51, 255));
        totalBook10.setText("0");
        jPanel28.add(totalBook10);
        totalBook10.setBounds(130, 50, 60, 22);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 255));
        jLabel29.setText("Total Booking Lesson");
        jPanel28.add(jLabel29);
        jLabel29.setBounds(50, 20, 210, 22);

        jPanel27.add(jPanel28);
        jPanel28.setBounds(560, 70, 270, 100);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel29.setForeground(new java.awt.Color(0, 102, 255));
        jPanel29.setLayout(null);

        totalBook11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook11.setForeground(new java.awt.Color(0, 51, 255));
        totalBook11.setText("0");
        jPanel29.add(totalBook11);
        totalBook11.setBounds(130, 50, 60, 22);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 255));
        jLabel30.setText("Total Booking Lesson");
        jPanel29.add(jLabel30);
        jLabel30.setBounds(50, 20, 210, 22);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel30.setForeground(new java.awt.Color(0, 102, 255));
        jPanel30.setLayout(null);

        totalBook12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook12.setForeground(new java.awt.Color(0, 51, 255));
        totalBook12.setText("0");
        jPanel30.add(totalBook12);
        totalBook12.setBounds(130, 50, 60, 22);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 255));
        jLabel31.setText("Total Booking Lesson");
        jPanel30.add(jLabel31);
        jLabel31.setBounds(50, 20, 210, 22);

        jPanel29.add(jPanel30);
        jPanel30.setBounds(560, 70, 270, 100);

        jPanel27.add(jPanel29);
        jPanel29.setBounds(560, 70, 270, 100);

        jPanel23.add(jPanel27);
        jPanel27.setBounds(560, 70, 270, 100);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel31.setForeground(new java.awt.Color(0, 102, 255));
        jPanel31.setLayout(null);

        totalBook13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook13.setForeground(new java.awt.Color(0, 51, 255));
        totalBook13.setText("0");
        jPanel31.add(totalBook13);
        totalBook13.setBounds(130, 50, 60, 22);

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 255));
        jLabel32.setText("Total Booking Lesson");
        jPanel31.add(jLabel32);
        jLabel32.setBounds(50, 20, 210, 22);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel32.setForeground(new java.awt.Color(0, 102, 255));
        jPanel32.setLayout(null);

        totalBook14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook14.setForeground(new java.awt.Color(0, 51, 255));
        totalBook14.setText("0");
        jPanel32.add(totalBook14);
        totalBook14.setBounds(130, 50, 60, 22);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 255));
        jLabel33.setText("Total Booking Lesson");
        jPanel32.add(jLabel33);
        jLabel33.setBounds(50, 20, 210, 22);

        jPanel31.add(jPanel32);
        jPanel32.setBounds(560, 70, 270, 100);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel33.setForeground(new java.awt.Color(0, 102, 255));
        jPanel33.setLayout(null);

        totalBook15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook15.setForeground(new java.awt.Color(0, 51, 255));
        totalBook15.setText("0");
        jPanel33.add(totalBook15);
        totalBook15.setBounds(130, 50, 60, 22);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 255));
        jLabel34.setText("Total Booking Lesson");
        jPanel33.add(jLabel34);
        jLabel34.setBounds(50, 20, 210, 22);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel34.setForeground(new java.awt.Color(0, 102, 255));
        jPanel34.setLayout(null);

        totalBook16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook16.setForeground(new java.awt.Color(0, 51, 255));
        totalBook16.setText("0");
        jPanel34.add(totalBook16);
        totalBook16.setBounds(130, 50, 60, 22);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 255));
        jLabel35.setText("Total Booking Lesson");
        jPanel34.add(jLabel35);
        jLabel35.setBounds(50, 20, 210, 22);

        jPanel33.add(jPanel34);
        jPanel34.setBounds(560, 70, 270, 100);

        jPanel31.add(jPanel33);
        jPanel33.setBounds(560, 70, 270, 100);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel35.setForeground(new java.awt.Color(0, 102, 255));
        jPanel35.setLayout(null);

        totalBook17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook17.setForeground(new java.awt.Color(0, 51, 255));
        totalBook17.setText("0");
        jPanel35.add(totalBook17);
        totalBook17.setBounds(130, 50, 60, 22);

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 51, 255));
        jLabel36.setText("Total Booking Lesson");
        jPanel35.add(jLabel36);
        jLabel36.setBounds(50, 20, 210, 22);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel36.setForeground(new java.awt.Color(0, 102, 255));
        jPanel36.setLayout(null);

        totalBook18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook18.setForeground(new java.awt.Color(0, 51, 255));
        totalBook18.setText("0");
        jPanel36.add(totalBook18);
        totalBook18.setBounds(130, 50, 60, 22);

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 51, 255));
        jLabel37.setText("Total Booking Lesson");
        jPanel36.add(jLabel37);
        jLabel37.setBounds(50, 20, 210, 22);

        jPanel35.add(jPanel36);
        jPanel36.setBounds(560, 70, 270, 100);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel37.setForeground(new java.awt.Color(0, 102, 255));
        jPanel37.setLayout(null);

        totalBook19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook19.setForeground(new java.awt.Color(0, 51, 255));
        totalBook19.setText("0");
        jPanel37.add(totalBook19);
        totalBook19.setBounds(130, 50, 60, 22);

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 51, 255));
        jLabel38.setText("Total Booking Lesson");
        jPanel37.add(jLabel38);
        jLabel38.setBounds(50, 20, 210, 22);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel38.setForeground(new java.awt.Color(0, 102, 255));
        jPanel38.setLayout(null);

        totalBook20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook20.setForeground(new java.awt.Color(0, 51, 255));
        totalBook20.setText("0");
        jPanel38.add(totalBook20);
        totalBook20.setBounds(130, 50, 60, 22);

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 51, 255));
        jLabel39.setText("Total Booking Lesson");
        jPanel38.add(jLabel39);
        jLabel39.setBounds(50, 20, 210, 22);

        jPanel37.add(jPanel38);
        jPanel38.setBounds(560, 70, 270, 100);

        jPanel35.add(jPanel37);
        jPanel37.setBounds(560, 70, 270, 100);

        jPanel31.add(jPanel35);
        jPanel35.setBounds(560, 70, 270, 100);

        jPanel23.add(jPanel31);
        jPanel31.setBounds(560, 70, 270, 100);

        getContentPane().add(jPanel23);
        jPanel23.setBounds(1010, 70, 220, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        bookingDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookingDetails.setForeground(new java.awt.Color(0, 102, 255));
        bookingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Lesson Name", "User Name", "Coach Name", "Date", "Day", "Time", "Grade", "Status", "Price"
            }
        ));
        bookingDetails.setRowHeight(30);
        bookingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bookingDetailsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(bookingDetails);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 930, 360);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Booking Details");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(440, 30, 160, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(400, 250, 990, 460);

        userName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 102, 255));
        userName.setText("Admin");
        getContentPane().add(userName);
        userName.setBounds(160, 340, 80, 30);
        getContentPane().add(adminImage);
        adminImage.setBounds(130, 200, 130, 130);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel14.setForeground(new java.awt.Color(0, 102, 255));
        jPanel14.setLayout(null);

        totalRating.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalRating.setForeground(new java.awt.Color(0, 51, 255));
        totalRating.setText("0");
        jPanel14.add(totalRating);
        totalRating.setBounds(100, 60, 60, 22);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("Total Ratings");
        jPanel14.add(jLabel16);
        jLabel16.setBounds(80, 20, 140, 22);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(1280, 70, 230, 100);

        checkTimeTableButton.setBackground(new java.awt.Color(0, 102, 255));
        checkTimeTableButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkTimeTableButton.setForeground(new java.awt.Color(255, 255, 255));
        checkTimeTableButton.setText("Check TimeTable");
        checkTimeTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTimeTableButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkTimeTableButton);
        checkTimeTableButton.setBounds(50, 410, 280, 40);

        addLessonButton.setBackground(new java.awt.Color(0, 102, 255));
        addLessonButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addLessonButton.setForeground(new java.awt.Color(255, 255, 255));
        addLessonButton.setText("Add Lesson");
        addLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLessonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addLessonButton);
        addLessonButton.setBounds(50, 480, 280, 40);

        reportButton.setBackground(new java.awt.Color(0, 102, 255));
        reportButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Monthly Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reportButton);
        reportButton.setBounds(50, 550, 280, 40);

        logoutButton.setBackground(new java.awt.Color(0, 102, 255));
        logoutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(50, 630, 280, 40);

        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingDetailsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingDetailsMouseReleased

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MonthlyReport().setVisible(true);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void addLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLessonButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddLesson().setVisible(true);
    }//GEN-LAST:event_addLessonButtonActionPerformed

    private void checkTimeTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTimeTableButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LessonTimeTable().setVisible(true);
    }//GEN-LAST:event_checkTimeTableButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    //display user booking details
    public void showUserBookingDetails() {
        String username;
        List<Booking> booking_details = new BookingController().loadBookingDetails();
        DefaultTableModel tbmodel = (DefaultTableModel) bookingDetails.getModel();
        for (int i = 0; i < booking_details.size(); i++) {
            bookingId = booking_details.get(i).getBookingId();
            lessonId = booking_details.get(i).getLesson().getLessonID();
            userId = booking_details.get(i).getUser().getUserId();
            username = new UserController().getUserById(userId).username;
            coachId = Integer.parseInt(booking_details.get(i).getLesson().getCoachId());
            coachName = new UserController().getUserById(coachId).getUsername();
            lessonName = new LessonController().getLessonById(lessonId).getLessonName();
            date = booking_details.get(i).getLesson().getDate();
            day = booking_details.get(i).getLesson().getDay();
            time = booking_details.get(i).getLesson().getTimeSlot();
            grade = booking_details.get(i).getLesson().getGradeLevel();
            status = booking_details.get(i).getStatus();
            price = booking_details.get(i).getLesson().getPrice();
            //display lessons details in jtable
            String toData[] = {"BOOKING_NO_000" + bookingId, lessonName, username, coachName, date, day, time, grade, status, price};
            //add new data in this table
            tbmodel.addRow(toData);
            //get total attended lesson
            totalBooking++;
            

            //get total attended lesson
            if (booking_details.get(i).getStatus().equalsIgnoreCase("Attended")) {
                totalAttended++;
            }
            //get total attended lesson
            if (booking_details.get(i).getStatus().equalsIgnoreCase("Cancelled")) {
                totalCancelled++;
            }
        }
    }

    // get user total ratings
    public void fetchUserTotalRatings() {
        List<Map<String, String>> rating_details = new RatingController().loadRatingData();
        for (int i = 0; i < rating_details.size(); i++) {
            totalRatings++;
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLessonButton;
    private javax.swing.JLabel adminImage;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTable bookingDetails;
    private javax.swing.JButton checkTimeTableButton;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel totalAttend;
    private javax.swing.JLabel totalAttend1;
    private javax.swing.JLabel totalAttend10;
    private javax.swing.JLabel totalAttend11;
    private javax.swing.JLabel totalAttend12;
    private javax.swing.JLabel totalAttend13;
    private javax.swing.JLabel totalAttend14;
    private javax.swing.JLabel totalAttend15;
    private javax.swing.JLabel totalAttend2;
    private javax.swing.JLabel totalAttend3;
    private javax.swing.JLabel totalAttend4;
    private javax.swing.JLabel totalAttend5;
    private javax.swing.JLabel totalAttend6;
    private javax.swing.JLabel totalAttend7;
    private javax.swing.JLabel totalAttend8;
    private javax.swing.JLabel totalAttend9;
    private javax.swing.JLabel totalBook;
    private javax.swing.JLabel totalBook1;
    private javax.swing.JLabel totalBook10;
    private javax.swing.JLabel totalBook11;
    private javax.swing.JLabel totalBook12;
    private javax.swing.JLabel totalBook13;
    private javax.swing.JLabel totalBook14;
    private javax.swing.JLabel totalBook15;
    private javax.swing.JLabel totalBook16;
    private javax.swing.JLabel totalBook17;
    private javax.swing.JLabel totalBook18;
    private javax.swing.JLabel totalBook19;
    private javax.swing.JLabel totalBook2;
    private javax.swing.JLabel totalBook20;
    private javax.swing.JLabel totalBook3;
    private javax.swing.JLabel totalBook6;
    private javax.swing.JLabel totalBook7;
    private javax.swing.JLabel totalBook8;
    private javax.swing.JLabel totalBook9;
    private javax.swing.JLabel totalCancels;
    private javax.swing.JLabel totalRating;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
