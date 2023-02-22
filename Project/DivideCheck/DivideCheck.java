import java.util.Scanner;
public class DivideCheck{
    public static void main (String args[ ]){
          Scanner reader=new Scanner(System.in);
          double a=0,b=0,c=0;
          try{
          a=reader.nextDouble();
          b=reader.nextDouble();
}         catch(Exception e){
             System.out.printf("Error!");
}
              if (b==0)
                System.out.printf("Error!");
              else
              c=a/b;
              System.out.printf("%f",c);
     }
}
          