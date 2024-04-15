public class Dog {
    int age;
    String name;

    // default constructor
    public Dog() {

    }

    // constructor with params
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
//
    public Dog(int age) {
        this.age = age;
    }
//
    public Dog(String name) {
        this.name = name;
    }
}
