package ConstructorDeclarations.legal;

class Foo2 {
    Foo2() {
    }

    private Foo2(byte b) {
    }

    Foo2(int x) {
    }

    Foo2(int x, int... y) {
    }
}

class Foo {
    public static void main(String[] args) {
        byte b = 0;
        Foo2 f = new Foo2(b);

    }

    public void test() {
        byte b = 0;
        Foo2 f = new Foo2(b);
    }
}

