public class NonFictionBook extends Book implements Chargeable{

    public NonFictionBook(double ddNumber, String title){

        
        try{
            super.setDDNumber(ddNumber);
        }
        catch (BadDDNumberException bddne){
            System.out.println("something went");
        }
        super.setTitle(title);
    }

    public NonFictionBook(NonFictionBook nfb){

        try{
            super.setDDNumber(nfb.getDDNumber());
        }
        catch (BadDDNumberException bddne){
            System.out.println("something went");
        }
        super.setTitle(nfb.getTitle());

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
