package Task05_01.model.data;

public abstract class User {
    private String firstname;
    private String secondname;
    private String nameOfUniversarty;

    public User(String firstname, String secondname, String nameOfUniversarty) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.nameOfUniversarty = nameOfUniversarty;
    }

    @Override
    public String toString() {
        return "User [firstname=" + firstname + ", secondname=" + secondname + ", nameOfUniversarty="
                + nameOfUniversarty + "]";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getNameOfUniversarty() {
        return nameOfUniversarty;
    }

    
}