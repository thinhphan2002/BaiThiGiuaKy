import java.text.ParseException;
import java.util.Scanner;
public class GiaoDichDrive {
    public static void main(String[] args) throws ParseException {
        
        DanhSachGiaDich lGD = new DanhSachGiaDich();
        Scanner sc = new Scanner(System.in);

        int luaChon;
        do{
            System.out.println("-------------------Giao Dich-------------------");
            System.out.println("1.Them giao dich dat");
            System.out.println("2.Them giao dich nha");
            System.out.println("3.Hien thi danh sach cac giao dich");
            System.out.println("4.Tong so luong tung loai giao dich");
            System.out.println("5.Trung binh thanh tien giao dich dat");
            System.out.println("6.Xuat cac giao dich cua thang 9 nam 2013");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------------------------");
            System.out.print("Lua chon :");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case (1):
                    lGD.nhapDS(1);
                    break;
                case (2):
                    lGD.nhapDS(2);
                    break;
                case (3):
                    lGD.inDS();
                    break;
                case (4):
                    lGD.tongSLTungLoai();
                    break;
                case (5):
                    lGD.tBThanhTienGDDat();
                    break;
                case (6):
                    lGD.inGiaoDichTheoThang();
                    break;
            }
    
        }while(luaChon != 0);
    }
}
