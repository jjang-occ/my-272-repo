package ic03a.question1;

public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }
    
    public String format()
    {
       return super.format() + " ID Number: " + idNumber;
    }


}
