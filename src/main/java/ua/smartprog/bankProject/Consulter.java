package ua.smartprog.bankProject;
public class Consulter extends Employee {
    private int experience;

    public Consulter() {
        experience  = 4;
        setSalary(1000);
        //new commit
    }

    public Consulter(int experience) {
        super();
        this.experience = experience;
        setSalary(1000);
    }

    public Consulter(String fName, String sName, int year, int month, int day, int ID, int Sal) {
        super(fName, sName, year, month, day, ID, Sal);
        this.experience = 4;
        setSalary(1000);
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String ToString(){
        Employee forToString = new Employee();
        return forToString.ToString() + "Expirience = " + experience + "]";
    }
}
