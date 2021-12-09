package BaiTH3.NangCao;

import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected float[] kichThuocCanh;

    public DaGiac() {
        super();
    }

    public DaGiac(int soCanh, float kichThuocCanh[]) {
        this.soCanh = soCanh;
        this.kichThuocCanh = kichThuocCanh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cạnh của đa giác: ");
        soCanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kích thước các cạnh: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.print("Cạnh " + (i + 1) + ": ");
            kichThuocCanh[i] = Float.parseFloat(scanner.nextLine());
        }
    }

    public float tinhChuVi() {
        float chuVi = 0f;
        for (int i = 0; i < soCanh; i++) {
            chuVi += kichThuocCanh[i];
        }
        return chuVi;
    }

    public void in() {
        System.out.println("Giá trị cạnh của đa giác: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.println("Cạnh " + (i + 1) + ": " + kichThuocCanh[i]);
        }
    }
}
