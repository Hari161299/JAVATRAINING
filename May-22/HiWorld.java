package mypack;

class MyClass {

    public void display1() {
        int x = 10;
        System.out.println("x = "+x);
    }

    public void display2() {
        int y = 20;
        System.out.println("y = "+y);
    }
}

public class HiWorld {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.display1();
        mc.display2();
    }
}