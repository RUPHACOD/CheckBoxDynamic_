package componentes;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class JPanelTitle
  extends JPanel
{
  public JPanelTitle()
  {
    initialize();
  }
  
  public JPanelTitle(boolean arg0)
  {
    super(arg0);
    
    initialize();
  }
  
  public JPanelTitle(LayoutManager arg0)
  {
    super(arg0);
    
    initialize();
  }
  
  public JPanelTitle(LayoutManager arg0, boolean arg1)
  {
    super(arg0, arg1);
    
    initialize();
  }
  
  private void initialize()
  {
    setLayout(null);
    setSize(300, 200);
    //setBackground(VariablesLookAndFeel.cPanelGridHeader);
    setBackground(new Color(255,130,14));
  }
}