import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     // create a scanner for user input
Scanner input = new Scanner(System.in);


// ask the casier for the price 
 System.out.println("Please enter the amount the customer spent");

// get the discount price from the user
double price = input.nextDouble();  

double total = 0;
double save = 0;
// variable for discount for 0-40$ 10%
double A =  price*.10;

//variable for discount for $40.01 - $80.00
double B = price*.20;

//variable for discount for $80.01 - $120.00
double C = price*.30;

//variable for discount for over $120
double D = price*.40;

 if(price> 0 && price <= 40){
   save = price *.10;
   total = price - save;
 System.out.println("They will receive 10% off.");
 } else {
 if(price> 40.01 && price <= 80){
 System.out.println("They will receive 20% off.");
 } else {
  if(price> 80.01 && price >= 120){
  System.out.println("They will receive 30% off.");
 } else {
  if(price> 120.01){
   System.out.println("They will receive 40% off.");
  }
 }
 }
 }


 

System.out.println("They will save $3.55.");
 System.out.println("total " +total);
  }
  }

