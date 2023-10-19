import java.util.Scanner;
public class Route{
   static Scanner input = new Scanner(System.in);
   static double  speed, distance, TOA, mns;
   static double r1, r2, r3;
   static int hrs;
   Route(){
      distance = 0;
      hrs = 0;
      mns = 0;
   }
   public static void main(String[] args){
      Route newR = new Route();
      System.out.print("Speed: ");
      speed = input.nextInt();
      
      System.out.println("\t\t\tCebu City - Moalboal");
      System.out.println("\tSTART - South Bus Terminal\n\tr1 - Minglanilla\n\tr2 - San Fernando\n\tr3 - Carcar");
      System.out.println("Choose route: [1] Barili\t[2] Sibonga");
      System.out.print("Choice: ");
      int c = input.nextInt();
      
      if(c == 1){ //route barili
         System.out.println("\tr4.1 - Barili\n\tr4.1.1 - Dumanjug\n\tr4.1.2 - Alcantara\n\tEND - Moalboal\n");
         r1 = 84.9;
         
         TOA = r1 / speed;
         hrs = (int)TOA;
         mns = (TOA*100) % 100;
         
         System.out.println("Distance: " + Math.round(r1*100.0)/100.0 + "km");
         System.out.printf("Estimated TOA: %dhrs %.0fmins", hrs, mns);
      } else { //route sibonga
         
         System.out.println("\tr4.2 - Sibonga");
         System.out.println("Choose route: [1] Dumanjug\t[2] Argao");
         System.out.print("Choice: ");
         c = input.nextInt();
         if(c == 1){ //route dumanjug
            System.out.println("\tr4.2.1 - Dumanjug\n\tr4.2.2 - Alcantara\n\tEND - Moalboal\n");
            
            r2 = 96.2;
            TOA = r2 / speed;
            hrs = (int)TOA;
            mns = (TOA*100) % 100;
            
            System.out.println("Distance: " + Math.round(r2*100.0)/100.0 + "km");
            System.out.printf("Estimated TOA: %dhrs %.0fmins", hrs, mns);
         } else { //route argao
            System.out.println("\tr5 - Argao\n\tr5.1 - Ronda\n\tr.5.2 - Alcantara\n\tEND - Moalboal\n");
            
            r3 = 92.2;
            TOA = r3 / speed;
            hrs = (int)TOA;
            mns = (TOA*100) % 100;
            
            System.out.println("Distance: " + Math.round(r3*100.0)/100.0 + "km");
            System.out.printf("Estimated TOA: %dhrs %.0fmins", hrs, mns);
         }
      }
   }
}