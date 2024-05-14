package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getNumbers()));
    }


    public static int[] getNumbers() {
        int[] arr = {1, 2, 3};
        return arr;
    }
}

//Создайте метод getNumbers();
//Метод должен возвращать массив из трех целочисленных значений: [1, 2, 3]
//Вызовите метод в main()
//Убедитесь, что метод работает верно


//Написать тест для метода getNumbers();
//Используйте метод Assertions.assertEquals
//Проанализируйте вывод
//Используйте метод Assertions.assertArrayEquals
//Проанализируйте результат
//        Напишите тест, который проверяет размер массива
//Создайте метод  void init(), определите в нем ожидаемый результат и примените аннотацию @BeforeEach
//Проанализируйте работу тестов
