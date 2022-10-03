
package OOP.phanso;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        phanso ps =new phanso(a, b);
        ps.phanso();
        System.out.println(ps);
    }
}
