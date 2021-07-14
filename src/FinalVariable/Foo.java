package FinalVariable;

final public class Foo {
    int a=1;
    public void test(){
        System.out.println("Hi Test");
    }
}
//class Foo2 extends  Foo{
//    //there is hava bug
//    //you cann't be suclassed
//}
class baz{
    final  void go(){
        System.out.println("Go");
    }
}

