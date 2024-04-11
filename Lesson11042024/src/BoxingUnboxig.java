public class BoxingUnboxig {
    public static void main(String[] args) {
        // неявное преобразование
        int i = 127; // 127 - byte
        int i2 = 32000; // 32000 - short
        double d1 = i; // 127 - int
//        System.out.println(i);
//        System.out.println(i2);
//        System.out.println(d1);

        // явное преобразование
//        byte b = 127; // -128 ... 127
        int i3 = 130; // i3 -> new Integer(i3) -> i3
        byte b = (byte)i3;
        System.out.println(b);

        int intNum = 10;
        Integer intObj = intNum; // intObj = new Integer(intNum) boxing
        Integer intObj2 = 123; // new Integer(123);
        int intNum2 = intObj2; // unboxing
    }
}
