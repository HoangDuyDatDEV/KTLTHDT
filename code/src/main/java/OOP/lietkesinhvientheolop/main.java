
package OOP.lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinhvien> list = new ArrayList<>();
        while(n -- >0){
       
            sinhvien sv = new sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine()) ;
            list.add(sv); 
        }
        
        int number  = Integer.parseInt(sc.nextLine()) ;
        String[] temp = new String [number] ;
        for(int i = 0 ; i<number ; i++){
            temp[i] = sc.nextLine() ;
          
        }
        for(int i = 0 ; i<number ; i ++) {
            System.out.println("DANH SACH SINH VIEN LOP "+temp[i]+":");
            for(int j = 0 ; j <list.size() ; j++) {
                if(list.get(j).getLop().equals(temp[i])){
                    System.out.println(list.get(j));
                }
            }
        }
        
    
    }
}
