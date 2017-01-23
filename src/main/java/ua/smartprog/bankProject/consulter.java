package ua.smartprog.bankProject;
public class Consulter extends Employee {
    private int experience;

    public Consulter() {
        experience  = 4;
        setSalary(1000);

    }

    public Consulter(int experience) {
        this.experience = experience;
        setSalary(1000);
    }

    public Consulter(String fName, String sName, int cAge, int ID, int Sal) {
        super(fName, sName, cAge, ID, Sal);
        this.experience = 4;
        setSalary(1000);
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
