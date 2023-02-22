import java.util.Scanner;
public class PasswordCheck{
    public static void main (String args[]){
      String regex1 = "^[0-9]+|^[a-z]+|^[A-Z]+|[\\p{Punct}]+";
      String regex2 = "^[a-zA-Z0-9]+$|[a-zA-Z\\p{Punct}]+$|[0-9\\p{Punct}]+$";
      Scanner scanner = new Scanner (System.in);
      System.out.printf("Please input Password:");
      String str = scanner.nextLine();
         if(str.matches(regex1)){
           System.out.printf("The password strength is low");
         }else if(str.matches(regex2)){
           System.out.printf("The password strength is medium");
         }else{
           System.out.printf("The password strength is high");
      }
   }
}