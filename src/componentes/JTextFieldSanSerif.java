package componentes;
import java.awt.Color;
import java.awt.Font;
import javax.swing.text.Document;

public class JTextFieldSanSerif
  extends UpperCaseField
{
  public JTextFieldSanSerif()
  {
    initialize();
  }
  
  public JTextFieldSanSerif(int arg0)
  {
    super(arg0);
    initialize();
  }
  
  public JTextFieldSanSerif(String arg0)
  {
    super(arg0);
    initialize();
  }
  
  public JTextFieldSanSerif(String arg0, int arg1)
  {
    super(arg0, arg1);
    initialize();
  }
  
  public JTextFieldSanSerif(Document arg0, String arg1, int arg2)
  {
    super(arg0, arg1, arg2);
    initialize();
  }
  
  private void initialize()
  {
    setFont(new Font("SansSerif", 0, 11));
    setForeground(Color.black);
  }
}