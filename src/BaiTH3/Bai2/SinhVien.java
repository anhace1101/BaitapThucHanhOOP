package BaiTH3.Bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private Date namSinh;
    private int tuoi;
    private String lop;

    public SinhVien() {

    }

    public SinhVien(String hoTen, Date namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public void nhapThongTinSV() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập năm sinh(dd--MM--yy): ");
//        String nS = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd--MM--yy");
        namSinh = dateFormat.parse(scanner.nextLine());
        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }

    public void inThongTinSV() {
        System.out.println("Họ tên: " + hoTen + " Lớp: " + lop);
        System.out.println("Năm sinh: " + namSinh + " tuổi: " + tuoi);
    }

}
