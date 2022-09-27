/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author keuuu
 */
/*
Hãy thực hiện thuật toán sắp xếp chèn trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán.

Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100).

Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.

Ví dụ:

Input

Output

4

5 7 3 2

Buoc 0: 5

Buoc 1: 5 7

Buoc 2: 3 5 7

Buoc 3: 2 3 5 7
*/

import java.util.* ;

import java.util.ArrayList;

public class Bai03_sapxepchen {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in ) ;
        int n = in.nextInt() , a[] = new int[n] ;
        for(int i = 0 ; i< n ;i ++) a[i] = in.nextInt() ;
        sapxepchen(a, n) ;
    }

    private static void sapxepchen(int[] a, int n) {
        int i , j ;

        ArrayList<Integer> list = new ArrayList<>();
        for(i = 0 ; i<n ;i++){
            list.add(a[i]);
            int tmp = i;
            for(j = i-1 ;j>=0 ;j--){
                if(list.get(i)<list.get(j)){
                    tmp=j;
                }
            }
            int tmp2 = list.get(i);
            for(int k = i;k>tmp;k--){
                list.set(k,list.get(k-1));
            }
            list.set(tmp,tmp2);

            String res = "Buoc " + (i) +":" ;
            for(j = 0 ; j <list.size() ;j++) res =res + " "+list.get(j) ;
            System.out.println(res);
        }

    }
}