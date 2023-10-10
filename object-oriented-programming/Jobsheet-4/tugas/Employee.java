package tugas;

public class Employee {
    protected String noKtp, name;
    protected int age;
    protected boolean isAttend;
    protected Restaurant restaurant;

    protected Employee(String noKtp, String name, int age, Restaurant restaurant) {
        this.noKtp = noKtp;
        this.name = name;
        this.age = age;
        this.restaurant = restaurant;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attend() {
        this.isAttend = true;
    }

    public boolean isAttend() {
        return isAttend;
    }
}
