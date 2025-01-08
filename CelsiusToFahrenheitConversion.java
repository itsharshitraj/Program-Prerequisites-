import java.util.*;
class CelsiusToFahrenheitConversion{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give Celsius  temperature to convert into Fahrenheit");

   Float celsius=sc.nextFloat();
   
   System.out.println("Fahrenheit = " + ((celsius * 9/5)+32));
}

}