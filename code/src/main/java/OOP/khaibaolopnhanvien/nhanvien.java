
package OOP.khaibaolopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class nhanvien {
    private String ma,name,giotinh,diachi,masothue;
    private Date ngaysinh,ngayky;

    public nhanvien( String name, String giotinh, String ngaysinh, String diachi, String masothue, String ngayky) throws ParseException {
        this.ma = ma;
        this.name = name;
        this.giotinh = giotinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }

    @Override
    public String toString() {
        return "00001"+" "+name+" "+giotinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+diachi+" "+masothue+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
    }
    
    
}
