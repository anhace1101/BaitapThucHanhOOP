package BaiTH2;

import java.util.Scanner;

public class ToanHoc {
    public static void main(String[] args) {
        System.out.print("Nhập số muốn kiểm tra : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // ktra so nguyen to
        if (isPrime(number) == true)
            System.out.println(number + " là số nguyên tố!");
        else {
            System.out.println(number + " không phải số nguyên tố!");
        }
        // kiem tra so hoan hảo
        if (isPerfect(number) == true)
            System.out.println(number + " là số hoàn hảo");
        else
            System.out.println(number + " không là số hoàn hảo");

        // in ra các số chính phương
        System.out.println("Dãy các số chính phương từ 1 => " + number);
        for (int i = 1; i <= number; i++) {
            if (isChinhPhuong(i))
                System.out.print(i + "    ");
        }

        // fib
        System.out.println("\nsố fib thứ " + number + " là " + fibonacci(number));

        // truy hoi
        System.out.println("truy hồi Ln " + truyHoi(number));
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n == 3) return true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            return true;
        return false;
    }

    public static boolean isChinhPhuong(int n) {
        int tmp = (int) Math.sqrt(n);
        if (tmp * tmp == n)
            return true;
        return false;
    }

    public static int fibonacci(int n) {
        if (n < 0) return -1;

        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int truyHoi(int n) {
        if (n == 0)
            return 2;
        else if (n == 1)
            return 1;
        else
            return truyHoi(n - 1) + truyHoi(n - 2);
    }
}
