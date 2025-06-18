import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        // Comparable -> lets you define natural sorting
        // Comparator -> lets you define un-natural sorting

        // Exceptions
        // Checked exceptions -> extends Exception
        //      must be handled somewhere
        //          throw that exception
        //          catch that exception
        // un - Checked exceptions -> extends RuntimeExceptions
        //      not forced to handle them in any way


        JFrame frame = new JFrame();
        frame.setSize(150,500);
        frame.setTitle("students");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new GridLayout(3, 4));



        ArrayList<Student> students = new ArrayList<>();

        try {
            students.add(new Student(4.0, 1));
            students.add(new Student(1.0, 5));
            students.add(new Student(3.1, -2));
            students.add(new Student(2.4, 3));

        } catch (InvalidStudentException ise){ 
            // most specific exception
            System.out.println("One or more students could not be made");
            System.out.println(ise.getMessage());
            return;
            
        } catch (Exception e) {
            // most generic exception
            System.out.println("something went wrong");
        } finally {
            System.out.println("this will ALWAYS run");
        }
        
        // Collections.sort(students);


        for(Student s: students){
            root.add(s);
        }




        // type name = "new" constructing(args)

        System.out.println(students);

        ArrayList<Employable> employees = new ArrayList<>();
        employees.add(new Doctor());
        try {
            employees.add(new Student(4, 5));
        } catch (InvalidStudentException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }

        try{
            System.out.println(((Student) employees.get(0)).getGPA());
        }
        catch(ClassCastException cce){
            System.out.println(((Student) employees.get(1)).getGPA());

        }



        // Collections.sort(students);

        System.out.println(students);


        // Comparable -> meant for natural sorting
        // Comparator ->
        ArrayList<Integer> listOfInts = new ArrayList<>();
        listOfInts.add(3);
        listOfInts.add(4);
        listOfInts.add(2);
        listOfInts.add(1);
        listOfInts.add(7);

        Collections.sort(listOfInts);

        System.out.println(listOfInts);

        JButton btn = new JButton();
        btn.addActionListener(e -> {
            // do some work that takes a lot of time
            for(int i = 0; i < 10_000_000; i ++){
                System.out.println(i);
            }
    
        });

        JButton btn2 = new JButton();
        btn.addActionListener(e -> {
            // do some work that takes a lot of time
            System.out.println("btn 2 was clicked");
        });

        root.add(btn2);
        root.add(btn);

        frame.setContentPane(root);
        frame.setVisible(true); // rendered whenever setVisible -> add stuff before now

        System.out.println("bottom of main reached");
        //. .......
        //. .......
        //. .......
        //. .......
        //. .......
        //. .......
        System.out.println("keep continuing");

        // for(int i = 0; i < 10_000_000; i ++){
        //     System.out.println(i);
        // }

    }

    public static void doThing(Employable e){
        e.getDesiredSalary();
    }
}
