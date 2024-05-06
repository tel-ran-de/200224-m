package task.sub_task;

public class SubTask {
    private String info = "SubTask class";

    public String getInfo() {
        return this.info;
    }

    public String getData() {
//        локальный внутренний класс
        class SomeInnerLocalClass {
            private String data = "Local class";

            public String getData() {
                return this.data;
            }
        }

        SomeInnerLocalClass someInnerLocalClass = new SomeInnerLocalClass();

        return someInnerLocalClass.getData();
    }
}
