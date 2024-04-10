
package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.Lesson;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anky
 */
public class LessonControllerIT {
    private static List<Lesson> lesson_details=new LessonController().loadLessonDetails();
    
    public LessonControllerIT() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadLessonDetails method, of class LessonController.
     */
    @Test
    public void testLoadLessonDetails() {
        System.out.println("loadLessonDetails");
        LessonController instance = new LessonController();
        List<Lesson> expResult = null;
        List<Lesson> result = instance.loadLessonDetails();
        if (result != null) {
            for (int i = 0; i < result.size(); i++) {

                int lessonID = lesson_details.get(i).getLessonID();
                String lessonName = lesson_details.get(i).getLessonName();
                String date = lesson_details.get(i).getDate();
                String day = lesson_details.get(i).getDay();
                String timeSlot = lesson_details.get(i).getTimeSlot();
                String gradeLevel = lesson_details.get(i).getGradeLevel();
                String coachId = lesson_details.get(i).getCoachId();
                String seat = lesson_details.get(i).getSeat();
                String price = lesson_details.get(i).getPrice();
                System.out.println("Lesson Id : " + result.get(i).getLessonID());
                System.out.println("Lesson Name : " + result.get(i).lessonName);
                System.out.println("Date : " + result.get(i).date);
                System.out.println("Day : " + result.get(i).day);
                System.out.println("Time Slot : " + result.get(i).timeSlot);
                System.out.println("Grade Level : " + result.get(i).gradeLevel);
                System.out.println("Seat : " + result.get(i).seat);
                System.out.println("Price : " + result.get(i).price);
                System.out.println();
            }

        } else {
            System.out.println("no data found");
        }
    }

    /**
     * Test of addLesson method, of class LessonController.
     */
    @Test
    public void testAddLesson() {
        String lessonName = "aqua fight";
        String date = "11-03-2024";
        String day = "Monday";
        String timeSlot = "4pm-5pm";
        String gradeLevel = "Grade Level 4";
        String seat = "4";
        String price = "799.99";
        String coachId="1";
        LessonController instance = new LessonController();
        if(!(lessonName.isBlank()||date.isBlank()||day.isBlank()||timeSlot.isBlank()||gradeLevel.isBlank()||seat.isBlank()||price.isBlank()))
        {
            //validation for seat
            if(seat.matches("[1-4]"))
            {
                //validation for price
                if(price.matches("[0-9]+") || price.matches("\\d+\\.\\d{2}"))
                {
                    //set . if price is without .00
                    if(price.matches("[0-9]+"))
                    {
                        price=price.concat(".00");
                    }
                    System.out.println("add lesson");
                    //add lesson
                    boolean result = instance.addLesson(lessonName, date, day, timeSlot, gradeLevel, seat, price,coachId);
                    if(result)
                    {
                        System.out.println("New Lesson added successfully");
                    }else
                    {
                        System.out.println("This date already lesson added");
                    }
                }else
                {
                    System.out.println("Enter valid price");
                }
            }else
            {
               System.out.println("Enter valid seat 1 to 4");
            }
        }else
        {
           System.out.println("All fields required");
        }
    }

    /**
     * Test of getLessonById method, of class LessonController.
     */
    @Test
    public void testGetLessonById() {
        System.out.println("getLessonById");
        int lessonId = 1;
        LessonController instance = new LessonController();
        boolean isLessonIdExist = LessonControllerIT.isLessonIdExist(lessonId);
        if(isLessonIdExist)
        {
             Lesson result = instance.getLessonById(lessonId);
             System.out.println("Lesson Id : " + result.getLessonID());
                System.out.println("Lesson Name : " + result.lessonName);
                System.out.println("Date : " + result.date);
                System.out.println("Day : " + result.day);
                System.out.println("Time Slot : " + result.timeSlot);
                System.out.println("Grade Level : " + result.gradeLevel);
                System.out.println("Seat : " + result.seat);
                System.out.println("Price : " + result.price);
                System.out.println();
        }else
        {
            System.out.println("Lesson id does not exist");
        }
       
        
    }

    /**
     * Test of updateSeatAvailablity method, of class LessonController.
     */
    @Test
    public void testUpdateSeatAvailablity() {
        System.out.println("updateSeatAvailablity");
        int lessonId =1234;
        String Status = "Booked";
         boolean isLesson_idExist = LessonControllerIT.isLessonIdExist(lessonId);
         if(isLesson_idExist)
        {
        int current_seat=Integer.parseInt(new LessonController().getLessonById(lessonId).seat);
        List<Lesson> lesson_details=new LessonController().loadLessonDetails();
        LessonController instance = new LessonController();
        System.out.println(lessonId);
        System.out.println(isLesson_idExist);
       
           if(current_seat>=1&&current_seat<=4)
           {
               instance.updateSeatAvailablity(""+lessonId, Status);
           }else
           {
               System.out.println("seat can not be update");
           }
            
        }else
        {
            System.out.println("Lesson id does not exist");
        }
    }

    /**
     * Test of isDateAndSlotAddedLesson method, of class LessonController.
     */
    @Test
    public void testIsDateAndSlotAddedLesson() {
        System.out.println("isDateAndSlotAddedLesson");
        String date = "11-03-2024";
        String slot = "4pm-5pm";
        boolean expResult = false;
        boolean result = LessonController.isDateAndSlotAddedLesson(date, slot);
        assertTrue( result);
        
    }
    
    //check lesson id exist or not
    public static boolean isLessonIdExist(int lessonId)
    {
        
        for(int i=0; i<lesson_details.size(); i++)
        {
            if(lesson_details.get(i).getLessonID()==lessonId)
            {
                return true;
            }
        }
        return false;
    }
    
   
}
