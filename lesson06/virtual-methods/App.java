import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Maria");
        Person s = new Student("Manel");
        Person p1 = new SpecialStudent("Ana");

        printName(p);
        printName(s);
        printName(p1);
    }
    public static void printName(Person o) {
        /**
         * Always read the field name defined by 
         * the type of the variable o, i.e. Person
         */
        //System.out.println(o.name);
        System.out.println(o.getName());


        /**
         * Calls the implementation of the virtual method print
         * depending of the OBJECT REFERRED by o.
         */
        o.print();
    }

}

class Person {
    public final String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    public void print() {
        out.println("I am a Person");
    }
}
/**
 * An instance of Student has tw fields name.
 */
class Student extends Person {
    /**
     * Another field name different from the field name of the base class.
     */
    public final String name;

    public Student(String name) {
        super(null);
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public void print() {
        out.println("I am a Student");
    }
}

class SpecialStudent extends Student {

    public SpecialStudent(String name) {
        super(name);
    }
}