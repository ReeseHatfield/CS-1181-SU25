public class UnderGradStudent extends Student implements Commuter {

    public UnderGradStudent(double gpa) {
        super(gpa);
    }

    @Override
    public void goToClass() {
        System.out.println("*attends CS1181*");
    }

    public void driveToCampus(){
        System.out.println("*drives to campus*");
    }
    
}
