package hatfieldjuniorswimmingschool.controller;

import hatfieldjuniorswimmingschool.model.User;
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

public class UserController extends User {

    private String filename = "src/hatfieldjuniorswimmingschool/csvFile/user_details.csv";
    private List<User> user_details;

    public UserController(int userId, String username, String email, String contact, String grade, String gender, String age, String address, String state, String city, String postcode, String role, String password) {
        super(userId, username, email, contact, grade, gender, age, address, state, city, postcode, role, password);
        user_details = fetchAllUser();
    }

    public UserController(String username, String email, String contact, String grade, String gender, String age, String address, String state, String city, String postcode, String role, String password) {
        super(username, email, contact, grade, gender, age, address, state, city, postcode, role, password);
        user_details = fetchAllUser();
    }

    public UserController() {
        user_details = fetchAllUser();
    }

    //get old user details from csv file
    public List<User> fetchAllUser() {
        List<User> user_details = new ArrayList<>();
        String line;
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
                //userid convert into integer
                int userId = Integer.parseInt(List[0]);
                user_details.add(new User(userId, List[2], List[3], List[4], List[1], List[5], List[6], List[7], List[8], List[9], List[10], List[11], List[12]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user_details;
    }

    //save user details in csv file
    public boolean userRegister() {
        //userId auto increament on save details
        int userId = fetchAllUser().size() + 1;
        //validation for email exist
        if (!isEmailExist(email)) {
            //store details in array
            String[] details = {"" + userId, grade, username, email, contact, gender, age, address, state, city, postcode, role, getPassword()};
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                //Writer header if file empty
                boolean isHeaderExist = isHeaderExist(filename);
                if (!isHeaderExist) {
                    writer.write("USER ID,GRADE,USERNAME,EMAIL,CONTACT,GENDER,AGE,ADDRESS,STATE,CITY,POSTCODE,ROLE,PASSWORD\n");
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

    //user login
    public int userLogin(String email, String password) {
        int userId = 0;
        //call fetchAlluser method to get user details
        List<User> user_details = fetchAllUser();
        for (int id = 0; id < user_details.size(); id++) {
            //get register email or password from csv file
            String registerEmail = user_details.get(id).getEmail();
            String registerPassword = user_details.get(id).getPassword();
            String role = user_details.get(id).getRole();
            //validation of email and password
            if (registerEmail.equalsIgnoreCase(email) && registerPassword.equalsIgnoreCase(password) && role.equalsIgnoreCase("Learner")) {
                //set user id after login successfully
                userId = user_details.get(id).getUserId();
            }
        }
        //return userId
        return userId;
    }

    //get user details by id
    public User getUserById(int userId) {
        User user = null;
        List<User> user_details = fetchAllUser();
        for (int i = 0; i < user_details.size(); i++) {
            if (user_details.get(i).getUserId() == userId) {
                String name = user_details.get(i).getUsername();
                String email = user_details.get(i).getEmail();
                String contact = user_details.get(i).getContact();
                String grade = user_details.get(i).getGrade();
                String gender = user_details.get(i).getGender();
                String age = user_details.get(i).getAge();
                String address = user_details.get(i).getAddress();
                String state = user_details.get(i).getState();
                String city = user_details.get(i).getCity();
                String postcode = user_details.get(i).getPostcode();
                String password = user_details.get(i).getPassword();
                String role = user_details.get(i).getRole();
                user = new User(userId, name, email, contact, grade, gender, age, address, state, city, postcode, role, password);
            }
        }
        return user;
    }

    //get all coach details
    public List<User> fetchAllCoach() {
        //create array list to store coach details
        List<User> coach_details = new ArrayList<>();
        for (int i = 0; i < user_details.size(); i++) {
            //validation of role from user_details table
            if (user_details.get(i).getRole().equalsIgnoreCase("Coach")) {
                userId = user_details.get(i).userId;
                String name = user_details.get(i).getUsername();
                String email = user_details.get(i).getEmail();
                String contact = user_details.get(i).getContact();
                String grade = user_details.get(i).getGrade();
                String gender = user_details.get(i).getGender();
                String age = user_details.get(i).getAge();
                String address = user_details.get(i).getAddress();
                String state = user_details.get(i).getState();
                String city = user_details.get(i).getCity();
                String postcode = user_details.get(i).getPostcode();
                String password = user_details.get(i).getPassword();
                String role = user_details.get(i).getRole();
                //add coach details in array list
                coach_details.add(new User(userId, name, email, contact, grade, gender, age, address, state, city, postcode, role, password));
            }
        }
        //return coach details
        return coach_details;
    }

    //update user grade
    public boolean updateUserGrade(String userId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;
            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                // validation of lesson id
                if (fields.length > 1 && fields[0].equalsIgnoreCase(userId)) {
                    //get user current grade level
                    int user_grade = Integer.parseInt(fields[1].substring(12)) + 1;
                    //change status
                    fields[1] = "Grade Level " + user_grade;
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

    //check header exist or not in file
    private static boolean isHeaderExist(String filename) throws FileNotFoundException, IOException { // Read the first line
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        // Read the first line
        String firstLine = reader.readLine();
        reader.close();
        //return firstline is exist or not
        return firstLine != null && !firstLine.isEmpty();
    }

    //check is email exist in user details csv file
    public static boolean isEmailExist(String email) {
        List<User> user_details = new UserController().fetchAllUser();
        for (int i = 0; i < user_details.size(); i++) {
            if (user_details.get(i).getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

}
