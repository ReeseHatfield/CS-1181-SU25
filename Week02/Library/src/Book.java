public abstract class Book {
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

    public void setDDNumber(double newDDNumber){
        // some behavior that is marked as being bad
        if(newDDNumber < 0){
            // dont set it
            return;
        }

        this.ddNumber = newDDNumber;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }


}
