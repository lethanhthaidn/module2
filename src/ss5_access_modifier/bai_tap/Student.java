package ss5_access_modifier.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String setName() {
        return name;
    }

    public String setClasses() {
        return classes;
    }
}
