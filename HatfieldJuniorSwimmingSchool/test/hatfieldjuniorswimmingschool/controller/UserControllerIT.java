package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UserControllerIT {
    private static List<User> user_details=new UserController().fetchAllUser();
    
    public UserControllerIT() {
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
     * Test of fetchAllUser method, of class UserController.
     */
    @Test
    public void testFetchAllUser() {
        System.out.println("fetchAllUser");
        UserController instance = new UserController();
        List<User> result = instance.fetchAllUser();
        for(int user=0; user<result.size(); user++)
        {
            System.out.println("User ID : "+result.get(user).getUserId());
            System.out.println("User Name : "+result.get(user).username);
            System.out.println("Email : "+result.get(user).email);
            System.out.println("Contact : "+result.get(user).contact);
            System.out.println("Gender : "+result.get(user).gender);
            if(!result.get(user).role.equalsIgnoreCase("Coach"))
            {
                System.out.println("Grade Level : "+result.get(user).grade);
            }
            System.out.println("Age : "+result.get(user).age);
            System.out.println("Address : "+result.get(user).address);
            System.out.println("State : "+result.get(user).state);
            System.out.println("City : "+result.get(user).city);
            System.out.println("Role : "+result.get(user).role);
            System.out.println("Postcode : "+result.get(user).postcode);
            System.out.println("Password : "+result.get(user).password);
            System.out.println();
        }
        
    }

    /**
     * Test of userRegister method, of class UserController.
     */
    @Test
    public void testUserRegister() {
        System.out.println("userRegister");
        int min_age;
        int max_age;
        String name="James";
        String email="james@gmail.com";
        String contact="9876543210";
        String age="4";
        String address="23 Primrose Street";
        String grade="Grade Level 1";
        String state="London";
        String city="Southwark";
        String role="Learner";
        String gender="Male";
        String postcode="123456";
        String password="123456";
        UserController instance = new UserController(name, email, contact, grade, gender, age, address, state, city, postcode, role, password);
        boolean isRegisteredEmail=UserControllerIT.isRegisteredEmail(email);
        //validation any fields not empty
        if (!(name.isBlank() || email.isBlank() || contact.isBlank() || address.isBlank() || state.isBlank() || postcode.isBlank() || role.equalsIgnoreCase("Select Role") || age.isBlank() || password.isBlank() || grade.equalsIgnoreCase("Choose Grade") || gender.equalsIgnoreCase("Choose Gender"))) {
            //validation for email
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                //validation for contact
                if (contact.matches("[0-9]{10}")) {
                    //validation for postcode
                    if (postcode.matches("[0-9]+")) {
                        if (role.equalsIgnoreCase("Learner")) {
                            min_age = 4;
                            max_age = 11;
                        } else {
                            min_age = 1;
                            max_age = 150;
                        }
                        //validation for age
                        if (age.matches("[0-9]+")) {
                            //convert age into integer
                            int age1 = Integer.parseInt(age);
                            if (age1 >= min_age && age1 <= max_age) {
                                if (!isRegisteredEmail) {
                                   boolean result = instance.userRegister();
                                    if (result) {
                                        System.out.println("Registration Successfully");
                                        
                                    }
                                } else {
                                   System.out.println("Email already registered");
                                }
                            } else {
                               System.out.println("Enter valid age \nEx Age : 4 to 11");
                            }

                        } else {
                            System.out.println("Enter valid Age");
                        }
                    } else {
                       System.out.println("Enter valid postcode \n Ex. Postcode : 123456");
                    }
                } else {
                   System.out.println("Enter valid contact \nEx Contact : 9876543210");
                }

            } else {
               System.out.println( "Enter valid email \nEx Email : abc@gmail.com");
            }

        } else {
            System.out.println("All fields are required");
        }
       
    }

    /**
     * Test of userLogin method, of class UserController.
     */
    @Test
    public void testUserLogin() {
        System.out.println("userLogin");
        String email = "henry@gmail.com";
        String password = "123456";
        UserController instance = new UserController();
        int expResult = 0;
        int result = instance.userLogin(email, password);
       if(result!=0)
       {
           System.out.println("Login Successfully");
       }else
       {
           System.out.println("Wrong email or password");
       }
    }

    /**
     * Test of getUserById method, of class UserController.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int userId = 6;
        UserController instance = new UserController();
        boolean isUserIdExist = UserControllerIT.isUserIdExist(userId);
        if(isUserIdExist)
        {
            User result = instance.getUserById(userId);
            System.out.println("User ID : "+result.getUserId());
            System.out.println("User Name : "+result.username);
            System.out.println("Email : "+result.email);
            System.out.println("Contact : "+result.contact);
            System.out.println("Gender : "+result.gender);
            System.out.println("Grade Level : "+result.grade);
            System.out.println("Age : "+result.age);
            System.out.println("Address : "+result.address);
            System.out.println("State : "+result.state);
            System.out.println("City : "+result.city);
            System.out.println("Role : "+result.role);
            System.out.println("Postcode : "+result.postcode);
            System.out.println("Password : "+result.password);
            System.out.println();
        }else
        {
            System.out.println("User id does not exist");
        }
       
       
    }

    /**
     * Test of fetchAllCoach method, of class UserController.
     */
    @Test
    public void testFetchAllCoach() {
        System.out.println("fetchAllCoach");
        UserController instance = new UserController();
        List<User> result = instance.fetchAllCoach();
        for(int user=0; user<result.size(); user++)
        {
            System.out.println("Coach ID : "+result.get(user).getUserId());
            System.out.println("Coach Name : "+result.get(user).username);
            System.out.println("Email : "+result.get(user).email);
            System.out.println("Contact : "+result.get(user).contact);
            System.out.println("Gender : "+result.get(user).gender);
            System.out.println("Age : "+result.get(user).age);
            System.out.println("Address : "+result.get(user).address);
            System.out.println("State : "+result.get(user).state);
            System.out.println("City : "+result.get(user).city);
            System.out.println("Role : "+result.get(user).role);
            System.out.println("Postcode : "+result.get(user).postcode);
            System.out.println("Password : "+result.get(user).password);
            System.out.println();
        }
        
    }

    /**
     * Test of updateUserGrade method, of class UserController.
     */
    @Test
    public void testUpdateUserGrade() {
        System.out.println("updateUserGrade");
        int userId = 6;
        UserController instance = new UserController();
        boolean isUserIdExist = UserControllerIT.isUserIdExist(userId);
        if (isUserIdExist) {
            boolean result = instance.updateUserGrade("" + userId);
            if (result) {
                System.out.println("User grade updated successfully");
            }
        } else {
            System.out.println("User id does not exist");
        }

    }

    /**
     * Test of isEmailExist method, of class UserController.
     */
    @Test
    public void testIsEmailExist() {
        System.out.println("isEmailExist");
        String email = "henry@gmail.com";
        boolean result = UserController.isEmailExist(email);
        if(result)
        {
            System.out.println("Email exist");
        }else
        {
            System.out.println("email does not exist");
        }
    }
    
    //check user id exist or not
    public static boolean isUserIdExist(int userId) {
        for (int i = 0; i < user_details.size(); i++) {
            if (user_details.get(i).userId == userId) {
                return true;
            }
        }
        return false;
    }
    
    //check user id exist or not
    public static boolean isCoachIdExist(int userId) {
        for (int i = 0; i < user_details.size(); i++) {
            if (user_details.get(i).userId == userId) {
                if (user_details.get(i).getRole().equalsIgnoreCase("Coach")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //validation email is pre registered or not
    public static boolean isRegisteredEmail(String email)
    {
        for(int i=0; i<user_details.size(); i++)
        {
            if(user_details.get(i).email.equalsIgnoreCase(email))
            {
                return true;
            }
        }
        return false;
    }
    
    
}
