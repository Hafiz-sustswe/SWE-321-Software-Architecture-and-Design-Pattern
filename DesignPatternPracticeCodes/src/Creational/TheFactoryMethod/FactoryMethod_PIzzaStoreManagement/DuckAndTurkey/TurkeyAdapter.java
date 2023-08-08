public class TurkeyAdapter implements Duck {
    // Implements the duck interface, but uses the turkey object
    // so that it can work as a replacement of the duck object
    // when we need a duck object, we will just use the duck object's method 
    // and then call the methods of turkey
    
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}