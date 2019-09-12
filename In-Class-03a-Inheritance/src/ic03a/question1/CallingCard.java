package ic03a.question1;

public class CallingCard extends Card
{
    private String cardNumber;
    private String pin;
    
    public CallingCard(String n, String cardNumber, String pin)
    {
        super(n);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    
    public boolean equals(Object otherObject)
    {
        CallingCard other = (CallingCard) otherObject;
        return this.getName() == other.getName() && this.cardNumber == other.cardNumber && this.pin == other.pin;
    }
    
    
}
