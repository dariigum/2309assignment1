public class Employee {
    
    public static int id;
    public static String name;
    public static String surname;
    public  static String position;
    public static double salary;
    private final double gpa;

    public String toString(){
        return id + name + surname;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static double getGpa() {
        double gpa;
        return gpa;
    }

    public void setGpa() {
        this.gpa=gpa;
    }
    

    public static double getSalary() {
        return salary;
    }

    public static String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSurname(String surname) {
        Employee.surname = surname;
    }

    public static void setPosition(String position) {
        Employee.position = position;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }

    public Employee(){

    }

    public Employee(String name, String surname, double gpa, String position, double salary){
        this.name=name;
        this.surname=surname;
        this.gpa=gpa;
        this.position=position;
        this.salary=salary;
    }
     @Override
    public double getPaymentAmount(){
        return salary;
    }

    @Override
    public String getPosition(){
        return position;
    }


    @Override
    public String toString(){
        return String.format("Employee: %s %s earns %.2f" + name + surname, getPosition(), salary);
    }
    
}
