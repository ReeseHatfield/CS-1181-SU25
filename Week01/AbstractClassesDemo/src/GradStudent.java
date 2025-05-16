public class GradStudent extends Student {

    public GradStudent(double gpa) {
        super(gpa);
    }

    @Override
    public void goToClass() {
        System.out.println("*attends CS7200*");
    }

    public String toString(){
        return "" + super.getGpa();
    }
    
}
