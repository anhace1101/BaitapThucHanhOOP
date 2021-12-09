package BaiTH5.NangCao;

import java.util.Scanner;

public class NhanSu {
    protected String hoTen;
    protected int namSinh;
    protected String ngheNghiep;

    public NhanSu() {
        super();
    }

    public NhanSu(String ht, int ns, String nn) {
        hoTen = ht;
        namSinh = ns;
        ngheNghiep = nn;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập nghề nghiệp: ");
        ngheNghiep = scanner.nextLine();
        System.out.print("Nhập năm sinh:");
        namSinh = Integer.parseInt(scanner.nextLine());
    }
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Nghề nghiệp: " + ngheNghiep);
        System.out.println("Năm sinh: " + namSinh);
    }
}
