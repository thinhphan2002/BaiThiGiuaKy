import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
public class GiaDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    private int choiceLoaiNha;

    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    
    public GiaDichNha(){};
    public GiaDichNha(int maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public void nhap() throws ParseException {
      
        super.nhap();
        System.out.println("Nhap loai nha: ");
        System.out.println("1.Cao Cap");
        System.out.println("2.Thuong");
        System.out.print("Lua chon: ");
        choiceLoaiNha = sc.nextInt();
        switch (choiceLoaiNha) {
            case 1:
                this.loaiNha = "Cao cap";
                break;
            case 2:
                this.loaiNha = "Thuong";
            default:
                break;
        }
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
    }
    @Override
    void tinhThanhTien() {
        if(choiceLoaiNha == 1){
            this.thanhTien = this.dienTich*this.donGia;
        }else{
            this.thanhTien = this.dienTich*this.donGia*0.9;
        }
        
    }
    @Override
    public String toString() {
     
        return super.toString()+"\nLoai nha: "+this.loaiNha+"\nDia chi: "+this.diaChi+"\nThanh Tien: "+this.thanhTien;
    }
    
}
