package lesson5;

public class Homework5 {

    private String fio;
    private String staff;
    private String email;
    private String phone;
    private int age;
    private double salary;

    public Homework5(String fio,
                     String staff,
                     String email,
                     String phone,
                     int age,
                     double salary) {
        this.fio = fio;
        this.staff = staff;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(" Fio: " + fio + " position: " + staff + " email: " + email + " phone: " + phone + " age: " + age + " salary: " + salary);
    }
}
