package AccessModifiers;

public class ZOO {
    public String coolMetgod(){
        return "Wow baby";
    }

}
class Moo{
    public void useAZoo(){



        ZOO z=new ZOO();
        System.out.println("A Zoo says,"+z.coolMetgod());
    }
}
class Moo1 extends  ZOO{
    public void useMyCoolMethod(){
        System.out.println("Moo says ,"+this.coolMetgod());


        ZOO z=new ZOO();
        System.out.println("ZOO");
    }

}