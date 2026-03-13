package exercisenumberfour;




public class MainAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Cat", "Alice", 3);
        Animal animal2 = new Animal("Cat", "Alice", 3);

        System.out.println(animal1.toString());
        System.out.println("Animals equal: " + animal1.equals(animal2));

        Dog dog1 = new Dog("Rex", "John", 5, "Labrador");
        Dog dog2 = new Dog("Rex", "John", 5, "Labrador");

        System.out.println(dog1.toString());
        System.out.println("Dogs equal: " + dog1.equals(dog2));
    }
}