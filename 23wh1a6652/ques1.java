import java.util.*;
class invoice
{
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    invoice()
    {
        Scanner sc=new Scanner(System.in);
        partNumber=sc.nextLine();
        partDescription=sc.next();
        quantity=sc.nextInt();
        price=sc.nextDouble();
    }
    void getInvoiceAmount()
    {
        System.out.println(quantity*price);
    
    }
    public static void main(String[] args)
    {
        invoice i=new invoice();
        i.getInvoiceAmount();
    }
}