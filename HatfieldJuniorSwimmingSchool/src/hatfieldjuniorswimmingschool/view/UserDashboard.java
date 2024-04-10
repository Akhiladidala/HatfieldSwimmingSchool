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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class UserDashboard extends javax.swing.JFrame {

    private int userId;
    private int user_grade;
    private String username;
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
    private int row;
    BookingController bookings;
    List<Booking> bookingDetail = null;
    private int totalBooking = 0;
    private int totalAttended = 0;
    private int totalRating = 0;

    //create constructor with parameter
    public UserDashboard(int userId) {
        initComponents();
        this.userId = userId;
        username = new UserController().getUserById(userId).getUsername();
        this.user_grade = Integer.parseInt(new UserController().getUserById(userId).getGrade().substring(12));
        userName.setText(username);
        userBookingDetails();
        fetchUserTotalRatings();
        totalBook.setText("" + totalBooking);
        totalAttend.setText("" + totalAttended);
        totalRatings.setText("" + totalRating);
        //set backgroundimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim6.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
        //set userimage
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/user.png")).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        userImage.setIcon(imageIcon1);
    }

    //create constructor without parameter
    public UserDashboard() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalBook = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        totalBook1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        totalBook2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        totalBook3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        totalBook4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        totalBook5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        totalBook6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        totalBook7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        totalBook8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        totalBook9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        totalBook10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        totalBook11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        totalBook12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        totalBook13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        totalBook14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        totalBook15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalAttend = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalAttend1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        totalAttend2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        totalAttend3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        totalRatings = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        totalBook17 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        totalBook18 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        totalBook19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDetails = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        selectionPanel = new javax.swing.JPanel();
        selectCoach = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selectDate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selectDay = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selectSlot = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        selectGrade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selectStatus = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        selectPrice = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        attendLesson = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        selectLesson = new javax.swing.JLabel();
        userImage = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        timeButton = new javax.swing.JButton();
        monthReport = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("User Dashboard");
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
        totalBook.setBounds(130, 50, 60, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Total Booking Lesson");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 20, 210, 22);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel8.setForeground(new java.awt.Color(0, 102, 255));
        jPanel8.setLayout(null);

        totalBook1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook1.setForeground(new java.awt.Color(0, 51, 255));
        totalBook1.setText("0");
        jPanel8.add(totalBook1);
        totalBook1.setBounds(130, 50, 60, 22);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("Total Booking Lesson");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(50, 20, 210, 22);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(560, 70, 270, 100);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel9.setForeground(new java.awt.Color(0, 102, 255));
        jPanel9.setLayout(null);

        totalBook2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook2.setForeground(new java.awt.Color(0, 51, 255));
        totalBook2.setText("0");
        jPanel9.add(totalBook2);
        totalBook2.setBounds(130, 50, 60, 22);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("Total Booking Lesson");
        jPanel9.add(jLabel17);
        jLabel17.setBounds(50, 20, 210, 22);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel10.setForeground(new java.awt.Color(0, 102, 255));
        jPanel10.setLayout(null);

        totalBook3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook3.setForeground(new java.awt.Color(0, 51, 255));
        totalBook3.setText("0");
        jPanel10.add(totalBook3);
        totalBook3.setBounds(130, 50, 60, 22);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("Total Booking Lesson");
        jPanel10.add(jLabel18);
        jLabel18.setBounds(50, 20, 210, 22);

        jPanel9.add(jPanel10);
        jPanel10.setBounds(560, 70, 270, 100);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(560, 70, 270, 100);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel11.setForeground(new java.awt.Color(0, 102, 255));
        jPanel11.setLayout(null);

        totalBook4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook4.setForeground(new java.awt.Color(0, 51, 255));
        totalBook4.setText("0");
        jPanel11.add(totalBook4);
        totalBook4.setBounds(130, 50, 60, 22);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setText("Total Booking Lesson");
        jPanel11.add(jLabel19);
        jLabel19.setBounds(50, 20, 210, 22);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel12.setForeground(new java.awt.Color(0, 102, 255));
        jPanel12.setLayout(null);

        totalBook5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook5.setForeground(new java.awt.Color(0, 51, 255));
        totalBook5.setText("0");
        jPanel12.add(totalBook5);
        totalBook5.setBounds(130, 50, 60, 22);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setText("Total Booking Lesson");
        jPanel12.add(jLabel20);
        jLabel20.setBounds(50, 20, 210, 22);

        jPanel11.add(jPanel12);
        jPanel12.setBounds(560, 70, 270, 100);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel13.setForeground(new java.awt.Color(0, 102, 255));
        jPanel13.setLayout(null);

        totalBook6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook6.setForeground(new java.awt.Color(0, 51, 255));
        totalBook6.setText("0");
        jPanel13.add(totalBook6);
        totalBook6.setBounds(130, 50, 60, 22);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 255));
        jLabel21.setText("Total Booking Lesson");
        jPanel13.add(jLabel21);
        jLabel21.setBounds(50, 20, 210, 22);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel14.setForeground(new java.awt.Color(0, 102, 255));
        jPanel14.setLayout(null);

        totalBook7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook7.setForeground(new java.awt.Color(0, 51, 255));
        totalBook7.setText("0");
        jPanel14.add(totalBook7);
        totalBook7.setBounds(130, 50, 60, 22);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 255));
        jLabel22.setText("Total Booking Lesson");
        jPanel14.add(jLabel22);
        jLabel22.setBounds(50, 20, 210, 22);

        jPanel13.add(jPanel14);
        jPanel14.setBounds(560, 70, 270, 100);

        jPanel11.add(jPanel13);
        jPanel13.setBounds(560, 70, 270, 100);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(560, 70, 270, 100);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel15.setForeground(new java.awt.Color(0, 102, 255));
        jPanel15.setLayout(null);

        totalBook8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook8.setForeground(new java.awt.Color(0, 51, 255));
        totalBook8.setText("0");
        jPanel15.add(totalBook8);
        totalBook8.setBounds(130, 50, 60, 22);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 255));
        jLabel23.setText("Total Booking Lesson");
        jPanel15.add(jLabel23);
        jLabel23.setBounds(50, 20, 210, 22);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel16.setForeground(new java.awt.Color(0, 102, 255));
        jPanel16.setLayout(null);

        totalBook9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook9.setForeground(new java.awt.Color(0, 51, 255));
        totalBook9.setText("0");
        jPanel16.add(totalBook9);
        totalBook9.setBounds(130, 50, 60, 22);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("Total Booking Lesson");
        jPanel16.add(jLabel24);
        jLabel24.setBounds(50, 20, 210, 22);

        jPanel15.add(jPanel16);
        jPanel16.setBounds(560, 70, 270, 100);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel17.setForeground(new java.awt.Color(0, 102, 255));
        jPanel17.setLayout(null);

        totalBook10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook10.setForeground(new java.awt.Color(0, 51, 255));
        totalBook10.setText("0");
        jPanel17.add(totalBook10);
        totalBook10.setBounds(130, 50, 60, 22);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 255));
        jLabel25.setText("Total Booking Lesson");
        jPanel17.add(jLabel25);
        jLabel25.setBounds(50, 20, 210, 22);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel18.setForeground(new java.awt.Color(0, 102, 255));
        jPanel18.setLayout(null);

        totalBook11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook11.setForeground(new java.awt.Color(0, 51, 255));
        totalBook11.setText("0");
        jPanel18.add(totalBook11);
        totalBook11.setBounds(130, 50, 60, 22);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 255));
        jLabel26.setText("Total Booking Lesson");
        jPanel18.add(jLabel26);
        jLabel26.setBounds(50, 20, 210, 22);

        jPanel17.add(jPanel18);
        jPanel18.setBounds(560, 70, 270, 100);

        jPanel15.add(jPanel17);
        jPanel17.setBounds(560, 70, 270, 100);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel19.setForeground(new java.awt.Color(0, 102, 255));
        jPanel19.setLayout(null);

        totalBook12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook12.setForeground(new java.awt.Color(0, 51, 255));
        totalBook12.setText("0");
        jPanel19.add(totalBook12);
        totalBook12.setBounds(130, 50, 60, 22);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 255));
        jLabel27.setText("Total Booking Lesson");
        jPanel19.add(jLabel27);
        jLabel27.setBounds(50, 20, 210, 22);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel20.setForeground(new java.awt.Color(0, 102, 255));
        jPanel20.setLayout(null);

        totalBook13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook13.setForeground(new java.awt.Color(0, 51, 255));
        totalBook13.setText("0");
        jPanel20.add(totalBook13);
        totalBook13.setBounds(130, 50, 60, 22);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 255));
        jLabel28.setText("Total Booking Lesson");
        jPanel20.add(jLabel28);
        jLabel28.setBounds(50, 20, 210, 22);

        jPanel19.add(jPanel20);
        jPanel20.setBounds(560, 70, 270, 100);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel21.setForeground(new java.awt.Color(0, 102, 255));
        jPanel21.setLayout(null);

        totalBook14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook14.setForeground(new java.awt.Color(0, 51, 255));
        totalBook14.setText("0");
        jPanel21.add(totalBook14);
        totalBook14.setBounds(130, 50, 60, 22);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 255));
        jLabel29.setText("Total Booking Lesson");
        jPanel21.add(jLabel29);
        jLabel29.setBounds(50, 20, 210, 22);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel22.setForeground(new java.awt.Color(0, 102, 255));
        jPanel22.setLayout(null);

        totalBook15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook15.setForeground(new java.awt.Color(0, 51, 255));
        totalBook15.setText("0");
        jPanel22.add(totalBook15);
        totalBook15.setBounds(130, 50, 60, 22);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 255));
        jLabel30.setText("Total Booking Lesson");
        jPanel22.add(jLabel30);
        jLabel30.setBounds(50, 20, 210, 22);

        jPanel21.add(jPanel22);
        jPanel22.setBounds(560, 70, 270, 100);

        jPanel19.add(jPanel21);
        jPanel21.setBounds(560, 70, 270, 100);

        jPanel15.add(jPanel19);
        jPanel19.setBounds(560, 70, 270, 100);

        jPanel1.add(jPanel15);
        jPanel15.setBounds(560, 70, 270, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 130, 270, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Total Attend Lesson");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 20, 210, 22);

        totalAttend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend.setText("0");
        jPanel2.add(totalAttend);
        totalAttend.setBounds(130, 50, 60, 22);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Total Attend Lesson");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(50, 20, 210, 22);

        totalAttend1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend1.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend1.setText("0");
        jPanel5.add(totalAttend1);
        totalAttend1.setBounds(130, 50, 60, 22);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(940, 70, 260, 100);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel6.setForeground(new java.awt.Color(0, 102, 255));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Total Attend Lesson");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(50, 20, 210, 22);

        totalAttend2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend2.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend2.setText("0");
        jPanel6.add(totalAttend2);
        totalAttend2.setBounds(130, 50, 60, 22);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel7.setForeground(new java.awt.Color(0, 102, 255));
        jPanel7.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("Total Attend Lesson");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(50, 20, 210, 22);

        totalAttend3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAttend3.setForeground(new java.awt.Color(0, 51, 255));
        totalAttend3.setText("0");
        jPanel7.add(totalAttend3);
        totalAttend3.setBounds(130, 50, 60, 22);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(940, 70, 260, 100);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(940, 70, 260, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(840, 130, 260, 100);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel23.setForeground(new java.awt.Color(0, 102, 255));
        jPanel23.setLayout(null);

        totalRatings.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalRatings.setForeground(new java.awt.Color(0, 51, 255));
        totalRatings.setText("0");
        jPanel23.add(totalRatings);
        totalRatings.setBounds(130, 50, 60, 22);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 255));
        jLabel31.setText("Total Ratings");
        jPanel23.add(jLabel31);
        jLabel31.setBounds(50, 20, 130, 22);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel24.setForeground(new java.awt.Color(0, 102, 255));
        jPanel24.setLayout(null);

        totalBook17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook17.setForeground(new java.awt.Color(0, 51, 255));
        totalBook17.setText("0");
        jPanel24.add(totalBook17);
        totalBook17.setBounds(130, 50, 60, 22);

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 255));
        jLabel32.setText("Total Booking Lesson");
        jPanel24.add(jLabel32);
        jLabel32.setBounds(50, 20, 210, 22);

        jPanel23.add(jPanel24);
        jPanel24.setBounds(560, 70, 270, 100);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel25.setForeground(new java.awt.Color(0, 102, 255));
        jPanel25.setLayout(null);

        totalBook18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook18.setForeground(new java.awt.Color(0, 51, 255));
        totalBook18.setText("0");
        jPanel25.add(totalBook18);
        totalBook18.setBounds(130, 50, 60, 22);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 255));
        jLabel33.setText("Total Booking Lesson");
        jPanel25.add(jLabel33);
        jLabel33.setBounds(50, 20, 210, 22);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        jPanel26.setForeground(new java.awt.Color(0, 102, 255));
        jPanel26.setLayout(null);

        totalBook19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBook19.setForeground(new java.awt.Color(0, 51, 255));
        totalBook19.setText("0");
        jPanel26.add(totalBook19);
        totalBook19.setBounds(130, 50, 60, 22);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 255));
        jLabel34.setText("Total Booking Lesson");
        jPanel26.add(jLabel34);
        jLabel34.setBounds(50, 20, 210, 22);

        jPanel25.add(jPanel26);
        jPanel26.setBounds(560, 70, 270, 100);

        jPanel23.add(jPanel25);
        jPanel25.setBounds(560, 70, 270, 100);

        getContentPane().add(jPanel23);
        jPanel23.setBounds(1220, 130, 260, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        bookingDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookingDetails.setForeground(new java.awt.Color(0, 102, 255));
        bookingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Lesson ID", "Lesson Name", "Coach Name", "Date", "Day", "Slot", "Grade", "Status", "Price"
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
        jScrollPane1.setBounds(30, 80, 610, 290);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 255));
        jLabel35.setText("Booking Details");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(290, 20, 210, 22);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel3.add(panel1);
        panel1.setBounds(0, 80, 660, 300);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(320, 330, 660, 380);

        selectionPanel.setBackground(new java.awt.Color(255, 255, 255));

        selectCoach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectCoach.setForeground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Coach Name   :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Date                 :");

        selectDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectDate.setForeground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Day                  :");

        selectDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectDay.setForeground(new java.awt.Color(0, 102, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Time  Slot        :");

        selectSlot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectSlot.setForeground(new java.awt.Color(0, 102, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Grade Level     :");

        selectGrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectGrade.setForeground(new java.awt.Color(0, 102, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Status               :");

        selectStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectStatus.setForeground(new java.awt.Color(0, 102, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("Price                 :");

        selectPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectPrice.setForeground(new java.awt.Color(0, 102, 255));

        cancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 102, 255));
        cancelButton.setText("Cancel Lesson");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        changeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changeButton.setForeground(new java.awt.Color(0, 102, 255));
        changeButton.setText("change Lesson");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        attendLesson.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        attendLesson.setForeground(new java.awt.Color(0, 102, 255));
        attendLesson.setText("Attend Lesson");
        attendLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendLessonActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 255));
        jLabel36.setText("Select Lesson");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 255));
        jLabel37.setText("Lesson Name  :");

        selectLesson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectLesson.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selectionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selectionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selectionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attendLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(selectLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(selectCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(selectSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(selectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(selectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(attendLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(selectionPanel);
        selectionPanel.setBounds(1000, 330, 470, 350);
        getContentPane().add(userImage);
        userImage.setBounds(130, 200, 130, 130);

        userName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(userName);
        userName.setBounds(160, 340, 80, 30);

        timeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeButton.setForeground(new java.awt.Color(0, 102, 255));
        timeButton.setText("Check timetable");
        timeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(timeButton);
        timeButton.setBounds(30, 410, 250, 40);

        monthReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        monthReport.setForeground(new java.awt.Color(0, 102, 255));
        monthReport.setText("Monthly report");
        monthReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthReportActionPerformed(evt);
            }
        });
        getContentPane().add(monthReport);
        monthReport.setBounds(30, 480, 250, 40);

        logoutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 102, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(20, 550, 260, 40);

        backgroundImage.setText("jLabel4");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingDetailsMouseReleased
        // TODO add your handling code here:
        getSelectedBooking();
    }//GEN-LAST:event_bookingDetailsMouseReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        cancelLesson();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        // TODO add your handling code here:
        changeLesson();
    }//GEN-LAST:event_changeButtonActionPerformed

    private void attendLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendLessonActionPerformed
        // TODO add your handling code here:
        attendLesson();
    }//GEN-LAST:event_attendLessonActionPerformed

    private void timeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LessonTimeTable(userId).setVisible(true);

    }//GEN-LAST:event_timeButtonActionPerformed

    private void monthReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MonthlyReport(userId).setVisible(true);

    }//GEN-LAST:event_monthReportActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserLogin().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    //display user booking details
    public void userBookingDetails() {
        List<Booking> booking_details = new BookingController().loadBookingDetails();
        DefaultTableModel tbmodel = (DefaultTableModel) bookingDetails.getModel();
        for (int i = 0; i < booking_details.size(); i++) {
            if (booking_details.get(i).getUser().getUserId() == userId) {
                bookingId = booking_details.get(i).getBookingId();
                lessonId = booking_details.get(i).getLesson().getLessonID();
                userId = booking_details.get(i).getUser().getUserId();
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
                String toData[] = {"BOOKING_NO_000" + bookingId, "" + lessonId, lessonName, coachName, date, day, time, grade, status, price};
                //add new data in this table
                tbmodel.addRow(toData);
                //hide lesson id in jtable
                TableColumn col1 = bookingDetails.getColumnModel().getColumn(1);
                col1.setMinWidth(1);
                col1.setMaxWidth(0);
                //count total booking
                if (booking_details.get(i).getStatus().equalsIgnoreCase("Booked")||booking_details.get(i).getStatus().equalsIgnoreCase("Changed")) {
                    totalBooking++;
                }

                //get total attended lesson
                if (booking_details.get(i).getStatus().equalsIgnoreCase("Attended")) {
                    totalAttended++;
                }
            }
        }
    }

    //get select booking details
    public void getSelectedBooking() {
        row = bookingDetails.getSelectedRow();
        //get data from jtable on select
        bookingId = bookingDetails.getModel().getValueAt(row, 0).toString();
        lessonId = Integer.parseInt(bookingDetails.getModel().getValueAt(row, 1).toString());
        lessonName = bookingDetails.getModel().getValueAt(row, 2).toString();
        coachName = bookingDetails.getModel().getValueAt(row, 3).toString();
        date = bookingDetails.getModel().getValueAt(row, 4).toString();
        day = bookingDetails.getModel().getValueAt(row, 5).toString();
        time = bookingDetails.getModel().getValueAt(row, 6).toString();
        grade = bookingDetails.getModel().getValueAt(row, 7).toString();
        status = bookingDetails.getModel().getValueAt(row, 8).toString();
        price = bookingDetails.getModel().getValueAt(row, 9).toString();

        //display select lesson details
        selectLesson.setText(lessonName);
        selectCoach.setText(coachName);
        selectDate.setText(date);
        selectDay.setText(day);
        selectSlot.setText(time);
        selectGrade.setText(grade);
        selectStatus.setText(status);
        selectPrice.setText(price);
        selectionPanel.setVisible(true);
        if (status.equalsIgnoreCase("Attended") || status.equalsIgnoreCase("Cancelled")) {
            cancelButton.setVisible(false);
            changeButton.setVisible(false);
            attendLesson.setVisible(false);

        } else {
            cancelButton.setVisible(true);
            changeButton.setVisible(true);
            attendLesson.setVisible(true);
        }
    }

    //empty selectional panel 
    public void emptySelectionPanel() {
        //display select lesson details
        selectionPanel.setVisible(false);
        selectLesson.setText("");
        selectCoach.setText("");
        selectDate.setText("");
        selectDay.setText("");
        selectSlot.setText("");
        selectGrade.setText("");
        selectStatus.setText("");
        selectPrice.setText("");
    }

    public void attendLesson() {
        try {
            //initialize booking controller
            BookingController bookingController = new BookingController();
            boolean attend = bookingController.attendLesson(bookingId);
            if (attend) {
                int lesson_grade = Integer.parseInt(grade.substring(12));
                int user_grade1 = user_grade + 1;
                if (lesson_grade == user_grade1) {
                    // Update user grade level if attend higher level lesson
                    UserController userController = new UserController();
                    userController.updateUserGrade("" + userId);
                }
                //open ratings page 
                this.setVisible(false);
                new Ratings(lessonId, userId, date).setVisible(true);
                // Clear old data from jtable
                DefaultTableModel tbmodel = (DefaultTableModel) bookingDetails.getModel();
                tbmodel.getDataVector().removeAllElements();
                // Load new booking details
                List<Booking> bookingDetail = bookingController.loadBookingDetails();
                userBookingDetails();
            } else {
                JOptionPane.showMessageDialog(this, "You cannot book the same lesson multiple times.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    //cancel lesson
    public void cancelLesson() {
        //initialize booking Controller
        BookingController booking1 = new BookingController();
        boolean cancel = new BookingController().cancelLesson(bookingId);
        if (cancel) {
            new LessonController().updateSeatAvailablity("" + lessonId, "Cancel");
            DefaultTableModel tbmodel = (DefaultTableModel) bookingDetails.getModel();
            //remove all old data from this table
            tbmodel.getDataVector().removeAllElements();
            List<Booking> bookingDetail = booking1.loadBookingDetails();
            //refresh jtable 
            userBookingDetails();
            //clear selection panel after booking cancel
            emptySelectionPanel();
            bookingDetails.getSelectionModel().clearSelection();
            emptySelectionPanel();
            cancelButton.setVisible(false);
            changeButton.setVisible(false);
            attendLesson.setVisible(false);
            JOptionPane.showMessageDialog(this, "Lesson cancelled successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "You can not book same lesson multiples", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

    //change lesson 
    public void changeLesson() {
        //update seat after change lesson
        this.setVisible(false);
        new ChangeLesson(bookingId, userId, "" + lessonId).setVisible(true);
    }

    // get user total ratings
    public void fetchUserTotalRatings() {
        List<Map<String, String>> rating_details = new RatingController().loadRatingData();
        for (int i = 0; i < rating_details.size(); i++) {
            if (rating_details.get(i).get("userId").equalsIgnoreCase("" + userId)) {
                totalRating++;
            }
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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendLesson;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTable bookingDetails;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeButton;
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
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton monthReport;
    private java.awt.Panel panel1;
    private javax.swing.JLabel selectCoach;
    private javax.swing.JLabel selectDate;
    private javax.swing.JLabel selectDay;
    private javax.swing.JLabel selectGrade;
    private javax.swing.JLabel selectLesson;
    private javax.swing.JLabel selectPrice;
    private javax.swing.JLabel selectSlot;
    private javax.swing.JLabel selectStatus;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JButton timeButton;
    private javax.swing.JLabel totalAttend;
    private javax.swing.JLabel totalAttend1;
    private javax.swing.JLabel totalAttend2;
    private javax.swing.JLabel totalAttend3;
    private javax.swing.JLabel totalBook;
    private javax.swing.JLabel totalBook1;
    private javax.swing.JLabel totalBook10;
    private javax.swing.JLabel totalBook11;
    private javax.swing.JLabel totalBook12;
    private javax.swing.JLabel totalBook13;
    private javax.swing.JLabel totalBook14;
    private javax.swing.JLabel totalBook15;
    private javax.swing.JLabel totalBook17;
    private javax.swing.JLabel totalBook18;
    private javax.swing.JLabel totalBook19;
    private javax.swing.JLabel totalBook2;
    private javax.swing.JLabel totalBook3;
    private javax.swing.JLabel totalBook4;
    private javax.swing.JLabel totalBook5;
    private javax.swing.JLabel totalBook6;
    private javax.swing.JLabel totalBook7;
    private javax.swing.JLabel totalBook8;
    private javax.swing.JLabel totalBook9;
    private javax.swing.JLabel totalRatings;
    private javax.swing.JLabel userImage;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
