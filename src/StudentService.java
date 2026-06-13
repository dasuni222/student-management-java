import java.util.ArrayList;
public class StudentService {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
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
}