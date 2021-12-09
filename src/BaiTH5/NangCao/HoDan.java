package BaiTH5.NangCao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HoDan {
    protected int soThanhVien;
    protected String soNha;
    protected NhanSu thanhVien[];

    public HoDan() {
        super();
        thanhVien = new NhanSu[10];
    }

    public HoDan(int sotv, String sn, NhanSu thanhVien[]) {
        soThanhVien = sotv;
        soNha = sn;
        this.thanhVien = thanhVien;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số thành viên trong hộ: ");
        soThanhVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số nhà:");
        soNha = scanner.nextLine();
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhập thông tin thành viên " + (i + 1));
            thanhVien[i] = new NhanSu();
            thanhVien[i].nhapThongTin();
        }
    }

    public void inThongTin() {
        System.out.println("Số thành viên: " + soThanhVien);
        System.out.println("Số nhà: " + soNha);

        for (int i = 0; i < this.soThanhVien; i++) {
            this.thanhVien[i].inThongTin();
        }

    }
}
