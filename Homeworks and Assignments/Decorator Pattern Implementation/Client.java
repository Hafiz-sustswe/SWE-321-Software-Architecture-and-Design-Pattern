public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        AbstractDecorator abstractDecorator = new ConcreteDecorator(component);

        abstractDecorator.operation();
    }
    
}
