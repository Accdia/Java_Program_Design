import java.util.Scanner;
interface test{
    public abstract double getintegration(double a,double b,double c);
}
class integration1 implements test{
    public double getintegration(double a,double b,double c){
       double x,sum=0;
       for(x=a;x<=b;x=x+c){
       sum=sum+Math.pow(Math.E,x)*c;
}
       return sum;}
}
class integration2 implements test{
    public double getintegration(double a,double b,double c){
       double x,sum=0;
       for(x=a;x<=b;x=x+c){
       sum=sum+(Math.pow(Math.E,x)+Math.pow(Math.E,x+c))*c/2;
}
       return sum;}
}
public class Integration{
   public static void main(String args[]){
      double c,d,h;
      Scanner reader=new Scanner(System.in);
      c=reader.nextDouble();
      d=reader.nextDouble();
      h=(c+d)/1000;
      integration1 a=new integration1();
      integration2 b=new integration2();
     System.out.printf("%f,%f",a.getintegration(c,d,h),b.getintegration(c,d,h));
}
}