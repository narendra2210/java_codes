package Super150.OOPS;

public class Student_details {

        public static void main(String[] args) {
    
            Student s2 = new Student();
            Student s3 = new Student();
            s2.name = "kunal";
            s2.age = 28;
            s3.name = "Hardik";
            s3.age = 26;
            System.out.println(s2.name + " " + s2.age);
            System.out.println(s3.name + " " + s3.age);
            System.out.println(".....................");
            // Test1(s2, s3);
            // Test2(s2, s3);
            int my_age = 20;
            String my_name = "C";
            Test3(s2, s3.age, s3.name, my_age, my_name);
            System.out.println(s2.name + " " + s2.age);
            System.out.println(s3.name + " " + s3.age);
    
        }
    
        public static void Test3(Student s, int age, String name, int myAge, String myName) {
            s.age = 0;
            s.name = "_";
            age = 0;
            name = "_";
            myAge = 0;
            myName = "_";
        }
    
        public static void Test2(Student s2, Student s3) {
    
            s2 = new Student();
            int tempa = s2.age;
            s2.age = s3.age;
            s3.age = tempa;
            s3 = new Student();
            String tempn = s2.name;
            s2.name = s3.name;
            s3.name = tempn;
        }
    
        public static void Test1(Student s2, Student s3) {
            Student t = s2;
            s2 = s3;
            s3 = t;
    
        }
    
    }
