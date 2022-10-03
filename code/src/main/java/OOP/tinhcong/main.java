
package OOP.tinhcong;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        nhanvien nv= new nhanvien(1,sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(nv.toString());
    }
   
}
