
package OOP.khaibaolopsinvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class sinhvien {
    private String name;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public sinhvien( String name, String lop, String ngaysinh, float gpa) throws ParseException {
        this.name = name;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "B20DCCN001"+" "+name+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.3g%n", gpa);
    }
    
    
}
