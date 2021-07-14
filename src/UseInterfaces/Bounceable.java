package UseInterfaces;

//73
public interface Bounceable {
    default void tg1() {
    }


    public int x = 1;
    int x1 = 1;
    static int x2 = 1;
    final int x3 = 2;
    public static final int x4 = 1;

    void bounce();

    //    what the compiler sees
//    public abstract void bounce();
    void setBounceFactor(int bf);
//    what the compiler sees
//    public abstract void setBounceFactor(int bf);
}

class Tire implements Bounceable {

    @Override
    public void bounce() {
//....
    }

    @Override
    public void tg1() {
        Bounceable.super.tg1();
    }

    @Override
    public void setBounceFactor(int bf) {
//....
    }
}