
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        StudentService service = new StudentService();

        while(true){

            System.out.println("\n=========== STUDENT MANAGEMENT SYSTEM ==============");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student ");
            System.out.println("4. Search Student ");
            System.out.println("5. Update Student");
            System.out.println("6. Find Topper");
            System.out.println("7. Calculate Average ");
            System.out.println("8. Sort By Marks ");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter NAME: ");
                    String name = sc.nextLine();
                    System.out.print("Enter MARKS: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id,name,marks);
                    service.addStudent(student);
                    break;


                case 2:
                    service.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int removeId = sc.nextInt();
                    service.removeStudent(removeId);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();
                    service.searchStudent(searchId);
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String updatedName = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double updatedMarks = sc.nextDouble();
                    service.updateStudent(updateId,updatedName,updatedMarks);
                    break;
                case 6:
                    service.findTopper();
                    break;

                case 7:
                    service.calculateAverage();
                    break;

                case 8:
                    service.sortByMarks();
                    break;

                case 9:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}