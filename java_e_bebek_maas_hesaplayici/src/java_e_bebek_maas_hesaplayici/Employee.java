package java_e_bebek_maas_hesaplayici;


public class Employee{

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    // ----------------------------------------------------------------------------------------
    public Employee(){

    }
    // ----------------------------------------------------------------------------------------
    public Employee(String name, double salary, double workHours,
                    int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // ----------------------------------------------------------------------------------------
    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    //-----------------------------------------------------------------------------------------
    public double tax() {
        double taxOfSalary = 0;

        if (this.salary < 1000)
            taxOfSalary = 0;
        else
            taxOfSalary = 0.03 * this.salary;
        return taxOfSalary;

    }
    //-----------------------------------------------------------------------------------------
    public double bonus() {
        double bonusOfSalary = 0;

        if (workHours > 40)
            bonusOfSalary = (workHours - 40) * 30;
        return bonusOfSalary;

    }
    //-----------------------------------------------------------------------------------------
    public double raiseSalary() {
        double raiseOfSalary = 0;

        if (2021 - (hireYear) < 10)
            raiseOfSalary = 0.05 * salary;
        else if (2021 - (hireYear) > 9 && 2021 - (hireYear) < 20)
            raiseOfSalary = 0.1 * salary;
        else if (2021 - (hireYear) > 19)
            raiseOfSalary = 0.15 * salary;

        return raiseOfSalary;

    }
 	//-----------------------------------------------------------------------------------------
    public void toMyString() {

        System.out.println("name surname: " + getName());
        System.out.println("salary: " + getSalary());
        System.out.println("work hours: " + getWorkHours());
        System.out.println("hire year: " + getHireYear());
        System.out.println("-");
        System.out.println("tax of " + getName() + " is=  " + tax());
        System.out.println("bonus of " + getName() + " is=  " + bonus());
        System.out.println("raise in salary of " + getName() + " is=  " + raiseSalary());
        System.out.println("-");
        System.out.println("salary with tax and bonuses of " + getName() + " is=  " + (getSalary() - tax() + bonus()));
        System.out.println("total salary of " + getName() + " is=  " + (getSalary() - tax() + bonus() + raiseSalary()));
        System.out.println("---------------------------");

    }
}
