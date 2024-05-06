package main;

import task.Task;
import task.sub_task.SubTask;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        SubTask subTask = new SubTask();
//        System.out.println(task.info);
//        System.out.println(task.getInfo());
//        System.out.println(subTask.getInfo());
//        task.info = 123;
//        task.setInfo("Hello");
//        task.setInfo("Hi");
//        System.out.println(task.getInfo());
//
//        System.out.println(task.getSomeInfo());
        System.out.println(subTask.getData());

//        аннонимный класс
//        Thread t = new Thread();
//        Runnable t1 = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }
    }
}
