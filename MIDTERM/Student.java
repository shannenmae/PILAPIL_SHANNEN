import java.util.Scanner;
public class Student{
   static Scanner input = new Scanner(System.in);
   public static String first_name;
   public static String middle_name;
   public static String last_name;
   public static String suffix;
   public static String fullname;
   public Student(String firstname, String middlename, String lastname, String suffix_){
      this.first_name = firstname;
      this.middle_name = middlename;
      this.last_name = lastname;
      this.suffix = suffix_;
   }
   public String getFirstName(String first_name){
      return first_name;
   }
   public String getMiddleName(String middle_name){
      return middle_name;
   }
   public String getLastName(String last_name){
      return last_name;
   }
   public String getSuffix(String suffix){
      return suffix;
   }
   public String getFullName(String fullname){
      return fullname;
   }
   public void setFirstName(){
      
   }
   public void setSecondName(){
      
   }
   public void setLastName(){
      
   }
   public void setSuffix(){
      
   }
   public static void main(String[] args){
     
      
      System.out.print("First Name: ");
      String firstname = input.nextLine();
      System.out.print("Middle Name: ");
      String middlename = input.nextLine();
      System.out.print("Last Name: ");
      String lastname = input.nextLine();
      System.out.print("Suffix: ");
      String suffix_ = input.nextLine();
      
      Student nStudent = new Student(firstname, middlename, lastname, suffix_);
       
      System.out.println("\nFirst name: " + first_name);
      System.out.println("Middle name: " + middle_name);
      System.out.println("Last name: " + last_name);
      System.out.println("Suffix: " + suffix);
      System.out.println("Full name: " + fullname);
   }
}