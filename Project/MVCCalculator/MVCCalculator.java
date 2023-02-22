import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
public class MVCCalculator{
    public static void main(String args[]){
        MVCWin win=new MVCWin();
    }
}
class Lader{                                             
    private double a,b,c;
    public String  getroots(){
       double z=0;double f=0;double z1=0;double z2=0;
       if (a==0)
       {if (b==0)
        {if (c==0) return "Any real roots";
         else return "no roots";
        }
        else return "x="+-c/b; 
       }
       else
       {z=b*b-4*a*c;
       if (z<0)
       {z=-z;
        f=Math.sqrt(z);
        return "x1="+(-b)/(2*a)+"+"+f/(2*a)+"i"+"\n"+"x2="+(-b)/(2*a)+"-"+f/(2*a)+"i";
       }
       else 
        {f=Math.sqrt(z);
         if (f==0)
         {z1=-b/(2*a)+f/(2*a);
          return "x1=x2="+z1;
         }
        else
        {z1=-b/(2*a)+f/(2*a);
         z2=-b/(2*a)-f/(2*a);
         return "x1="+z1+"\n"+"x2="+z2;
        }
        }
    } 
}
    public void seta(double a){
        this.a=a;
    }
    public void setb(double b){
        this.b=b;
    }
    public void setc(double c){
        this.c=c;
    }
}
    class MVCWin extends JFrame implements ActionListener{
    Lader lader;                                
    JTextField num1,num2,num3;     
    JTextArea showArea;                    
    JButton EndButton; 
    MVCWin(){
        lader=new Lader();
        num1=new JTextField(5);   
        num2=new JTextField(5);
        num3=new JTextField(5);
        showArea=new JTextArea();
        EndButton=new JButton("End");
        JPanel pNorth=new JPanel();
        pNorth.add(num1);
        pNorth.add(new JLabel("x^2+"));
        pNorth.add(num2);
        pNorth.add(new JLabel("x+"));
        pNorth.add(num3);
        pNorth.add(EndButton);
        EndButton.addActionListener(this);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER);
        setBounds(100,100,420,280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

public void actionPerformed(ActionEvent e){
        try{   
              double a=Double.parseDouble(num1.getText().trim());   
              double b=Double.parseDouble(num2.getText().trim()); 
              double c=Double.parseDouble(num3.getText().trim());
              lader.seta(a) ;      
              lader.setb(b);
              lader.setc(c);
              showArea.append(lader.getroots()+"\n");
        } 
        catch(Exception ex){
              showArea.append("Please input number\n");
        }
    }
}

