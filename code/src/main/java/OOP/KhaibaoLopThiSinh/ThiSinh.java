/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.KhaibaoLopThiSinh;

import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.* ;

public class ThiSinh {
    private String hoten ;
    private Date ngaysinh ;
    private float diem1 ,diem2 ,diem3 ;

    public ThiSinh(String hoten, String ngaysinh, float diem1, float diem2, float diem3) throws ParseException {
        this.hoten = hoten;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    @Override
    public String toString(){
        float x = diem1+ diem2 +diem3 ;
        return hoten + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) +" "+x ;
    }
}