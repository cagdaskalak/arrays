public class arrays {
    public static void main(String[] args) throws Exception {
        
        // arrays = used to store multiple values in a single veriable

    //String [] cars = {"Tesla","BMW","Mercedes"};

      //  System.out.println(cars[2]);
    
      String[] cars = new String[3];

      cars[0] = "Tesla";
      cars[1] = "BMW";
      cars[2] = "Mercedes";

      
      for(int i=0; i<cars.length; i++){

        System.out.println(cars[i]);

      }
        
    }
}
