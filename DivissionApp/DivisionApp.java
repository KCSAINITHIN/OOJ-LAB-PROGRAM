import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
   

    private JFrame frame;
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionApp() {
        frame = new JFrame("Integer Division");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JLabel num1Label = new JLabel("Enter Num1: ");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Enter Num2: ");
        num2Field = new JTextField(10);

        divideButton = new JButton("Divide");

        JLabel resultLabel = new JLabel("Result: ");
        resultField = new JTextField(10);
        resultField.setEditable(false); 

        
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(resultLabel);
        frame.add(resultField);


        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();

                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.",
                                                  "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                  
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.",
                                                  "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                   
                    JOptionPane.showMessageDialog(frame, "An error occurred: " + ex.getMessage(),
                                                  "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new DivisionApp();
    }
}
