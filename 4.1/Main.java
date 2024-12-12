public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice", Gender.Female);
        Employee employee = new Employee("Bob", Gender.Male);

        System.out.println(customer);
        customer.setName("Anna");
        System.out.println(customer);
        System.out.println(employee);
        System.out.println(employee.getGender());
    }
}
