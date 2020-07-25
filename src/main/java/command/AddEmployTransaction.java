package command;

public abstract class AddEmployTransaction implements Transaction {
    private String name;
    private int employeeId;
    private String address;
    private int salary;

    protected AddEmployTransaction(String name, int employeeId, String address, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.address = address;
        this.salary = salary;
    }

    protected String getName() {
        return name;
    }

    protected int getEmployeeId() {
        return employeeId;
    }

    protected String getAddress() {
        return address;
    }

    protected int getSalary() {
        return salary;
    }
}
