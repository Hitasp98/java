package LocalVariables;

public class TestServer {
    int count=9;
    public void logIn(){
        int count=10;
        System.out.println("Local variable count is "+count);
    }
    public void setCount(){
        System.out.println("instance variable count is "+count);
    }
    public static  void main(String[] args){
        new TestServer().logIn();
        new TestServer().setCount();
    }
}
