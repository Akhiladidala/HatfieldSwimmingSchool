package hatfieldjuniorswimmingschool.controller;


import hatfieldjuniorswimmingschool.model.Lesson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RatingController {
    private String filename="src/hatfieldjuniorswimmingschool/csvFile/rating_details.csv";
    //load old rating data from csv file
    public List<Map<String,String>> loadRatingData()
    {
        List<Map<String,String>>ratings=new ArrayList<>();
        String line = "";  
        String splitBy = ",";
        try {  
               //read data from csv file 
                BufferedReader br = new BufferedReader(new FileReader(filename));               
                br.readLine(); // this will read the first line
                String line1=null;
               //validate line not null  
               while ((line = br.readLine()) != null)   
                {  
                    //spilt line and store list array
                    String[] List = line.split(splitBy);                                             
                    //insert user previous email and userId in map list
                    Map<String,String>rating=new HashMap<>();
                    rating.put("ratingId", List[0]);
                    rating.put("userId",List[1]);
                    rating.put("lessonId", List[2]);
                    rating.put("coachId", List[3]);
                    rating.put("date", List[4]);
                    rating.put("day", List[5]);
                    rating.put("slot", List[6]);
                    rating.put("rating",List[7]);
                     rating.put("review",List[8]);
                    ratings.add(rating);
                 }
            }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
        
        return ratings;
        
    }
    
    //save ratings in csv file
    public boolean saveRating(int lessonId, String userId, String ratings, String reviews) {
        //get lesson details by lesson id
        Lesson lesson = new LessonController().getLessonById(lessonId);
        String coachId = lesson.getCoachId();
        String date = lesson.date;
        String day = lesson.day;
        String slot = lesson.timeSlot;
        List<Map<String, String>> rating_list = loadRatingData();
        int ratingId = rating_list.size() + 1;
        //store details in array
        String[] details = {"" + ratingId, userId, "" + lessonId, coachId, date, day, slot, ratings, reviews};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            //Writer header if file empty
            boolean isHeaderExist = isFirstRowExist(filename);
            if (!isHeaderExist) {
                writer.write("Rating ID,User ID,Lesson ID,Coach ID,Date,Day,Time Slot,Ratings,Reviews\n");
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
        return false;
    }

    //get booking details by user id
    public List<Map<String, String>> getAverageRatingByCoach(int coachId) {
        int totalRatings = 0;
        int totalStudent = 0;
        int averageRating = 0;
        //store total rating by user
        List<Map<String, String>> rating_detail = new ArrayList<>();
        //fetch total ratings
        List<Map<String, String>> rating_details = new RatingController().loadRatingData();
        for (int i = 0; i < rating_details.size(); i++) {
            if (rating_details.get(i).get("coachId").equalsIgnoreCase("" + coachId)) {
                totalStudent++;
                totalRatings = Integer.parseInt(rating_details.get(i).get("rating")) + totalRatings;
                }
        }
        //find avarage rating of coach
        if (totalRatings != 0 && totalStudent != 0) {
            averageRating = totalRatings / totalStudent;
        }

        Map<String, String> ratings = new HashMap<>();
        ratings.put("coachId", "" + coachId);
        ratings.put("avgRating", "" + averageRating);
        //add rating detail in arraylist
        rating_detail.add(ratings);
        //return rating details
        return rating_detail;
    }

    
    
    //check first row is exist or not
    private static boolean isFirstRowExist(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        // Read the first line
        String firstLine = reader.readLine();
        reader.close();
        //return firstline is exist or not
        return firstLine != null && !firstLine.isEmpty();
    }
  
    
    
    

}
