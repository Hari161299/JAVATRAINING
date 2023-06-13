package mypack;

interface Interface {
    void a();
    void b();
}

interface Interface1 extends Interface {
    void c();
    void d();
}

class Interface2 implements Interface1 {

    public void a() {
        System.out.println("A");

    }
    public void b() {
        System.out.println("B");

    }
    public void c() {
        System.out.println("C");

    }
    public void d() {
        System.out.println("D");

    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        Interface1 Result = new Interface2();
        Result.a();
        Result.b();
        Result.c();
        Result.d();
    }
}
