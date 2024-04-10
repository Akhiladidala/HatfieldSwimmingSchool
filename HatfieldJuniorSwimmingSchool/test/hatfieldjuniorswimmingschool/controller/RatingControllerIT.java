
package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.User;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RatingControllerIT {
    
    public RatingControllerIT() {
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
     * Test of loadRatingData method, of class RatingController.
     */
    @Test
    public void testLoadRatingData() {
        System.out.println("loadRatingData");
        RatingController instance = new RatingController();
        List<Map<String, String>> result = instance.loadRatingData();
        for(int i=0; i<result.size(); i++)
        {
            System.out.println("Rating id : RATING_NO_000"+result.get(i).get("ratingId"));
            System.out.println("Lesson Name : "+new LessonController().getLessonById(Integer.parseInt(result.get(i).get("lessonId"))).getLessonName());
            System.out.println("User Name : "+new UserController().getUserById(Integer.parseInt(result.get(i).get("userId"))).getUsername());
            System.out.println("Coach Name  : "+new UserController().getUserById(Integer.parseInt(result.get(i).get("coachId"))).getUsername());
            System.out.println("Date : "+result.get(i).get("date"));
            System.out.println("Day : "+result.get(i).get("day"));
            System.out.println("Time Slot : "+result.get(i).get("slot"));
            System.out.println("Ratings : "+result.get(i).get("rating"));
            System.out.println("Reviews : "+result.get(i).get("review"));
            System.out.println();
        }
    }

    /**
     * Test of saveRating method, of class RatingController.
     */
    @Test
    public void testSaveRating() {
        System.out.println("saveRating");
        int lessonId = 1;
        int userId = 6;
        String ratings = "5";
        String reviews = "best class";
        //check lesson id exist or not
        boolean isLessonIdExist = LessonControllerIT.isLessonIdExist(lessonId);
        //check userId exist or not
        boolean isUserIdExist = UserControllerIT.isUserIdExist(userId);
        //check lesson alredy got ratings or not
        boolean isLessonIdRating = RatingControllerIT.isLessonIdRated("" + lessonId, "" + userId);
       //initialize rating controller
        RatingController instance = new RatingController();
        if (isLessonIdExist && isUserIdExist) {
            if (!isLessonIdRating) {
                //validate save rating or not
                boolean result = instance.saveRating(lessonId, "" + userId, ratings, reviews);
                if (result) {
                    System.out.println("rating successfully");
                }
            } else {
                System.out.println("this lesson already got ratings");
            }
        } else {

            System.out.println("User id or lesson id does not exist");
        }

    }

    /**
     * Test of getAverageRatingByCoach method, of class RatingController.
     */
    @Test
    public void testGetAverageRatingByCoach() {
        int coachId;
        System.out.println("getAverageRatingByCoach");
        //intitialize rating controller
        RatingController instance = new RatingController();
        //fetch coach details
        List<User> coach_details = new UserController().fetchAllCoach();
        RatingController ratig = new RatingController();
        for (int j = 0; j < coach_details.size(); j++) {
            coachId = coach_details.get(j).getUserId();
            System.out.println("Coach id : " + coachId);
            //get rating details by coach id
            List<Map<String, String>> result = ratig.getAverageRatingByCoach(j + 1);
            for (int i = 0; i < result.size(); i++) {
                System.out.println("Coach Name : " + new UserController().getUserById(coachId).username);
                System.out.println("Average Rating : " + result.get(i).get("avgRating"));
                System.out.println();
            }
        }

    }

    //chech this lesson has been rating or not
    public static boolean isLessonIdRated(String lessonId,String userId)
    {
         List<Map<String, String>> result = new RatingController().loadRatingData();
         for(int i=0; i<result.size(); i++)
         {
             if(result.get(i).get("lessonId").equalsIgnoreCase(lessonId)&&result.get(i).get("userId").equalsIgnoreCase(userId))
             {
                 return true;
             }
         }
             return false;
    }
    
}
