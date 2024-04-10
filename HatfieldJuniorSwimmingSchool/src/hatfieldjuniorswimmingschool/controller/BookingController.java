package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.Booking;
import hatfieldjuniorswimmingschool.model.Lesson;
import hatfieldjuniorswimmingschool.model.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingController extends Booking {

    private String filename = "src/hatfieldjuniorswimmingschool/csvFile/booking_Details.csv";
    private List<Booking> booking_details = loadBookingDetails();

    public BookingController(User user, Lesson lesson) {
        super(user, lesson);
    }

    public BookingController(String bookingId, String status, User user, Lesson lesson) {
        super(bookingId, status, user, lesson);
    }

    public BookingController() {

    }

    //load booking details from csv file
    public List<Booking> loadBookingDetails() {
        List<Booking> bookingDetails = new ArrayList<>();
        String line = "";
        String splitBy = ",";
        try {
            //read data from csv file 
            BufferedReader br = new BufferedReader(new FileReader(filename));
            // read the first line
            br.readLine();
            //validate line not null  
            while ((line = br.readLine()) != null) {
                //spilt line and store list array
                String[] List = line.split(splitBy);
                //convert lessonId and userId into integer
                int lessonId = Integer.parseInt(List[2]);
                int userId = Integer.parseInt(List[1]);
                Lesson lesson = new Lesson(lessonId, List[4], List[5], List[6], List[7], List[3], List[9]);
                User user = new User(userId, "", "");
                bookingDetails.add(new Booking(List[0], List[8], user, lesson));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookingDetails;
    }

    //store booking Details in csv file
    @SuppressWarnings("empty-statement")
    public boolean userBooking(int lessonId, int userId) {
        //get lesson details by lesson id
        Lesson lessons = new LessonController().getLessonById(lessonId);
        String coachId = lessons.getCoachId();
        String date = lessons.getDate();
        String day = lessons.getDay();
        String slot = lessons.getTimeSlot();
        String grade = lessons.getGradeLevel();
        String price = lessons.getPrice();
        //get booking details in list
        List<Booking> bookings = loadBookingDetails();
        //store exercise booked by user
        List<Integer> book_lesson = new ArrayList<>();
        String status = "Booked";
        int bookingId = bookings.size() + 1;

        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getUser().getUserId() == userId) {
                if (!bookings.get(i).getStatus().equalsIgnoreCase("Cancelled")) {
                    if ((bookings.get(i).getLesson().getLessonID() == lessonId)) {
                        book_lesson.add(bookings.get(i).getLesson().getLessonID());
                    }
                }
            }
        }

        if (!book_lesson.contains(lessonId)) {
            //store details in array
            String[] details = {"" + bookingId, "" + userId, "" + lessonId, coachId, date, day, slot, grade, status, price};

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                //Writer header if file emapty
                boolean isHeaderExist = isHeaderExist(filename);
                if (!isHeaderExist) {
                    writer.write("Booking ID,User ID,Lesson ID,Coach ID,Date,Day,Slot,Grade,Status,Price\n");
                }

                // Write data
                for (int i = 0; i < details.length; i++) {
                    writer.write(details[i]);
                    if (i != details.length - 1) {
                        writer.write(",");
                    }
                }
                //for new line
                writer.newLine();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //attend lesson
    public boolean attendLesson(String bookingId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;
            // Read line 
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                //get booking id real
                String bookingID = bookingId.substring(14);
                // validation of lesson id
                if (fields.length > 1 && fields[0].equalsIgnoreCase(bookingID)) {
                    //change status
                    fields[8] = "Attended";
                    line = String.join(",", fields);
                }
                lines.add(line);
            }
            //update file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    //cancel lessong
    public boolean cancelLesson(String bookingId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;
            // Read line 
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                //get booking id real
                String bookingID = bookingId.substring(14);
                // validation of lesson id
                if (fields.length > 1 && fields[0].equalsIgnoreCase(bookingID)) {
                    //change status
                    fields[8] = "Cancelled";
                    line = String.join(",", fields);
                }
                lines.add(line);
            }

            //update file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    //change lesson
    public boolean changeLesson(String bookingId, int lessonId, int userId) {
        //get lesson details by lesson id
        Lesson lesson=new LessonController().getLessonById(lessonId);
        String coachId=lesson.getCoachId();
        String date=lesson.getDate();
        String day=lesson.getDay();
        String slot=lesson.getTimeSlot();
        String seat=lesson.getSeat();
        String grade=lesson.getGradeLevel();
        String price=lesson.getPrice();
        
        List<Booking> user_booking = loadBookingDetails();
        //store user booking lesson in list
        List<Integer> booking_lessons = new ArrayList<>();
        for (int i = 0; i < user_booking.size(); i++) {
            if (user_booking.get(i).getUser().getUserId() == userId) {
                if (user_booking.get(i).getStatus().equalsIgnoreCase("Booked") || user_booking.get(i).getStatus().equalsIgnoreCase("Attended") || user_booking.get(i).getStatus().equalsIgnoreCase("Changed")) {
                    booking_lessons.add(user_booking.get(i).getLesson().getLessonID());
                }
            }
        }

        //validation of user booking lesson and change lesson not same
        if (!booking_lessons.contains(lessonId)) {
            //change seat into integer
            int seat1 = Integer.parseInt(seat);
            if (seat1 >= 1 && seat1 <= 4) {
                try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                    List<String> lines = new ArrayList<>();
                    String line;
                    // Read line 
                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(",");
                        String bookingID = bookingId.substring(14);
                        // validation of lesson id
                        if (fields.length > 1 && fields[0].equalsIgnoreCase(bookingID)) {
                            //change status
                            fields[2] = "" + lessonId;
                            fields[3] = coachId;
                            fields[4] = date;
                            fields[5] = day;
                            fields[6] = slot;
                            fields[7] = grade;
                            fields[8] = "Changed";
                            fields[9] = price;
                            line = String.join(",", fields);
                        }
                        lines.add(line);

                    }
                    //update file
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        for (String updatedLine : lines) {
                            writer.write(updatedLine);
                            writer.newLine();
                        }
                    }
                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return false;
    }
    
    
   
    
    //get booking details by user id
      public List<Map<String,String>> getBookingDetailsByUserId(int userId)
      {
          int totalBooking=0;
          int totalCancelled=0;
          int totalAttended=0;
          List<Map<String,String>> booking_detail1=new ArrayList<>();
          for(int i=0; i<booking_details.size(); i++)
          {
              if(booking_details.get(i).getUser().getUserId()==userId)
              {
                  if(booking_details.get(i).getStatus().equalsIgnoreCase("Booked")||booking_details.get(i).getStatus().equalsIgnoreCase("Changed"))
                  {
                      totalBooking++;
                  }
                  
                  if(booking_details.get(i).getStatus().equalsIgnoreCase("Cancelled"))
                  {
                      totalCancelled++;
                  }
                   if(booking_details.get(i).getStatus().equalsIgnoreCase("Attended"))
                  {
                      totalAttended++;
                  }
              }
          }
          Map<String, String> bookings = new HashMap<>();
          bookings.put("userId", "" + userId);
          bookings.put("totalBooking", "" + totalBooking);
          bookings.put("totalCancel", "" + totalCancelled);
          bookings.put("totalAttend", "" + totalAttended);
          booking_detail1.add(bookings);
          return booking_detail1;
      }
    
    //check first row is exist or not
    private static boolean isHeaderExist(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        // Read the first line
        String firstLine = reader.readLine();
        reader.close();
        //return firstline is exist or not
        return firstLine != null && !firstLine.isEmpty();
    }
}
