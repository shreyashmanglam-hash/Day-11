import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mul,add,sub,per,eq,off;
    JTextField textField;
    double num1,num2,result;
    char op;

    Calculator(){

        setSize(500,500);
        setLayout(null);

        b1 = new JButton("1");
        b1.setBounds(100,100,50,30);
        add(b1);

        b2 = new JButton("2");
        b2.setBounds(150,100,50,30);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(200,100,50,30);
        add(b3);

        b4 = new JButton("4");
        b4.setBounds(100,130,50,30);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(150,130,50,30);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(200,130,50,30);
        add(b6);

        b7 = new JButton("7");
        b7.setBounds(100,160,50,30);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(150,160,50,30);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(200,160,50,30);
        add(b9);

        div = new JButton("/");
        div.setBounds(100,190,50,30);
        add(div);

        b0 = new JButton("0");
        b0.setBounds(150,190,50,30);
        add(b0);

        per = new JButton("%");
        per.setBounds(200,190,50,30);
        add(per);

        add = new JButton("+");
        add.setBounds(250,100,50,30);
        add(add);

        sub = new JButton("-");
        sub.setBounds(250,130,50,30);
        add(sub);

        mul = new JButton("*");
        mul.setBounds(250,160,50,30);
        add(mul);

        eq = new JButton("=");
        eq.setBounds(250,190,50,30);
        add(eq);

        off = new JButton("OFF");
        off.setBounds(150,220,100,30);
        add(off);

        textField = new JTextField();
        textField.setBounds(200,70,100,30);
        textField.setEditable(false);
        add(textField);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        per.addActionListener(this);
        eq.addActionListener(this);
        off.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
            textField.setText(textField.getText()+"1");

        else if(e.getSource()==b2)
            textField.setText(textField.getText()+"2");

        else if(e.getSource()==b3)
            textField.setText(textField.getText()+"3");

        else if(e.getSource()==b4)
            textField.setText(textField.getText()+"4");

        else if(e.getSource()==b5)
            textField.setText(textField.getText()+"5");

        else if(e.getSource()==b6)
            textField.setText(textField.getText()+"6");

        else if(e.getSource()==b7)
            textField.setText(textField.getText()+"7");

        else if(e.getSource()==b8)
            textField.setText(textField.getText()+"8");

        else if(e.getSource()==b9)
            textField.setText(textField.getText()+"9");

        else if(e.getSource()==b0)
            textField.setText(textField.getText()+"0");

        else if(e.getSource()==add){
            num1 = Double.parseDouble(textField.getText());
            op = '+';
            textField.setText("");
        }

        else if(e.getSource()==sub){
            num1 = Double.parseDouble(textField.getText());
            op = '-';
            textField.setText("");
        }

        else if(e.getSource()==mul){
            num1 = Double.parseDouble(textField.getText());
            op = '*';
            textField.setText("");
        }

        else if(e.getSource()==div){
            num1 = Double.parseDouble(textField.getText());
            op = '/';
            textField.setText("");
        }

        else if(e.getSource()==eq){

            num2 = Double.parseDouble(textField.getText());

            switch(op){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }

        else if(e.getSource()==off){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

