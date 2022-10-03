
package OOP.thunhapgiaovien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        giaovien gv= new giaovien( in.nextLine(), in.nextLine(),in.nextFloat());
        System.out.println(gv);
    }
}
