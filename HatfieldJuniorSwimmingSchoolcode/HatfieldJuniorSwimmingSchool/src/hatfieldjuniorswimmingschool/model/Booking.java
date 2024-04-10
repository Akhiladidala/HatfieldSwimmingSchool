package hatfieldjuniorswimmingschool.model;


public class Booking {
    private String bookingId;
    private String status;
    public User user;
    public Lesson lesson;
    /**
     * @return the bookingId
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * @param bookingId the bookingId to set
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the lesson
     */
    public Lesson getLesson() {
        return lesson;
    }

    /**
     * @param lesson the lesson to set
     */
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    //create constructor with all parameter 
    public Booking(String bookingId,String status,User user,Lesson lesson)
    {
        this.bookingId=bookingId;
        this.status=status;
        this.user=user;
        this.lesson=lesson;
    }
   
    //create constructor without bookingId
    public Booking(User user,Lesson lesson)
    {
        this.user=user;
        this.lesson=lesson;
    }
    //create constructor without any parameter
    public Booking()
    {
        
    }
}
