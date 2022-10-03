
package OOP.Danhsachmathang;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
          Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<sanpham> list=new ArrayList<>();
        for(int i=1;i<t+1;i++){
           in.nextLine();
           sanpham p =new sanpham(i,in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt()) ;
            list.add(p) ;
           
        }
        Collections.sort(list);
        for(sanpham sp:list)
        System.out.println(sp);
    }
}
