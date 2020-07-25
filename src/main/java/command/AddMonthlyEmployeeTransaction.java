package command;

public class AddMonthlyEmployeeTransaction extends AddEmployTransaction {
    public AddMonthlyEmployeeTransaction(String name, int employeeId, String address, int salary) {
        super(name, employeeId, address, salary);
    }

    @Override
    public void execute() {
        System.out.printf("%s 직원은 월급을 %d원 받습니다.\n", this.getName(), this.getSalary());
    }
}
