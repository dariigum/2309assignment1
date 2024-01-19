public class Person implements Payable, Comparable<Person> {

    public static int id_gen=1;
    public static int id;

    public String name;
    public String surname;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Person(){

    }

    public Person(String name, String surname, String position, double salary){
        this.name=name;
        this.surname=surname;
        this.position=position;
        this.salary=salary;
    }

    public void getPaymentAmount() {
    }
}
