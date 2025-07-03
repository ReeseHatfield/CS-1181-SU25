public class Student implements Comparable<Student>{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    public String toString(){
        return this.name;
    }
}
