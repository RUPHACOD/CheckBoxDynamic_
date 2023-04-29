package componentes;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class UpperCaseDocument
  extends PlainDocument
{
  int maxLength;
  
  public UpperCaseDocument(int pMaxLength)
  {
    this.maxLength = pMaxLength;
  }
  
  public UpperCaseDocument()
  {
    this.maxLength = 250;
  }
  
  public void setLengthText(int pMaxLength)
  {
    this.maxLength = pMaxLength;
  }
  
  public void insertString(int offs, String str, AttributeSet a)
    throws BadLocationException
  {
    if (getLength() < this.maxLength) {
      try
      {
        if (str == null) {
          return;
        }
        char[] upper = str.toCharArray();
        for (int i = 0; i < upper.length; i++) {
          upper[i] = Character.toUpperCase(upper[i]);
        }
        super.insertString(offs, new String(upper), a);
      }
      catch (Exception e) {}
    }
  }
}