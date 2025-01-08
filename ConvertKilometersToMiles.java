

import java.util.*;
class ConvertKilometersToMiles{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give the distance in kilometers  ");

   float kilometers=sc.nextFloat();
 
   System.out.println("Miles = " + (kilometers * 0.621371));
}

}