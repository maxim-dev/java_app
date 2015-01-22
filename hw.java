
import javax.swing.*;

public class hw extends JFrame
{
  public static void main(String[] args)
  {
    new hw();
  }

  public hw()
  {
    JPanel panel1 = new JPanel();
    JLabel label1 = new JLabel("hi world!");

    panel1.add(label1);

    this.add(panel1);
    this.setTitle("HW");
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}