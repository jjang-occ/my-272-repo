package ic03a.question1;

public class BillfoldTester
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        DriverLicense d = new DriverLicense("John Doe", 2007);
        CallingCard c = new CallingCard("Omega Card", "0123456789", "1234");
        
        BillFold b = new BillFold();
        
        b.addCard(d);
        b.addCard(c);
        
        System.out.println(b.formatCards());
        
        
        
        

    }

}
