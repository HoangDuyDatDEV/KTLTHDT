
package OOP.thunhapgiaovien;
import java.util.*;
public class giaovien {
    private String ngach,hoten;
    private int heso;
    private float coban,phucap,thunhap;

    public giaovien(String ngach, String hoten, float coban) {
        this.ngach = ngach;
        this.hoten = hoten; 
        this.coban = coban;
        
    }

    @Override
    public String toString() {
        String cv=this.ngach.substring(0,2);
        heso=Integer.parseInt(this.ngach.substring(2));
        if(cv.equalsIgnoreCase("HT"))
        {
            this.phucap=2000000;
        }
        if(cv.equalsIgnoreCase("HP"))
        {
            this.phucap=900000;
        }
         if(cv.equalsIgnoreCase("GV"))
        {
            this.phucap=500000;
        }
         this.thunhap=coban*heso+phucap;
        return ngach+" "+hoten+" "+heso+" "+String.format("%.0f", phucap)+" "+String.format("%.0f", thunhap);
    }
    
    
}
