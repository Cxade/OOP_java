package Task05_01.model.data;

public class Student extends User {

    private String nameOfDepartment;
    private String yeraOfSrudy;

    public Student(String firstname, String secondname, String nameOfUniversarty, String nameOfDepartment,
    String yeraOfSrudy) {
        super(firstname, secondname, nameOfUniversarty);
        this.nameOfDepartment = nameOfDepartment;
        this.yeraOfSrudy = yeraOfSrudy;
    }

    @Override
    public String toString() {
        return "Student [firstname=" + getFirstname() + ", secondname=" + getSecondname() + ", nameOfUniversarty="
        + getNameOfUniversarty() + "nameOfDepartment=" + nameOfDepartment + ", yeraOfSrudy=" + yeraOfSrudy + "]";
    }

    

    
}
