package com.dunglt2004110051.tuan01;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        nhapTen(scanner);
        hinhChuNhat(scanner);
        theTichKhoiLapPhuong(scanner);
        delta(scanner);
    }

    public static void nhapTen(Scanner scanner) {
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        float diemTB = scanner.nextFloat();
        System.out.print(hoTen + " - " + diemTB);
        System.out.println(hoTen + " - " + diemTB);
        System.out.printf("%s - %.1f điểm", hoTen, diemTB);
    }

    public static void hinhChuNhat(Scanner scanner) {
        short chieuDai, chieuRong;
        do {
            System.out.print("\nNhập chiều dài: ");
            chieuDai = scanner.nextShort();
            System.out.print("Nhập chiều rộng: ");
            chieuRong = scanner.nextShort();
            if (chieuRong > chieuDai) {
                System.out.println("Nhập lại! Chiều rộng phải bé hơn chiều dài");
            }
        } while (chieuRong > chieuDai);

        int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        int minSide = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + minSide);
    }

    public static void theTichKhoiLapPhuong(Scanner scanner) {
        System.out.print("\nNhập cạnh khối lập phương: ");
        int canhLapPhuong = scanner.nextInt();
        double theTich = Math.pow(canhLapPhuong, 3);
        System.out.println("Thể tích khối lập phương: " + (int) theTich);
    }

    public static void delta(Scanner scanner) {
        System.out.print("\nNhập a: ");
        short a = scanner.nextShort();
        System.out.print("Nhập b: ");
        short b = scanner.nextShort();
        System.out.print("Nhập c: ");
        short c = scanner.nextShort();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double squareDelta = Math.sqrt(delta);
        System.out.println("Delta: " + delta);
        System.out.println("Căn bậc 2 delta: " + squareDelta);
    }
}
