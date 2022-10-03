
package OOP.khaibaolopnhanvien;

import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner in= new Scanner(System.in);
        nhanvien nv= new nhanvien( in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println(nv);
    }
}
