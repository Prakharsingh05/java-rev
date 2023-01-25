public class Employee {

    int employeeId;
    int salary;
    String dept;

    Employee(int empid, int sal , String d){
        int employeeId=101;
        int salary = 3000;
        String dept ="testing";
        

    }

    public static void main(String[] args){
        Employee harsha = new Employee(101,3000,"Testing");
        Employee varsha = new Employee(102,5000,"Engineering");
        System.out.println(harsha.employeeId+" salary "+harsha.salary+" dept"+harsha.dept);
        System.out.println(varsha.employeeId+" salary "+varsha.salary+" dept"+varsha.dept);
    }
}