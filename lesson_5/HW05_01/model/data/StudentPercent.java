package model.data;


public class StudentPercent {
    private String name;
    private float percent;

    public StudentPercent(String name, Float percent) {
        this.name = name;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "StudentPercent [name=" + name + ", percent=" + percent + "]";
    }

    public String getName() {
        return name;
    }

    public Float getPercent() {
        return percent;
    }

}
