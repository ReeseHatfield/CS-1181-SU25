public abstract class Student extends Object implements Comparable<Student> {

    private double gpa;
    public String name = "John Doe";

    public abstract void goToClass();

    public Student(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return this.gpa;
    }


    public String toString(){
        return "i am a student";
    }

    public int compareTo(Student other){

        if(this.gpa > other.gpa){
            return -1;
        }
        else if(this.gpa < other.gpa){
            return 1;
        }
        else {
            return 0;
        }
        

    }
}
