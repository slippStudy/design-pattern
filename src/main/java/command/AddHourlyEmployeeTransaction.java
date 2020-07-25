package command;

public class AddHourlyEmployeeTransaction extends AddEmployTransaction {

    public AddHourlyEmployeeTransaction(String name, int employeeId, String address, int salary) {
        super(name, employeeId, address, salary);
    }

    @Override
    public void execute() {
        System.out.printf("%s 직원은 시급을 %d원 받습니다.\n", this.getName(), this.getSalary());
    }
}
