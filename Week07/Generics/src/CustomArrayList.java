public class CustomArrayList<E> {
    private E[] arr;

    public CustomArrayList(int initialCapacity){
        // type erasure
        this.arr = (E[]) new Object[initialCapacity];
    }


    public void add(E element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                this.arr[i] = element;
                return;
            }
        }
    }



    public E get(int index){
        return this.arr[index];
    }


    public String toString(){
        String s = "";

        for(E element: this.arr){
            s += " " + element;
        }


        return s;
    }
}
