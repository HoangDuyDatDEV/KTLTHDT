
package OOP.lietketukhacnhau;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author keuuu
 */
public class main {
  public static void main(String[] args) throws FileNotFoundException  {
        Scanner input = new Scanner(new File("DATA.in"));
        Wordset ws = new Wordset(input);
        System.out.println(ws);
    }   
}
