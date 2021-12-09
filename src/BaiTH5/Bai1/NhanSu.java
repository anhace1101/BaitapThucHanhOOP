package BaiTH5.Bai1;

import java.util.Scanner;

public class NhanSu extends Nguoi {
    protected Nguoi nguoi;
    protected String maNhanSu;
    protected float heSoLuong;
    protected float heSoChucVu;
    protected static int luongCoBan;

    public static void setLuongCoBan(int luongCoBan) {
        NhanSu.luongCoBan = luongCoBan;
    }

    public void nhapThongTinNhanSu() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        maNhanSu = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập hệ số chức vụ: ");
        heSoChucVu = Float.parseFloat(scanner.nextLine());
    }

    public void inThongTinNhanSu() {
        super.inThongTin();
        System.out.println("Mã nhân sự: " + maNhanSu);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Hệ số chức vụ: " + heSoChucVu);
        System.out.println("Lương: "+ tinhLuong());
    }

    public double tinhLuong() {
        return (heSoLuong * heSoChucVu) * luongCoBan - heSoLuong * luongCoBan * 0.05;
    }
}
