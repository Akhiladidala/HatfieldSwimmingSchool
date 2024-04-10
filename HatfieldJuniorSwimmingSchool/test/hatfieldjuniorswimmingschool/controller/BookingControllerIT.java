
package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.Booking;
import hatfieldjuniorswimmingschool.model.User;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BookingControllerIT {
    private static List<Booking> booking_details=new BookingController().loadBookingDetails();
    
    public BookingControllerIT() {
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
     * Test of loadBookingDetails method, of class BookingController.
     */
    @Test
    public void testLoadBookingDetails() {
        System.out.println("loadBookingDetails\n");
        BookingController instance = new BookingController();
        List<Booking> result = instance.loadBookingDetails();
        assertNotNull( result);
         for(int i=0; i<result.size();i++ )
        {
             System.out.println("Booking id : "+result.get(i).getBookingId());
             System.out.println("Lesson Name : "+new LessonController().getLessonById(result.get(i).getLesson().getLessonID()).lessonName);
             System.out.println("UserName : "+new UserController().getUserById(result.get(i).getUser().getUserId()).getUsername());
             System.out.println("Coach Id : "+result.get(i).getLesson().getCoachId());
             System.out.println("Date : "+result.get(i).getLesson().getDate());
             System.out.println("Day : "+result.get(i).getLesson().getDay());
             System.out.println("Time Slot : "+result.get(i).getLesson().getTimeSlot());
             System.out.println("Grade Level : "+result.get(i).getLesson().getGradeLevel());
             System.out.println("Status : "+result.get(i).getStatus());
             System.out.println("");
        }
    }

    /**
     * Test of userBooking method, of class BookingController.
     */
    @Test
    public void testUserBooking() {
        System.out.println("userBooking");
        int lessonId = 2321;
        int userId = 1;
        boolean isLessonIdExist = LessonControllerIT.isLessonIdExist(lessonId);
        boolean isUserIdExist = UserControllerIT.isUserIdExist(userId);
        BookingController instance = new BookingController();
        if (isLessonIdExist && isUserIdExist) {
            boolean result = instance.userBooking(lessonId, userId);
            if (result) {
                System.out.println("Booking Successfully");
            } else {
                System.out.println("Already booked");
            }
        }else
        {
            System.out.println("user id or lesson id does not exist");
        }
    }

    /**
     * Test of attendLesson method, of class BookingController.
     */
    @Test
    public void testAttendLesson() {
        System.out.println("attendLesson");
        String bookingId = "BOOKING_NO_0001";
        boolean isBookingIdTrue = isBookingIdExist(bookingId);
        boolean isBookingIdAttended = BookingControllerIT.isBookingIdAttended(bookingId);
        boolean result = false;
        BookingController instance = new BookingController();
        if (isBookingIdTrue) {
            if (!isBookingIdAttended) {
                result = instance.attendLesson(bookingId);
            } else {
                System.out.println("already attended this lesson");
            }
        } else {
            System.out.println("Booking id does not exist");
        }
    }

    /**
     * Test of cancelLesson method, of class BookingController.
     */
    @Test
    public void testCancelLesson() {
        System.out.println("cancelLesson");
        String bookingId = "BOOKING_NO_0001";
        boolean isBookingIdTrue = isBookingIdExist(bookingId);
        boolean result = false;
        boolean isBookingCancel = isBookingIdCancelled(bookingId);
        boolean isBookingAttend = isBookingIdAttended(bookingId);
        BookingController instance = new BookingController();
        if (isBookingIdTrue) {
            if (!isBookingCancel && !isBookingAttend) {
                result = instance.cancelLesson(bookingId);
            } else {
                System.out.println("Booking id already attended or cancel");
            }
        }else
        {
            System.out.println("Booking id does not exist");
        }
    }

    /**
     * Test of changeLesson method, of class BookingController.
     */
    @Test
    public void testChangeLesson() {
        System.out.println("changeLesson");
        String bookingId = "BOOKING_NO_0001";
        int lessonId = 1;
        int userId = 1;
        boolean result = false;
        boolean isBookingIdTrue = isBookingIdExist(bookingId);
        boolean isLessonIdExist = LessonControllerIT.isLessonIdExist(lessonId);
        boolean isUserIdExist = UserControllerIT.isUserIdExist(userId);
        boolean isBookingCancel = isBookingIdCancelled(bookingId);
        boolean isBookingAttend = isBookingIdAttended(bookingId);
        boolean isBookLessson = isLessonIdBooked(lessonId);
        BookingController instance = new BookingController();
        if (isBookingIdTrue){
            if (!isBookingCancel || !isBookingAttend) {
                if (isLessonIdExist && isUserIdExist) {
                    if (!isBookLessson) {
                        result = instance.changeLesson(bookingId, lessonId, userId);
                    } else {
                        System.out.println("this lesson id already booked");
                    }

                } else {
                    System.out.println("lesson id or user id does not existl");
                }
            } else {
                System.out.println("Bookng id already cancel or attendl");
            }
        } else {
            System.out.println("Booking id does not exist");
        }
    }

    /**
     * Test of getBookingDetailsByUserId method, of class BookingController.
     */
    @Test
    public void testGetBookingDetailsByUserId() {
        System.out.println("getBookingDetailsByUserId");
        int user_id;
        String user_name;
        String totalBooking;
        String totalCancel;
        String totalAttend;
        BookingController instance = new BookingController();
        List<User> user_details = new UserController().fetchAllUser();
        for (int i = 0; i < user_details.size(); i++) {
            //validation of user id exist or not
            boolean isUserIdExist = UserControllerIT.isUserIdExist(i + 1);
            if (isUserIdExist) {
                List<Map<String, String>> result = instance.getBookingDetailsByUserId(i + 1);
                //print booking details
                if (result != null) {
                    for (int j = 0; j < result.size(); j++) {
                        user_id = Integer.parseInt(result.get(j).get("userId"));
                        user_name = new UserController().getUserById(user_id).username;
                        totalBooking = result.get(j).get("totalBooking");
                        totalCancel = result.get(j).get("totalCancel");
                        totalAttend = result.get(j).get("totalAttend");
                        System.out.println("User Name : " + user_name);
                        System.out.println("Total Booking : " + totalBooking);
                        System.out.println("Total Cancel : " + totalCancel);
                        System.out.println("Total Attend : " + totalAttend);
                        System.out.println();
                    }
                } else {
                    System.out.println("not any booking data of this user id");
                }
            } else {
                System.out.println("User id does not exist");
            }
        }
    }

   
    
    //check booking id exist or not
    public static boolean isBookingIdExist(String bookingId)
    {
        bookingId=bookingId.substring(14);
        for(int i=0; i<booking_details.size(); i++)
        {
            if(booking_details.get(i).getBookingId().equalsIgnoreCase(bookingId))
            {
                return true;
            }
        }
        return false;
    }
    
    
    //check booking id not cancel or attend
    public static boolean isBookingIdCancelled(String bookingId)
    {
        bookingId=bookingId.substring(14);
        for(int i=0; i<booking_details.size(); i++)
        {
            if(booking_details.get(i).getBookingId().equalsIgnoreCase(bookingId))
            {
                if(booking_details.get(i).getStatus().equalsIgnoreCase("Cancelled"))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    //check booking id not cancel or attend
    public static boolean isBookingIdAttended(String bookingId)
    {
        bookingId=bookingId.substring(14);
        for(int i=0; i<booking_details.size(); i++)
        {
            if(booking_details.get(i).getBookingId().equalsIgnoreCase(bookingId))
            {
                if(booking_details.get(i).getStatus().equalsIgnoreCase("Attended"))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    //chech lesson id booked 
    public static boolean isLessonIdBooked(int lessonId)
    {
         for(int i=0; i<booking_details.size(); i++)
        {
            if(booking_details.get(i).lesson.getLessonID()==lessonId)
            {
                 if(!(booking_details.get(i).getStatus().equalsIgnoreCase("Cancelled")))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
