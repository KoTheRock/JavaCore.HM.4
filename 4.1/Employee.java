public class Employee {
    private String name;
    private Gender gender;

    public Employee(String name, Gender gender){

        this.name = name;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

