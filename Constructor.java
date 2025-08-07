// package - collection of similar classes, subpackages , interfaces.
/*  constructor - special method used to initialize objects. every class has default constructor.
                 constructor name = class name
                 it has no return type
                 default
                 parameterized*/
class Student {
    int rollNo;
    String name;

    // No constructor defined, so Java provides a default one:
    // Student() { }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student(); // Default constructor called
        System.out.println(s.rollNo); // 0 (default value)
        System.out.println(s.name);   // null (default value)
    }
}
