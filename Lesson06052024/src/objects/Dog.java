package objects;

import java.util.Objects;

public class Dog
{
    private String name;
    private int age;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Dog obj1 = (Dog)(obj);
        return Objects.equals(obj1.age, this.age) && Objects.equals(obj1.name, this.name);
    }
}
