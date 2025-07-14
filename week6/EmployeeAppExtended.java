/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee with information number of hours & wages per hour, number of weeks & wages per week respectively & method calculateWages() to calculate their monthly salary. Also override getDesig () method depending on the type of contract employee.*/

class Employee {
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getDesig() {
        return "Contract Employee";
    }
}

class HourlyEmployee extends ContractEmployee {
    private int numberOfHours;
    private double wagesPerHour;

    public HourlyEmployee(String firstName, String lastName, int numberOfHours, double wagesPerHour) {
        super(firstName, lastName);
        this.numberOfHours = numberOfHours;
        this.wagesPerHour = wagesPerHour;
    }

    @Override
    public String getDesig() {
        return "Hourly " + super.getDesig();
    }

    public double calculateWages() {
        return numberOfHours * wagesPerHour * 4; // Assuming 4 weeks in a month
    }
}

class WeeklyEmployee extends ContractEmployee {
    private int numberOfWeeks;
    private double wagesPerWeek;

    public WeeklyEmployee(String firstName, String lastName, int numberOfWeeks, double wagesPerWeek) {
        super(firstName, lastName);
        this.numberOfWeeks = numberOfWeeks;
        this.wagesPerWeek = wagesPerWeek;
    }

    @Override
    public String getDesig() {
        return "Weekly " + super.getDesig();
    }

    public double calculateWages() {
        return numberOfWeeks * wagesPerWeek;
    }
}
public class EmployeeAppExtended {
    public static void main(String[] args) {
        // Creating instances of HourlyEmployee and WeeklyEmployee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "Doe", 40, 15.0);
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee("Alice", "Smith", 4, 500.0);

        // Displaying full name, designation, and calculating wages
        displayEmployeeInfo(hourlyEmployee);
        displayEmployeeInfo(weeklyEmployee);
    }

    // Method to display employee information
    private static void displayEmployeeInfo(ContractEmployee employee) {
        System.out.println("Employee: " + employee.getDesig() + " - " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Monthly Salary: $" + (employee instanceof HourlyEmployee ? ((HourlyEmployee) employee).calculateWages() :
            ((WeeklyEmployee) employee).calculateWages()));
        System.out.println("-----------------------");
    }
}
 
