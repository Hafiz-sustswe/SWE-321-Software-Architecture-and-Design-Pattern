
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck()
    {

    }
    public abstract void display();
    /**
     * 
     */
    public void performQuack()
    {
        quackBehavior.quack();
    }
    public void performFly()
    {
        flyBehavior.fly();
    }
    public void swim()
    {
        System.out.println("ALL duck can swim");
    }
    
    
}
