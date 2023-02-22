public class RandomNumber{
    public static void main(String args[]){
       int num=0;
       int randomnumber,x,y,z;
       while(true){
          num++;
          randomnumber=(int)(Math.random()*900)+100;
          x=randomnumber%10;y=randomnumber/10%10;z=randomnumber/100;
            if((x==y&&x==z)||(x==y+1&&y==z+1)){
              System.out.printf("%d,%d",randomnumber,num);
              break;
        }
      }
   }
}