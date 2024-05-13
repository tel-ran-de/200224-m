package stringClass;
//Создайте StringBuilder объекты используя все предоставленные конструкторы
//Используя метод append добавьте к объекту, который создан при помощи конструктора без параметров, строку “StartaUniversity”
//Распечатайте все объекты на консоле
//Примените метод reverse() к любому созданному объекту
//Распечатайте объект на консоле
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        String str = "Java";
        StringBuilder sb3 = new StringBuilder(str);
        StringBuilder sb4 = new StringBuilder("qwertdfgds sdgfsdgfs000");

//        System.out.println(sb1 + " " + sb1.capacity() + " " + sb1.length());

//        sb1.append("StartaUniversity");
//        System.out.println(sb1 + " " + sb1.capacity() + " " + sb1.length());
//        System.out.println(sb2 + " " + sb2.capacity() + " " + sb2.length());
//        System.out.println(sb3 + " " + sb3.capacity() + " " + sb3.length());
//        System.out.println(sb4 + " " + sb4.capacity() + " " + sb4.length());

//        sb1.reverse();
//        System.out.println(sb1 + " " + sb1.capacity() + " " + sb1.length());
//        System.out.println(sb1.charAt(0));
        System.out.println(sb1.delete(0, 6));
//        System.out.println(sb1.deleteCharAt(0));
        System.out.println(sb1.substring(6));
//        System.out.println(sb1.replace(0, 6, "Java"));
        StringBuilder sb5 = new StringBuilder("Java StringBuilder");
        System.out.println(sb5 + " " + sb5.capacity() + " " + sb5.length());
        sb5.trimToSize();
        System.out.println(sb5 + " " + sb5.capacity() + " " + sb5.length());

    }
}
