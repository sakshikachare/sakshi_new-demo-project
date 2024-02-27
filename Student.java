import java.util.*;
 class Student {
    public String name;
    public int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;

    }
    
    public void display() {
        System.out.println(name + "" + age);
        System.out.println(name);
        System.out.println(age);
    }
}
class codechef {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        Student obj = new Student(name, age);
        obj.display();
    }
}
