package BaiTH5.Bai2;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    protected Nguoi nguoi;
    protected String maSinhVien;
    protected String tenLop;
    protected float diem1;
    protected float diem2;
    protected float diem3;

    public SinhVien() {
        super();
    }

    public SinhVien(Nguoi nguoi, String msv, String tenlop, float diem1, float diem2, float diem3) {
        this.nguoi = nguoi;
        maSinhVien = msv;
        tenLop = tenlop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.println("Nhập tên lớp: ");
        tenLop = scanner.nextLine();
        System.out.println("Nhập điểm 1: ");
        diem1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm 2: ");
        diem2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm 3: ");
        diem3 = Integer.parseInt(scanner.nextLine());
    }


    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Mã SV: " + maSinhVien);
        System.out.println("Tên lớp: " + tenLop);
        System.out.println("Điểm 1: " + diem1);
        System.out.println("Điêm 2: " + diem2);
        System.out.println("Điểm 3: " + diem3);
        System.out.println("Điểm trung bình:" + tinhDiemTrungBinh());
    }

    public double tinhDiemTrungBinh() {
        return (diem1 * 0.3 + diem2 * 0.7) * 0.3 + diem3 * 0.7;
    }
}
