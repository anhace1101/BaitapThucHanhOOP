package BaiTH3.Bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TheMuon {
    private int soPhieuMuon;
    private Date ngayMuon;
    private Date ngayTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public TheMuon() {

    }

    public TheMuon(int soPhieuMuon, Date ngayMuon, Date ngayTra, String soHieuSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public void nhapThongTinTheMuon() throws Exception {
        this.sinhVien = new SinhVien();
        this.sinhVien.nhapThongTinSV();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập  số phiếu mượn: ");
        soPhieuMuon = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập ngày mượn (dd--MM--yy): ");
        DateFormat dateFormat = new SimpleDateFormat("dd--MM--yy");
        ngayMuon = dateFormat.parse(scanner.nextLine());
        System.out.print("Nhập ngày trả (dd-MM--yy): ");
        ngayTra = dateFormat.parse(scanner.nextLine());
        System.out.print("Nhập số hiệu sách: ");
        soHieuSach = scanner.nextLine();
    }

    public void hienThongTinhTheMuon() {
        sinhVien.inThongTinSV();
        System.out.println("Tên sách trả: " + soHieuSach);
        System.out.println("Ngày mượn: " + ngayMuon);
        System.out.println("Ngày trả: " + ngayTra);
    }

    public static void main(String[] args) throws Exception{
//        ArrayList ds = new ArrayList();
//        Scanner scanner = new Scanner(System.in);
//        int dem = 0;
//        char c;
//        do {
//            System.out.println("Nhập thông tin the mượn thứ " + (dem + 1) + ": ");
//            TheMuon theMuon = new TheMuon();
//            theMuon.nhapThongTinTheMuon();
//            ds.add(theMuon);
//            dem++;
//            System.out.println("Có muốn nhập thêm nữa? Y/N");
//            c = scanner.nextLine().charAt(0);
//        }while (c == 'Y' || c == 'y');
//        System.out.println("========================================");
//
    TheMuon theMuon = new TheMuon();
    theMuon.nhapThongTinTheMuon();
    theMuon.hienThongTinhTheMuon();
    }
}
