package AbstractMethods;

public abstract class IllegalClass {
    //    public abstract  void doIt();//error
    public abstract void hi();

    abstract int weather();

    abstract void foo();

}

abstract class IllegalClass1 extends IllegalClass {
    public abstract void goodbye();

    public void howAreYou() {
        System.out.println("howAreYou");
    }

    void foo(int i) {
        System.out.println(i);
    }
}

class get extends IllegalClass1 {
    @Override
    void foo() {

    }

    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Override
    int weather() {
        return 37;
    }

    @Override
    public void goodbye() {
        System.out.println("goodbye");
    }

    @Override
    public void howAreYou() {
        super.howAreYou();
    }
}

class main {
    public static void main(String[] args) {
        get g = new get();
        g.goodbye();
        g.howAreYou();
        int c = g.weather();
        System.out.println(c);
    }
}