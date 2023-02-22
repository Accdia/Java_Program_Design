import test31.*;
public class VolumeCalculation2{
    public static void main(String args[]){
       double a,b,c,h;
       h=3;
       cricle x=new cricle(3);
       rectangle y=new rectangle(4,5);
       triangle z=new triangle(6,7,8);
       a=x.area3()*h;
       b=y.area1()*h;
       c=z.area2()*h;
       System.out.printf("%f,%f,%f",a,b,c);
}
}