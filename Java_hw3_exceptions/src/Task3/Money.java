package Task3;

public class Money {
    private int id;
    private String currency;
    private int intPart;
    private byte floatPart;

    public int getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public int getIntPart() {
        return intPart;
    }

    public byte getFloatPart() {
        return floatPart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setIntPart(int intPart) {
        this.intPart = intPart;
    }

    public void setFloatPart(byte floatPart) throws Exception {
        if (floatPart < 100 && floatPart >= 0)
            this.floatPart = floatPart;
        else throw new Exception("You've tried to set wrong value to the float part!");
    }

    public Money(int id, String currency) {
        this.id = id;
        this.currency = currency;
    }

    public void ShowMoney() {
        System.out.println("***   Currency type - " + this.currency+ "   ***");
        if (this.floatPart < 10) {
            System.out.println("Amount - " + this.intPart + ".0" + this.floatPart);
        }else System.out.println("Amount - " + this.intPart + "." + this.floatPart);
    }
    public String ShowAmount()  {
        if (this.floatPart < 10) {
            return (this.intPart + ".0" + this.floatPart).toString();
        }else return (this.intPart + "." + this.floatPart).toString();
    }
}
