public class Box<T> {
    private T content;
    // Type name


    public Box(T content){
        this.content = content;
    }


    public String toString(){
        return this.content.toString();
    }
}
