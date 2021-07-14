package UseInterfaces.StaticIface;

interface StaticIface {
    static int m1() {
        return 42;
    }

    public static void m2() {
        ;
    }
    //final static void m3(){;}//illegal:final
    //abstract static void m4(){;} //illegal:abstract
    //static void m5() //illegal:need body
}

public class TestSIF {

    public static void main(String[] args) {
        System.out.println(StaticIface.m1());
        new TestSIF().go();
    }

    void go() {
        System.out.println(StaticIface.m1());
    }
}