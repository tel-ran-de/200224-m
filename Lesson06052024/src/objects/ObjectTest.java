package objects;

public class ObjectTest {
    public static void main(String[] args) {
        Object obj = new Object();
//        obj = 123;
//        System.out.println(obj);
        Dog spike = new Dog(5, "Spike");
        Dog tom = new Dog(3, "Tom");
//        Dog spike1 = spike;
        Dog spike1 = new Dog(5, "Spike");;

//        spike1.setName("Spike1");
        System.out.println(spike);
        System.out.println(spike1);
//        System.out.println(tom);
//        System.out.println(spike.equals(tom));
        System.out.println(spike.equals(spike1));
//        System.out.println(spike.getName());
//        System.out.println(spike.getAge());
    }
}
