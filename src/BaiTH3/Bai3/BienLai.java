package BaiTH3.Bai3;

import java.util.Scanner;

public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;
    private long soTien;

    public BienLai() {
        super();
    }

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        super();
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public long getSoTien() {
        return soTien;
    }

    public void setSoTien(long soTien) {
        this.soTien = soTien;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        khachHang = new KhachHang();
        khachHang.nhapThongTin();
        do {
            System.out.print("Nhập chỉ số cũ: ");
            chiSoCu = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập chỉ số mới: ");
            chiSoMoi = Integer.parseInt(scanner.nextLine());
        } while (chiSoCu < chiSoMoi);

        soTien = tinhTien();

    }

    public long tinhTien() {
        long thanhTien = 0;
        int soDien = chiSoMoi - chiSoCu;
        if (soDien <= 50) {
            thanhTien = soTien * 1678;
        } else if (soDien > 50 && soDien <= 100) {
            thanhTien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien > 100 & soDien <= 200) {
            thanhTien = 50 * 1678 + 100 * 1734 + (soDien - 100) * 2014;
        } else if (soDien > 200 & soDien <= 300) {
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + (soDien - 100) * 2536;
        } else if (soDien > 300 & soDien <= 400) {
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 100) * 2834;
        } else if (soDien > 400) {
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 100) * 2927;
        }
        return thanhTien;
    }

    public void hienThiBienLai() {

        khachHang.hienThongTin();
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Số tiền điện: " + soTien);
    }

}


