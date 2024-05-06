package task;

import java.util.Objects;

public class Task {
    private String info = "Task class";

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        if (Objects.equals(info, "Hello")) {
            System.out.println("Wrong value!");
        } else {
            this.info = info;
        }
    }

    public String getSomeInfo() {
        SomeInnerClass someInnerClass = new SomeInnerClass();
        return someInnerClass.getInfo();
    }


    private class SomeInnerClass {
        private String someInfo = "Hello from Inner Class";

        public String getInfo() {
            return this.someInfo;
        }
    }
}
