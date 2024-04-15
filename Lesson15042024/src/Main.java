public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Java!");
        Dog dogDefault = new Dog();
        Dog spike = new Dog(10, "Spike");
//        Dog dogName = new Dog("Tike");
        Dog dogAge = new Dog(5);
//        System.out.println(dogDefault.age);
        System.out.println(spike.age);
        System.out.println(spike.name);
//        System.out.println(dogName.name);
        System.out.println(dogAge.age);
        System.out.println(dogAge.name);
    }
}