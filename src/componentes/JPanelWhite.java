package componentes;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class JPanelWhite
  extends JPanel
{
  public JPanelWhite()
  {
    initialize();
  }
  
  public JPanelWhite(boolean arg0)
  {
    super(arg0);
    
    initialize();
  }
  
  public JPanelWhite(LayoutManager arg0)
  {
    super(arg0);
    
    initialize();
  }
  
  public JPanelWhite(LayoutManager arg0, boolean arg1)
  {
    super(arg0, arg1);
    
    initialize();
  }
  
  private void initialize()
  {
    setLayout(null);
    setSize(300, 200);
    setBackground(Color.white);
  }
}
