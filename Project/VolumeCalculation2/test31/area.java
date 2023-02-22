package test31;
public class area{
  double a,b,d,h,r,num;
  public area(double a,double b){
     this.a=a;
     this.b=b;
}
  public void set1(double d,double h){
     this.d=d;
     this.h=h;
}
  public void set2(double r){
     this.r=r;
}
   public void area1(){
     num=a*b;
}
   public void area2(){
     num=d*h/2;
}
   public void area3(){
     num=Math.PI*r*r;
}
}