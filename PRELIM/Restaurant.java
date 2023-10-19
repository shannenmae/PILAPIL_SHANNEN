import java.util.Scanner;
public class Restaurant{
   static Scanner input = new Scanner(System.in);
   static double c1, c2, c3, r1, r2;
   static double total;
   static int amnt;
   static int ctr = 0;
   static String[] item = new String[10];
   static int[] qnt = new int[10];
   static double[] ttl = new double[10];
   Restaurant(){
      c1 = 100.00;
      c2 = 150.00;
      c3 = 200.00;
      r1 = 35.00;
      r2 = 50.00;
      total = 0;
      
   }
   //main
   public static void main(String[] args){
      int c;
      
      Restaurant menu = new Restaurant();
      
      do{
         System.out.println("\t\tMENU\t\t\t\tADD ONS");
         System.out.println("\t[1] C1 - Php 100.00\t\t" + "[4] R1 - Php 35.00\n" +
                           "\t[2] C2 - Php 150.00\t\t" + "[5] R2 - Php 50.00\n" +
                           "\t[3] C3 - Php 200.00\n");
      
         menu.order();
         
         System.out.print("\nWould you like to order? (y-1/n-0): ");
         c = input.nextInt();
         ctr++;
      }while(c == 1);
      menu.display();
      menu.getTotal();
      menu.exit();
      
   }
   //order
   public void order(){
      double temp;
      
      System.out.print("\n\tOrder: ");
      int order = input.nextInt();
      
      switch(order){
         case 1:
            System.out.print("\tQuantity: ");
            amnt = input.nextInt();
            total += (c1 * amnt);
            temp = c1 * amnt; //get partial total
            
            item[ctr] = "C1";
            qnt[ctr] = amnt;
            ttl[ctr] = temp;
            break;
         case 2:
            System.out.print("\tQuantity: ");
            amnt = input.nextInt();
            total += (c2 * amnt);
            temp = c2 * amnt; //get partial total
            
            item[ctr] = "C2";
            qnt[ctr] = amnt;
            ttl[ctr] = temp;
            break;
         case 3:
            System.out.print("\tQuantity: ");
            amnt = input.nextInt();
            total += (c3 * amnt);
            temp = c3 * amnt; //get partial total
            
            item[ctr] = "C3";
            qnt[ctr] = amnt;
            ttl[ctr] = temp;
            break;
         case 4:
            System.out.print("\tQuantity: ");
            amnt = input.nextInt();
            total += (r1 * amnt);
            temp = r1 * amnt; //get partial total
            
            item[ctr] = "R1";
            qnt[ctr] = amnt;
            ttl[ctr] = temp;
            break;
         case 5:
            System.out.print("\tQuantity: ");
            amnt = input.nextInt();
            total += (r2 * amnt);
            temp = r2 * amnt; //get partial total
            
            item[ctr] = "R2";
            qnt[ctr] = amnt;
            ttl[ctr] = temp;
            break;
      }
   }
   //display order
   public void display(){
      System.out.println("\n\tITEM\t\t\tQuantity\t\t\tTotal");
      for(int i = 0; i < ctr; i++){
         System.out.println("\t " + item[i] + "\t\t\t   " + qnt[i] + "\t\t\t\t" + ttl[i]);
      }
   }
   //get total
   public void getTotal(){
      System.out.println("\t-------------------------------------------------------------");
      System.out.println("\tTotal Price:\t\t\t\t\t\t$" + total*0.018); //convert to USD
   }
   //exit
   public void exit(){
      System.out.println("\nThank you, please come again!");
   }
}
/*
Create an interactive application that computes that Displays the Total Price, Qty and the Item(s)
ordered by the user.
Menu:
1. C1 - Php 100.00
2. C2 - Php 150.00
3. C3 - Php 200
Add Ons:
4. R1 - Php 35.00
5. R2 - Php 50.00
Required Functionality:
Display a simple menu.
Display accurate Total Price, Qty and Orders data.
Convert Total Price currency (php) to dollar ($).
Allow inputting of User selections and Qty.
*/