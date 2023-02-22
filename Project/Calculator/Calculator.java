import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
public class Calculator{
    public static void main(String args[]){
        OperateWin win=new OperateWin();
    }
}
class OperateWin extends JFrame implements ActionListener{
    JTextField num1,num2,num3;     
    JTextArea showArea;                    
    JButton EndButton; 
    OperateWin(){
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
              double z=0;double f=0;double z1=0;double z2=0;
              if(a==0)
              {if(b==0)
               {if(c==0)  showArea.append("Any real roots\n");
                else showArea.append("non-existent\n");}
               else {showArea.append("x="+c/b+"\n");}
              }
              else
              {z=b*b-4*a*c;
                if(z<0)
                {z=-z;
                 f=Math.sqrt(z);
                 showArea.append("x1="+-b/(2*a)+"+"+f/(2*a)+"i"+"\n");
                 showArea.append("x2="+-b/(2*a)+"-"+f/(2*a)+"i"+"\n");
                }
                else
                {f=Math.sqrt(z);
                 if (f==0)
                  {z1=z1=-b/(2*a)+f/(2*a);
                   showArea.append("x1=x2="+z1+"\n");
                  }
                 else
                  {
                 z1=-b/(2*a)+f/(2*a);
                 z2=-b/(2*a)-f/(2*a);
                 showArea.append("x1="+z1+"\n");
                 showArea.append("x2="+z2+"\n");
                  }
                }
               }
              }
      catch(Exception ex){
         showArea.append("Please input number\n");
      }
   }
}