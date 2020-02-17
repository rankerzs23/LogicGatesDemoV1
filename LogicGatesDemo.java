import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LogicGatesv1 extends JFrame implements ActionListener
{
   JLabel lnum1, lnum2, lres;
   JTextField tnum1, tnum2, tres;
   JButton bAND, bOR, bNAND, bNOR, bXOR, bXNOR;
   JPanel p1, p2;
   Container c = getContentPane();
   
   LogicGatesv1() //constructor serves as 1. GUI Components
   {
      super("Simple Calculator v1");
      lnum1 = new JLabel("Input num1: ");
      lnum2 = new JLabel("Input num2: ");
      lres = new JLabel("Result: ");
      
      tnum1 = new JTextField(5);
      tnum2 = new JTextField(5);
      tres = new JTextField(5); tres.setEditable(false);
      
      bAND = new JButton("AND"); bAND.addActionListener(this);
      bOR = new JButton("OR"); bOR.addActionListener(this);
      bNAND = new JButton("NAND"); bNAND.addActionListener(this);
      bNOR = new JButton("NOR"); bNOR.addActionListener(this);
      bXOR = new JButton("XOR"); bXOR.addActionListener(this);
      bXNOR = new JButton("XNOR"); bXNOR.addActionListener(this);
      
      p1 = new JPanel(); p1.setLayout(new GridLayout(3,2));
      p1.add(lnum1); p1.add(tnum1);
      p1.add(lnum2); p1.add(tnum2);
      p1.add(lres); p1.add(tres);
      
      p2 = new JPanel(); p2.setLayout(new GridLayout(2,3));
      p2.add(bAND); p2.add(bOR); p2.add(bNAND); p2.add(bNOR);
      p2.add(bXOR);p2.add(bXNOR);
      
      c.setLayout(new BorderLayout());
      c.add(p1, BorderLayout.CENTER);
      c.add(p2, BorderLayout.SOUTH);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 200);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e)//2. Listener Method
   {
      int num1 =0, num2=0;
      boolean res = false;

      try
      {
         
         num1 = Integer.parseInt(tnum1.getText());
         num2 = Integer.parseInt(tnum2.getText());
         
         if(e.getSource()==bAND)
         {
            res = AND(num1, num2);
         }
         else
         if(e.getSource()==bOR)
         {
            res = OR(num1, num2);
         }
         else
         if(e.getSource()==bNAND)
         {
            res = NAND(num1, num2);
         }
         else
         if(e.getSource()==bNOR)
         {
            res = NOR(num1, num2);
         }
          else
         if(e.getSource()==bXOR)
         {
            res = XOR(num1, num2);
         }
          else
         if(e.getSource()==bXNOR)
         {
            res = XNOR(num1, num2);
         }
         tres.setText(res+"");
      }

      catch(NumberFormatException nfe)
      {
         tres.setText("Boang ka!");
      }
      catch(Exception ex)
      {
      
      }
   }
   
   //3. Application Methods
   public boolean AND(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;
      
   }
   public boolean OR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;

   }
   public boolean NAND(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }
   public boolean NOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }
    public boolean XOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;

   }
    public boolean XNOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }

 
}

//--------------------------------------------
public class LogicGatesDemo
{
   public static void main(String args[])
   {
      LogicGatesv1 LGV1 = new LogicGatesv1();
      LGV1.setVisible(true); //calc.show();
   }
}