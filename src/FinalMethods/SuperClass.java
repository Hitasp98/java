package FinalMethods;


public class SuperClass {
    public final  void showSample(){
        System.out.println("One thing");
    }
}
class SubClass extends SuperClass{

//    @Override
//    public void showSample(){
//        System.out.println("One thing");
//    }
    //cant override
    public void getRecord(final  int recNumber){}
}
