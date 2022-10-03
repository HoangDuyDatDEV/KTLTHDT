
package OOP.tinhtien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        ArrayList<sanpham> list = new ArrayList<>();
        
        while(n -- >0 ){
            sc.nextLine() ;
            sanpham sp = new sanpham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(),sc.nextLong() );
            list.add(sp);
        }
        Collections.sort(list);
        
        for(sanpham sp: list){
            System.out.println(sp);
        }
    } 
}
