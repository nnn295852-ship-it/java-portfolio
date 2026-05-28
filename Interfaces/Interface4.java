interface EmployeeDuties {
    void performDuties();
}

interface Payable {
    double calculatePay();
}

class Manager implements EmployeeDuties, Payable {

    @Override
    public void performDuties() {
        System.out.println("Manager supervises employees and manages projects.");
    }

    @Override
    public double calculatePay() {
        return 5000.0;
    }
}

class Intern implements EmployeeDuties, Payable {

    @Override
    public void performDuties() {
        System.out.println("Intern assists with simple office tasks.");
    }

    @Override
    public double calculatePay() {
        return 1200.0;
    }
}

public class Interface4 {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Intern intern = new Intern();

        manager.performDuties();
        System.out.println("Manager Pay: $" + manager.calculatePay());

        System.out.println();

        intern.performDuties();
        System.out.println("Intern Pay: $" + intern.calculatePay());
    }
}