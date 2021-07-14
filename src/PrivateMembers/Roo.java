package PrivateMembers;

public class Roo {
    private String doRooThings(){
        return  "fun";
    }
}
 class UseARoo{
    public void testIt(){
        Roo r=new Roo();
//        System.out.println(r.doRooThings);//erro :cannot find methode
    }
}
