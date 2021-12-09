package BaiTH1.NangCao;

import java.util.Scanner;

// nhập 2 số thực rồi tính + - * / %
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 2 số thực cần tính: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        double thuong = num1 / num2;
        double phanDu = num1 % num2;
        System.out.println("Tổng của " + num1 + " và " + num2 + " = " + tong);
        System.out.println("Hiệu của " + num1 + " và " + num2 + " = " + hieu);
        System.out.println("Tích của " + num1 + " và " + num2 + " = " + tich);
        System.out.println("thương của " + num1 + " và " + num2 + " = " + thuong);
        System.out.println("Phần dư của " + num1 + " và " + num2 + " = " + phanDu);

    }
}
