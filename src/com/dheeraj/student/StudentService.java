
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentService{
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Addend Successfully");
    }

    public void displayAllStudents(){
        if (students.isEmpty()){
            System.out.println("No Students Available");
        }
        for(Student student : students){
            System.out.println();
            System.out.println("ID: "+student.getId());
            System.out.println("NAME: "+student.getName());
            System.out.println("MARKS: "+student.getMarks());
            System.out.println("---------------------------------");
        }
    }

    public void removeStudent(int removeId){
        if (students.isEmpty()){
            System.out.println("No Students Available");
        }
        Student foundStudent = null;
        for (Student student : students){
            if(removeId == student.getId()){
                foundStudent = student;
                break;
            }
        }
        if( foundStudent != null){
            students.remove(foundStudent);
            System.out.println("The Student removed Successfully");
        }else{
            System.out.println("The Student Not Found ");
        }
    }
    public void searchStudent(int id){
        for(Student student : students){
            if(student.getId() == id ) {
                System.out.println("Student Found !");
                System.out.println("ID: " + student.getId());
                System.out.println("NAME: " + student.getName());
                System.out.println("MARKS: " + student.getMarks());
                return;
            }
        }
        System.out.println("The Student Not Found");
    }
    public void updateStudent(int id,String updatedName,double updatedMarks){
        for(Student student : students){
            if(student.getId() == id){
                student.setName(updatedName);
                student.setMarks(updatedMarks);
                System.out.println("Student updated successfully ");
                return;
            }
        }
        System.out.println("The Student Not Found");
    }
    public void findTopper(){
        if (students.isEmpty()){
            System.out.println("No Students Available");
        }
        Student topper = students.get(0);
        for( Student student : students){
            if(student.getMarks() > topper.getMarks()){
                topper = student;
            }
        }
        System.out.println();
        System.out.println("=============== TOPPER ===================:");
        System.out.println("ID: "+topper.getId());
        System.out.println("NAME: "+topper.getName());
        System.out.println("MARKS: "+topper.getMarks());
    }
    public void calculateAverage(){
        if(students.isEmpty()){
            System.out.println("No Students Available");
        }
        int size = students.size();
        int total =0;
        for(Student student : students){
            total += student.getMarks();
        }
        int average = total/size;
        System.out.println("The Average Marks : "+ average);
    }
    public void sortByMarks(){
        Collections.sort(
                students,
                Comparator.comparingDouble(Student::getMarks )
        );
        System.out.println("Students Sorted Successfully ");
    }
}