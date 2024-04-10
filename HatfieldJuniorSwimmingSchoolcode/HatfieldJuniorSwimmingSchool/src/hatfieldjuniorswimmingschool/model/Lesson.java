package hatfieldjuniorswimmingschool.model;


public class Lesson {
    private int lessonID;
    public String lessonName;
    public String date;
    public String day; 
    public String timeSlot;
    public String gradeLevel;
    private String coachId;
    public String seat;
    public String price;
    /**
     * @return the lessonID
     */
    public int getLessonID() {
        return lessonID;
    }

    /**
     * @param lessonID the lessonID to set
     */
    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    /**
     * @return the lessonName
     */
    public String getLessonName() {
        return lessonName;
    }

    /**
     * @param lessonName the lessonName to set
     */
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the timeSlot
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * @param timeSlot the timeSlot to set
     */
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    /**
     * @return the gradeLevel
     */
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * @param gradeLevel the gradeLevel to set
     */
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    /**
     * @return the coachId
     */
    public String getCoachId() {
        return coachId;
    }

    /**
     * @param coachId the coachId to set
     */
    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }
    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }
   
    
    
    // create constructor
    public Lesson(int lessonID, String lessonName, String date, String day, String timeSlot, String gradeLevel,String coachId, String seat,String price) {
        this.lessonID = lessonID;
        this.lessonName = lessonName;
        this.date = date;
        this.day = day;
        this.timeSlot = timeSlot;
        this.gradeLevel = gradeLevel;
        this.coachId=coachId;
        this.seat = seat;
        this.price=price;
    }
    
    
    
     // create constructor withou lessonId
    public Lesson(String lessonName, String date, String timeSlot, String gradeLevel,String coachId, String seat,String price) {
        this.lessonName = lessonName;
        this.date = date;
        this.timeSlot = timeSlot;
        this.gradeLevel = gradeLevel;
        this.coachId=coachId;
        this.seat = seat;
        this.price=price;
    }
    
    // create constructor
    public Lesson(int lessonID, String date, String day, String timeSlot, String gradeLevel,String coachId,String price) {
        this.lessonID = lessonID;
        this.date = date;
        this.day = day;
        this.timeSlot = timeSlot;
        this.gradeLevel = gradeLevel;
        this.coachId=coachId;
        this.price=price;
    }
    
//create constructor without parameter
    public Lesson()
    {
        
    }

    
   
    
}
