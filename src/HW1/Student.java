package HW1;

public class Student {
    String name;
    int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    void studentsInfo() {
        System.out.println(getName() + ": " + getMark());
    }

}
