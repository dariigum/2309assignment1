public class Student {
    public static int id;

    private static int id_gen=1;
    public static String name;
    public static String surname;
    public static double gpa;

    private static final double Stipend_amount=36660.00;

    public Student(){
        id=id_gen+1;
    }

    public Student( String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public String toString(){
        return name + surname;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? Stipend_amount : 0.00;
    }

    @Override
    public String toString(){
        return String.format("%s earns %.2f " + name + surname + getPaymentAmount());
    }

}
