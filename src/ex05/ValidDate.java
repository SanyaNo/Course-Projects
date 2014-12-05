/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ex05;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author SanyaNo
 */
public class ValidDate {
    
    
    

  public static boolean isValidDate(String inDate) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
    dateFormat.setLenient(false);
    try {
      dateFormat.parse(inDate.trim());
    } catch (ParseException pe) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    System.out.println(isValidDate("4-2-29"));
    System.out.println(isValidDate("5-2-29"));
  }
}


