// Start with just empty Driver
// and non-abstract student class

public class Driver {

    public static void main(String[] args) {
        System.out.println("Hello world");


        // Student s = new Student();  broken when made it abstract
        Student ug = new UnderGradStudent(3.9);
        // ton a code
        ug.goToClass();

        Student g = new GradStudent(3.4);
        g.goToClass();
        // ug.driveToCampus();

        System.out.println(ug.getGpa());

    }



    public void foo(Student s){
        s.driveToCampus();
    }
}
