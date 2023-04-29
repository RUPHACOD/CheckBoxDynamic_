package componentes;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class UpperCaseField
  extends JTextField
{
  UpperCaseDocument document;
  
  public UpperCaseField() {}
  
  public UpperCaseField(int columns)
  {
    super(columns);
    this.document = new UpperCaseDocument();
  }
  
  public UpperCaseField(String text)
  {
    super(text);
    this.document = new UpperCaseDocument();
  }
  
  public UpperCaseField(String text, int columns)
  {
    super(text, columns);
    this.document = new UpperCaseDocument();
  }
  
  public UpperCaseField(Document doc, String text, int columns)
  {
    super(doc, text, columns);
    this.document = new UpperCaseDocument();
  }
  
  protected Document createDefaultModel()
  {
    this.document = new UpperCaseDocument();
    return this.document;
  }
  
  public void setLengthText(int max)
  {
    this.document.setLengthText(max);
  }
}