public class TableandChairs{
   public static void main(String[] args){
      Print newPrint = new Print();
      newPrint.printTC();
   }
}
class Print{
   public void printTC(){
      System.out.println("x                    x\n" +
                         "x                    x\n" +
                         "x     xxxxxxxxxx     x\n" +
                         "xxxxx x        x xxxxx\n" +
                         "x   x x        x x   x\n" +
                         "X   x x        x x   x");
   }
}