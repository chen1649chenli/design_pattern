public class MullardDuck extends Duck {
    public MullardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a real Mallard duck!");
    }
}
