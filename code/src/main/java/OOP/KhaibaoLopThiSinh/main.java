
package OOP.KhaibaoLopThiSinh;

/**
 *ss
 * @author dathd-8970
 */
import java.text.ParseException;
import java.util.*;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        ThiSinh ts=new ThiSinh(sc.nextLine(), sc.nextLine(),sc.nextFloat(),  sc.nextFloat(),  sc.nextFloat());
        System.out.println(ts);
    }
}
