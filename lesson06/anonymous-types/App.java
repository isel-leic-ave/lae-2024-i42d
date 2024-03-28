import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        new A().makeB().foo();
    }
}

class A {

    private class MyB extends B {
        @Override
        public void foo() {
            out.println("Foo implemented in MyB");
        }
    }

    final IB dummy1 = new IB() {
        @Override
        public void foo() {
            System.out.println("Foo on IB implementation");
        }
    };
    final B dummy = new B() {
        public void foo() {
            out.println("I am a different B");
        }
    };

    public A() { }
    public A(int x) { }

    public B makeB() {
        return new B() {
            public void foo() {
                out.println("Foo from B on Java A class");
            }
        };
    }
}



