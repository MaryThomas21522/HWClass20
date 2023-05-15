package HWClass20;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(5000,8.2);
        Visa visa=new Visa(10000,10.5);
        AX ax = new AX(12345,12.9);

        System.out.println(creditCard.calculateInterest());
        System.out.println(visa.calculateInterest());
        System.out.println(ax.calculateInterest());
    }
}

