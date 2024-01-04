public class Student {
    public static int id;
    public String name;
    public String surname;
    public double gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Person(){

    }

    public Person(String name, String surname, double gpa){
        this.name=name;
        this.surname=surname;
        this.gpa=gpa;
    }

    getPaymentAmount(){
        if (gpa>2.67){
            int stipend=36660;
            System.out.println(stipend);
        }
    }

}
