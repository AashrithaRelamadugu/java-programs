import java.util.*;

abstract class Bank {
    abstract double getBalance(); 
}

class A extends Bank {
    private double balance = 100; 
    double getBalance() {
        return balance;
    }
}

class B extends Bank {
    private double balance = 150; 
    double getBalance() {
        return balance;
    }
}

class C extends Bank {
    private double balance = 200; 
    double getBalance() {
        return balance;
    }
}

 public class BankAbstractEx {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Balance in bank A = $" + a.getBalance()); 
        B b = new B();
        System.out.println("Balance in bank B = $" + b.getBalance()); 
        C c = new C();
        System.out.println("Balance in bank C = $" + c.getBalance()); 
    }
}