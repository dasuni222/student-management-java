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
        }
    }
}