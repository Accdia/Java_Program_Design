package test31;
public class triangle{
    double a,b,c,p,num;
    public triangle(double a,double b,double c){
      this.a=a;
      this.b=b;
      this.c=c;
}
   public double area2(){
      p=(a+b+c)/2;
      num=Math.sqrt(p*(p-a)*(p-b)*(p-c));
      return num;
}
}