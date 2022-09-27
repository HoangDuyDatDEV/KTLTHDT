/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;



import java.util.*;



public class sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in ) ;
        int n = in.nextInt() , a[] = new int[n] ;
        for(int i = 0 ; i< n ;i ++) a[i] = in.nextInt() ;
        sapxep(a, n) ;
     }

    private static void sapxep(int[] a, int n) {
        int i , j , t ;
        ArrayList<String> ds = new ArrayList<>() ;
        for(i = 0 ; i<n -1 ;i++){
            for(j = i +1 ;j<n ;j++){
                if(a[i] > a[j]){
                t =a[i] ; a[i] = a[j] ; a[j] = t ;  
                }
            }
          String tmp = "Buoc " + (i + 1) +":" ;
          for(j = 0 ; j <n ;j++) tmp =tmp + " "+a[j] ;
          ds.add(tmp) ;
        }
        
      for(String tmp : ds) 
          System.out.println(tmp);
    }
    
}