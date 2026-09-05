
public class Student{
        private int id;
        private String name;
        private double marks;

        Student(int id,String name,double marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }
        public void setName(String name){ this.name = name;}
        public String getName(){return name;}

        public int getId(){return id;}

        public  void setMarks(double marks){ this.marks = marks;}
        public double getMarks(){return marks;}
}