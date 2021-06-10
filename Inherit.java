//Single inheritance
class Parent {
    Parent() {

    }

    void Car() {
        System.out.println("Using Car of Parent");
    }

}

class Child extends Parent{
    Child() {

    }

    void Bike() {
        System.out.println("Using own Bike");
    }
}

class A {
    A() {
        System.out.println("A  Constructor");
    }

}

interface B {
    void display();
}

class C extends A implements B{
   C() {
        System.out.println("C  Constructor");
    }
    

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("This is the sub-class");
        
    }
}

class D extends A{
    void method(D q) {
        System.out.println("qqqqqq");

    }
    void method(A a) {
        System.out.println("fesgrg");

    }
    public D() {
        System.out.println("public");

    }
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("This is the sub-class");
        
    }
}
class E extends A{
    E() {

    }
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("This is the sub-class");
        
    }
}
public class Inherit {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.Car();//single inheritance
        C c = new C();
        c.display();
        // D w = new D();
        A a = new D();
       // a.method(a);
        System.out.println(c instanceof C);
    }
}
