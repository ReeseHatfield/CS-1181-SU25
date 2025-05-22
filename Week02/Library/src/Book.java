public abstract class Book extends Object implements Comparable<Book>{
    private double ddNumber;
    private String title;


    // hypotheical constructor(String title, DDnumber)

    public abstract boolean checkOut();

    public double getDDNumber(){
        return this.ddNumber;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDDNumber(double newDDNumber) throws BadDDNumberException {
        // some behavior that is marked as being bad
        if(newDDNumber < 0){
            throw new BadDDNumberException("Cannot have DDNumber of " + newDDNumber);
        }

        this.ddNumber = newDDNumber;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    @Override // annotation
    public String toString(){
        return this.getTitle() +" "+  this.getDDNumber();
    }

    @Override
    public int compareTo(Book other){

        if (this.ddNumber < other.ddNumber){
            return -1;
        }
        else if (this.ddNumber > other.ddNumber){
            return 1;
        }
        else {
            return this.title.compareToIgnoreCase(other.getTitle());
        }

    }



}
