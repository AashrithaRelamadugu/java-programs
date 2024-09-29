import java.util.*;
class currencyconverter
{
    public static void main(String s[])
    {
        String from_currency;
        String to_currency;
        double amt;
        double conversionrate=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to convert : ");
        amt=sc.nextDouble();
        System.out.println("enter the from currency(USD, EUR, JPY, INR) :  ");
        from_currency=sc.next().toUpperCase();
        System.out.println("enter the to currency(USD, EUR, JPY, INR) :  ");
        to_currency=sc.next().toUpperCase();
        switch(from_currency)
        {
            case "USD":
                if (to_currency.equals("INR"))
                {
                    conversionrate = 85.0;
                }
                else if (to_currency.equals("EUR"))
                {
                    conversionrate = 0.90;
                }
                else if (to_currency.equals("JPY"))
                {
                    conversionrate = 135.0;
                }
                break;
            case "EUR":
                if (to_currency.equals("USD"))
                {
                    conversionrate = 1.11;
                }
                else if (to_currency.equals("INR"))
                {
                    conversionrate = 94.0;
                }
                else if (to_currency.equals("JPY"))
                {
                    conversionrate = 149.0;
                }
                break;
            case "JPY":
                if (to_currency.equals("USD")) 
                {
                    conversionrate = 0.0074;
                }
                else if (to_currency.equals("EUR"))
                {
                    conversionrate = 0.0067;
                }
                else if (to_currency.equals("INR"))
                {
                    conversionrate = 6.30;
                }
                break;
            case "INR":
                if (to_currency.equals("USD"))
                {
                    conversionrate = 0.0118;
                }
                else if (to_currency.equals("EUR"))
                {
                    conversionrate = 0.0106;
                }
                else if (to_currency.equals("JPY"))
                {
                    conversionrate = 16.13;
                }
                break;
            default:
                System.out.println("Invalid currency conversion");
                return;
        }
        if (conversionrate != 0.0) {
            System.out.println(amt + " " + from_currency + " = " + (amt * conversionrate) + " " + to_currency);
        }
        
    }
}