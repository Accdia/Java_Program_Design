public class ThreadNumber{
   public static void main(String args[]){
      Left targetOfLeft =new Left();
      Thread left=new Thread(targetOfLeft);
      Right targetOfRight =new Right();
      Thread right=new Thread(targetOfRight);
      left.start();
      right.start();
   }
}
class Left implements Runnable{
       int num=0;
       int randomnumber,x,y,z;
       public void run(){
          while(true){
          num++;
          randomnumber=(int)(Math.random()*900)+100;
          x=randomnumber%10;y=randomnumber/10%10;z=randomnumber/100;
            if((x==y&&x==z)||(x==y+1&&y==z+1)){
              System.out.printf("%d,%d",randomnumber,num);
              System.exit(0);
      }
            else
            System.out.printf("%d,%d\n",randomnumber,num);
            try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
   }
}
}
class Right implements Runnable{
   int num=0;
   public void run(){
   while(true){
   num++;
   System.out.printf("The number of spectators:%d\n",num);
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
     }
  }
}
