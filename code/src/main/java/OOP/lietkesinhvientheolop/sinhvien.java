
package OOP.lietkesinhvientheolop;


public class sinhvien {
  private String ma;
  private String ten;
  private String lop;
  private String email;

    public sinhvien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma+" "+ ten+" "+lop+" "+email ;
    }
  
}
