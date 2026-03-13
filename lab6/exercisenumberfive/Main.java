package exercisenumberfive;
import exercisenumberfour.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "John", 5, "Labrador");
        Dog dog2 = new Dog("Rex", "John", 5, "Labrador");

        System.out.println(dog1);
        System.out.println("Dogs equal: " + dog1.equals(dog2));

        Account acc = new Account(12345, "Turan", 500);

        acc.deposit(200);
        System.out.println("Balance after deposit: " + acc.getBalance());

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}