//class Person {
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}


public class App {
    public static void main(String[] args) {
        Person p = new Person("Maria");
        System.out.println(p.getName());
        // p.name = "Manuela"; // error: name has private access in Person
        p.setName("Manuela");
    }
}