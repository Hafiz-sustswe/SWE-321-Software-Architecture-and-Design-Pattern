
public class Client {
    public static void main(String[] args) {
         

        Burger burger= new Burger.BurgerBuilder("larger")
                .cheese(2).cheese(6).onions(3).build();

        System.out.println(burger.Cheese()); // this will print 8 , because we've added cheese for two times(2+6 = 8)
        System.out.println(burger.Onions()); // this will print 3 
        System.out.println(burger.Mushrooms()); // this will print 0 , because the client didn't want any Mushrooms
    }
}
