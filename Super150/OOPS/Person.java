package Super150.OOPS;

public class Person {

    private String name = "kriti";
    private int age = 89;

    // Constructor
    // public Person() {
    // this.name = "Motu";
    // this.age = 24;
    //
    // }
    //

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void fun() {
        String name = "Panchi";
        int Adhar_no = 901928;
        System.out.println(this.name + " " + this.age + " " + Adhar_no);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        Person p = new Person("Karan", 25);
        p.setName("Priya");
        p.setAge(-9);
        System.out.println(p.getAge());
        p.fun();
        Person p1 = new Person("Kumar", 24);

        p1.fun();

    }
}
