package Super150.OOPS;

public class Student {

        String name;
        int age;
    
        public void Intro_yourSelf() {
            String name = "Kaju";
            System.out.println("My Name is " + this.name + " and age is " + this.age);
    
    }
    public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.age);
		System.out.println(s.name);
		s.age = 90;
		s.name = "Ramu";
		System.out.println(s.age);
		System.out.println(s.name);
		s.Intro_yourSelf();
    }
}
