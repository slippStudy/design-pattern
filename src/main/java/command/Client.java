package command;

public class Client {
    public static void main(String[] args) {
        AddHourlyEmployeeTransaction addHourlyEmployee = new AddHourlyEmployeeTransaction("김아름", 1, "임의의 주소", 10000);
        AddEmploy addEmploy = new AddEmploy(addHourlyEmployee);
        addEmploy.add();

        AddMonthlyEmployeeTransaction addMonthlyEmployee = new AddMonthlyEmployeeTransaction("김직원", 2, "한국 임의의 주소", 1000000);
        AddEmploy addEmploy2 = new AddEmploy(addMonthlyEmployee);
        addEmploy2.add();

        AddComissionedEmployeeTransaction addCommissionedEmployee = new AddComissionedEmployeeTransaction("김임원", 3, "미국 임의의 주소", 10000000, 10);
        AddEmploy addEmploy3 = new AddEmploy(addCommissionedEmployee);
        addEmploy3.add();
    }
}
