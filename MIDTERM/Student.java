import java.util.Scanner;
public class Student{
   static Scanner input = new Scanner(System.in);
   public String first_name;
   public String middle_name;
   public String last_name;
   public String suffix;
   public  String fullname;
   public Student(String firstname, String middlename, String lastname, String suffix_){
      this.first_name = firstname;
      this.middle_name = middlename;
      this.last_name = lastname;
      this.suffix = suffix_;
   }
   public String getFirstName(){
      return first_name;
   }
   public String getMiddleName(){
      return middle_name;
   }
   public String getLastName(){
      return last_name;
   }
   public String getSuffix(){
      return suffix;
   }
   public void getFullName(){
      System.out.println("Full name: " + first_name + " " + middle_name + " " + last_name + " " + suffix);
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
       
      System.out.println("\nFirst name: " + nStudent.getFirstName());
      System.out.println("Middle name: " + nStudent.getMiddleName());
      System.out.println("Last name: " + nStudent.getLastName());
      System.out.println("Suffix: " + nStudent.getSuffix());
      nStudent.getFullName();
   }
}