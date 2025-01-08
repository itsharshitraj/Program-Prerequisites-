import java.util.*;
class AreaOfCircle{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give radius of circle ");

   Float radius=sc.nextFloat();
   
   System.out.println("Area of circle = " + (Math.PI*radius*radius));
}

}