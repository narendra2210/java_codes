package Super150.OOPS;

public class Student1 {
        private String name = "kriti";
        private int age = 80;
        
    
        public Student1(String name, int age) {
            this.age = age;
            this.name = name;
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
    
        public void setAge1(int age) throws Exception {
            if (age < 0) {
    
                throw new Exception("pgl hai age -ve nhi hota");
    
            }
            this.age = age;
    
        }
    
        public void setAge(int age) {
            try {
                if (age < 0) {
    
                    throw new Exception("pgl hai age -ve nhi hota");
    
                }
    
                this.age = age;
            }
    
            catch (Exception e) {
                //  handle exception
                // System.out.println(e);
                e.printStackTrace();
    
            }
    
            finally {
                System.out.println(getName());
            }
    
        }
            public static void main(String[] args) {
                Student1 s = new Student1("Rajma", 23);
                s.setName("Kumar");
                s.setAge(-2);
                System.out.println(s.getAge() + " " + s.getName());
        //		int [] arr = new int [4];
        //		System.out.println(arr[4]);
        
            }
        }
