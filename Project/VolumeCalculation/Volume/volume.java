package Volume;
public class volume{
  double a,b,c,d,r,h;
  public volume(double a,double b,double c){
     this.a=a;
     this.b=b;
     this.c=c;
}
   public void set(double r,double h){
      this.r=r;
      this.h=h;
}
   public void volume1(){
   d=a*b*c;
   System.out.printf("volume:%f\n",d);
}
   public void volume2(){
    d=Math.PI*r*r*h;
    System.out.printf("volume:%f\n",d);
}
   public void volume3(){
   d=Math.PI*r*r*h/3;
   System.out.printf("volume:%f\n",d);
}
}