// Feel free to add here any import statements that you need for your tests
/*
Timothy Trebus
COP2513
*/

/**
   TOTAL 3 points
   Use the main method in this class to test the features of our
   InvoiceItem class. To do so, you are free to create several objects,
   call methods...
**/
public class IE1{
   
   public static void main(String[] args){
      //test with entry info
      InvoiceItem test1 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 30, 25.99);
      
      //test decreaseQuantity
      InvoiceItem test2 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 30, 25.99);
      test2.decreaseQuantity(3);

      //test increaseQuantity
      InvoiceItem test3 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 30, 25.99);
      test3.increaseQuantity(2);
      
      //tests the increaseQuantity if the parameter is negatitve
      InvoiceItem test4 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 12, 25.99);
      test4.increaseQuantity(-3);
      
      //test default parameters
      InvoiceItem test5 = new InvoiceItem();
      
      //test decreaseQuantity if the parameters is negative
      InvoiceItem test6 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 30, 25.99);
      test6.decreaseQuantity(-3);
      
      //test decreaseQuantity stops if the quantity reaches a negative value
      InvoiceItem test7 = new InvoiceItem("Anime", "There is a Harem everywhere you look", 30, 25.99);
      test7.decreaseQuantity(33);
      
      /*
      Write your tests in this main method.
      You will be graded on the thoroughness of your tests; 
         1 point  main code tests each of the available methods at least once, 
                  this includes testing object creation with all available constructors
         1 point  In addition, methods are tested on parameters that they should reject
                  or handle as special cases.
         1 point  All tests result in clear information being displayed on the screen
                  so that, by just reading the programs' output, we can understand exactly
                  what has been tested, with what values, and what was the result or
                  consequences of running the test.
      */
      System.out.println("Starting the testing of the InvoiceItem class...");
      System.out.println(test1.toString());
      System.out.println("unit Price: " + test1.getUnitPrice());
      System.out.println(test1.getDateRegistered());
      System.out.println("the Total price of test1: " + test1.getTotalPrice());
      System.out.println("Test 2");
      System.out.println(test2.toString());
      System.out.println("Test 3");
      System.out.println(test3.toString());
      System.out.println("Test 4");
      System.out.println(test4.toString());
      System.out.println("Test 5");
      System.out.println(test5.toString());
      System.out.println("Test 6");
      System.out.println(test6.toString());
      System.out.println("Test 7");
      System.out.println(test7.toString());
   }//end main
   
} // end public class
