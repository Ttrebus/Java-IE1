/*
Timothy Trebus
COP2513
2020/10/01
*/
// TASK #0 - Feel free to add here any import statements that you need to implement the methods below
import java.util.Date;
/**
   TOTAL 10 points
   This class is meant to model an item on an invoice.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class InvoiceItem{

   /* TASK #1 - 1 point
      Declare the following attributes as private:
         name              of data type   String
         description       of data type   String
         quantity          of data type   int
         unitPrice         of data type   double
         dateRegistered    of data type   Date
   */   
   private String name;
   private String description;
   private int quantity;
   private double unitPrice;
   private Date dateRegistered;
   /* TASK #2 - 2 point
      Write the code for the following constructor.
      In addition to initializing the attributes with their corresponding parameters,
      you will also need to create a new object of class Date and assign its reference
      to the dateRegistered attribute in order to time-stamp the object creation.
      Do not alter the name of the parameters.
   */
   public InvoiceItem(String name, String description, int quantity, double unitPrice){
      this.name = name;
      this.description = description;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
      this.dateRegistered = new Date();
      
   }// end constructor with 4 args
  
  
  
   /* TASK #3 - 1 point
      Write the code for the following no-args constructor.
      The default value must be as follows;
         string "Default Item" for the name
         string "..." for the description
         quantity of 0
         unitPrice of 0.0
      The dateRegistered attribute is expected to be set to the
      current time (see instructions in previous constructor).
      To get full credit, make sure to not write code that would be
      redundant with respect to the constructor from task #2
   */
   public InvoiceItem(){
      this("Default Item", "...", 0, 0.0);
   }// end no-args constructor 
   
   public String getDateRegistered(){
      return this.dateRegistered.toString();
   }
   
   /* TASK #4 - 1 point
      Write a method that returns the total price for this item by
      multiplying the price per unit by the quantity.
   */
   public double getTotalPrice(){
      double total =  0;
      total = (double) this.quantity * this.unitPrice;
      return total; 
   }// end method getTotalPrice
   
   
   
   /* TASK #5 - 1 point
      Write a method that returns the value of the unitPrice attribute.
   */
   public double getUnitPrice(){
      return this.unitPrice;
   }// end method getUnitPrice
   
   
   
   /* TASK #6 - 1 point
      Write a method that increases by an amount v the quantity attribute.
      You should not add v to the attribute if the parameter is negative.
   */
   public void increaseQuantity(int v){
      if(v >= 0){      
         for(int i = 1; i <= v; i++)
         this.quantity++;
      }//end IF
   }// end method increaseQuantity
   
   
   
   /* TASK #7 - 2 point
      Write a method that decreases by an amount v the quantity attribute.
      You should not subtract v to the attribute if the parameter is negative
      or if the resulting quantity would become negative.
   */
   public void decreaseQuantity(int v){
      if(v >= 0){      
         for(int i = 1; i <= v; i++){
            this.quantity--;
            if(this.quantity < 0){
               this.quantity = 0;
               break;
            }//end IF
         }//end FOR
      }//end IF
   }// end method decreaseQuantity
   
   
   
   /* TASK #8 - 1 points
      Write a method that returns a string that represents the information stored
      in the object in a human-readable format.
      For example, if your object holds the following information: 
         name is "Squirrel"
         description is "Action figure, comes from outer space"
         quantity is 253
         unitPrice is 25.99
      Then, the string that your method returns should be:
         "Squirrel: 253 units, $25.99 per unit (Action figure, comes from outer space)"
   */
   public String toString(){
      return this.name + ": " + this.quantity + " units, $"  + this.unitPrice + " per unit " + "(" + this.description + ")"; // this is not right, replace this with your own code
   }// end method toString
   
   
   
}// end class
