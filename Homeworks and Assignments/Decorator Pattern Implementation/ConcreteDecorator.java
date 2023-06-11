public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(Component component) {
        super(component);
       
    }
    void operation()
    {
        super.operation();
        System.out.println("Doing Some additional works with the initial object but not modifying the original class");
    }
    
}
