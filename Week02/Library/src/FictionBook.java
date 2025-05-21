public class FictionBook extends Book implements Chargeable{

    private String author;

    public FictionBook(double ddNumber, String title, String author){
        super.setDDNumber(ddNumber);
        super.setTitle(title);

        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public boolean checkOut() {
        return false;
    }

    @Override
    public int getCharge(int age) {
        if(age < 12){
            return 0;
        }

        return 10;
    }

    
}
