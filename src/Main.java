import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;
     
        do{
           System.out.println("\n1. Add Student");
           System.out.println("View Students");
           System.out.println("Search Student");
           System.out.println("Delete Students");
           System.out.println("Exit");

           choice = input.nextInt();
           switch(choice){
            case 1:
                System.out.print("ID: ");
                int id = input.nextInt();

                input.nextLine();

                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("Course: ");
                String course = input.nextLine();

                Student student = new Student(id, name, course);

                service.addStudent(student);
                break;

            case 2 :
                service.viewStudent();
                break;

            case 3 :
                System.out.print("Enter Id : ");
                int searchId = input.nextInt();
                service.searchStudent(searchId);
                break;

            case 4 :
                
           }
        }
    }
}