// Start with just empty Driver
// and non-abstract student class

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Hello world");


        // Student s = new Student();  broken when made it abstract
        // Student ug = new UnderGradStudent(3.9);
        // // ton a code
        // ug.goToClass();

        // Student g = new GradStudent(3.4);
        // g.goToClass();
        // // ug.driveToCampus();

        // System.out.println(ug.getGpa());

        // Student s1 = new GradStudent(2.0);
        // Student s2 = new GradStudent(3.5);
        // Student s3 = new GradStudent(3.1);
        // Student s4 = new GradStudent(3.4);

        // ArrayList<Student> list = new ArrayList<>();
        // list.add(s1);
        // list.add(s2);
        // list.add(s3);
        // list.add(s4);

        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

        
        // Dog myDog = new Dog();

        // myDog.makeNoise();

        // Bird myBird = new Bird();

        // Dog myDog = new Dog();

        // // wakeBeast(myBird);
        // wakeBeast(myDog);

        // myDog.playFetch();

        // // myBird.run();
        // // myBird.makeNoise();


        // TwoLeggedThing thing = new Bird();
        // // thing.makeNoise();


        // LogList ll = new LogList();
        // ll.add("Event 1 occured");
        // ll.add("Event 2 occured");
        // ll.add("Event 3 occured");
        // ll.add("Event 4 occured");
        // ll.add("Event 5 occured");
        // ll.printEveryOther();

        Animal pig = new Animal() {
            // anonymous inner class
            public void makeNoise(){
                System.out.println("*oink*");
            }

            public void fly(){
                System.out.println("when pigs fly");
            }
        };

        // run method takes no parameters
        // only a single method present in this interface

        // lambda expression
        TwoLeggedThing myTwoLeggedThing = ((s) -> {
            System.out.println("I am running " + s);
        });

        myTwoLeggedThing.run("away");


    }


    /**
     * Wakes up a beast and makes its noise
     * @param a the animal to wake up
     */
    public static void wakeBeast(Animal a){
        System.out.println("waking the beast");
        a.makeNoise();
        // a.playFetch();

    }



    // public void foo(Student s){
    //     s.driveToCampus();
    // }
}
