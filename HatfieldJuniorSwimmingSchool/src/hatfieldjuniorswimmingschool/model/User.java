package hatfieldjuniorswimmingschool.model;


public class User {
    public int userId;
    public String username;
    public String email;
    public String contact;
    public String grade;
    public String gender;
    public String age;
    public String address;
    public String state;
    public String city;
    public String postcode;
    public String role;
    public String password;
    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public int getUserId() {
        return userId;
    }

    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getContact() {
        return contact;
    }

   
    public void setContact(String contact) {
        this.contact = contact;
    }

    
    public String getAge() {
        return age;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

   
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getState() {
        return state;
    }

   
    public void setState(String state) {
        this.state = state;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   
    public String getPostcode() {
        return postcode;
    }

    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }
   
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    //create constructor
     public User(int userId, String username, String email, String contact, String grade, String gender, String age,String address, String state, String city, String postcode, String role, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.grade = grade;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.state = state;
        this.city = city;
        this.postcode = postcode;
        this.role = role;
        this.password = password;
    }
    
     //create constructor without userId
  public User( String username, String email, String contact, String grade, String gender, String age,String address, String state, String city, String postcode, String role, String password) {
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.grade = grade;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.state = state;
        this.city = city;
        this.postcode = postcode;
        this.role = role;
        this.password = password;
    }
     public User(int userId,String email,String password)
    {
        this.userId=userId;
        this.email=email;
        this.password=password;
    }
    
    public User()
    {
        
    }
}
