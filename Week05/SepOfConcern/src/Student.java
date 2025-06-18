import javax.swing.JLabel;
import javax.swing.JPanel;

public class Student extends JPanel implements Comparable<Student>, Employable {

    private double gpa;
    private int id;


    public Student(double gpa, int id) throws InvalidStudentException, Exception{

        if(gpa < 0.0) {
            throw new InvalidStudentException("cannot have a negative gpa");
        }

        if (id < 0){
            throw new Exception("bad ID");
        }



        this.gpa = gpa;
        this.id = id;

        this.add(new JLabel("ID: " + id));
        this.add(new JLabel("GPA: " + gpa));

    }

    public Student(Student other){
        this.gpa = other.gpa;
        this.id = other.id;
    }


    public String toString(){
        return "" + id + ": " + gpa;
    }


    @Override
    public int compareTo(Student other) {
        // this
        // other
        if (this.id < other.id) {
            return -1;
        }
        else if (this.id > other.id){
            return 1;
        }
        else {
            return 0;
        }
    }


    public double getGPA(){
        return this.gpa;
    }

    public void setGPA(double newGPA){
        this.gpa = newGPA;
    }


    @Override
    public int getDesiredSalary() {
        return 20_000;
    }
}
