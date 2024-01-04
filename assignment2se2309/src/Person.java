public class Person {

    public static int id;
    public String name;
    public String surname;
    public String toString(){
        return name + surname;
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

    public Person(String name, String surname, String position, int salary){
        this.name=name;
        this.surname=surname;
        this.position=position;
        this.salary=salary;
    }
}
