import com.sun.istack.internal.Nullable;

import java.util.LinkedList;

interface Animal {
    String getName();
}

abstract class AlmostAnimal {
    abstract String getName();
}

class Cat extends AlmostAnimal implements Animal {

    @Override
    public String getName() {
        return "I am a cat";
    }

    public void pur() {
        System.out.print("meow");
    }
}

class Dog extends AlmostAnimal implements Animal {

    @Override
    public String getName() {
        return "I am a dog";
    }

    public void woof() {
        System.out.print("woof");
    }
}

abstract class Payment {


    public void payStuff() {
        System.out.print("Paid");
    }
}

class CreditCardPayment extends Payment {
}

interface PaymentResult {
    String name = "123";
    public String getName();
}

class CreditCardResult implements PaymentResult {

    @Override
    @Nullable
    public String getName() {
        return name;
    }
}

class CashResult implements PaymentResult {

    @Override
    @Nullable
    public String getName() {
        return null;
    }
}


class CheckPayment extends Payment {
    public void doStuff() {
        Logger.getInstance(1).log(new CashResult());
    }
}

class Logger {
    private static Logger instance1;
    private static Logger instance2;

    private int numberOfMessges = 0;

    public static Logger getInstance(int number) throws IllegalArgumentException {
        if (number == 0) {
            if (instance1 == null) {
                instance1 = new Logger();
            }

            return instance1;
        } else if (number == 1){
            if (instance2 == null) {
                instance2 = new Logger();
            }

            return instance2;
        }
        throw new IllegalArgumentException();
    }

    private Logger() {}

    public void log(PaymentResult result) {
        if (numberOfMessges > 1000) return;
        System.out.print("Log something" + result.getName());
    }
}


public class CompositionInterfacesStuff {

    CompositionInterfacesStuff() {
        Dog d = new Dog();

        d.getName();
        d.woof();


        AlmostAnimal d2 = new Dog();
        d2.getName();

        AlmostAnimal c1 = new Cat();
        c1.getName();
    }

    public void methodName() {
        methodName("");
    }

    public void methodName(String val1) {
        methodName("", "");
    }

    public void methodName(String val1, String val2) {

    }
}
