import java.util.ArrayList;
import java.sql.*;

public class StudentService {

    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String user = "root";
    String password = "your_password";

    Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }
    public void addStudent(Student student){
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO students (id, name, course) VALUES (?, ?, ?)");
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getCourse());
            stmt.executeUpdate();
            System.out.println("Student added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudent(){
       if (students.isEmpty()){
            System.out.println("No students found");
            return;
       }
       for (Student s : students){
        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse() ); 
       }    
    }

    public void searchStudent(int id){
        for (Student s : students){
            if (s.getId() == id){
                System.out.println("Found :");
                System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
                return;
            }
        } 
        System.out.println("Student not found");
    }

    public void deleteStudent(int id){
        for (Student s : students){
            if (s.getId() == id){
                students.remove(s);
                System.out.println("Student Deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }
}