package AccessModifiers;
class SportsCar{
    public void goFast(){}
    public  void doStuff(){
        goFast();
    }
}
class convertible extends  SportsCar{
public void doThings(){
    SportsCar sc=new SportsCar();
    sc.goFast();

}
public  void doMore(){
    goFast();
}

}
public class Driver {
    public void  doiDriverStuff(){
        SportsCar car=new SportsCar();
        car.goFast();
        convertible convertible=new convertible();
        convertible. doMore();
    }
}
