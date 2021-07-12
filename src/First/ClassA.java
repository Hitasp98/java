package First;

class ClassB {
    public int A;

    public void hi() {
        A = 2;
        System.out.println("Hi, Class B :" + A);
    }
}

public class ClassA extends ClassB {

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.hi();
        ClassA classA = new ClassA();
        ClassA.test();
        classA.hiA("a");
    }
//look here
  /*  public int hiA(int x) {
        *//*A = 1;
        System.out.println("Inside hiA : "+A);*//*
        return  0;
    }
*/
    private int hiA(int x) {
        return 0;
    }

    private String hiA(String  a) {
        return  "0";
    }

    public static void test() {
        System.out.printf("Inside test method");
    }
}
