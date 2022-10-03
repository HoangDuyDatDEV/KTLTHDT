
package OOP.tinhtien;

public class sanpham implements Comparable<sanpham>{
    private String ma ;
    private String tensp ;
    private int soluong ;
    private long dongia ,chietkhau ,tong ;

    public sanpham(String ma, String tensp, int soluong, long dongia, long chietkhau) {
        this.ma = ma;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tong = soluong * dongia - chietkhau;
    }
    
    @Override 
    public String toString(){
        return ma+" "+tensp+" "+soluong+" "+dongia+" "+chietkhau+" "+tong ;
    }

    @Override
    public int compareTo(sanpham o) {
        if(this.tong > o.tong){
                return -1 ;
        }
        else 
              return 1 ;
        
    }
}
