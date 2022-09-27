/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Hãy thực hiện thuật toán sắp xếp chọn trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán.

Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100).

Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.
Input

Output

4

5 7 3 2

Buoc 1: 2 7 3 5

Buoc 2: 2 3 7 5

Buoc 3: 2 3 5 7
*/
package javabasic;

/**
 *
 * @author keuuu
 */
import java.util.*;

public class bai02_sapxepchon {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int size=sc.nextInt();
       int[] a = new int[size];
       for(int i=0;i<size;i++){
           a[i]=sc.nextInt();
       }
        selection_sort(a);
    }
    private static void selection_sort(int a[]){
     int count=1;
     for(int i=0;i<a.length-1;i++)
     {
         int min=i;
         for(int j=i+1;j<a.length;j++)
         {
             if(a[j]<a[min]){
                 min =j;
             }
         }
         int tmp=a[min];
         a[min]=a[i];
         a[i]=tmp;
         System.out.print("Buoc "+(count)+": ");
         for(int j=0;j<a.length;j++)
         {
             if(j==a.length-1){
                 System.out.println(a[j]);
             }else{
                 System.out.print(a[j]+" ");
             }
         }
         count++;
     }
    }
    
}
