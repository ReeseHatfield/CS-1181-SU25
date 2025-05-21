public class NonFictionBook extends Book implements Chargeable{

    public NonFictionBook(double ddNumber, String title){

        
        super.setDDNumber(ddNumber);
        super.setTitle(title);
    }

    @Override
    public boolean checkOut() {
        return true;
    }

    @Override
    public int getCharge(int age) {
        return 5;
    }
    
}
