class Employee {
    private String name;
    private String empId;
    private String address;
    private String email;
    private String mobileNo;
    private double basicPay;

    public Employee(String name, String empId, String address, String email, String mobileNo, double basicPay) {
        this.name = name;
        this.empId = empId;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return 0.97 * basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    public double calculatePAF() {
        return 0.12 * basicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    public double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public double calculateDeductions() {
        return calculatePAF() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }

    public void printSalarySlip() {
        System.out.println("Salary Slip for " + name + " (ID: " + empId + ")");
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println();
        System.out.printf("Basic Pay: %.2f\n", basicPay);
        System.out.printf("DA (97%%): %.2f\n", calculateDA());
        System.out.printf("HRA (10%%): %.2f\n", calculateHRA());
        System.out.printf("PAF (12%%): %.2f\n", calculatePAF());
        System.out.printf("Staff Club Fund (0.1%%): %.2f\n", calculateStaffClubFund());
        System.out.printf("Gross Salary: %.2f\n", calculateGrossSalary());
        System.out.printf("Deductions: %.2f\n", calculateDeductions());
        System.out.printf("Net Salary: %.2f\n", calculateNetSalary());
        System.out.println("----------------------------------------------------------------");
    
    }
}


class Programmer extends Employee {
    public Programmer(String name, String empId, String address, String email, String mobileNo, double basicPay) {
        super(name, empId, address, email, mobileNo, basicPay);
    }
}

class TeamLead extends Employee {
    public TeamLead(String name, String empId, String address, String email, String mobileNo, double basicPay) {
        super(name, empId, address, email, mobileNo, basicPay);
    }
}

class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String name, String empId, String address, String email, String mobileNo, double basicPay) {
        super(name, empId, address, email, mobileNo, basicPay);
    }
}

class ProjectManager extends Employee {
    public ProjectManager(String name, String empId, String address, String email, String mobileNo, double basicPay) {
        super(name, empId, address, email, mobileNo, basicPay);
    }
}

public class employee {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alice", "P1001", "123 Main St", "alice@example.com", "555-1234", 50000);
        TeamLead teamLead = new TeamLead("Bob", "TL2001", "456 Oak St", "bob@example.com", "555-5678", 70000);
        AssistantProjectManager apm = new AssistantProjectManager("Charlie", "APM3001", "789 Pine St", "charlie@example.com", "555-8765", 80000);
        ProjectManager pm = new ProjectManager("Diana", "PM4001", "101 Maple St", "diana@example.com", "555-4321", 100000);

        programmer.printSalarySlip();
        teamLead.printSalarySlip();
        apm.printSalarySlip();
        pm.printSalarySlip();
    }
}

