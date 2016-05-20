package comportamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.text.DefaultFormatter;
import java.text.ParseException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextIntLimit extends PlainDocument {

  private int limit;

  //Added the following 2 lines
  String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
  boolean isAccepted = false;
  //

  public JTextIntLimit(int limit) {
    super();
    this.limit = limit;
  }

  @Override
  public void insertString(int offset, String str, AttributeSet attr)
      throws BadLocationException {
    if (str == null) {
      return;
    }

    //And the following 2 lines
    for (String thisnumber : numbers) {
      isAccepted = str.equals(thisnumber);
      if (isAccepted) {
        //
        if ((getLength() + str.length()) <= limit) {
          super.insertString(offset, str, attr);
        }
      }
    }
  }
}
