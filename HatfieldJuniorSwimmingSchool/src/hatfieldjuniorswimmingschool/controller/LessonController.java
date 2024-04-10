package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.Lesson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LessonController extends Lesson {

    private String filename = "src/hatfieldjuniorswimmingschool/csvFile/lesson_details.csv";

    public LessonController(int lessonID, String lessonName, String date, String day, String timeSlot, String gradeLevel, String coachId, String seat, String price) {
        super(lessonID, lessonName, date, day, timeSlot, gradeLevel, coachId, seat, price);
    }

    public LessonController(String lessonName, String date, String timeSlot, String gradeLevel, String coachId, String seat, String price) {
        super(lessonName, date, timeSlot, gradeLevel, coachId, seat, price);
    }

    public LessonController() {

    }

    //load data from lesson.csv file
    public List<Lesson> loadLessonDetails() {
        List<Lesson> lessonDetails = new ArrayList<>();
        String line = "";
        String splitBy = ",";
        try {
            //read data from csv file 
            BufferedReader br = new BufferedReader(new FileReader(filename));
            br.readLine(); // this will read the first line
            String line1 = null;
            //validate line not null  
            while ((line = br.readLine()) != null) {
                //spilt line and store list array
                String[] List = line.split(splitBy);
                //store lesson detail in maplist

                //store lesson details in arraylist
                int lessonId = Integer.parseInt(List[0]);
                lessonDetails.add(new LessonController(lessonId, List[1], List[2], List[3], List[4], List[5], List[6], List[7], List[8]));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LessonController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LessonController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lessonDetails;
    }

    //add new lesson in csv file
    public boolean addLesson(String lessonName, String date, String day, String timeSlot, String gradeLevel, String seat, String price, String coachId) {
        int lessonId = loadLessonDetails().size() + 1;
        if (!isDateAndSlotAddedLesson(date, timeSlot)) {
            //store details in array
            String[] details = {"" + lessonId, lessonName, date, day, timeSlot, gradeLevel, coachId, seat, "$" + price};
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                //Writer header if file empty
                boolean isHeaderExist = isHeaderExist(filename);
                if (!isHeaderExist) {
                    writer.write("Lesson ID,Lesson Name,Date,Day,Time Slot,Grade Level,Coach Name,Seat,Price\n");
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

    //get lesson details by lesson id
    public Lesson getLessonById(int lessonId) {
        List<Lesson> lesson_details = loadLessonDetails();
        Lesson lesson = null;
        for (int i = 0; i < lesson_details.size(); i++) {
            if (lesson_details.get(i).getLessonID() == lessonId) {
                int lessonID = lesson_details.get(i).getLessonID();
                String lessonName = lesson_details.get(i).getLessonName();
                String date = lesson_details.get(i).getDate();
                String day = lesson_details.get(i).getDay();
                String timeSlot = lesson_details.get(i).getTimeSlot();
                String gradeLevel = lesson_details.get(i).getGradeLevel();
                String coachId = lesson_details.get(i).getCoachId();
                String seat = lesson_details.get(i).getSeat();
                String price = lesson_details.get(i).getPrice();
                lesson = new Lesson(lessonID, lessonName, date, day, timeSlot, gradeLevel, coachId, seat, price);
            }
        }
        return lesson;
    }

    //update seat after lesson booking or cancel
    public void updateSeatAvailablity(String lessonId, String Status) {
        //read lessons.csv file 
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;

            // Read line of csv file
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                // validation of lesson id
                if (fields.length > 1 && fields[0].equalsIgnoreCase(lessonId)) {
                    //get available seat
                    int available_seat = Integer.parseInt(fields[7]);
                    int update_seat;
                    if (Status.equalsIgnoreCase("Booked")) {
                        update_seat = available_seat - 1;
                        //change available seat
                        fields[7] = "" + update_seat;
                        line = String.join(",", fields);
                    } else if (Status.equalsIgnoreCase("Cancel")) {
                        update_seat = available_seat + 1;
                        //change available seat
                        fields[7] = "" + update_seat;
                        line = String.join(",", fields);
                    }
                }
                lines.add(line);
            }

            //update file after modify seat
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //validation or empty file or not
    private static boolean isHeaderExist(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        // Read the first line
        String firstLine = reader.readLine();
        reader.close();
        //return firstline is exist or not
        return firstLine != null && !firstLine.isEmpty();
    }
    
   //check this date and slot not added any lesson
    public static boolean isDateAndSlotAddedLesson(String date,String slot)
    {
        List<Lesson>lesson_details=new LessonController().loadLessonDetails();
        for(int i=0; i<lesson_details.size(); i++)
        {
            if(lesson_details.get(i).date.equalsIgnoreCase(date)&&lesson_details.get(i).timeSlot.equalsIgnoreCase(slot))
            {
                return true;
            }
        }
        return false;
    }

}
