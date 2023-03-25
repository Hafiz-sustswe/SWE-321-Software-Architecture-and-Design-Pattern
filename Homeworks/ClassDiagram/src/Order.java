import java.util.ArrayList;
import java.util.regex.Pattern;

public class Order {


      private   String date;
      private String status;

      // Association
      Customer customer = new Customer();

      // Aggregation
      ArrayList<OrderDetail> orderDetails = new ArrayList<>();

      //Association
     // Paymnet paymnet = new Paymnet();

      public int calcSubtotal()
      {
          return 0;
      }
      public int calctax()
      {
          return  0;
      }
      public int total()
      {
          return 0;
      }
      public int totalWeight()
      {
          return 0;
      }
}
