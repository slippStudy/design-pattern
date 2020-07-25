package command;

public class AddComissionedEmployeeTransaction extends AddEmployTransaction {
    private double commission;

    public AddComissionedEmployeeTransaction(String name, int employeeId, String address, int salary, double commission) {
        super(name, employeeId, address, salary);
        this.commission = commission;
    }

    @Override
    public void execute() {
        System.out.printf("%s 직원은 월급을 %d원을 받고 추가 수수료율 %f%%를 적용합니다.\n", this.getName(), this.getSalary(), this.commission);
    }
}
