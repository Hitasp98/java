package DeclaringEnums;
enum CoffeeSize{
    BIG,HUGE,OVERWHELMING
}
public class Coffee {
    CoffeeSize size;

}
class CoffeeTest1{
    public static void main(String[] args){
        Coffee drink=new Coffee();
        drink.size = CoffeeSize.BIG;
        System.out.println(drink.size);
    }
}
