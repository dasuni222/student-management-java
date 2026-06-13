import java.util.ArrayList;
public class StudentService {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    }
    
}