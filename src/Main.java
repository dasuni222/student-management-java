import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentService service = new StudentService();

          do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            
            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Course: ");
                    String course = input.nextLine();

                    service.addStudent(new Student(id, name, course));
                    break;


                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.searchStudent(input.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    service.deleteStudent(input.nextInt());
                    break;
          }    
    }    
}