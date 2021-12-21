import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 30.08.2021
 * @author 
 */

public class HumboldtHelper {
  
  public static void helloWorld(){
    System.out.println("Hello World");  
  }
  
  public static String readString()
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(isr);
    
    try 
    {
      return stdin.readLine();
      
    }
    catch(IOException e) 
    {
      System.out.println(e);
      return null;
    }
  } 
  
  public static char readChar()
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(isr);
    
    try 
    {
      return stdin.readLine().toCharArray()[0];
    }
    catch(IOException e) 
    {
      System.out.println(e);
      return 'F';
    }
  }   
  
  public static int readInt()
  {
    String s = readString();
    int i = Integer.parseInt(s.trim());
    return i;
  }
  
  public static double readDouble()
  {
    String s = readString();
    double i = Double.parseDouble(s.trim());
    return i;
  }
  
  public static boolean readBoolean()
  {
    String s = readString();
    boolean b = Boolean.parseBoolean(s.trim());
    return b;  
  }

} // end of class HumboldtHelper
